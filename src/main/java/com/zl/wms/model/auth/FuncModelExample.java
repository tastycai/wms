package com.zl.wms.model.auth;

import java.util.ArrayList;
import java.util.List;

public class FuncModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FuncModelExample() {
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

        public Criteria andFuncIdIsNull() {
            addCriterion("func_id is null");
            return (Criteria) this;
        }

        public Criteria andFuncIdIsNotNull() {
            addCriterion("func_id is not null");
            return (Criteria) this;
        }

        public Criteria andFuncIdEqualTo(Integer value) {
            addCriterion("func_id =", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdNotEqualTo(Integer value) {
            addCriterion("func_id <>", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdGreaterThan(Integer value) {
            addCriterion("func_id >", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("func_id >=", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdLessThan(Integer value) {
            addCriterion("func_id <", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdLessThanOrEqualTo(Integer value) {
            addCriterion("func_id <=", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdIn(List<Integer> values) {
            addCriterion("func_id in", values, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdNotIn(List<Integer> values) {
            addCriterion("func_id not in", values, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdBetween(Integer value1, Integer value2) {
            addCriterion("func_id between", value1, value2, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdNotBetween(Integer value1, Integer value2) {
            addCriterion("func_id not between", value1, value2, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncNameIsNull() {
            addCriterion("func_name is null");
            return (Criteria) this;
        }

        public Criteria andFuncNameIsNotNull() {
            addCriterion("func_name is not null");
            return (Criteria) this;
        }

        public Criteria andFuncNameEqualTo(String value) {
            addCriterion("func_name =", value, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameNotEqualTo(String value) {
            addCriterion("func_name <>", value, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameGreaterThan(String value) {
            addCriterion("func_name >", value, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameGreaterThanOrEqualTo(String value) {
            addCriterion("func_name >=", value, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameLessThan(String value) {
            addCriterion("func_name <", value, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameLessThanOrEqualTo(String value) {
            addCriterion("func_name <=", value, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameLike(String value) {
            addCriterion("func_name like", value, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameNotLike(String value) {
            addCriterion("func_name not like", value, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameIn(List<String> values) {
            addCriterion("func_name in", values, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameNotIn(List<String> values) {
            addCriterion("func_name not in", values, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameBetween(String value1, String value2) {
            addCriterion("func_name between", value1, value2, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameNotBetween(String value1, String value2) {
            addCriterion("func_name not between", value1, value2, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncDescIsNull() {
            addCriterion("func_desc is null");
            return (Criteria) this;
        }

        public Criteria andFuncDescIsNotNull() {
            addCriterion("func_desc is not null");
            return (Criteria) this;
        }

        public Criteria andFuncDescEqualTo(String value) {
            addCriterion("func_desc =", value, "funcDesc");
            return (Criteria) this;
        }

        public Criteria andFuncDescNotEqualTo(String value) {
            addCriterion("func_desc <>", value, "funcDesc");
            return (Criteria) this;
        }

        public Criteria andFuncDescGreaterThan(String value) {
            addCriterion("func_desc >", value, "funcDesc");
            return (Criteria) this;
        }

        public Criteria andFuncDescGreaterThanOrEqualTo(String value) {
            addCriterion("func_desc >=", value, "funcDesc");
            return (Criteria) this;
        }

        public Criteria andFuncDescLessThan(String value) {
            addCriterion("func_desc <", value, "funcDesc");
            return (Criteria) this;
        }

        public Criteria andFuncDescLessThanOrEqualTo(String value) {
            addCriterion("func_desc <=", value, "funcDesc");
            return (Criteria) this;
        }

        public Criteria andFuncDescLike(String value) {
            addCriterion("func_desc like", value, "funcDesc");
            return (Criteria) this;
        }

        public Criteria andFuncDescNotLike(String value) {
            addCriterion("func_desc not like", value, "funcDesc");
            return (Criteria) this;
        }

        public Criteria andFuncDescIn(List<String> values) {
            addCriterion("func_desc in", values, "funcDesc");
            return (Criteria) this;
        }

        public Criteria andFuncDescNotIn(List<String> values) {
            addCriterion("func_desc not in", values, "funcDesc");
            return (Criteria) this;
        }

        public Criteria andFuncDescBetween(String value1, String value2) {
            addCriterion("func_desc between", value1, value2, "funcDesc");
            return (Criteria) this;
        }

        public Criteria andFuncDescNotBetween(String value1, String value2) {
            addCriterion("func_desc not between", value1, value2, "funcDesc");
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