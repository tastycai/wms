package com.zl.wms.model.stock;

import java.util.Date;

public class StockAdjustModel {
    private Integer stockAdjustId;

    private String stockAdjustCode;

    private Integer productId;

    private String productCode;

    private String adjustType;

    private String adjustReason;

    private Integer adjustNumber;

    private String adjustStatus;

    private Integer applyUserId;

    private String applyUserCode;

    private Date applyTime;

    private Integer adjustUserId;

    private String adjustUserCode;

    private Date adjustTime;

    public Integer getStockAdjustId() {
        return stockAdjustId;
    }

    public void setStockAdjustId(Integer stockAdjustId) {
        this.stockAdjustId = stockAdjustId;
    }

    public String getStockAdjustCode() {
        return stockAdjustCode;
    }

    public void setStockAdjustCode(String stockAdjustCode) {
        this.stockAdjustCode = stockAdjustCode == null ? null : stockAdjustCode.trim();
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

    public String getAdjustType() {
        return adjustType;
    }

    public void setAdjustType(String adjustType) {
        this.adjustType = adjustType == null ? null : adjustType.trim();
    }

    public String getAdjustReason() {
        return adjustReason;
    }

    public void setAdjustReason(String adjustReason) {
        this.adjustReason = adjustReason == null ? null : adjustReason.trim();
    }

    public Integer getAdjustNumber() {
        return adjustNumber;
    }

    public void setAdjustNumber(Integer adjustNumber) {
        this.adjustNumber = adjustNumber;
    }

    public String getAdjustStatus() {
        return adjustStatus;
    }

    public void setAdjustStatus(String adjustStatus) {
        this.adjustStatus = adjustStatus == null ? null : adjustStatus.trim();
    }

    public Integer getApplyUserId() {
        return applyUserId;
    }

    public void setApplyUserId(Integer applyUserId) {
        this.applyUserId = applyUserId;
    }

    public String getApplyUserCode() {
        return applyUserCode;
    }

    public void setApplyUserCode(String applyUserCode) {
        this.applyUserCode = applyUserCode == null ? null : applyUserCode.trim();
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Integer getAdjustUserId() {
        return adjustUserId;
    }

    public void setAdjustUserId(Integer adjustUserId) {
        this.adjustUserId = adjustUserId;
    }

    public String getAdjustUserCode() {
        return adjustUserCode;
    }

    public void setAdjustUserCode(String adjustUserCode) {
        this.adjustUserCode = adjustUserCode == null ? null : adjustUserCode.trim();
    }

    public Date getAdjustTime() {
        return adjustTime;
    }

    public void setAdjustTime(Date adjustTime) {
        this.adjustTime = adjustTime;
    }
}