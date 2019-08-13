package com.zl.wms.model.stock;

import java.util.Date;

public class StockChangeModel {
    private Integer stockChangeId;

    private Integer stockId;

    private Integer productId;

    private Integer productCode;

    private Integer beforeStock;

    private Integer changeStock;

    private Integer afterStock;

    private Date changeTime;

    private String changeType;

    private Integer relationId;

    private String relationType;

    public Integer getStockChangeId() {
        return stockChangeId;
    }

    public void setStockChangeId(Integer stockChangeId) {
        this.stockChangeId = stockChangeId;
    }

    public Integer getStockId() {
        return stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getProductCode() {
        return productCode;
    }

    public void setProductCode(Integer productCode) {
        this.productCode = productCode;
    }

    public Integer getBeforeStock() {
        return beforeStock;
    }

    public void setBeforeStock(Integer beforeStock) {
        this.beforeStock = beforeStock;
    }

    public Integer getChangeStock() {
        return changeStock;
    }

    public void setChangeStock(Integer changeStock) {
        this.changeStock = changeStock;
    }

    public Integer getAfterStock() {
        return afterStock;
    }

    public void setAfterStock(Integer afterStock) {
        this.afterStock = afterStock;
    }

    public Date getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
    }

    public String getChangeType() {
        return changeType;
    }

    public void setChangeType(String changeType) {
        this.changeType = changeType == null ? null : changeType.trim();
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
}