package ctvit.mybatis_ts.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class organizationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public organizationExample() {
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

        public Criteria andOrganizationidIsNull() {
            addCriterion("organizationid is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationidIsNotNull() {
            addCriterion("organizationid is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationidEqualTo(String value) {
            addCriterion("organizationid =", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidNotEqualTo(String value) {
            addCriterion("organizationid <>", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidGreaterThan(String value) {
            addCriterion("organizationid >", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidGreaterThanOrEqualTo(String value) {
            addCriterion("organizationid >=", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidLessThan(String value) {
            addCriterion("organizationid <", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidLessThanOrEqualTo(String value) {
            addCriterion("organizationid <=", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidLike(String value) {
            addCriterion("organizationid like", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidNotLike(String value) {
            addCriterion("organizationid not like", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidIn(List<String> values) {
            addCriterion("organizationid in", values, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidNotIn(List<String> values) {
            addCriterion("organizationid not in", values, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidBetween(String value1, String value2) {
            addCriterion("organizationid between", value1, value2, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidNotBetween(String value1, String value2) {
            addCriterion("organizationid not between", value1, value2, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameIsNull() {
            addCriterion("organizationname is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameIsNotNull() {
            addCriterion("organizationname is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameEqualTo(String value) {
            addCriterion("organizationname =", value, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameNotEqualTo(String value) {
            addCriterion("organizationname <>", value, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameGreaterThan(String value) {
            addCriterion("organizationname >", value, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameGreaterThanOrEqualTo(String value) {
            addCriterion("organizationname >=", value, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameLessThan(String value) {
            addCriterion("organizationname <", value, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameLessThanOrEqualTo(String value) {
            addCriterion("organizationname <=", value, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameLike(String value) {
            addCriterion("organizationname like", value, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameNotLike(String value) {
            addCriterion("organizationname not like", value, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameIn(List<String> values) {
            addCriterion("organizationname in", values, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameNotIn(List<String> values) {
            addCriterion("organizationname not in", values, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameBetween(String value1, String value2) {
            addCriterion("organizationname between", value1, value2, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameNotBetween(String value1, String value2) {
            addCriterion("organizationname not between", value1, value2, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationcreatetimeIsNull() {
            addCriterion("organizationcreatetime is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationcreatetimeIsNotNull() {
            addCriterion("organizationcreatetime is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationcreatetimeEqualTo(Date value) {
            addCriterion("organizationcreatetime =", value, "organizationcreatetime");
            return (Criteria) this;
        }

        public Criteria andOrganizationcreatetimeNotEqualTo(Date value) {
            addCriterion("organizationcreatetime <>", value, "organizationcreatetime");
            return (Criteria) this;
        }

        public Criteria andOrganizationcreatetimeGreaterThan(Date value) {
            addCriterion("organizationcreatetime >", value, "organizationcreatetime");
            return (Criteria) this;
        }

        public Criteria andOrganizationcreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("organizationcreatetime >=", value, "organizationcreatetime");
            return (Criteria) this;
        }

        public Criteria andOrganizationcreatetimeLessThan(Date value) {
            addCriterion("organizationcreatetime <", value, "organizationcreatetime");
            return (Criteria) this;
        }

        public Criteria andOrganizationcreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("organizationcreatetime <=", value, "organizationcreatetime");
            return (Criteria) this;
        }

        public Criteria andOrganizationcreatetimeIn(List<Date> values) {
            addCriterion("organizationcreatetime in", values, "organizationcreatetime");
            return (Criteria) this;
        }

        public Criteria andOrganizationcreatetimeNotIn(List<Date> values) {
            addCriterion("organizationcreatetime not in", values, "organizationcreatetime");
            return (Criteria) this;
        }

        public Criteria andOrganizationcreatetimeBetween(Date value1, Date value2) {
            addCriterion("organizationcreatetime between", value1, value2, "organizationcreatetime");
            return (Criteria) this;
        }

        public Criteria andOrganizationcreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("organizationcreatetime not between", value1, value2, "organizationcreatetime");
            return (Criteria) this;
        }

        public Criteria andOrganizationflagIsNull() {
            addCriterion("organizationflag is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationflagIsNotNull() {
            addCriterion("organizationflag is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationflagEqualTo(Integer value) {
            addCriterion("organizationflag =", value, "organizationflag");
            return (Criteria) this;
        }

        public Criteria andOrganizationflagNotEqualTo(Integer value) {
            addCriterion("organizationflag <>", value, "organizationflag");
            return (Criteria) this;
        }

        public Criteria andOrganizationflagGreaterThan(Integer value) {
            addCriterion("organizationflag >", value, "organizationflag");
            return (Criteria) this;
        }

        public Criteria andOrganizationflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("organizationflag >=", value, "organizationflag");
            return (Criteria) this;
        }

        public Criteria andOrganizationflagLessThan(Integer value) {
            addCriterion("organizationflag <", value, "organizationflag");
            return (Criteria) this;
        }

        public Criteria andOrganizationflagLessThanOrEqualTo(Integer value) {
            addCriterion("organizationflag <=", value, "organizationflag");
            return (Criteria) this;
        }

        public Criteria andOrganizationflagIn(List<Integer> values) {
            addCriterion("organizationflag in", values, "organizationflag");
            return (Criteria) this;
        }

        public Criteria andOrganizationflagNotIn(List<Integer> values) {
            addCriterion("organizationflag not in", values, "organizationflag");
            return (Criteria) this;
        }

        public Criteria andOrganizationflagBetween(Integer value1, Integer value2) {
            addCriterion("organizationflag between", value1, value2, "organizationflag");
            return (Criteria) this;
        }

        public Criteria andOrganizationflagNotBetween(Integer value1, Integer value2) {
            addCriterion("organizationflag not between", value1, value2, "organizationflag");
            return (Criteria) this;
        }

        public Criteria andOrganizationdescIsNull() {
            addCriterion("organizationdesc is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationdescIsNotNull() {
            addCriterion("organizationdesc is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationdescEqualTo(String value) {
            addCriterion("organizationdesc =", value, "organizationdesc");
            return (Criteria) this;
        }

        public Criteria andOrganizationdescNotEqualTo(String value) {
            addCriterion("organizationdesc <>", value, "organizationdesc");
            return (Criteria) this;
        }

        public Criteria andOrganizationdescGreaterThan(String value) {
            addCriterion("organizationdesc >", value, "organizationdesc");
            return (Criteria) this;
        }

        public Criteria andOrganizationdescGreaterThanOrEqualTo(String value) {
            addCriterion("organizationdesc >=", value, "organizationdesc");
            return (Criteria) this;
        }

        public Criteria andOrganizationdescLessThan(String value) {
            addCriterion("organizationdesc <", value, "organizationdesc");
            return (Criteria) this;
        }

        public Criteria andOrganizationdescLessThanOrEqualTo(String value) {
            addCriterion("organizationdesc <=", value, "organizationdesc");
            return (Criteria) this;
        }

        public Criteria andOrganizationdescLike(String value) {
            addCriterion("organizationdesc like", value, "organizationdesc");
            return (Criteria) this;
        }

        public Criteria andOrganizationdescNotLike(String value) {
            addCriterion("organizationdesc not like", value, "organizationdesc");
            return (Criteria) this;
        }

        public Criteria andOrganizationdescIn(List<String> values) {
            addCriterion("organizationdesc in", values, "organizationdesc");
            return (Criteria) this;
        }

        public Criteria andOrganizationdescNotIn(List<String> values) {
            addCriterion("organizationdesc not in", values, "organizationdesc");
            return (Criteria) this;
        }

        public Criteria andOrganizationdescBetween(String value1, String value2) {
            addCriterion("organizationdesc between", value1, value2, "organizationdesc");
            return (Criteria) this;
        }

        public Criteria andOrganizationdescNotBetween(String value1, String value2) {
            addCriterion("organizationdesc not between", value1, value2, "organizationdesc");
            return (Criteria) this;
        }

        public Criteria andOrganizationietitleIsNull() {
            addCriterion("organizationietitle is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationietitleIsNotNull() {
            addCriterion("organizationietitle is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationietitleEqualTo(String value) {
            addCriterion("organizationietitle =", value, "organizationietitle");
            return (Criteria) this;
        }

        public Criteria andOrganizationietitleNotEqualTo(String value) {
            addCriterion("organizationietitle <>", value, "organizationietitle");
            return (Criteria) this;
        }

        public Criteria andOrganizationietitleGreaterThan(String value) {
            addCriterion("organizationietitle >", value, "organizationietitle");
            return (Criteria) this;
        }

        public Criteria andOrganizationietitleGreaterThanOrEqualTo(String value) {
            addCriterion("organizationietitle >=", value, "organizationietitle");
            return (Criteria) this;
        }

        public Criteria andOrganizationietitleLessThan(String value) {
            addCriterion("organizationietitle <", value, "organizationietitle");
            return (Criteria) this;
        }

        public Criteria andOrganizationietitleLessThanOrEqualTo(String value) {
            addCriterion("organizationietitle <=", value, "organizationietitle");
            return (Criteria) this;
        }

        public Criteria andOrganizationietitleLike(String value) {
            addCriterion("organizationietitle like", value, "organizationietitle");
            return (Criteria) this;
        }

        public Criteria andOrganizationietitleNotLike(String value) {
            addCriterion("organizationietitle not like", value, "organizationietitle");
            return (Criteria) this;
        }

        public Criteria andOrganizationietitleIn(List<String> values) {
            addCriterion("organizationietitle in", values, "organizationietitle");
            return (Criteria) this;
        }

        public Criteria andOrganizationietitleNotIn(List<String> values) {
            addCriterion("organizationietitle not in", values, "organizationietitle");
            return (Criteria) this;
        }

        public Criteria andOrganizationietitleBetween(String value1, String value2) {
            addCriterion("organizationietitle between", value1, value2, "organizationietitle");
            return (Criteria) this;
        }

        public Criteria andOrganizationietitleNotBetween(String value1, String value2) {
            addCriterion("organizationietitle not between", value1, value2, "organizationietitle");
            return (Criteria) this;
        }

        public Criteria andBeizuIsNull() {
            addCriterion("beizu is null");
            return (Criteria) this;
        }

        public Criteria andBeizuIsNotNull() {
            addCriterion("beizu is not null");
            return (Criteria) this;
        }

        public Criteria andBeizuEqualTo(String value) {
            addCriterion("beizu =", value, "beizu");
            return (Criteria) this;
        }

        public Criteria andBeizuNotEqualTo(String value) {
            addCriterion("beizu <>", value, "beizu");
            return (Criteria) this;
        }

        public Criteria andBeizuGreaterThan(String value) {
            addCriterion("beizu >", value, "beizu");
            return (Criteria) this;
        }

        public Criteria andBeizuGreaterThanOrEqualTo(String value) {
            addCriterion("beizu >=", value, "beizu");
            return (Criteria) this;
        }

        public Criteria andBeizuLessThan(String value) {
            addCriterion("beizu <", value, "beizu");
            return (Criteria) this;
        }

        public Criteria andBeizuLessThanOrEqualTo(String value) {
            addCriterion("beizu <=", value, "beizu");
            return (Criteria) this;
        }

        public Criteria andBeizuLike(String value) {
            addCriterion("beizu like", value, "beizu");
            return (Criteria) this;
        }

        public Criteria andBeizuNotLike(String value) {
            addCriterion("beizu not like", value, "beizu");
            return (Criteria) this;
        }

        public Criteria andBeizuIn(List<String> values) {
            addCriterion("beizu in", values, "beizu");
            return (Criteria) this;
        }

        public Criteria andBeizuNotIn(List<String> values) {
            addCriterion("beizu not in", values, "beizu");
            return (Criteria) this;
        }

        public Criteria andBeizuBetween(String value1, String value2) {
            addCriterion("beizu between", value1, value2, "beizu");
            return (Criteria) this;
        }

        public Criteria andBeizuNotBetween(String value1, String value2) {
            addCriterion("beizu not between", value1, value2, "beizu");
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