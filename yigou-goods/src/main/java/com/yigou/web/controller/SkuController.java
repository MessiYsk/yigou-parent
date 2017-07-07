package com.yigou.web.controller;

import com.yigou.base.BaseController;
import com.yigou.constant.PageConstant;
import com.yigou.model.dto.PaginatedResult;
import com.yigou.service.SkuService;
import com.yigou.util.PageUtil;
import com.yigou.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author 川军六十六师
 * Since 2017/6/22 13:23.
 */
@RestController
/*@RequestMapping("/sku")*/
public class SkuController extends BaseController {


    private SkuService skuService;

    @Autowired
    public SkuController(SkuService skuService) {
        this.skuService = skuService;
    }

    /**
     * 分页查询SKU
     * @param pageString
     * @param perPageString
     * @param keyword
     * @return
     */
    @RequestMapping("pageSku")
    public Object pageSku(@RequestParam(value = "page", required = false) String pageString,
                                     @RequestParam(value = "per_page", required = false) String perPageString,
                          @RequestParam(value = "keyword", required = false)String keyword,
                       @RequestParam(value = "productId" ,required = false)Integer productId) {

        // Parse request parameters
        int page = PageUtil.parsePage(pageString, PageConstant.PAGE);
        int perPage = PageUtil.parsePerPage(perPageString, PageConstant.PER_PAGE);
        PaginatedResult paginatedResult = skuService.pageSku(page, perPage,keyword,productId);
        return ResultUtil.successObject(paginatedResult);
    }

    public Object update(@RequestParam(value = "id", required = false)Integer id) {

        return ResultUtil.successObject();
    }
}
