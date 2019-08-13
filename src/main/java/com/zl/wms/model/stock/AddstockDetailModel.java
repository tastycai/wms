package com.zl.wms.model.stock;

import java.math.BigDecimal;

public class AddstockDetailModel {
    private Integer addstockDetailId;

    private Integer addstockId;

    private String addstockCode;

    private Integer productId;

    private String productCode;

    private Integer addstockNumber;

    private BigDecimal price;

    private BigDecimal money;

    public Integer getAddstockDetailId() {
        return addstockDetailId;
    }

    public void setAddstockDetailId(Integer addstockDetailId) {
        this.addstockDetailId = addstockDetailId;
    }

    public Integer getAddstockId() {
        return addstockId;
    }

    public void setAddstockId(Integer addstockId) {
        this.addstockId = addstockId;
    }

    public String getAddstockCode() {
        return addstockCode;
    }

    public void setAddstockCode(String addstockCode) {
        this.addstockCode = addstockCode == null ? null : addstockCode.trim();
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    public Integer getAddstockNumber() {
        return addstockNumber;
    }

    public void setAddstockNumber(Integer addstockNumber) {
        this.addstockNumber = addstockNumber;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }
}