package com.zl.wms.model.stock;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AddstockModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AddstockModelExample() {
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

        public Criteria andAddstockTimeIsNull() {
            addCriterion("addstock_time is null");
            return (Criteria) this;
        }

        public Criteria andAddstockTimeIsNotNull() {
            addCriterion("addstock_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddstockTimeEqualTo(Date value) {
            addCriterion("addstock_time =", value, "addstockTime");
            return (Criteria) this;
        }

        public Criteria andAddstockTimeNotEqualTo(Date value) {
            addCriterion("addstock_time <>", value, "addstockTime");
            return (Criteria) this;
        }

        public Criteria andAddstockTimeGreaterThan(Date value) {
            addCriterion("addstock_time >", value, "addstockTime");
            return (Criteria) this;
        }

        public Criteria andAddstockTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("addstock_time >=", value, "addstockTime");
            return (Criteria) this;
        }

        public Criteria andAddstockTimeLessThan(Date value) {
            addCriterion("addstock_time <", value, "addstockTime");
            return (Criteria) this;
        }

        public Criteria andAddstockTimeLessThanOrEqualTo(Date value) {
            addCriterion("addstock_time <=", value, "addstockTime");
            return (Criteria) this;
        }

        public Criteria andAddstockTimeIn(List<Date> values) {
            addCriterion("addstock_time in", values, "addstockTime");
            return (Criteria) this;
        }

        public Criteria andAddstockTimeNotIn(List<Date> values) {
            addCriterion("addstock_time not in", values, "addstockTime");
            return (Criteria) this;
        }

        public Criteria andAddstockTimeBetween(Date value1, Date value2) {
            addCriterion("addstock_time between", value1, value2, "addstockTime");
            return (Criteria) this;
        }

        public Criteria andAddstockTimeNotBetween(Date value1, Date value2) {
            addCriterion("addstock_time not between", value1, value2, "addstockTime");
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