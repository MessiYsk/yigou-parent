package com.yigou.model.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
public class Product {

    private Integer productId;

    private String productNo;

    private String cate;

    private String model;

    private Boolean isShow;

    private Boolean isSn;

    private Integer snLen;

    private Boolean displayorder;

    private String description;

    private Boolean isNew;

    private Boolean isHot;

    private Date createtime;

    private String imageUrl;

    private String brandId;

    private String brandName;

    private BigDecimal productPrice;

    private Integer mallNav;

    private Boolean isValid;

    private String bannerUrl;

    private Boolean isVirtual;

    private String content;

    /**
     * 库存信息，传递给SKU的
     */
    private Integer inventory;

    /**
     * 用于接收前台的规格参数
     */
    private List<Map<String,Object>> specs;

    /**
     * 用于返回规格参数
     */
    private List<String> allSpec;

    /**
     * 生成商品的名称给前台用的
     */
    private String name;
}