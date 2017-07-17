package com.yigou.controller;


import com.yigou.base.BaseController;
import com.yigou.constant.PageConstant;
import com.yigou.constant.ResourceNameConstant;
import com.yigou.model.entity.Book;
import com.yigou.service.BookService;
import com.yigou.exception.ResourceNotFoundException;
import com.yigou.model.dto.PaginatedResult;
import com.yigou.util.PageUtil;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

/**
 * Modified By 川军六十六师.
 * Since 2017/6/24 17:01.
 */
@RestController
@RequestMapping("/books")
public class BookController extends BaseController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @ApiOperation(value = "分页查询", notes="分页查询")
    @ApiImplicitParam(name = "book")
    @GetMapping
    public ResponseEntity<?> getBooks(@RequestParam(value = "page", required = false) String pageString,
                                      @RequestParam(value = "per_page", required = false) String perPageString) {
        // Parse request parameters
        int page = PageUtil.parsePage(pageString, PageConstant.PAGE);
        int perPage = PageUtil.parsePerPage(perPageString, PageConstant.PER_PAGE);

        return ResponseEntity
                .ok(new PaginatedResult()
                        .setData(bookService.getBooksByPage(page, perPage))
                        .setCurrentPage(page)
                        .setTotalPage(bookService.getTotalPage(perPage)));
    }

    @ApiOperation(value = "获取", notes="主键获取")
    @ApiImplicitParam(name = "book")
    @GetMapping("/{bookId}")
    public ResponseEntity<?> getBookById(@PathVariable Long bookId) {

        logBefore(logger,"test");

     /*   try {
            int i = 1/0;
        }catch (Exception e){
            logger.info(e.toString(),e);
        }*/
        return bookService
                .getBookById(bookId)
                .map(ResponseEntity::ok)
                .orElseThrow(() -> new ResourceNotFoundException()
                        .setResourceName(ResourceNameConstant.BOOK)
                        .setId(bookId));
    }

    @ApiOperation(value = "新增", notes="新增book")
    @ApiImplicitParam(name = "book")
    @PostMapping
    public ResponseEntity<?> postBook(@RequestBody Book book) {
        bookService.saveBook(book);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(book.getId())
                .toUri();

        return ResponseEntity
                .created(location)
                .body(book);

    }

    @ApiOperation(value = "更新", notes="更新book")
    @ApiImplicitParam(name = "book")
    @PutMapping("/{bookId}")
    public ResponseEntity<?> putBook(@PathVariable Long bookId, @RequestBody Book book) {


        assertBookExist(bookId);

        bookService.modifyBookOnNameById(book.setId(bookId));

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(book);
    }

    @ApiOperation(value = "删除", notes="删除book")
    @ApiImplicitParam(name = "book")
    @DeleteMapping("/{bookId}")
    public ResponseEntity<?> deleteBook(@PathVariable Long bookId) {
        assertBookExist(bookId);

        bookService.deleteBookById(bookId);

        return ResponseEntity
                .noContent()
                .build();
    }

    /********************************** HELPER METHOD **********************************/
    private void assertBookExist(Long bookId) {
        bookService
                .getBookById(bookId)
                .orElseThrow(() -> new ResourceNotFoundException()
                        .setResourceName(ResourceNameConstant.BOOK)
                        .setId(bookId));
    }
}
