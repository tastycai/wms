package com.zl.wms.model.stock;

import java.math.BigDecimal;
import java.util.Date;

public class AddstockModel {
    private Integer addstockId;

    private String addstockCode;

    private BigDecimal money;

    private Date addstockTime;

    private Integer relationId;

    private String relationType;

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

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Date getAddstockTime() {
        return addstockTime;
    }

    public void setAddstockTime(Date addstockTime) {
        this.addstockTime = addstockTime;
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