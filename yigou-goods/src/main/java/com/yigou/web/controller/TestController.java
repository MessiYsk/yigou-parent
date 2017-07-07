package com.yigou.web.controller;

import com.yigou.base.BaseController;
import com.yigou.constant.PageConstant;
import com.yigou.model.dto.PaginatedResult;
import com.yigou.model.entity.Product;
import com.yigou.service.TestService;
import com.yigou.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * 
 * Author 川军六十六师.
 * Since 2017/6/24 17:14.
 * Modified By 川军六十六师.
 */
@RestController
@RequestMapping("/test")
public class TestController extends BaseController{


    private TestService testService;
    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @RequestMapping("add")
    public void add(@RequestBody Product product){

        /*List<List<String>> specs = product.getSpecs();
        List<List<String>> params = product.getParams();*/

        /*System.out.println(specs.size());
        System.out.println(params.size());*/

        System.out.println(product.getBrandName());

    }

    @RequestMapping("page")
    public ResponseEntity<?> getTests(@RequestParam(value = "page", required = false) String pageString,
                                      @RequestParam(value = "per_page", required = false) String perPageString) {

        /*HttpServletResponse response = this.getResponse();
        HttpServletRequest request = this.getRequest();
        response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
        response.setHeader("Access-Control-Allow-Headers", "content-type");
        response.addHeader("Access-Control-Allow-Credentials", "true");*/


        // Parse request parameters
        int page = PageUtil.parsePage(pageString, PageConstant.PAGE);
        int perPage = PageUtil.parsePerPage(perPageString, PageConstant.PER_PAGE);

        /*page =1;

        perPage = 10000;*/

        return ResponseEntity
                .ok(new PaginatedResult()
                        .setData(testService.getTestsByPage(page, perPage))
                        .setCurrentPage(page)
                        .setTotalPage(testService.getTotalPage(perPage)).setTotalCount(testService.selectCount()));
    }

    @RequestMapping("/delete//{id}")
    public ResponseEntity<?> deleteTest(@PathVariable Integer id) {
        /*assertBookExist(bookId);*/
        /*HttpServletResponse response = this.getResponse();
        HttpServletRequest request = this.getRequest();
        response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
        response.setHeader("Access-Control-Allow-Headers", "content-type");
        response.addHeader("Access-Control-Allow-Credentials", "true");*/
        testService.deleteTestById(id);

        return ResponseEntity
                .noContent()
                .build();
    }
}
