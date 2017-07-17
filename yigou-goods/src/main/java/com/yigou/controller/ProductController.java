package com.yigou.controller;

import com.yigou.base.BaseController;
import com.yigou.constant.PageConstant;
import com.yigou.model.dto.PaginatedResult;
import com.yigou.model.entity.Product;
import com.yigou.service.ProductService;
import com.yigou.util.HttpRequest;
import com.yigou.util.PageUtil;
import com.yigou.util.ResultUtil;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 产品的接口类
 * Author 川军六十六师.
 * Since 2017/6/24 17:19.
 */
@RestController
public class ProductController extends BaseController {


    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    /**
     * 分页查询产品
     * @param pageString 当前页码
     * @param perPageString 每页大小
     * @param keyword 搜索关键字
     * @return
     */
    @RequestMapping("pageProduct")
    public Object pageProduct(@RequestParam(value = "page", required = false) String pageString,
                                @RequestParam(value = "per_page", required = false) String perPageString,
                            @RequestParam(value = "keyword", required = false)String keyword) {

        // Parse request parameters
        int page = PageUtil.parsePage(pageString, PageConstant.PAGE);
        int perPage = PageUtil.parsePerPage(perPageString, PageConstant.PER_PAGE);
        PaginatedResult paginatedResult = productService.pageProduct(page, perPage,keyword);
        return ResultUtil.successObject(paginatedResult);
    }

    /**
     * 添加产品的接口
     * @param product 产品
     * @return
     */
    @ApiOperation(value = "新增产品", notes="这个接口在新增产品的时候也会新增SKU")
    @ApiImplicitParam(name = "product", value = "新增的时候productId为空，编辑的时候productId是有值的", required = true, dataType = "Product")
    @RequestMapping("addProduct")
    public Object addProduct(@RequestBody Product product) throws Exception{

        String ipAddr = HttpRequest.getIpAddr(this.getRequest());

        System.out.println(ipAddr);

        productService.addProduct(product);
        return ResultUtil.successObject();
    }

    /**
     * 更新产品信息的接口
     * 主要用于更新产品的上下架、是否可用等信息
     * @param product 产品
     * @return
     */
    @RequestMapping("updateProduct")
    public Object updateProduct(@RequestBody Product product) {

        productService.updateProduct(product);
        return ResultUtil.successObject();
    }

    /**
     * 根据主键获取产品
     * @param id 产品主键
     * @return
     */
    @RequestMapping("getProductById")
    public Object getProductById(@RequestParam(value = "id", required = false) Integer id) {

        Product product = productService.getProductById(id);
        return ResultUtil.successObject(product);
    }

    /**
     * 根据条件查询唯一产品
     * @param product
     */
    @ApiOperation(value = "判断产品是否存在", notes="这个接口在新增产品前调用判断新增的产品是否存在")
    @ApiImplicitParam(name = "product", value = "该参数只需要提交三个参数，1、brandId(品牌ID);2、cate(分类);3、name(型号名称)", required = true, dataType = "Product")
    @RequestMapping("getProduct")
    public Object getProduct(@RequestBody Product product) {

        return ResultUtil.successObject(productService.getProduct(product));
    }
}
