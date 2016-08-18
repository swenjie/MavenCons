package com.ctvit.db.beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TimeSheetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TimeSheetExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andTimesheetidIsNull() {
            addCriterion("timesheetid is null");
            return (Criteria) this;
        }

        public Criteria andTimesheetidIsNotNull() {
            addCriterion("timesheetid is not null");
            return (Criteria) this;
        }

        public Criteria andTimesheetidEqualTo(String value) {
            addCriterion("timesheetid =", value, "timesheetid");
            return (Criteria) this;
        }

        public Criteria andTimesheetidNotEqualTo(String value) {
            addCriterion("timesheetid <>", value, "timesheetid");
            return (Criteria) this;
        }

        public Criteria andTimesheetidGreaterThan(String value) {
            addCriterion("timesheetid >", value, "timesheetid");
            return (Criteria) this;
        }

        public Criteria andTimesheetidGreaterThanOrEqualTo(String value) {
            addCriterion("timesheetid >=", value, "timesheetid");
            return (Criteria) this;
        }

        public Criteria andTimesheetidLessThan(String value) {
            addCriterion("timesheetid <", value, "timesheetid");
            return (Criteria) this;
        }

        public Criteria andTimesheetidLessThanOrEqualTo(String value) {
            addCriterion("timesheetid <=", value, "timesheetid");
            return (Criteria) this;
        }

        public Criteria andTimesheetidLike(String value) {
            addCriterion("timesheetid like", value, "timesheetid");
            return (Criteria) this;
        }

        public Criteria andTimesheetidNotLike(String value) {
            addCriterion("timesheetid not like", value, "timesheetid");
            return (Criteria) this;
        }

        public Criteria andTimesheetidIn(List<String> values) {
            addCriterion("timesheetid in", values, "timesheetid");
            return (Criteria) this;
        }

        public Criteria andTimesheetidNotIn(List<String> values) {
            addCriterion("timesheetid not in", values, "timesheetid");
            return (Criteria) this;
        }

        public Criteria andTimesheetidBetween(String value1, String value2) {
            addCriterion("timesheetid between", value1, value2, "timesheetid");
            return (Criteria) this;
        }

        public Criteria andTimesheetidNotBetween(String value1, String value2) {
            addCriterion("timesheetid not between", value1, value2, "timesheetid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andTimedateIsNull() {
            addCriterion("timedate is null");
            return (Criteria) this;
        }

        public Criteria andTimedateIsNotNull() {
            addCriterion("timedate is not null");
            return (Criteria) this;
        }

        public Criteria andTimedateEqualTo(Date value) {
            addCriterion("timedate =", value, "timedate");
            return (Criteria) this;
        }

        public Criteria andTimedateNotEqualTo(Date value) {
            addCriterion("timedate <>", value, "timedate");
            return (Criteria) this;
        }

        public Criteria andTimedateGreaterThan(Date value) {
            addCriterion("timedate >", value, "timedate");
            return (Criteria) this;
        }

        public Criteria andTimedateGreaterThanOrEqualTo(Date value) {
            addCriterion("timedate >=", value, "timedate");
            return (Criteria) this;
        }

        public Criteria andTimedateLessThan(Date value) {
            addCriterion("timedate <", value, "timedate");
            return (Criteria) this;
        }

        public Criteria andTimedateLessThanOrEqualTo(Date value) {
            addCriterion("timedate <=", value, "timedate");
            return (Criteria) this;
        }

        public Criteria andTimedateIn(List<Date> values) {
            addCriterion("timedate in", values, "timedate");
            return (Criteria) this;
        }

        public Criteria andTimedateNotIn(List<Date> values) {
            addCriterion("timedate not in", values, "timedate");
            return (Criteria) this;
        }

        public Criteria andTimedateBetween(Date value1, Date value2) {
            addCriterion("timedate between", value1, value2, "timedate");
            return (Criteria) this;
        }

        public Criteria andTimedateNotBetween(Date value1, Date value2) {
            addCriterion("timedate not between", value1, value2, "timedate");
            return (Criteria) this;
        }

        public Criteria andOntimeIsNull() {
            addCriterion("ontime is null");
            return (Criteria) this;
        }

        public Criteria andOntimeIsNotNull() {
            addCriterion("ontime is not null");
            return (Criteria) this;
        }

        public Criteria andOntimeEqualTo(Date value) {
            addCriterionForJDBCTime("ontime =", value, "ontime");
            return (Criteria) this;
        }

        public Criteria andOntimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("ontime <>", value, "ontime");
            return (Criteria) this;
        }

        public Criteria andOntimeGreaterThan(Date value) {
            addCriterionForJDBCTime("ontime >", value, "ontime");
            return (Criteria) this;
        }

        public Criteria andOntimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("ontime >=", value, "ontime");
            return (Criteria) this;
        }

        public Criteria andOntimeLessThan(Date value) {
            addCriterionForJDBCTime("ontime <", value, "ontime");
            return (Criteria) this;
        }

        public Criteria andOntimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("ontime <=", value, "ontime");
            return (Criteria) this;
        }

        public Criteria andOntimeIn(List<Date> values) {
            addCriterionForJDBCTime("ontime in", values, "ontime");
            return (Criteria) this;
        }

        public Criteria andOntimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("ontime not in", values, "ontime");
            return (Criteria) this;
        }

        public Criteria andOntimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("ontime between", value1, value2, "ontime");
            return (Criteria) this;
        }

        public Criteria andOntimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("ontime not between", value1, value2, "ontime");
            return (Criteria) this;
        }

        public Criteria andOfftimeIsNull() {
            addCriterion("offtime is null");
            return (Criteria) this;
        }

        public Criteria andOfftimeIsNotNull() {
            addCriterion("offtime is not null");
            return (Criteria) this;
        }

        public Criteria andOfftimeEqualTo(Date value) {
            addCriterionForJDBCTime("offtime =", value, "offtime");
            return (Criteria) this;
        }

        public Criteria andOfftimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("offtime <>", value, "offtime");
            return (Criteria) this;
        }

        public Criteria andOfftimeGreaterThan(Date value) {
            addCriterionForJDBCTime("offtime >", value, "offtime");
            return (Criteria) this;
        }

        public Criteria andOfftimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("offtime >=", value, "offtime");
            return (Criteria) this;
        }

        public Criteria andOfftimeLessThan(Date value) {
            addCriterionForJDBCTime("offtime <", value, "offtime");
            return (Criteria) this;
        }

        public Criteria andOfftimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("offtime <=", value, "offtime");
            return (Criteria) this;
        }

        public Criteria andOfftimeIn(List<Date> values) {
            addCriterionForJDBCTime("offtime in", values, "offtime");
            return (Criteria) this;
        }

        public Criteria andOfftimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("offtime not in", values, "offtime");
            return (Criteria) this;
        }

        public Criteria andOfftimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("offtime between", value1, value2, "offtime");
            return (Criteria) this;
        }

        public Criteria andOfftimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("offtime not between", value1, value2, "offtime");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andOnexceptionIsNull() {
            addCriterion("onexception is null");
            return (Criteria) this;
        }

        public Criteria andOnexceptionIsNotNull() {
            addCriterion("onexception is not null");
            return (Criteria) this;
        }

        public Criteria andOnexceptionEqualTo(Short value) {
            addCriterion("onexception =", value, "onexception");
            return (Criteria) this;
        }

        public Criteria andOnexceptionNotEqualTo(Short value) {
            addCriterion("onexception <>", value, "onexception");
            return (Criteria) this;
        }

        public Criteria andOnexceptionGreaterThan(Short value) {
            addCriterion("onexception >", value, "onexception");
            return (Criteria) this;
        }

        public Criteria andOnexceptionGreaterThanOrEqualTo(Short value) {
            addCriterion("onexception >=", value, "onexception");
            return (Criteria) this;
        }

        public Criteria andOnexceptionLessThan(Short value) {
            addCriterion("onexception <", value, "onexception");
            return (Criteria) this;
        }

        public Criteria andOnexceptionLessThanOrEqualTo(Short value) {
            addCriterion("onexception <=", value, "onexception");
            return (Criteria) this;
        }

        public Criteria andOnexceptionIn(List<Short> values) {
            addCriterion("onexception in", values, "onexception");
            return (Criteria) this;
        }

        public Criteria andOnexceptionNotIn(List<Short> values) {
            addCriterion("onexception not in", values, "onexception");
            return (Criteria) this;
        }

        public Criteria andOnexceptionBetween(Short value1, Short value2) {
            addCriterion("onexception between", value1, value2, "onexception");
            return (Criteria) this;
        }

        public Criteria andOnexceptionNotBetween(Short value1, Short value2) {
            addCriterion("onexception not between", value1, value2, "onexception");
            return (Criteria) this;
        }

        public Criteria andOffexceptionIsNull() {
            addCriterion("offexception is null");
            return (Criteria) this;
        }

        public Criteria andOffexceptionIsNotNull() {
            addCriterion("offexception is not null");
            return (Criteria) this;
        }

        public Criteria andOffexceptionEqualTo(Short value) {
            addCriterion("offexception =", value, "offexception");
            return (Criteria) this;
        }

        public Criteria andOffexceptionNotEqualTo(Short value) {
            addCriterion("offexception <>", value, "offexception");
            return (Criteria) this;
        }

        public Criteria andOffexceptionGreaterThan(Short value) {
            addCriterion("offexception >", value, "offexception");
            return (Criteria) this;
        }

        public Criteria andOffexceptionGreaterThanOrEqualTo(Short value) {
            addCriterion("offexception >=", value, "offexception");
            return (Criteria) this;
        }

        public Criteria andOffexceptionLessThan(Short value) {
            addCriterion("offexception <", value, "offexception");
            return (Criteria) this;
        }

        public Criteria andOffexceptionLessThanOrEqualTo(Short value) {
            addCriterion("offexception <=", value, "offexception");
            return (Criteria) this;
        }

        public Criteria andOffexceptionIn(List<Short> values) {
            addCriterion("offexception in", values, "offexception");
            return (Criteria) this;
        }

        public Criteria andOffexceptionNotIn(List<Short> values) {
            addCriterion("offexception not in", values, "offexception");
            return (Criteria) this;
        }

        public Criteria andOffexceptionBetween(Short value1, Short value2) {
            addCriterion("offexception between", value1, value2, "offexception");
            return (Criteria) this;
        }

        public Criteria andOffexceptionNotBetween(Short value1, Short value2) {
            addCriterion("offexception not between", value1, value2, "offexception");
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