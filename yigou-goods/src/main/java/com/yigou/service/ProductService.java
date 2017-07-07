package com.yigou.service;

import com.yigou.model.dto.PaginatedResult;
import com.yigou.model.entity.Product;

/**
 * 最小销售单元的Service接口
 * Author 川军六十六师
 * Since 2017/6/23 16:20.
 */
public interface ProductService {

    /**
     * 分页查询sku
     * @return
     */
    PaginatedResult pageProduct(int page, int perPage, String keywords);

    /**
     * 添加产品及SKU
     * @param product 产品的bean
     */
    void addProduct(Product product);

    /**
     * 更新产品的信息
     * @param product
     */
    void updateProduct(Product product);

    /**
     * 根据主键ID查询产品的信息
     * @param productId 产品的ID
     * @return
     */
    Product getProductById(Integer productId);

    /**
     * 根据条件查询唯一的产品
     * @param product 封装条件
     * @return
     */
    Product getProduct(Product product);
}
