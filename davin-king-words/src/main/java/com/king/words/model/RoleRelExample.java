package com.king.words.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RoleRelExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table rolerel
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table rolerel
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table rolerel
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rolerel
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public RoleRelExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rolerel
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rolerel
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rolerel
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rolerel
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rolerel
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rolerel
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rolerel
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rolerel
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rolerel
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rolerel
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table rolerel
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
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

        public Criteria andRolerelidIsNull() {
            addCriterion("roleRelId is null");
            return (Criteria) this;
        }

        public Criteria andRolerelidIsNotNull() {
            addCriterion("roleRelId is not null");
            return (Criteria) this;
        }

        public Criteria andRolerelidEqualTo(Integer value) {
            addCriterion("roleRelId =", value, "rolerelid");
            return (Criteria) this;
        }

        public Criteria andRolerelidNotEqualTo(Integer value) {
            addCriterion("roleRelId <>", value, "rolerelid");
            return (Criteria) this;
        }

        public Criteria andRolerelidGreaterThan(Integer value) {
            addCriterion("roleRelId >", value, "rolerelid");
            return (Criteria) this;
        }

        public Criteria andRolerelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("roleRelId >=", value, "rolerelid");
            return (Criteria) this;
        }

        public Criteria andRolerelidLessThan(Integer value) {
            addCriterion("roleRelId <", value, "rolerelid");
            return (Criteria) this;
        }

        public Criteria andRolerelidLessThanOrEqualTo(Integer value) {
            addCriterion("roleRelId <=", value, "rolerelid");
            return (Criteria) this;
        }

        public Criteria andRolerelidIn(List<Integer> values) {
            addCriterion("roleRelId in", values, "rolerelid");
            return (Criteria) this;
        }

        public Criteria andRolerelidNotIn(List<Integer> values) {
            addCriterion("roleRelId not in", values, "rolerelid");
            return (Criteria) this;
        }

        public Criteria andRolerelidBetween(Integer value1, Integer value2) {
            addCriterion("roleRelId between", value1, value2, "rolerelid");
            return (Criteria) this;
        }

        public Criteria andRolerelidNotBetween(Integer value1, Integer value2) {
            addCriterion("roleRelId not between", value1, value2, "rolerelid");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNull() {
            addCriterion("roleId is null");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNotNull() {
            addCriterion("roleId is not null");
            return (Criteria) this;
        }

        public Criteria andRoleidEqualTo(Integer value) {
            addCriterion("roleId =", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotEqualTo(Integer value) {
            addCriterion("roleId <>", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThan(Integer value) {
            addCriterion("roleId >", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("roleId >=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThan(Integer value) {
            addCriterion("roleId <", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThanOrEqualTo(Integer value) {
            addCriterion("roleId <=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidIn(List<Integer> values) {
            addCriterion("roleId in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotIn(List<Integer> values) {
            addCriterion("roleId not in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidBetween(Integer value1, Integer value2) {
            addCriterion("roleId between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotBetween(Integer value1, Integer value2) {
            addCriterion("roleId not between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andAuthidIsNull() {
            addCriterion("authId is null");
            return (Criteria) this;
        }

        public Criteria andAuthidIsNotNull() {
            addCriterion("authId is not null");
            return (Criteria) this;
        }

        public Criteria andAuthidEqualTo(Integer value) {
            addCriterion("authId =", value, "authid");
            return (Criteria) this;
        }

        public Criteria andAuthidNotEqualTo(Integer value) {
            addCriterion("authId <>", value, "authid");
            return (Criteria) this;
        }

        public Criteria andAuthidGreaterThan(Integer value) {
            addCriterion("authId >", value, "authid");
            return (Criteria) this;
        }

        public Criteria andAuthidGreaterThanOrEqualTo(Integer value) {
            addCriterion("authId >=", value, "authid");
            return (Criteria) this;
        }

        public Criteria andAuthidLessThan(Integer value) {
            addCriterion("authId <", value, "authid");
            return (Criteria) this;
        }

        public Criteria andAuthidLessThanOrEqualTo(Integer value) {
            addCriterion("authId <=", value, "authid");
            return (Criteria) this;
        }

        public Criteria andAuthidIn(List<Integer> values) {
            addCriterion("authId in", values, "authid");
            return (Criteria) this;
        }

        public Criteria andAuthidNotIn(List<Integer> values) {
            addCriterion("authId not in", values, "authid");
            return (Criteria) this;
        }

        public Criteria andAuthidBetween(Integer value1, Integer value2) {
            addCriterion("authId between", value1, value2, "authid");
            return (Criteria) this;
        }

        public Criteria andAuthidNotBetween(Integer value1, Integer value2) {
            addCriterion("authId not between", value1, value2, "authid");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("createDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("createDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("createDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("createDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("createDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("createDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("createDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("createDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("createDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("createDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("createDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("createDate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andExpiredateIsNull() {
            addCriterion("expireDate is null");
            return (Criteria) this;
        }

        public Criteria andExpiredateIsNotNull() {
            addCriterion("expireDate is not null");
            return (Criteria) this;
        }

        public Criteria andExpiredateEqualTo(Date value) {
            addCriterion("expireDate =", value, "expiredate");
            return (Criteria) this;
        }

        public Criteria andExpiredateNotEqualTo(Date value) {
            addCriterion("expireDate <>", value, "expiredate");
            return (Criteria) this;
        }

        public Criteria andExpiredateGreaterThan(Date value) {
            addCriterion("expireDate >", value, "expiredate");
            return (Criteria) this;
        }

        public Criteria andExpiredateGreaterThanOrEqualTo(Date value) {
            addCriterion("expireDate >=", value, "expiredate");
            return (Criteria) this;
        }

        public Criteria andExpiredateLessThan(Date value) {
            addCriterion("expireDate <", value, "expiredate");
            return (Criteria) this;
        }

        public Criteria andExpiredateLessThanOrEqualTo(Date value) {
            addCriterion("expireDate <=", value, "expiredate");
            return (Criteria) this;
        }

        public Criteria andExpiredateIn(List<Date> values) {
            addCriterion("expireDate in", values, "expiredate");
            return (Criteria) this;
        }

        public Criteria andExpiredateNotIn(List<Date> values) {
            addCriterion("expireDate not in", values, "expiredate");
            return (Criteria) this;
        }

        public Criteria andExpiredateBetween(Date value1, Date value2) {
            addCriterion("expireDate between", value1, value2, "expiredate");
            return (Criteria) this;
        }

        public Criteria andExpiredateNotBetween(Date value1, Date value2) {
            addCriterion("expireDate not between", value1, value2, "expiredate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table rolerel
     *
     * @mbg.generated do_not_delete_during_merge Wed Sep 04 12:29:19 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table rolerel
     *
     * @mbg.generated Wed Sep 04 12:29:19 CST 2019
     */
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