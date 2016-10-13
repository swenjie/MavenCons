package ctvit.mybatis_ts.model;

import java.util.ArrayList;
import java.util.List;

public class u_rExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public u_rExample() {
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

        public Criteria andRelationidIsNull() {
            addCriterion("relationid is null");
            return (Criteria) this;
        }

        public Criteria andRelationidIsNotNull() {
            addCriterion("relationid is not null");
            return (Criteria) this;
        }

        public Criteria andRelationidEqualTo(String value) {
            addCriterion("relationid =", value, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidNotEqualTo(String value) {
            addCriterion("relationid <>", value, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidGreaterThan(String value) {
            addCriterion("relationid >", value, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidGreaterThanOrEqualTo(String value) {
            addCriterion("relationid >=", value, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidLessThan(String value) {
            addCriterion("relationid <", value, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidLessThanOrEqualTo(String value) {
            addCriterion("relationid <=", value, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidLike(String value) {
            addCriterion("relationid like", value, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidNotLike(String value) {
            addCriterion("relationid not like", value, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidIn(List<String> values) {
            addCriterion("relationid in", values, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidNotIn(List<String> values) {
            addCriterion("relationid not in", values, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidBetween(String value1, String value2) {
            addCriterion("relationid between", value1, value2, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidNotBetween(String value1, String value2) {
            addCriterion("relationid not between", value1, value2, "relationid");
            return (Criteria) this;
        }

        public Criteria andUserUseridIsNull() {
            addCriterion("user_userid is null");
            return (Criteria) this;
        }

        public Criteria andUserUseridIsNotNull() {
            addCriterion("user_userid is not null");
            return (Criteria) this;
        }

        public Criteria andUserUseridEqualTo(String value) {
            addCriterion("user_userid =", value, "userUserid");
            return (Criteria) this;
        }

        public Criteria andUserUseridNotEqualTo(String value) {
            addCriterion("user_userid <>", value, "userUserid");
            return (Criteria) this;
        }

        public Criteria andUserUseridGreaterThan(String value) {
            addCriterion("user_userid >", value, "userUserid");
            return (Criteria) this;
        }

        public Criteria andUserUseridGreaterThanOrEqualTo(String value) {
            addCriterion("user_userid >=", value, "userUserid");
            return (Criteria) this;
        }

        public Criteria andUserUseridLessThan(String value) {
            addCriterion("user_userid <", value, "userUserid");
            return (Criteria) this;
        }

        public Criteria andUserUseridLessThanOrEqualTo(String value) {
            addCriterion("user_userid <=", value, "userUserid");
            return (Criteria) this;
        }

        public Criteria andUserUseridLike(String value) {
            addCriterion("user_userid like", value, "userUserid");
            return (Criteria) this;
        }

        public Criteria andUserUseridNotLike(String value) {
            addCriterion("user_userid not like", value, "userUserid");
            return (Criteria) this;
        }

        public Criteria andUserUseridIn(List<String> values) {
            addCriterion("user_userid in", values, "userUserid");
            return (Criteria) this;
        }

        public Criteria andUserUseridNotIn(List<String> values) {
            addCriterion("user_userid not in", values, "userUserid");
            return (Criteria) this;
        }

        public Criteria andUserUseridBetween(String value1, String value2) {
            addCriterion("user_userid between", value1, value2, "userUserid");
            return (Criteria) this;
        }

        public Criteria andUserUseridNotBetween(String value1, String value2) {
            addCriterion("user_userid not between", value1, value2, "userUserid");
            return (Criteria) this;
        }

        public Criteria andRolRoleidIsNull() {
            addCriterion("rol_roleid is null");
            return (Criteria) this;
        }

        public Criteria andRolRoleidIsNotNull() {
            addCriterion("rol_roleid is not null");
            return (Criteria) this;
        }

        public Criteria andRolRoleidEqualTo(String value) {
            addCriterion("rol_roleid =", value, "rolRoleid");
            return (Criteria) this;
        }

        public Criteria andRolRoleidNotEqualTo(String value) {
            addCriterion("rol_roleid <>", value, "rolRoleid");
            return (Criteria) this;
        }

        public Criteria andRolRoleidGreaterThan(String value) {
            addCriterion("rol_roleid >", value, "rolRoleid");
            return (Criteria) this;
        }

        public Criteria andRolRoleidGreaterThanOrEqualTo(String value) {
            addCriterion("rol_roleid >=", value, "rolRoleid");
            return (Criteria) this;
        }

        public Criteria andRolRoleidLessThan(String value) {
            addCriterion("rol_roleid <", value, "rolRoleid");
            return (Criteria) this;
        }

        public Criteria andRolRoleidLessThanOrEqualTo(String value) {
            addCriterion("rol_roleid <=", value, "rolRoleid");
            return (Criteria) this;
        }

        public Criteria andRolRoleidLike(String value) {
            addCriterion("rol_roleid like", value, "rolRoleid");
            return (Criteria) this;
        }

        public Criteria andRolRoleidNotLike(String value) {
            addCriterion("rol_roleid not like", value, "rolRoleid");
            return (Criteria) this;
        }

        public Criteria andRolRoleidIn(List<String> values) {
            addCriterion("rol_roleid in", values, "rolRoleid");
            return (Criteria) this;
        }

        public Criteria andRolRoleidNotIn(List<String> values) {
            addCriterion("rol_roleid not in", values, "rolRoleid");
            return (Criteria) this;
        }

        public Criteria andRolRoleidBetween(String value1, String value2) {
            addCriterion("rol_roleid between", value1, value2, "rolRoleid");
            return (Criteria) this;
        }

        public Criteria andRolRoleidNotBetween(String value1, String value2) {
            addCriterion("rol_roleid not between", value1, value2, "rolRoleid");
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