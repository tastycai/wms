package com.zl.wms.model.auth;

import java.util.ArrayList;
import java.util.List;

public class ResourceModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResourceModelExample() {
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

        public Criteria andResourceIdIsNull() {
            addCriterion("resource_id is null");
            return (Criteria) this;
        }

        public Criteria andResourceIdIsNotNull() {
            addCriterion("resource_id is not null");
            return (Criteria) this;
        }

        public Criteria andResourceIdEqualTo(Integer value) {
            addCriterion("resource_id =", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotEqualTo(Integer value) {
            addCriterion("resource_id <>", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdGreaterThan(Integer value) {
            addCriterion("resource_id >", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("resource_id >=", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLessThan(Integer value) {
            addCriterion("resource_id <", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLessThanOrEqualTo(Integer value) {
            addCriterion("resource_id <=", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdIn(List<Integer> values) {
            addCriterion("resource_id in", values, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotIn(List<Integer> values) {
            addCriterion("resource_id not in", values, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdBetween(Integer value1, Integer value2) {
            addCriterion("resource_id between", value1, value2, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("resource_id not between", value1, value2, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceUrlIsNull() {
            addCriterion("resource_url is null");
            return (Criteria) this;
        }

        public Criteria andResourceUrlIsNotNull() {
            addCriterion("resource_url is not null");
            return (Criteria) this;
        }

        public Criteria andResourceUrlEqualTo(String value) {
            addCriterion("resource_url =", value, "resourceUrl");
            return (Criteria) this;
        }

        public Criteria andResourceUrlNotEqualTo(String value) {
            addCriterion("resource_url <>", value, "resourceUrl");
            return (Criteria) this;
        }

        public Criteria andResourceUrlGreaterThan(String value) {
            addCriterion("resource_url >", value, "resourceUrl");
            return (Criteria) this;
        }

        public Criteria andResourceUrlGreaterThanOrEqualTo(String value) {
            addCriterion("resource_url >=", value, "resourceUrl");
            return (Criteria) this;
        }

        public Criteria andResourceUrlLessThan(String value) {
            addCriterion("resource_url <", value, "resourceUrl");
            return (Criteria) this;
        }

        public Criteria andResourceUrlLessThanOrEqualTo(String value) {
            addCriterion("resource_url <=", value, "resourceUrl");
            return (Criteria) this;
        }

        public Criteria andResourceUrlLike(String value) {
            addCriterion("resource_url like", value, "resourceUrl");
            return (Criteria) this;
        }

        public Criteria andResourceUrlNotLike(String value) {
            addCriterion("resource_url not like", value, "resourceUrl");
            return (Criteria) this;
        }

        public Criteria andResourceUrlIn(List<String> values) {
            addCriterion("resource_url in", values, "resourceUrl");
            return (Criteria) this;
        }

        public Criteria andResourceUrlNotIn(List<String> values) {
            addCriterion("resource_url not in", values, "resourceUrl");
            return (Criteria) this;
        }

        public Criteria andResourceUrlBetween(String value1, String value2) {
            addCriterion("resource_url between", value1, value2, "resourceUrl");
            return (Criteria) this;
        }

        public Criteria andResourceUrlNotBetween(String value1, String value2) {
            addCriterion("resource_url not between", value1, value2, "resourceUrl");
            return (Criteria) this;
        }

        public Criteria andResourceKeyIsNull() {
            addCriterion("resource_key is null");
            return (Criteria) this;
        }

        public Criteria andResourceKeyIsNotNull() {
            addCriterion("resource_key is not null");
            return (Criteria) this;
        }

        public Criteria andResourceKeyEqualTo(String value) {
            addCriterion("resource_key =", value, "resourceKey");
            return (Criteria) this;
        }

        public Criteria andResourceKeyNotEqualTo(String value) {
            addCriterion("resource_key <>", value, "resourceKey");
            return (Criteria) this;
        }

        public Criteria andResourceKeyGreaterThan(String value) {
            addCriterion("resource_key >", value, "resourceKey");
            return (Criteria) this;
        }

        public Criteria andResourceKeyGreaterThanOrEqualTo(String value) {
            addCriterion("resource_key >=", value, "resourceKey");
            return (Criteria) this;
        }

        public Criteria andResourceKeyLessThan(String value) {
            addCriterion("resource_key <", value, "resourceKey");
            return (Criteria) this;
        }

        public Criteria andResourceKeyLessThanOrEqualTo(String value) {
            addCriterion("resource_key <=", value, "resourceKey");
            return (Criteria) this;
        }

        public Criteria andResourceKeyLike(String value) {
            addCriterion("resource_key like", value, "resourceKey");
            return (Criteria) this;
        }

        public Criteria andResourceKeyNotLike(String value) {
            addCriterion("resource_key not like", value, "resourceKey");
            return (Criteria) this;
        }

        public Criteria andResourceKeyIn(List<String> values) {
            addCriterion("resource_key in", values, "resourceKey");
            return (Criteria) this;
        }

        public Criteria andResourceKeyNotIn(List<String> values) {
            addCriterion("resource_key not in", values, "resourceKey");
            return (Criteria) this;
        }

        public Criteria andResourceKeyBetween(String value1, String value2) {
            addCriterion("resource_key between", value1, value2, "resourceKey");
            return (Criteria) this;
        }

        public Criteria andResourceKeyNotBetween(String value1, String value2) {
            addCriterion("resource_key not between", value1, value2, "resourceKey");
            return (Criteria) this;
        }

        public Criteria andResourceDescIsNull() {
            addCriterion("resource_desc is null");
            return (Criteria) this;
        }

        public Criteria andResourceDescIsNotNull() {
            addCriterion("resource_desc is not null");
            return (Criteria) this;
        }

        public Criteria andResourceDescEqualTo(String value) {
            addCriterion("resource_desc =", value, "resourceDesc");
            return (Criteria) this;
        }

        public Criteria andResourceDescNotEqualTo(String value) {
            addCriterion("resource_desc <>", value, "resourceDesc");
            return (Criteria) this;
        }

        public Criteria andResourceDescGreaterThan(String value) {
            addCriterion("resource_desc >", value, "resourceDesc");
            return (Criteria) this;
        }

        public Criteria andResourceDescGreaterThanOrEqualTo(String value) {
            addCriterion("resource_desc >=", value, "resourceDesc");
            return (Criteria) this;
        }

        public Criteria andResourceDescLessThan(String value) {
            addCriterion("resource_desc <", value, "resourceDesc");
            return (Criteria) this;
        }

        public Criteria andResourceDescLessThanOrEqualTo(String value) {
            addCriterion("resource_desc <=", value, "resourceDesc");
            return (Criteria) this;
        }

        public Criteria andResourceDescLike(String value) {
            addCriterion("resource_desc like", value, "resourceDesc");
            return (Criteria) this;
        }

        public Criteria andResourceDescNotLike(String value) {
            addCriterion("resource_desc not like", value, "resourceDesc");
            return (Criteria) this;
        }

        public Criteria andResourceDescIn(List<String> values) {
            addCriterion("resource_desc in", values, "resourceDesc");
            return (Criteria) this;
        }

        public Criteria andResourceDescNotIn(List<String> values) {
            addCriterion("resource_desc not in", values, "resourceDesc");
            return (Criteria) this;
        }

        public Criteria andResourceDescBetween(String value1, String value2) {
            addCriterion("resource_desc between", value1, value2, "resourceDesc");
            return (Criteria) this;
        }

        public Criteria andResourceDescNotBetween(String value1, String value2) {
            addCriterion("resource_desc not between", value1, value2, "resourceDesc");
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