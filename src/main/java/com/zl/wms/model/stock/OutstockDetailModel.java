package com.zl.wms.model.stock;

import java.math.BigDecimal;

public class OutstockDetailModel {
    private Integer outstockDetailId;

    private Integer outstockId;

    private String outstockCode;

    private Integer productId;

    private String productCode;

    private Integer outstockNumber;

    private Integer relationId;

    private String relationType;

    private BigDecimal cost;

    private BigDecimal money;

    public Integer getOutstockDetailId() {
        return outstockDetailId;
    }

    public void setOutstockDetailId(Integer outstockDetailId) {
        this.outstockDetailId = outstockDetailId;
    }

    public Integer getOutstockId() {
        return outstockId;
    }

    public void setOutstockId(Integer outstockId) {
        this.outstockId = outstockId;
    }

    public String getOutstockCode() {
        return outstockCode;
    }

    public void setOutstockCode(String outstockCode) {
        this.outstockCode = outstockCode == null ? null : outstockCode.trim();
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

    public Integer getOutstockNumber() {
        return outstockNumber;
    }

    public void setOutstockNumber(Integer outstockNumber) {
        this.outstockNumber = outstockNumber;
    }

    public Integer getRelationId() {
        return relationId;
    }

    public void setRelationId(Integer relationId) {
        this.relationId = relationId;
    }

    public String getRelationType() {
        return relationType;
    }

    public void setRelationType(String relationType) {
        this.relationType = relationType == null ? null : relationType.trim();
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }
}