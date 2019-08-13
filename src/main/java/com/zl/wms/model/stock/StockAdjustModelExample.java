package com.zl.wms.model.stock;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StockAdjustModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockAdjustModelExample() {
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

        public Criteria andStockAdjustIdIsNull() {
            addCriterion("stock_adjust_id is null");
            return (Criteria) this;
        }

        public Criteria andStockAdjustIdIsNotNull() {
            addCriterion("stock_adjust_id is not null");
            return (Criteria) this;
        }

        public Criteria andStockAdjustIdEqualTo(Integer value) {
            addCriterion("stock_adjust_id =", value, "stockAdjustId");
            return (Criteria) this;
        }

        public Criteria andStockAdjustIdNotEqualTo(Integer value) {
            addCriterion("stock_adjust_id <>", value, "stockAdjustId");
            return (Criteria) this;
        }

        public Criteria andStockAdjustIdGreaterThan(Integer value) {
            addCriterion("stock_adjust_id >", value, "stockAdjustId");
            return (Criteria) this;
        }

        public Criteria andStockAdjustIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock_adjust_id >=", value, "stockAdjustId");
            return (Criteria) this;
        }

        public Criteria andStockAdjustIdLessThan(Integer value) {
            addCriterion("stock_adjust_id <", value, "stockAdjustId");
            return (Criteria) this;
        }

        public Criteria andStockAdjustIdLessThanOrEqualTo(Integer value) {
            addCriterion("stock_adjust_id <=", value, "stockAdjustId");
            return (Criteria) this;
        }

        public Criteria andStockAdjustIdIn(List<Integer> values) {
            addCriterion("stock_adjust_id in", values, "stockAdjustId");
            return (Criteria) this;
        }

        public Criteria andStockAdjustIdNotIn(List<Integer> values) {
            addCriterion("stock_adjust_id not in", values, "stockAdjustId");
            return (Criteria) this;
        }

        public Criteria andStockAdjustIdBetween(Integer value1, Integer value2) {
            addCriterion("stock_adjust_id between", value1, value2, "stockAdjustId");
            return (Criteria) this;
        }

        public Criteria andStockAdjustIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stock_adjust_id not between", value1, value2, "stockAdjustId");
            return (Criteria) this;
        }

        public Criteria andStockAdjustCodeIsNull() {
            addCriterion("stock_adjust_code is null");
            return (Criteria) this;
        }

        public Criteria andStockAdjustCodeIsNotNull() {
            addCriterion("stock_adjust_code is not null");
            return (Criteria) this;
        }

        public Criteria andStockAdjustCodeEqualTo(String value) {
            addCriterion("stock_adjust_code =", value, "stockAdjustCode");
            return (Criteria) this;
        }

        public Criteria andStockAdjustCodeNotEqualTo(String value) {
            addCriterion("stock_adjust_code <>", value, "stockAdjustCode");
            return (Criteria) this;
        }

        public Criteria andStockAdjustCodeGreaterThan(String value) {
            addCriterion("stock_adjust_code >", value, "stockAdjustCode");
            return (Criteria) this;
        }

        public Criteria andStockAdjustCodeGreaterThanOrEqualTo(String value) {
            addCriterion("stock_adjust_code >=", value, "stockAdjustCode");
            return (Criteria) this;
        }

        public Criteria andStockAdjustCodeLessThan(String value) {
            addCriterion("stock_adjust_code <", value, "stockAdjustCode");
            return (Criteria) this;
        }

        public Criteria andStockAdjustCodeLessThanOrEqualTo(String value) {
            addCriterion("stock_adjust_code <=", value, "stockAdjustCode");
            return (Criteria) this;
        }

        public Criteria andStockAdjustCodeLike(String value) {
            addCriterion("stock_adjust_code like", value, "stockAdjustCode");
            return (Criteria) this;
        }

        public Criteria andStockAdjustCodeNotLike(String value) {
            addCriterion("stock_adjust_code not like", value, "stockAdjustCode");
            return (Criteria) this;
        }

        public Criteria andStockAdjustCodeIn(List<String> values) {
            addCriterion("stock_adjust_code in", values, "stockAdjustCode");
            return (Criteria) this;
        }

        public Criteria andStockAdjustCodeNotIn(List<String> values) {
            addCriterion("stock_adjust_code not in", values, "stockAdjustCode");
            return (Criteria) this;
        }

        public Criteria andStockAdjustCodeBetween(String value1, String value2) {
            addCriterion("stock_adjust_code between", value1, value2, "stockAdjustCode");
            return (Criteria) this;
        }

        public Criteria andStockAdjustCodeNotBetween(String value1, String value2) {
            addCriterion("stock_adjust_code not between", value1, value2, "stockAdjustCode");
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

        public Criteria andAdjustTypeIsNull() {
            addCriterion("adjust_type is null");
            return (Criteria) this;
        }

        public Criteria andAdjustTypeIsNotNull() {
            addCriterion("adjust_type is not null");
            return (Criteria) this;
        }

        public Criteria andAdjustTypeEqualTo(String value) {
            addCriterion("adjust_type =", value, "adjustType");
            return (Criteria) this;
        }

        public Criteria andAdjustTypeNotEqualTo(String value) {
            addCriterion("adjust_type <>", value, "adjustType");
            return (Criteria) this;
        }

        public Criteria andAdjustTypeGreaterThan(String value) {
            addCriterion("adjust_type >", value, "adjustType");
            return (Criteria) this;
        }

        public Criteria andAdjustTypeGreaterThanOrEqualTo(String value) {
            addCriterion("adjust_type >=", value, "adjustType");
            return (Criteria) this;
        }

        public Criteria andAdjustTypeLessThan(String value) {
            addCriterion("adjust_type <", value, "adjustType");
            return (Criteria) this;
        }

        public Criteria andAdjustTypeLessThanOrEqualTo(String value) {
            addCriterion("adjust_type <=", value, "adjustType");
            return (Criteria) this;
        }

        public Criteria andAdjustTypeLike(String value) {
            addCriterion("adjust_type like", value, "adjustType");
            return (Criteria) this;
        }

        public Criteria andAdjustTypeNotLike(String value) {
            addCriterion("adjust_type not like", value, "adjustType");
            return (Criteria) this;
        }

        public Criteria andAdjustTypeIn(List<String> values) {
            addCriterion("adjust_type in", values, "adjustType");
            return (Criteria) this;
        }

        public Criteria andAdjustTypeNotIn(List<String> values) {
            addCriterion("adjust_type not in", values, "adjustType");
            return (Criteria) this;
        }

        public Criteria andAdjustTypeBetween(String value1, String value2) {
            addCriterion("adjust_type between", value1, value2, "adjustType");
            return (Criteria) this;
        }

        public Criteria andAdjustTypeNotBetween(String value1, String value2) {
            addCriterion("adjust_type not between", value1, value2, "adjustType");
            return (Criteria) this;
        }

        public Criteria andAdjustReasonIsNull() {
            addCriterion("adjust_reason is null");
            return (Criteria) this;
        }

        public Criteria andAdjustReasonIsNotNull() {
            addCriterion("adjust_reason is not null");
            return (Criteria) this;
        }

        public Criteria andAdjustReasonEqualTo(String value) {
            addCriterion("adjust_reason =", value, "adjustReason");
            return (Criteria) this;
        }

        public Criteria andAdjustReasonNotEqualTo(String value) {
            addCriterion("adjust_reason <>", value, "adjustReason");
            return (Criteria) this;
        }

        public Criteria andAdjustReasonGreaterThan(String value) {
            addCriterion("adjust_reason >", value, "adjustReason");
            return (Criteria) this;
        }

        public Criteria andAdjustReasonGreaterThanOrEqualTo(String value) {
            addCriterion("adjust_reason >=", value, "adjustReason");
            return (Criteria) this;
        }

        public Criteria andAdjustReasonLessThan(String value) {
            addCriterion("adjust_reason <", value, "adjustReason");
            return (Criteria) this;
        }

        public Criteria andAdjustReasonLessThanOrEqualTo(String value) {
            addCriterion("adjust_reason <=", value, "adjustReason");
            return (Criteria) this;
        }

        public Criteria andAdjustReasonLike(String value) {
            addCriterion("adjust_reason like", value, "adjustReason");
            return (Criteria) this;
        }

        public Criteria andAdjustReasonNotLike(String value) {
            addCriterion("adjust_reason not like", value, "adjustReason");
            return (Criteria) this;
        }

        public Criteria andAdjustReasonIn(List<String> values) {
            addCriterion("adjust_reason in", values, "adjustReason");
            return (Criteria) this;
        }

        public Criteria andAdjustReasonNotIn(List<String> values) {
            addCriterion("adjust_reason not in", values, "adjustReason");
            return (Criteria) this;
        }

        public Criteria andAdjustReasonBetween(String value1, String value2) {
            addCriterion("adjust_reason between", value1, value2, "adjustReason");
            return (Criteria) this;
        }

        public Criteria andAdjustReasonNotBetween(String value1, String value2) {
            addCriterion("adjust_reason not between", value1, value2, "adjustReason");
            return (Criteria) this;
        }

        public Criteria andAdjustNumberIsNull() {
            addCriterion("adjust_number is null");
            return (Criteria) this;
        }

        public Criteria andAdjustNumberIsNotNull() {
            addCriterion("adjust_number is not null");
            return (Criteria) this;
        }

        public Criteria andAdjustNumberEqualTo(Integer value) {
            addCriterion("adjust_number =", value, "adjustNumber");
            return (Criteria) this;
        }

        public Criteria andAdjustNumberNotEqualTo(Integer value) {
            addCriterion("adjust_number <>", value, "adjustNumber");
            return (Criteria) this;
        }

        public Criteria andAdjustNumberGreaterThan(Integer value) {
            addCriterion("adjust_number >", value, "adjustNumber");
            return (Criteria) this;
        }

        public Criteria andAdjustNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("adjust_number >=", value, "adjustNumber");
            return (Criteria) this;
        }

        public Criteria andAdjustNumberLessThan(Integer value) {
            addCriterion("adjust_number <", value, "adjustNumber");
            return (Criteria) this;
        }

        public Criteria andAdjustNumberLessThanOrEqualTo(Integer value) {
            addCriterion("adjust_number <=", value, "adjustNumber");
            return (Criteria) this;
        }

        public Criteria andAdjustNumberIn(List<Integer> values) {
            addCriterion("adjust_number in", values, "adjustNumber");
            return (Criteria) this;
        }

        public Criteria andAdjustNumberNotIn(List<Integer> values) {
            addCriterion("adjust_number not in", values, "adjustNumber");
            return (Criteria) this;
        }

        public Criteria andAdjustNumberBetween(Integer value1, Integer value2) {
            addCriterion("adjust_number between", value1, value2, "adjustNumber");
            return (Criteria) this;
        }

        public Criteria andAdjustNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("adjust_number not between", value1, value2, "adjustNumber");
            return (Criteria) this;
        }

        public Criteria andAdjustStatusIsNull() {
            addCriterion("adjust_status is null");
            return (Criteria) this;
        }

        public Criteria andAdjustStatusIsNotNull() {
            addCriterion("adjust_status is not null");
            return (Criteria) this;
        }

        public Criteria andAdjustStatusEqualTo(String value) {
            addCriterion("adjust_status =", value, "adjustStatus");
            return (Criteria) this;
        }

        public Criteria andAdjustStatusNotEqualTo(String value) {
            addCriterion("adjust_status <>", value, "adjustStatus");
            return (Criteria) this;
        }

        public Criteria andAdjustStatusGreaterThan(String value) {
            addCriterion("adjust_status >", value, "adjustStatus");
            return (Criteria) this;
        }

        public Criteria andAdjustStatusGreaterThanOrEqualTo(String value) {
            addCriterion("adjust_status >=", value, "adjustStatus");
            return (Criteria) this;
        }

        public Criteria andAdjustStatusLessThan(String value) {
            addCriterion("adjust_status <", value, "adjustStatus");
            return (Criteria) this;
        }

        public Criteria andAdjustStatusLessThanOrEqualTo(String value) {
            addCriterion("adjust_status <=", value, "adjustStatus");
            return (Criteria) this;
        }

        public Criteria andAdjustStatusLike(String value) {
            addCriterion("adjust_status like", value, "adjustStatus");
            return (Criteria) this;
        }

        public Criteria andAdjustStatusNotLike(String value) {
            addCriterion("adjust_status not like", value, "adjustStatus");
            return (Criteria) this;
        }

        public Criteria andAdjustStatusIn(List<String> values) {
            addCriterion("adjust_status in", values, "adjustStatus");
            return (Criteria) this;
        }

        public Criteria andAdjustStatusNotIn(List<String> values) {
            addCriterion("adjust_status not in", values, "adjustStatus");
            return (Criteria) this;
        }

        public Criteria andAdjustStatusBetween(String value1, String value2) {
            addCriterion("adjust_status between", value1, value2, "adjustStatus");
            return (Criteria) this;
        }

        public Criteria andAdjustStatusNotBetween(String value1, String value2) {
            addCriterion("adjust_status not between", value1, value2, "adjustStatus");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdIsNull() {
            addCriterion("apply_user_id is null");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdIsNotNull() {
            addCriterion("apply_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdEqualTo(Integer value) {
            addCriterion("apply_user_id =", value, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdNotEqualTo(Integer value) {
            addCriterion("apply_user_id <>", value, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdGreaterThan(Integer value) {
            addCriterion("apply_user_id >", value, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("apply_user_id >=", value, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdLessThan(Integer value) {
            addCriterion("apply_user_id <", value, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("apply_user_id <=", value, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdIn(List<Integer> values) {
            addCriterion("apply_user_id in", values, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdNotIn(List<Integer> values) {
            addCriterion("apply_user_id not in", values, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdBetween(Integer value1, Integer value2) {
            addCriterion("apply_user_id between", value1, value2, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("apply_user_id not between", value1, value2, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserCodeIsNull() {
            addCriterion("apply_user_code is null");
            return (Criteria) this;
        }

        public Criteria andApplyUserCodeIsNotNull() {
            addCriterion("apply_user_code is not null");
            return (Criteria) this;
        }

        public Criteria andApplyUserCodeEqualTo(String value) {
            addCriterion("apply_user_code =", value, "applyUserCode");
            return (Criteria) this;
        }

        public Criteria andApplyUserCodeNotEqualTo(String value) {
            addCriterion("apply_user_code <>", value, "applyUserCode");
            return (Criteria) this;
        }

        public Criteria andApplyUserCodeGreaterThan(String value) {
            addCriterion("apply_user_code >", value, "applyUserCode");
            return (Criteria) this;
        }

        public Criteria andApplyUserCodeGreaterThanOrEqualTo(String value) {
            addCriterion("apply_user_code >=", value, "applyUserCode");
            return (Criteria) this;
        }

        public Criteria andApplyUserCodeLessThan(String value) {
            addCriterion("apply_user_code <", value, "applyUserCode");
            return (Criteria) this;
        }

        public Criteria andApplyUserCodeLessThanOrEqualTo(String value) {
            addCriterion("apply_user_code <=", value, "applyUserCode");
            return (Criteria) this;
        }

        public Criteria andApplyUserCodeLike(String value) {
            addCriterion("apply_user_code like", value, "applyUserCode");
            return (Criteria) this;
        }

        public Criteria andApplyUserCodeNotLike(String value) {
            addCriterion("apply_user_code not like", value, "applyUserCode");
            return (Criteria) this;
        }

        public Criteria andApplyUserCodeIn(List<String> values) {
            addCriterion("apply_user_code in", values, "applyUserCode");
            return (Criteria) this;
        }

        public Criteria andApplyUserCodeNotIn(List<String> values) {
            addCriterion("apply_user_code not in", values, "applyUserCode");
            return (Criteria) this;
        }

        public Criteria andApplyUserCodeBetween(String value1, String value2) {
            addCriterion("apply_user_code between", value1, value2, "applyUserCode");
            return (Criteria) this;
        }

        public Criteria andApplyUserCodeNotBetween(String value1, String value2) {
            addCriterion("apply_user_code not between", value1, value2, "applyUserCode");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNull() {
            addCriterion("apply_time is null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNotNull() {
            addCriterion("apply_time is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeEqualTo(Date value) {
            addCriterion("apply_time =", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotEqualTo(Date value) {
            addCriterion("apply_time <>", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThan(Date value) {
            addCriterion("apply_time >", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("apply_time >=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThan(Date value) {
            addCriterion("apply_time <", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("apply_time <=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIn(List<Date> values) {
            addCriterion("apply_time in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotIn(List<Date> values) {
            addCriterion("apply_time not in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeBetween(Date value1, Date value2) {
            addCriterion("apply_time between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("apply_time not between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andAdjustUserIdIsNull() {
            addCriterion("adjust_user_id is null");
            return (Criteria) this;
        }

        public Criteria andAdjustUserIdIsNotNull() {
            addCriterion("adjust_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdjustUserIdEqualTo(Integer value) {
            addCriterion("adjust_user_id =", value, "adjustUserId");
            return (Criteria) this;
        }

        public Criteria andAdjustUserIdNotEqualTo(Integer value) {
            addCriterion("adjust_user_id <>", value, "adjustUserId");
            return (Criteria) this;
        }

        public Criteria andAdjustUserIdGreaterThan(Integer value) {
            addCriterion("adjust_user_id >", value, "adjustUserId");
            return (Criteria) this;
        }

        public Criteria andAdjustUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("adjust_user_id >=", value, "adjustUserId");
            return (Criteria) this;
        }

        public Criteria andAdjustUserIdLessThan(Integer value) {
            addCriterion("adjust_user_id <", value, "adjustUserId");
            return (Criteria) this;
        }

        public Criteria andAdjustUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("adjust_user_id <=", value, "adjustUserId");
            return (Criteria) this;
        }

        public Criteria andAdjustUserIdIn(List<Integer> values) {
            addCriterion("adjust_user_id in", values, "adjustUserId");
            return (Criteria) this;
        }

        public Criteria andAdjustUserIdNotIn(List<Integer> values) {
            addCriterion("adjust_user_id not in", values, "adjustUserId");
            return (Criteria) this;
        }

        public Criteria andAdjustUserIdBetween(Integer value1, Integer value2) {
            addCriterion("adjust_user_id between", value1, value2, "adjustUserId");
            return (Criteria) this;
        }

        public Criteria andAdjustUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("adjust_user_id not between", value1, value2, "adjustUserId");
            return (Criteria) this;
        }

        public Criteria andAdjustUserCodeIsNull() {
            addCriterion("adjust_user_code is null");
            return (Criteria) this;
        }

        public Criteria andAdjustUserCodeIsNotNull() {
            addCriterion("adjust_user_code is not null");
            return (Criteria) this;
        }

        public Criteria andAdjustUserCodeEqualTo(String value) {
            addCriterion("adjust_user_code =", value, "adjustUserCode");
            return (Criteria) this;
        }

        public Criteria andAdjustUserCodeNotEqualTo(String value) {
            addCriterion("adjust_user_code <>", value, "adjustUserCode");
            return (Criteria) this;
        }

        public Criteria andAdjustUserCodeGreaterThan(String value) {
            addCriterion("adjust_user_code >", value, "adjustUserCode");
            return (Criteria) this;
        }

        public Criteria andAdjustUserCodeGreaterThanOrEqualTo(String value) {
            addCriterion("adjust_user_code >=", value, "adjustUserCode");
            return (Criteria) this;
        }

        public Criteria andAdjustUserCodeLessThan(String value) {
            addCriterion("adjust_user_code <", value, "adjustUserCode");
            return (Criteria) this;
        }

        public Criteria andAdjustUserCodeLessThanOrEqualTo(String value) {
            addCriterion("adjust_user_code <=", value, "adjustUserCode");
            return (Criteria) this;
        }

        public Criteria andAdjustUserCodeLike(String value) {
            addCriterion("adjust_user_code like", value, "adjustUserCode");
            return (Criteria) this;
        }

        public Criteria andAdjustUserCodeNotLike(String value) {
            addCriterion("adjust_user_code not like", value, "adjustUserCode");
            return (Criteria) this;
        }

        public Criteria andAdjustUserCodeIn(List<String> values) {
            addCriterion("adjust_user_code in", values, "adjustUserCode");
            return (Criteria) this;
        }

        public Criteria andAdjustUserCodeNotIn(List<String> values) {
            addCriterion("adjust_user_code not in", values, "adjustUserCode");
            return (Criteria) this;
        }

        public Criteria andAdjustUserCodeBetween(String value1, String value2) {
            addCriterion("adjust_user_code between", value1, value2, "adjustUserCode");
            return (Criteria) this;
        }

        public Criteria andAdjustUserCodeNotBetween(String value1, String value2) {
            addCriterion("adjust_user_code not between", value1, value2, "adjustUserCode");
            return (Criteria) this;
        }

        public Criteria andAdjustTimeIsNull() {
            addCriterion("adjust_time is null");
            return (Criteria) this;
        }

        public Criteria andAdjustTimeIsNotNull() {
            addCriterion("adjust_time is not null");
            return (Criteria) this;
        }

        public Criteria andAdjustTimeEqualTo(Date value) {
            addCriterion("adjust_time =", value, "adjustTime");
            return (Criteria) this;
        }

        public Criteria andAdjustTimeNotEqualTo(Date value) {
            addCriterion("adjust_time <>", value, "adjustTime");
            return (Criteria) this;
        }

        public Criteria andAdjustTimeGreaterThan(Date value) {
            addCriterion("adjust_time >", value, "adjustTime");
            return (Criteria) this;
        }

        public Criteria andAdjustTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("adjust_time >=", value, "adjustTime");
            return (Criteria) this;
        }

        public Criteria andAdjustTimeLessThan(Date value) {
            addCriterion("adjust_time <", value, "adjustTime");
            return (Criteria) this;
        }

        public Criteria andAdjustTimeLessThanOrEqualTo(Date value) {
            addCriterion("adjust_time <=", value, "adjustTime");
            return (Criteria) this;
        }

        public Criteria andAdjustTimeIn(List<Date> values) {
            addCriterion("adjust_time in", values, "adjustTime");
            return (Criteria) this;
        }

        public Criteria andAdjustTimeNotIn(List<Date> values) {
            addCriterion("adjust_time not in", values, "adjustTime");
            return (Criteria) this;
        }

        public Criteria andAdjustTimeBetween(Date value1, Date value2) {
            addCriterion("adjust_time between", value1, value2, "adjustTime");
            return (Criteria) this;
        }

        public Criteria andAdjustTimeNotBetween(Date value1, Date value2) {
            addCriterion("adjust_time not between", value1, value2, "adjustTime");
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