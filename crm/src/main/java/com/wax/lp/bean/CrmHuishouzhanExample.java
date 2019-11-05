package com.wax.lp.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CrmHuishouzhanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CrmHuishouzhanExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andHidIsNull() {
            addCriterion("hid is null");
            return (Criteria) this;
        }

        public Criteria andHidIsNotNull() {
            addCriterion("hid is not null");
            return (Criteria) this;
        }

        public Criteria andHidEqualTo(Integer value) {
            addCriterion("hid =", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotEqualTo(Integer value) {
            addCriterion("hid <>", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidGreaterThan(Integer value) {
            addCriterion("hid >", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidGreaterThanOrEqualTo(Integer value) {
            addCriterion("hid >=", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidLessThan(Integer value) {
            addCriterion("hid <", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidLessThanOrEqualTo(Integer value) {
            addCriterion("hid <=", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidIn(List<Integer> values) {
            addCriterion("hid in", values, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotIn(List<Integer> values) {
            addCriterion("hid not in", values, "hid");
            return (Criteria) this;
        }

        public Criteria andHidBetween(Integer value1, Integer value2) {
            addCriterion("hid between", value1, value2, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotBetween(Integer value1, Integer value2) {
            addCriterion("hid not between", value1, value2, "hid");
            return (Criteria) this;
        }

        public Criteria andOwneridIsNull() {
            addCriterion("ownerid is null");
            return (Criteria) this;
        }

        public Criteria andOwneridIsNotNull() {
            addCriterion("ownerid is not null");
            return (Criteria) this;
        }

        public Criteria andOwneridEqualTo(Integer value) {
            addCriterion("ownerid =", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridNotEqualTo(Integer value) {
            addCriterion("ownerid <>", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridGreaterThan(Integer value) {
            addCriterion("ownerid >", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridGreaterThanOrEqualTo(Integer value) {
            addCriterion("ownerid >=", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridLessThan(Integer value) {
            addCriterion("ownerid <", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridLessThanOrEqualTo(Integer value) {
            addCriterion("ownerid <=", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridIn(List<Integer> values) {
            addCriterion("ownerid in", values, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridNotIn(List<Integer> values) {
            addCriterion("ownerid not in", values, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridBetween(Integer value1, Integer value2) {
            addCriterion("ownerid between", value1, value2, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridNotBetween(Integer value1, Integer value2) {
            addCriterion("ownerid not between", value1, value2, "ownerid");
            return (Criteria) this;
        }

        public Criteria andCreateidIsNull() {
            addCriterion("createid is null");
            return (Criteria) this;
        }

        public Criteria andCreateidIsNotNull() {
            addCriterion("createid is not null");
            return (Criteria) this;
        }

        public Criteria andCreateidEqualTo(Integer value) {
            addCriterion("createid =", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidNotEqualTo(Integer value) {
            addCriterion("createid <>", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidGreaterThan(Integer value) {
            addCriterion("createid >", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("createid >=", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidLessThan(Integer value) {
            addCriterion("createid <", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidLessThanOrEqualTo(Integer value) {
            addCriterion("createid <=", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidIn(List<Integer> values) {
            addCriterion("createid in", values, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidNotIn(List<Integer> values) {
            addCriterion("createid not in", values, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidBetween(Integer value1, Integer value2) {
            addCriterion("createid between", value1, value2, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidNotBetween(Integer value1, Integer value2) {
            addCriterion("createid not between", value1, value2, "createid");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNull() {
            addCriterion("companyname is null");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNotNull() {
            addCriterion("companyname is not null");
            return (Criteria) this;
        }

        public Criteria andCompanynameEqualTo(String value) {
            addCriterion("companyname =", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotEqualTo(String value) {
            addCriterion("companyname <>", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThan(String value) {
            addCriterion("companyname >", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("companyname >=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThan(String value) {
            addCriterion("companyname <", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThanOrEqualTo(String value) {
            addCriterion("companyname <=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLike(String value) {
            addCriterion("companyname like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotLike(String value) {
            addCriterion("companyname not like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameIn(List<String> values) {
            addCriterion("companyname in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotIn(List<String> values) {
            addCriterion("companyname not in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameBetween(String value1, String value2) {
            addCriterion("companyname between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotBetween(String value1, String value2) {
            addCriterion("companyname not between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andContactspositionIsNull() {
            addCriterion("contactsposition is null");
            return (Criteria) this;
        }

        public Criteria andContactspositionIsNotNull() {
            addCriterion("contactsposition is not null");
            return (Criteria) this;
        }

        public Criteria andContactspositionEqualTo(String value) {
            addCriterion("contactsposition =", value, "contactsposition");
            return (Criteria) this;
        }

        public Criteria andContactspositionNotEqualTo(String value) {
            addCriterion("contactsposition <>", value, "contactsposition");
            return (Criteria) this;
        }

        public Criteria andContactspositionGreaterThan(String value) {
            addCriterion("contactsposition >", value, "contactsposition");
            return (Criteria) this;
        }

        public Criteria andContactspositionGreaterThanOrEqualTo(String value) {
            addCriterion("contactsposition >=", value, "contactsposition");
            return (Criteria) this;
        }

        public Criteria andContactspositionLessThan(String value) {
            addCriterion("contactsposition <", value, "contactsposition");
            return (Criteria) this;
        }

        public Criteria andContactspositionLessThanOrEqualTo(String value) {
            addCriterion("contactsposition <=", value, "contactsposition");
            return (Criteria) this;
        }

        public Criteria andContactspositionLike(String value) {
            addCriterion("contactsposition like", value, "contactsposition");
            return (Criteria) this;
        }

        public Criteria andContactspositionNotLike(String value) {
            addCriterion("contactsposition not like", value, "contactsposition");
            return (Criteria) this;
        }

        public Criteria andContactspositionIn(List<String> values) {
            addCriterion("contactsposition in", values, "contactsposition");
            return (Criteria) this;
        }

        public Criteria andContactspositionNotIn(List<String> values) {
            addCriterion("contactsposition not in", values, "contactsposition");
            return (Criteria) this;
        }

        public Criteria andContactspositionBetween(String value1, String value2) {
            addCriterion("contactsposition between", value1, value2, "contactsposition");
            return (Criteria) this;
        }

        public Criteria andContactspositionNotBetween(String value1, String value2) {
            addCriterion("contactsposition not between", value1, value2, "contactsposition");
            return (Criteria) this;
        }

        public Criteria andContactsnameIsNull() {
            addCriterion("contactsname is null");
            return (Criteria) this;
        }

        public Criteria andContactsnameIsNotNull() {
            addCriterion("contactsname is not null");
            return (Criteria) this;
        }

        public Criteria andContactsnameEqualTo(String value) {
            addCriterion("contactsname =", value, "contactsname");
            return (Criteria) this;
        }

        public Criteria andContactsnameNotEqualTo(String value) {
            addCriterion("contactsname <>", value, "contactsname");
            return (Criteria) this;
        }

        public Criteria andContactsnameGreaterThan(String value) {
            addCriterion("contactsname >", value, "contactsname");
            return (Criteria) this;
        }

        public Criteria andContactsnameGreaterThanOrEqualTo(String value) {
            addCriterion("contactsname >=", value, "contactsname");
            return (Criteria) this;
        }

        public Criteria andContactsnameLessThan(String value) {
            addCriterion("contactsname <", value, "contactsname");
            return (Criteria) this;
        }

        public Criteria andContactsnameLessThanOrEqualTo(String value) {
            addCriterion("contactsname <=", value, "contactsname");
            return (Criteria) this;
        }

        public Criteria andContactsnameLike(String value) {
            addCriterion("contactsname like", value, "contactsname");
            return (Criteria) this;
        }

        public Criteria andContactsnameNotLike(String value) {
            addCriterion("contactsname not like", value, "contactsname");
            return (Criteria) this;
        }

        public Criteria andContactsnameIn(List<String> values) {
            addCriterion("contactsname in", values, "contactsname");
            return (Criteria) this;
        }

        public Criteria andContactsnameNotIn(List<String> values) {
            addCriterion("contactsname not in", values, "contactsname");
            return (Criteria) this;
        }

        public Criteria andContactsnameBetween(String value1, String value2) {
            addCriterion("contactsname between", value1, value2, "contactsname");
            return (Criteria) this;
        }

        public Criteria andContactsnameNotBetween(String value1, String value2) {
            addCriterion("contactsname not between", value1, value2, "contactsname");
            return (Criteria) this;
        }

        public Criteria andSaltnameIsNull() {
            addCriterion("saltname is null");
            return (Criteria) this;
        }

        public Criteria andSaltnameIsNotNull() {
            addCriterion("saltname is not null");
            return (Criteria) this;
        }

        public Criteria andSaltnameEqualTo(String value) {
            addCriterion("saltname =", value, "saltname");
            return (Criteria) this;
        }

        public Criteria andSaltnameNotEqualTo(String value) {
            addCriterion("saltname <>", value, "saltname");
            return (Criteria) this;
        }

        public Criteria andSaltnameGreaterThan(String value) {
            addCriterion("saltname >", value, "saltname");
            return (Criteria) this;
        }

        public Criteria andSaltnameGreaterThanOrEqualTo(String value) {
            addCriterion("saltname >=", value, "saltname");
            return (Criteria) this;
        }

        public Criteria andSaltnameLessThan(String value) {
            addCriterion("saltname <", value, "saltname");
            return (Criteria) this;
        }

        public Criteria andSaltnameLessThanOrEqualTo(String value) {
            addCriterion("saltname <=", value, "saltname");
            return (Criteria) this;
        }

        public Criteria andSaltnameLike(String value) {
            addCriterion("saltname like", value, "saltname");
            return (Criteria) this;
        }

        public Criteria andSaltnameNotLike(String value) {
            addCriterion("saltname not like", value, "saltname");
            return (Criteria) this;
        }

        public Criteria andSaltnameIn(List<String> values) {
            addCriterion("saltname in", values, "saltname");
            return (Criteria) this;
        }

        public Criteria andSaltnameNotIn(List<String> values) {
            addCriterion("saltname not in", values, "saltname");
            return (Criteria) this;
        }

        public Criteria andSaltnameBetween(String value1, String value2) {
            addCriterion("saltname between", value1, value2, "saltname");
            return (Criteria) this;
        }

        public Criteria andSaltnameNotBetween(String value1, String value2) {
            addCriterion("saltname not between", value1, value2, "saltname");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterionForJDBCDate("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterionForJDBCDate("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("updatetime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andDeletestatusIsNull() {
            addCriterion("deletestatus is null");
            return (Criteria) this;
        }

        public Criteria andDeletestatusIsNotNull() {
            addCriterion("deletestatus is not null");
            return (Criteria) this;
        }

        public Criteria andDeletestatusEqualTo(Integer value) {
            addCriterion("deletestatus =", value, "deletestatus");
            return (Criteria) this;
        }

        public Criteria andDeletestatusNotEqualTo(Integer value) {
            addCriterion("deletestatus <>", value, "deletestatus");
            return (Criteria) this;
        }

        public Criteria andDeletestatusGreaterThan(Integer value) {
            addCriterion("deletestatus >", value, "deletestatus");
            return (Criteria) this;
        }

        public Criteria andDeletestatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("deletestatus >=", value, "deletestatus");
            return (Criteria) this;
        }

        public Criteria andDeletestatusLessThan(Integer value) {
            addCriterion("deletestatus <", value, "deletestatus");
            return (Criteria) this;
        }

        public Criteria andDeletestatusLessThanOrEqualTo(Integer value) {
            addCriterion("deletestatus <=", value, "deletestatus");
            return (Criteria) this;
        }

        public Criteria andDeletestatusIn(List<Integer> values) {
            addCriterion("deletestatus in", values, "deletestatus");
            return (Criteria) this;
        }

        public Criteria andDeletestatusNotIn(List<Integer> values) {
            addCriterion("deletestatus not in", values, "deletestatus");
            return (Criteria) this;
        }

        public Criteria andDeletestatusBetween(Integer value1, Integer value2) {
            addCriterion("deletestatus between", value1, value2, "deletestatus");
            return (Criteria) this;
        }

        public Criteria andDeletestatusNotBetween(Integer value1, Integer value2) {
            addCriterion("deletestatus not between", value1, value2, "deletestatus");
            return (Criteria) this;
        }

        public Criteria andDeleteuseridIsNull() {
            addCriterion("deleteuserid is null");
            return (Criteria) this;
        }

        public Criteria andDeleteuseridIsNotNull() {
            addCriterion("deleteuserid is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteuseridEqualTo(Integer value) {
            addCriterion("deleteuserid =", value, "deleteuserid");
            return (Criteria) this;
        }

        public Criteria andDeleteuseridNotEqualTo(Integer value) {
            addCriterion("deleteuserid <>", value, "deleteuserid");
            return (Criteria) this;
        }

        public Criteria andDeleteuseridGreaterThan(Integer value) {
            addCriterion("deleteuserid >", value, "deleteuserid");
            return (Criteria) this;
        }

        public Criteria andDeleteuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("deleteuserid >=", value, "deleteuserid");
            return (Criteria) this;
        }

        public Criteria andDeleteuseridLessThan(Integer value) {
            addCriterion("deleteuserid <", value, "deleteuserid");
            return (Criteria) this;
        }

        public Criteria andDeleteuseridLessThanOrEqualTo(Integer value) {
            addCriterion("deleteuserid <=", value, "deleteuserid");
            return (Criteria) this;
        }

        public Criteria andDeleteuseridIn(List<Integer> values) {
            addCriterion("deleteuserid in", values, "deleteuserid");
            return (Criteria) this;
        }

        public Criteria andDeleteuseridNotIn(List<Integer> values) {
            addCriterion("deleteuserid not in", values, "deleteuserid");
            return (Criteria) this;
        }

        public Criteria andDeleteuseridBetween(Integer value1, Integer value2) {
            addCriterion("deleteuserid between", value1, value2, "deleteuserid");
            return (Criteria) this;
        }

        public Criteria andDeleteuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("deleteuserid not between", value1, value2, "deleteuserid");
            return (Criteria) this;
        }

        public Criteria andDeletetimeIsNull() {
            addCriterion("deletetime is null");
            return (Criteria) this;
        }

        public Criteria andDeletetimeIsNotNull() {
            addCriterion("deletetime is not null");
            return (Criteria) this;
        }

        public Criteria andDeletetimeEqualTo(Date value) {
            addCriterionForJDBCDate("deletetime =", value, "deletetime");
            return (Criteria) this;
        }

        public Criteria andDeletetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("deletetime <>", value, "deletetime");
            return (Criteria) this;
        }

        public Criteria andDeletetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("deletetime >", value, "deletetime");
            return (Criteria) this;
        }

        public Criteria andDeletetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("deletetime >=", value, "deletetime");
            return (Criteria) this;
        }

        public Criteria andDeletetimeLessThan(Date value) {
            addCriterionForJDBCDate("deletetime <", value, "deletetime");
            return (Criteria) this;
        }

        public Criteria andDeletetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("deletetime <=", value, "deletetime");
            return (Criteria) this;
        }

        public Criteria andDeletetimeIn(List<Date> values) {
            addCriterionForJDBCDate("deletetime in", values, "deletetime");
            return (Criteria) this;
        }

        public Criteria andDeletetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("deletetime not in", values, "deletetime");
            return (Criteria) this;
        }

        public Criteria andDeletetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("deletetime between", value1, value2, "deletetime");
            return (Criteria) this;
        }

        public Criteria andDeletetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("deletetime not between", value1, value2, "deletetime");
            return (Criteria) this;
        }

        public Criteria andIstransformedIsNull() {
            addCriterion("istransformed is null");
            return (Criteria) this;
        }

        public Criteria andIstransformedIsNotNull() {
            addCriterion("istransformed is not null");
            return (Criteria) this;
        }

        public Criteria andIstransformedEqualTo(Integer value) {
            addCriterion("istransformed =", value, "istransformed");
            return (Criteria) this;
        }

        public Criteria andIstransformedNotEqualTo(Integer value) {
            addCriterion("istransformed <>", value, "istransformed");
            return (Criteria) this;
        }

        public Criteria andIstransformedGreaterThan(Integer value) {
            addCriterion("istransformed >", value, "istransformed");
            return (Criteria) this;
        }

        public Criteria andIstransformedGreaterThanOrEqualTo(Integer value) {
            addCriterion("istransformed >=", value, "istransformed");
            return (Criteria) this;
        }

        public Criteria andIstransformedLessThan(Integer value) {
            addCriterion("istransformed <", value, "istransformed");
            return (Criteria) this;
        }

        public Criteria andIstransformedLessThanOrEqualTo(Integer value) {
            addCriterion("istransformed <=", value, "istransformed");
            return (Criteria) this;
        }

        public Criteria andIstransformedIn(List<Integer> values) {
            addCriterion("istransformed in", values, "istransformed");
            return (Criteria) this;
        }

        public Criteria andIstransformedNotIn(List<Integer> values) {
            addCriterion("istransformed not in", values, "istransformed");
            return (Criteria) this;
        }

        public Criteria andIstransformedBetween(Integer value1, Integer value2) {
            addCriterion("istransformed between", value1, value2, "istransformed");
            return (Criteria) this;
        }

        public Criteria andIstransformedNotBetween(Integer value1, Integer value2) {
            addCriterion("istransformed not between", value1, value2, "istransformed");
            return (Criteria) this;
        }

        public Criteria andTransformuseridIsNull() {
            addCriterion("transformuserid is null");
            return (Criteria) this;
        }

        public Criteria andTransformuseridIsNotNull() {
            addCriterion("transformuserid is not null");
            return (Criteria) this;
        }

        public Criteria andTransformuseridEqualTo(Integer value) {
            addCriterion("transformuserid =", value, "transformuserid");
            return (Criteria) this;
        }

        public Criteria andTransformuseridNotEqualTo(Integer value) {
            addCriterion("transformuserid <>", value, "transformuserid");
            return (Criteria) this;
        }

        public Criteria andTransformuseridGreaterThan(Integer value) {
            addCriterion("transformuserid >", value, "transformuserid");
            return (Criteria) this;
        }

        public Criteria andTransformuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("transformuserid >=", value, "transformuserid");
            return (Criteria) this;
        }

        public Criteria andTransformuseridLessThan(Integer value) {
            addCriterion("transformuserid <", value, "transformuserid");
            return (Criteria) this;
        }

        public Criteria andTransformuseridLessThanOrEqualTo(Integer value) {
            addCriterion("transformuserid <=", value, "transformuserid");
            return (Criteria) this;
        }

        public Criteria andTransformuseridIn(List<Integer> values) {
            addCriterion("transformuserid in", values, "transformuserid");
            return (Criteria) this;
        }

        public Criteria andTransformuseridNotIn(List<Integer> values) {
            addCriterion("transformuserid not in", values, "transformuserid");
            return (Criteria) this;
        }

        public Criteria andTransformuseridBetween(Integer value1, Integer value2) {
            addCriterion("transformuserid between", value1, value2, "transformuserid");
            return (Criteria) this;
        }

        public Criteria andTransformuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("transformuserid not between", value1, value2, "transformuserid");
            return (Criteria) this;
        }

        public Criteria andContactsidIsNull() {
            addCriterion("contactsid is null");
            return (Criteria) this;
        }

        public Criteria andContactsidIsNotNull() {
            addCriterion("contactsid is not null");
            return (Criteria) this;
        }

        public Criteria andContactsidEqualTo(Integer value) {
            addCriterion("contactsid =", value, "contactsid");
            return (Criteria) this;
        }

        public Criteria andContactsidNotEqualTo(Integer value) {
            addCriterion("contactsid <>", value, "contactsid");
            return (Criteria) this;
        }

        public Criteria andContactsidGreaterThan(Integer value) {
            addCriterion("contactsid >", value, "contactsid");
            return (Criteria) this;
        }

        public Criteria andContactsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("contactsid >=", value, "contactsid");
            return (Criteria) this;
        }

        public Criteria andContactsidLessThan(Integer value) {
            addCriterion("contactsid <", value, "contactsid");
            return (Criteria) this;
        }

        public Criteria andContactsidLessThanOrEqualTo(Integer value) {
            addCriterion("contactsid <=", value, "contactsid");
            return (Criteria) this;
        }

        public Criteria andContactsidIn(List<Integer> values) {
            addCriterion("contactsid in", values, "contactsid");
            return (Criteria) this;
        }

        public Criteria andContactsidNotIn(List<Integer> values) {
            addCriterion("contactsid not in", values, "contactsid");
            return (Criteria) this;
        }

        public Criteria andContactsidBetween(Integer value1, Integer value2) {
            addCriterion("contactsid between", value1, value2, "contactsid");
            return (Criteria) this;
        }

        public Criteria andContactsidNotBetween(Integer value1, Integer value2) {
            addCriterion("contactsid not between", value1, value2, "contactsid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNull() {
            addCriterion("customerid is null");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNotNull() {
            addCriterion("customerid is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeridEqualTo(Integer value) {
            addCriterion("customerid =", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotEqualTo(Integer value) {
            addCriterion("customerid <>", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThan(Integer value) {
            addCriterion("customerid >", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("customerid >=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThan(Integer value) {
            addCriterion("customerid <", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThanOrEqualTo(Integer value) {
            addCriterion("customerid <=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIn(List<Integer> values) {
            addCriterion("customerid in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotIn(List<Integer> values) {
            addCriterion("customerid not in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridBetween(Integer value1, Integer value2) {
            addCriterion("customerid between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotBetween(Integer value1, Integer value2) {
            addCriterion("customerid not between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andBusinessidIsNull() {
            addCriterion("businessid is null");
            return (Criteria) this;
        }

        public Criteria andBusinessidIsNotNull() {
            addCriterion("businessid is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessidEqualTo(Integer value) {
            addCriterion("businessid =", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidNotEqualTo(Integer value) {
            addCriterion("businessid <>", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidGreaterThan(Integer value) {
            addCriterion("businessid >", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidGreaterThanOrEqualTo(Integer value) {
            addCriterion("businessid >=", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidLessThan(Integer value) {
            addCriterion("businessid <", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidLessThanOrEqualTo(Integer value) {
            addCriterion("businessid <=", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidIn(List<Integer> values) {
            addCriterion("businessid in", values, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidNotIn(List<Integer> values) {
            addCriterion("businessid not in", values, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidBetween(Integer value1, Integer value2) {
            addCriterion("businessid between", value1, value2, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidNotBetween(Integer value1, Integer value2) {
            addCriterion("businessid not between", value1, value2, "businessid");
            return (Criteria) this;
        }

        public Criteria andNextstepIsNull() {
            addCriterion("nextstep is null");
            return (Criteria) this;
        }

        public Criteria andNextstepIsNotNull() {
            addCriterion("nextstep is not null");
            return (Criteria) this;
        }

        public Criteria andNextstepEqualTo(String value) {
            addCriterion("nextstep =", value, "nextstep");
            return (Criteria) this;
        }

        public Criteria andNextstepNotEqualTo(String value) {
            addCriterion("nextstep <>", value, "nextstep");
            return (Criteria) this;
        }

        public Criteria andNextstepGreaterThan(String value) {
            addCriterion("nextstep >", value, "nextstep");
            return (Criteria) this;
        }

        public Criteria andNextstepGreaterThanOrEqualTo(String value) {
            addCriterion("nextstep >=", value, "nextstep");
            return (Criteria) this;
        }

        public Criteria andNextstepLessThan(String value) {
            addCriterion("nextstep <", value, "nextstep");
            return (Criteria) this;
        }

        public Criteria andNextstepLessThanOrEqualTo(String value) {
            addCriterion("nextstep <=", value, "nextstep");
            return (Criteria) this;
        }

        public Criteria andNextstepLike(String value) {
            addCriterion("nextstep like", value, "nextstep");
            return (Criteria) this;
        }

        public Criteria andNextstepNotLike(String value) {
            addCriterion("nextstep not like", value, "nextstep");
            return (Criteria) this;
        }

        public Criteria andNextstepIn(List<String> values) {
            addCriterion("nextstep in", values, "nextstep");
            return (Criteria) this;
        }

        public Criteria andNextstepNotIn(List<String> values) {
            addCriterion("nextstep not in", values, "nextstep");
            return (Criteria) this;
        }

        public Criteria andNextstepBetween(String value1, String value2) {
            addCriterion("nextstep between", value1, value2, "nextstep");
            return (Criteria) this;
        }

        public Criteria andNextstepNotBetween(String value1, String value2) {
            addCriterion("nextstep not between", value1, value2, "nextstep");
            return (Criteria) this;
        }

        public Criteria andNexttimeIsNull() {
            addCriterion("nexttime is null");
            return (Criteria) this;
        }

        public Criteria andNexttimeIsNotNull() {
            addCriterion("nexttime is not null");
            return (Criteria) this;
        }

        public Criteria andNexttimeEqualTo(Date value) {
            addCriterionForJDBCDate("nexttime =", value, "nexttime");
            return (Criteria) this;
        }

        public Criteria andNexttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("nexttime <>", value, "nexttime");
            return (Criteria) this;
        }

        public Criteria andNexttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("nexttime >", value, "nexttime");
            return (Criteria) this;
        }

        public Criteria andNexttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("nexttime >=", value, "nexttime");
            return (Criteria) this;
        }

        public Criteria andNexttimeLessThan(Date value) {
            addCriterionForJDBCDate("nexttime <", value, "nexttime");
            return (Criteria) this;
        }

        public Criteria andNexttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("nexttime <=", value, "nexttime");
            return (Criteria) this;
        }

        public Criteria andNexttimeIn(List<Date> values) {
            addCriterionForJDBCDate("nexttime in", values, "nexttime");
            return (Criteria) this;
        }

        public Criteria andNexttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("nexttime not in", values, "nexttime");
            return (Criteria) this;
        }

        public Criteria andNexttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("nexttime between", value1, value2, "nexttime");
            return (Criteria) this;
        }

        public Criteria andNexttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("nexttime not between", value1, value2, "nexttime");
            return (Criteria) this;
        }

        public Criteria andHavetimeIsNull() {
            addCriterion("havetime is null");
            return (Criteria) this;
        }

        public Criteria andHavetimeIsNotNull() {
            addCriterion("havetime is not null");
            return (Criteria) this;
        }

        public Criteria andHavetimeEqualTo(Date value) {
            addCriterionForJDBCDate("havetime =", value, "havetime");
            return (Criteria) this;
        }

        public Criteria andHavetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("havetime <>", value, "havetime");
            return (Criteria) this;
        }

        public Criteria andHavetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("havetime >", value, "havetime");
            return (Criteria) this;
        }

        public Criteria andHavetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("havetime >=", value, "havetime");
            return (Criteria) this;
        }

        public Criteria andHavetimeLessThan(Date value) {
            addCriterionForJDBCDate("havetime <", value, "havetime");
            return (Criteria) this;
        }

        public Criteria andHavetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("havetime <=", value, "havetime");
            return (Criteria) this;
        }

        public Criteria andHavetimeIn(List<Date> values) {
            addCriterionForJDBCDate("havetime in", values, "havetime");
            return (Criteria) this;
        }

        public Criteria andHavetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("havetime not in", values, "havetime");
            return (Criteria) this;
        }

        public Criteria andHavetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("havetime between", value1, value2, "havetime");
            return (Criteria) this;
        }

        public Criteria andHavetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("havetime not between", value1, value2, "havetime");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andLeadnoteIsNull() {
            addCriterion("leadnote is null");
            return (Criteria) this;
        }

        public Criteria andLeadnoteIsNotNull() {
            addCriterion("leadnote is not null");
            return (Criteria) this;
        }

        public Criteria andLeadnoteEqualTo(String value) {
            addCriterion("leadnote =", value, "leadnote");
            return (Criteria) this;
        }

        public Criteria andLeadnoteNotEqualTo(String value) {
            addCriterion("leadnote <>", value, "leadnote");
            return (Criteria) this;
        }

        public Criteria andLeadnoteGreaterThan(String value) {
            addCriterion("leadnote >", value, "leadnote");
            return (Criteria) this;
        }

        public Criteria andLeadnoteGreaterThanOrEqualTo(String value) {
            addCriterion("leadnote >=", value, "leadnote");
            return (Criteria) this;
        }

        public Criteria andLeadnoteLessThan(String value) {
            addCriterion("leadnote <", value, "leadnote");
            return (Criteria) this;
        }

        public Criteria andLeadnoteLessThanOrEqualTo(String value) {
            addCriterion("leadnote <=", value, "leadnote");
            return (Criteria) this;
        }

        public Criteria andLeadnoteLike(String value) {
            addCriterion("leadnote like", value, "leadnote");
            return (Criteria) this;
        }

        public Criteria andLeadnoteNotLike(String value) {
            addCriterion("leadnote not like", value, "leadnote");
            return (Criteria) this;
        }

        public Criteria andLeadnoteIn(List<String> values) {
            addCriterion("leadnote in", values, "leadnote");
            return (Criteria) this;
        }

        public Criteria andLeadnoteNotIn(List<String> values) {
            addCriterion("leadnote not in", values, "leadnote");
            return (Criteria) this;
        }

        public Criteria andLeadnoteBetween(String value1, String value2) {
            addCriterion("leadnote between", value1, value2, "leadnote");
            return (Criteria) this;
        }

        public Criteria andLeadnoteNotBetween(String value1, String value2) {
            addCriterion("leadnote not between", value1, value2, "leadnote");
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