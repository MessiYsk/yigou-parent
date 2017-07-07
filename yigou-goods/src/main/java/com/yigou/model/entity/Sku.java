package com.yigou.model.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Sku {
    private String spId;

    private String name;

    private String fullname;

    private String code;

    private String ctId;

    private String brand;

    private String config;

    private String note;

    private String status;

    private String type;

    private String color;

    private String isch;

    private Integer chcd;

    private Integer kcMax;

    private Integer kcMin;

    private String imageUrl;

    private Float xnspProfit;

    private Integer inventory;

    private String specData;

    private Integer productId;

    private Float weight;

    private String wunit;

    private Float volume;

    private String vunit;

    private Float length;

    private Float width;

    private String lunit;

    private Float height;

    private Integer packageType;

    private Boolean expdateFlag;

    private Date expirationDate;

    private Boolean batchnoFlag;

    private Integer warmline;

    private Boolean securityCodeFlag;

    private Date createtime;

    private List<String> dictIds;

    /*private String dictIds;

    private String dictNames;*/
}