package com.yigou.service;

import com.yigou.model.dto.PaginatedResult;
import com.yigou.model.entity.Sku;

/**
 * 最小销售单元的Service接口
 * Author 川军六十六师
 * Since 2017/6/23 16:20.
 */
public interface SkuService {

    /**
     * 分页查询sku
     * @return
     */
    PaginatedResult pageSku(int page,int perPage,String keyword,Integer productId);

    /**
     * 更新SKU信息
     * @param sku
     */
    void updateSku(Sku sku);
}
