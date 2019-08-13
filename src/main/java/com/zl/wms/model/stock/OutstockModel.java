package com.zl.wms.model.stock;

import java.math.BigDecimal;
import java.util.Date;

public class OutstockModel {
    private Integer outstockId;

    private String outstockCode;

    private Date outstockTime;

    private BigDecimal money;

    private Integer relationId;

    private String relationType;

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

    public Date getOutstockTime() {
        return outstockTime;
    }

    public void setOutstockTime(Date outstockTime) {
        this.outstockTime = outstockTime;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
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