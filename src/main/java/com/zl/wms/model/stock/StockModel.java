package com.zl.wms.model.stock;

public class StockModel {
    private Integer stockId;

    private Integer productId;

    private Integer productCode;

    private Integer stockNumber;

    private Integer occupyNumber;

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

    public Integer getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(Integer stockNumber) {
        this.stockNumber = stockNumber;
    }

    public Integer getOccupyNumber() {
        return occupyNumber;
    }

    public void setOccupyNumber(Integer occupyNumber) {
        this.occupyNumber = occupyNumber;
    }
}