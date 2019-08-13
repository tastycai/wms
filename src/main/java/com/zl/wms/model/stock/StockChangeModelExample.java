package com.zl.wms.model.stock;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StockChangeModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockChangeModelExample() {
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

        public Criteria andStockChangeIdIsNull() {
            addCriterion("stock_change_id is null");
            return (Criteria) this;
        }

        public Criteria andStockChangeIdIsNotNull() {
            addCriterion("stock_change_id is not null");
            return (Criteria) this;
        }

        public Criteria andStockChangeIdEqualTo(Integer value) {
            addCriterion("stock_change_id =", value, "stockChangeId");
            return (Criteria) this;
        }

        public Criteria andStockChangeIdNotEqualTo(Integer value) {
            addCriterion("stock_change_id <>", value, "stockChangeId");
            return (Criteria) this;
        }

        public Criteria andStockChangeIdGreaterThan(Integer value) {
            addCriterion("stock_change_id >", value, "stockChangeId");
            return (Criteria) this;
        }

        public Criteria andStockChangeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock_change_id >=", value, "stockChangeId");
            return (Criteria) this;
        }

        public Criteria andStockChangeIdLessThan(Integer value) {
            addCriterion("stock_change_id <", value, "stockChangeId");
            return (Criteria) this;
        }

        public Criteria andStockChangeIdLessThanOrEqualTo(Integer value) {
            addCriterion("stock_change_id <=", value, "stockChangeId");
            return (Criteria) this;
        }

        public Criteria andStockChangeIdIn(List<Integer> values) {
            addCriterion("stock_change_id in", values, "stockChangeId");
            return (Criteria) this;
        }

        public Criteria andStockChangeIdNotIn(List<Integer> values) {
            addCriterion("stock_change_id not in", values, "stockChangeId");
            return (Criteria) this;
        }

        public Criteria andStockChangeIdBetween(Integer value1, Integer value2) {
            addCriterion("stock_change_id between", value1, value2, "stockChangeId");
            return (Criteria) this;
        }

        public Criteria andStockChangeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stock_change_id not between", value1, value2, "stockChangeId");
            return (Criteria) this;
        }

        public Criteria andStockIdIsNull() {
            addCriterion("stock_id is null");
            return (Criteria) this;
        }

        public Criteria andStockIdIsNotNull() {
            addCriterion("stock_id is not null");
            return (Criteria) this;
        }

        public Criteria andStockIdEqualTo(Integer value) {
            addCriterion("stock_id =", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotEqualTo(Integer value) {
            addCriterion("stock_id <>", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdGreaterThan(Integer value) {
            addCriterion("stock_id >", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock_id >=", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdLessThan(Integer value) {
            addCriterion("stock_id <", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdLessThanOrEqualTo(Integer value) {
            addCriterion("stock_id <=", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdIn(List<Integer> values) {
            addCriterion("stock_id in", values, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotIn(List<Integer> values) {
            addCriterion("stock_id not in", values, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdBetween(Integer value1, Integer value2) {
            addCriterion("stock_id between", value1, value2, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stock_id not between", value1, value2, "stockId");
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

        public Criteria andProductCodeEqualTo(Integer value) {
            addCriterion("product_code =", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotEqualTo(Integer value) {
            addCriterion("product_code <>", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThan(Integer value) {
            addCriterion("product_code >", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_code >=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThan(Integer value) {
            addCriterion("product_code <", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThanOrEqualTo(Integer value) {
            addCriterion("product_code <=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeIn(List<Integer> values) {
            addCriterion("product_code in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotIn(List<Integer> values) {
            addCriterion("product_code not in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeBetween(Integer value1, Integer value2) {
            addCriterion("product_code between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("product_code not between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andBeforeStockIsNull() {
            addCriterion("before_stock is null");
            return (Criteria) this;
        }

        public Criteria andBeforeStockIsNotNull() {
            addCriterion("before_stock is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeStockEqualTo(Integer value) {
            addCriterion("before_stock =", value, "beforeStock");
            return (Criteria) this;
        }

        public Criteria andBeforeStockNotEqualTo(Integer value) {
            addCriterion("before_stock <>", value, "beforeStock");
            return (Criteria) this;
        }

        public Criteria andBeforeStockGreaterThan(Integer value) {
            addCriterion("before_stock >", value, "beforeStock");
            return (Criteria) this;
        }

        public Criteria andBeforeStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("before_stock >=", value, "beforeStock");
            return (Criteria) this;
        }

        public Criteria andBeforeStockLessThan(Integer value) {
            addCriterion("before_stock <", value, "beforeStock");
            return (Criteria) this;
        }

        public Criteria andBeforeStockLessThanOrEqualTo(Integer value) {
            addCriterion("before_stock <=", value, "beforeStock");
            return (Criteria) this;
        }

        public Criteria andBeforeStockIn(List<Integer> values) {
            addCriterion("before_stock in", values, "beforeStock");
            return (Criteria) this;
        }

        public Criteria andBeforeStockNotIn(List<Integer> values) {
            addCriterion("before_stock not in", values, "beforeStock");
            return (Criteria) this;
        }

        public Criteria andBeforeStockBetween(Integer value1, Integer value2) {
            addCriterion("before_stock between", value1, value2, "beforeStock");
            return (Criteria) this;
        }

        public Criteria andBeforeStockNotBetween(Integer value1, Integer value2) {
            addCriterion("before_stock not between", value1, value2, "beforeStock");
            return (Criteria) this;
        }

        public Criteria andChangeStockIsNull() {
            addCriterion("change_stock is null");
            return (Criteria) this;
        }

        public Criteria andChangeStockIsNotNull() {
            addCriterion("change_stock is not null");
            return (Criteria) this;
        }

        public Criteria andChangeStockEqualTo(Integer value) {
            addCriterion("change_stock =", value, "changeStock");
            return (Criteria) this;
        }

        public Criteria andChangeStockNotEqualTo(Integer value) {
            addCriterion("change_stock <>", value, "changeStock");
            return (Criteria) this;
        }

        public Criteria andChangeStockGreaterThan(Integer value) {
            addCriterion("change_stock >", value, "changeStock");
            return (Criteria) this;
        }

        public Criteria andChangeStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("change_stock >=", value, "changeStock");
            return (Criteria) this;
        }

        public Criteria andChangeStockLessThan(Integer value) {
            addCriterion("change_stock <", value, "changeStock");
            return (Criteria) this;
        }

        public Criteria andChangeStockLessThanOrEqualTo(Integer value) {
            addCriterion("change_stock <=", value, "changeStock");
            return (Criteria) this;
        }

        public Criteria andChangeStockIn(List<Integer> values) {
            addCriterion("change_stock in", values, "changeStock");
            return (Criteria) this;
        }

        public Criteria andChangeStockNotIn(List<Integer> values) {
            addCriterion("change_stock not in", values, "changeStock");
            return (Criteria) this;
        }

        public Criteria andChangeStockBetween(Integer value1, Integer value2) {
            addCriterion("change_stock between", value1, value2, "changeStock");
            return (Criteria) this;
        }

        public Criteria andChangeStockNotBetween(Integer value1, Integer value2) {
            addCriterion("change_stock not between", value1, value2, "changeStock");
            return (Criteria) this;
        }

        public Criteria andAfterStockIsNull() {
            addCriterion("after_stock is null");
            return (Criteria) this;
        }

        public Criteria andAfterStockIsNotNull() {
            addCriterion("after_stock is not null");
            return (Criteria) this;
        }

        public Criteria andAfterStockEqualTo(Integer value) {
            addCriterion("after_stock =", value, "afterStock");
            return (Criteria) this;
        }

        public Criteria andAfterStockNotEqualTo(Integer value) {
            addCriterion("after_stock <>", value, "afterStock");
            return (Criteria) this;
        }

        public Criteria andAfterStockGreaterThan(Integer value) {
            addCriterion("after_stock >", value, "afterStock");
            return (Criteria) this;
        }

        public Criteria andAfterStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("after_stock >=", value, "afterStock");
            return (Criteria) this;
        }

        public Criteria andAfterStockLessThan(Integer value) {
            addCriterion("after_stock <", value, "afterStock");
            return (Criteria) this;
        }

        public Criteria andAfterStockLessThanOrEqualTo(Integer value) {
            addCriterion("after_stock <=", value, "afterStock");
            return (Criteria) this;
        }

        public Criteria andAfterStockIn(List<Integer> values) {
            addCriterion("after_stock in", values, "afterStock");
            return (Criteria) this;
        }

        public Criteria andAfterStockNotIn(List<Integer> values) {
            addCriterion("after_stock not in", values, "afterStock");
            return (Criteria) this;
        }

        public Criteria andAfterStockBetween(Integer value1, Integer value2) {
            addCriterion("after_stock between", value1, value2, "afterStock");
            return (Criteria) this;
        }

        public Criteria andAfterStockNotBetween(Integer value1, Integer value2) {
            addCriterion("after_stock not between", value1, value2, "afterStock");
            return (Criteria) this;
        }

        public Criteria andChangeTimeIsNull() {
            addCriterion("change_time is null");
            return (Criteria) this;
        }

        public Criteria andChangeTimeIsNotNull() {
            addCriterion("change_time is not null");
            return (Criteria) this;
        }

        public Criteria andChangeTimeEqualTo(Date value) {
            addCriterion("change_time =", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeNotEqualTo(Date value) {
            addCriterion("change_time <>", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeGreaterThan(Date value) {
            addCriterion("change_time >", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("change_time >=", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeLessThan(Date value) {
            addCriterion("change_time <", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeLessThanOrEqualTo(Date value) {
            addCriterion("change_time <=", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeIn(List<Date> values) {
            addCriterion("change_time in", values, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeNotIn(List<Date> values) {
            addCriterion("change_time not in", values, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeBetween(Date value1, Date value2) {
            addCriterion("change_time between", value1, value2, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeNotBetween(Date value1, Date value2) {
            addCriterion("change_time not between", value1, value2, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTypeIsNull() {
            addCriterion("change_type is null");
            return (Criteria) this;
        }

        public Criteria andChangeTypeIsNotNull() {
            addCriterion("change_type is not null");
            return (Criteria) this;
        }

        public Criteria andChangeTypeEqualTo(String value) {
            addCriterion("change_type =", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeNotEqualTo(String value) {
            addCriterion("change_type <>", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeGreaterThan(String value) {
            addCriterion("change_type >", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("change_type >=", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeLessThan(String value) {
            addCriterion("change_type <", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeLessThanOrEqualTo(String value) {
            addCriterion("change_type <=", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeLike(String value) {
            addCriterion("change_type like", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeNotLike(String value) {
            addCriterion("change_type not like", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeIn(List<String> values) {
            addCriterion("change_type in", values, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeNotIn(List<String> values) {
            addCriterion("change_type not in", values, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeBetween(String value1, String value2) {
            addCriterion("change_type between", value1, value2, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeNotBetween(String value1, String value2) {
            addCriterion("change_type not between", value1, value2, "changeType");
            return (Criteria) this;
        }

        public Criteria andRelationIdIsNull() {
            addCriterion("relation_id is null");
            return (Criteria) this;
        }

        public Criteria andRelationIdIsNotNull() {
            addCriterion("relation_id is not null");
            return (Criteria) this;
        }

        public Criteria andRelationIdEqualTo(Integer value) {
            addCriterion("relation_id =", value, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdNotEqualTo(Integer value) {
            addCriterion("relation_id <>", value, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdGreaterThan(Integer value) {
            addCriterion("relation_id >", value, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("relation_id >=", value, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdLessThan(Integer value) {
            addCriterion("relation_id <", value, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdLessThanOrEqualTo(Integer value) {
            addCriterion("relation_id <=", value, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdIn(List<Integer> values) {
            addCriterion("relation_id in", values, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdNotIn(List<Integer> values) {
            addCriterion("relation_id not in", values, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdBetween(Integer value1, Integer value2) {
            addCriterion("relation_id between", value1, value2, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("relation_id not between", value1, value2, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationTypeIsNull() {
            addCriterion("relation_type is null");
            return (Criteria) this;
        }

        public Criteria andRelationTypeIsNotNull() {
            addCriterion("relation_type is not null");
            return (Criteria) this;
        }

        public Criteria andRelationTypeEqualTo(String value) {
            addCriterion("relation_type =", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeNotEqualTo(String value) {
            addCriterion("relation_type <>", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeGreaterThan(String value) {
            addCriterion("relation_type >", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("relation_type >=", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeLessThan(String value) {
            addCriterion("relation_type <", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeLessThanOrEqualTo(String value) {
            addCriterion("relation_type <=", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeLike(String value) {
            addCriterion("relation_type like", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeNotLike(String value) {
            addCriterion("relation_type not like", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeIn(List<String> values) {
            addCriterion("relation_type in", values, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeNotIn(List<String> values) {
            addCriterion("relation_type not in", values, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeBetween(String value1, String value2) {
            addCriterion("relation_type between", value1, value2, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeNotBetween(String value1, String value2) {
            addCriterion("relation_type not between", value1, value2, "relationType");
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