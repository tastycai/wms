package com.zl.wms.model.stock;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AddstockDetailModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AddstockDetailModelExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andAddstockDetailIdIsNull() {
            addCriterion("addstock_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andAddstockDetailIdIsNotNull() {
            addCriterion("addstock_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddstockDetailIdEqualTo(Integer value) {
            addCriterion("addstock_detail_id =", value, "addstockDetailId");
            return (Criteria) this;
        }

        public Criteria andAddstockDetailIdNotEqualTo(Integer value) {
            addCriterion("addstock_detail_id <>", value, "addstockDetailId");
            return (Criteria) this;
        }

        public Criteria andAddstockDetailIdGreaterThan(Integer value) {
            addCriterion("addstock_detail_id >", value, "addstockDetailId");
            return (Criteria) this;
        }

        public Criteria andAddstockDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("addstock_detail_id >=", value, "addstockDetailId");
            return (Criteria) this;
        }

        public Criteria andAddstockDetailIdLessThan(Integer value) {
            addCriterion("addstock_detail_id <", value, "addstockDetailId");
            return (Criteria) this;
        }

        public Criteria andAddstockDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("addstock_detail_id <=", value, "addstockDetailId");
            return (Criteria) this;
        }

        public Criteria andAddstockDetailIdIn(List<Integer> values) {
            addCriterion("addstock_detail_id in", values, "addstockDetailId");
            return (Criteria) this;
        }

        public Criteria andAddstockDetailIdNotIn(List<Integer> values) {
            addCriterion("addstock_detail_id not in", values, "addstockDetailId");
            return (Criteria) this;
        }

        public Criteria andAddstockDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("addstock_detail_id between", value1, value2, "addstockDetailId");
            return (Criteria) this;
        }

        public Criteria andAddstockDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("addstock_detail_id not between", value1, value2, "addstockDetailId");
            return (Criteria) this;
        }

        public Criteria andAddstockIdIsNull() {
            addCriterion("addstock_id is null");
            return (Criteria) this;
        }

        public Criteria andAddstockIdIsNotNull() {
            addCriterion("addstock_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddstockIdEqualTo(Integer value) {
            addCriterion("addstock_id =", value, "addstockId");
            return (Criteria) this;
        }

        public Criteria andAddstockIdNotEqualTo(Integer value) {
            addCriterion("addstock_id <>", value, "addstockId");
            return (Criteria) this;
        }

        public Criteria andAddstockIdGreaterThan(Integer value) {
            addCriterion("addstock_id >", value, "addstockId");
            return (Criteria) this;
        }

        public Criteria andAddstockIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("addstock_id >=", value, "addstockId");
            return (Criteria) this;
        }

        public Criteria andAddstockIdLessThan(Integer value) {
            addCriterion("addstock_id <", value, "addstockId");
            return (Criteria) this;
        }

        public Criteria andAddstockIdLessThanOrEqualTo(Integer value) {
            addCriterion("addstock_id <=", value, "addstockId");
            return (Criteria) this;
        }

        public Criteria andAddstockIdIn(List<Integer> values) {
            addCriterion("addstock_id in", values, "addstockId");
            return (Criteria) this;
        }

        public Criteria andAddstockIdNotIn(List<Integer> values) {
            addCriterion("addstock_id not in", values, "addstockId");
            return (Criteria) this;
        }

        public Criteria andAddstockIdBetween(Integer value1, Integer value2) {
            addCriterion("addstock_id between", value1, value2, "addstockId");
            return (Criteria) this;
        }

        public Criteria andAddstockIdNotBetween(Integer value1, Integer value2) {
            addCriterion("addstock_id not between", value1, value2, "addstockId");
            return (Criteria) this;
        }

        public Criteria andAddstockCodeIsNull() {
            addCriterion("addstock_code is null");
            return (Criteria) this;
        }

        public Criteria andAddstockCodeIsNotNull() {
            addCriterion("addstock_code is not null");
            return (Criteria) this;
        }

        public Criteria andAddstockCodeEqualTo(String value) {
            addCriterion("addstock_code =", value, "addstockCode");
            return (Criteria) this;
        }

        public Criteria andAddstockCodeNotEqualTo(String value) {
            addCriterion("addstock_code <>", value, "addstockCode");
            return (Criteria) this;
        }

        public Criteria andAddstockCodeGreaterThan(String value) {
            addCriterion("addstock_code >", value, "addstockCode");
            return (Criteria) this;
        }

        public Criteria andAddstockCodeGreaterThanOrEqualTo(String value) {
            addCriterion("addstock_code >=", value, "addstockCode");
            return (Criteria) this;
        }

        public Criteria andAddstockCodeLessThan(String value) {
            addCriterion("addstock_code <", value, "addstockCode");
            return (Criteria) this;
        }

        public Criteria andAddstockCodeLessThanOrEqualTo(String value) {
            addCriterion("addstock_code <=", value, "addstockCode");
            return (Criteria) this;
        }

        public Criteria andAddstockCodeLike(String value) {
            addCriterion("addstock_code like", value, "addstockCode");
            return (Criteria) this;
        }

        public Criteria andAddstockCodeNotLike(String value) {
            addCriterion("addstock_code not like", value, "addstockCode");
            return (Criteria) this;
        }

        public Criteria andAddstockCodeIn(List<String> values) {
            addCriterion("addstock_code in", values, "addstockCode");
            return (Criteria) this;
        }

        public Criteria andAddstockCodeNotIn(List<String> values) {
            addCriterion("addstock_code not in", values, "addstockCode");
            return (Criteria) this;
        }

        public Criteria andAddstockCodeBetween(String value1, String value2) {
            addCriterion("addstock_code between", value1, value2, "addstockCode");
            return (Criteria) this;
        }

        public Criteria andAddstockCodeNotBetween(String value1, String value2) {
            addCriterion("addstock_code not between", value1, value2, "addstockCode");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNull() {
            addCriterion("product_code is null");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNotNull() {
            addCriterion("product_code is not null");
            return (Criteria) this;
        }

        public Criteria andProductCodeEqualTo(String value) {
            addCriterion("product_code =", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotEqualTo(String value) {
            addCriterion("product_code <>", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThan(String value) {
            addCriterion("product_code >", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThanOrEqualTo(String value) {
            addCriterion("product_code >=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThan(String value) {
            addCriterion("product_code <", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThanOrEqualTo(String value) {
            addCriterion("product_code <=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLike(String value) {
            addCriterion("product_code like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotLike(String value) {
            addCriterion("product_code not like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeIn(List<String> values) {
            addCriterion("product_code in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotIn(List<String> values) {
            addCriterion("product_code not in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeBetween(String value1, String value2) {
            addCriterion("product_code between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotBetween(String value1, String value2) {
            addCriterion("product_code not between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andAddstockNumberIsNull() {
            addCriterion("addstock_number is null");
            return (Criteria) this;
        }

        public Criteria andAddstockNumberIsNotNull() {
            addCriterion("addstock_number is not null");
            return (Criteria) this;
        }

        public Criteria andAddstockNumberEqualTo(Integer value) {
            addCriterion("addstock_number =", value, "addstockNumber");
            return (Criteria) this;
        }

        public Criteria andAddstockNumberNotEqualTo(Integer value) {
            addCriterion("addstock_number <>", value, "addstockNumber");
            return (Criteria) this;
        }

        public Criteria andAddstockNumberGreaterThan(Integer value) {
            addCriterion("addstock_number >", value, "addstockNumber");
            return (Criteria) this;
        }

        public Criteria andAddstockNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("addstock_number >=", value, "addstockNumber");
            return (Criteria) this;
        }

        public Criteria andAddstockNumberLessThan(Integer value) {
            addCriterion("addstock_number <", value, "addstockNumber");
            return (Criteria) this;
        }

        public Criteria andAddstockNumberLessThanOrEqualTo(Integer value) {
            addCriterion("addstock_number <=", value, "addstockNumber");
            return (Criteria) this;
        }

        public Criteria andAddstockNumberIn(List<Integer> values) {
            addCriterion("addstock_number in", values, "addstockNumber");
            return (Criteria) this;
        }

        public Criteria andAddstockNumberNotIn(List<Integer> values) {
            addCriterion("addstock_number not in", values, "addstockNumber");
            return (Criteria) this;
        }

        public Criteria andAddstockNumberBetween(Integer value1, Integer value2) {
            addCriterion("addstock_number between", value1, value2, "addstockNumber");
            return (Criteria) this;
        }

        public Criteria andAddstockNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("addstock_number not between", value1, value2, "addstockNumber");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(BigDecimal value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(BigDecimal value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(BigDecimal value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(BigDecimal value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<BigDecimal> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<BigDecimal> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}