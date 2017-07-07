package com.yigou.model.entity;

public class ProductParam {
    private Integer praramId;

    private Integer productId;

    private String title;

    private String dictId;

    private String paramValue;

    public Integer getPraramId() {
        return praramId;
    }

    public void setPraramId(Integer praramId) {
        this.praramId = praramId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDictId() {
        return dictId;
    }

    public void setDictId(String dictId) {
        this.dictId = dictId == null ? null : dictId.trim();
    }

    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue == null ? null : paramValue.trim();
    }
}