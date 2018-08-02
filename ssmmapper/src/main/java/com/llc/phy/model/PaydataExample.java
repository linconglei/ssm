package com.llc.phy.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaydataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaydataExample() {
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

        public Criteria andPaydataIdIsNull() {
            addCriterion("PAYDATA_ID is null");
            return (Criteria) this;
        }

        public Criteria andPaydataIdIsNotNull() {
            addCriterion("PAYDATA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPaydataIdEqualTo(Short value) {
            addCriterion("PAYDATA_ID =", value, "paydataId");
            return (Criteria) this;
        }

        public Criteria andPaydataIdNotEqualTo(Short value) {
            addCriterion("PAYDATA_ID <>", value, "paydataId");
            return (Criteria) this;
        }

        public Criteria andPaydataIdGreaterThan(Short value) {
            addCriterion("PAYDATA_ID >", value, "paydataId");
            return (Criteria) this;
        }

        public Criteria andPaydataIdGreaterThanOrEqualTo(Short value) {
            addCriterion("PAYDATA_ID >=", value, "paydataId");
            return (Criteria) this;
        }

        public Criteria andPaydataIdLessThan(Short value) {
            addCriterion("PAYDATA_ID <", value, "paydataId");
            return (Criteria) this;
        }

        public Criteria andPaydataIdLessThanOrEqualTo(Short value) {
            addCriterion("PAYDATA_ID <=", value, "paydataId");
            return (Criteria) this;
        }

        public Criteria andPaydataIdIn(List<Short> values) {
            addCriterion("PAYDATA_ID in", values, "paydataId");
            return (Criteria) this;
        }

        public Criteria andPaydataIdNotIn(List<Short> values) {
            addCriterion("PAYDATA_ID not in", values, "paydataId");
            return (Criteria) this;
        }

        public Criteria andPaydataIdBetween(Short value1, Short value2) {
            addCriterion("PAYDATA_ID between", value1, value2, "paydataId");
            return (Criteria) this;
        }

        public Criteria andPaydataIdNotBetween(Short value1, Short value2) {
            addCriterion("PAYDATA_ID not between", value1, value2, "paydataId");
            return (Criteria) this;
        }

        public Criteria andBatchIdIsNull() {
            addCriterion("BATCH_ID is null");
            return (Criteria) this;
        }

        public Criteria andBatchIdIsNotNull() {
            addCriterion("BATCH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBatchIdEqualTo(Short value) {
            addCriterion("BATCH_ID =", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotEqualTo(Short value) {
            addCriterion("BATCH_ID <>", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdGreaterThan(Short value) {
            addCriterion("BATCH_ID >", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdGreaterThanOrEqualTo(Short value) {
            addCriterion("BATCH_ID >=", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdLessThan(Short value) {
            addCriterion("BATCH_ID <", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdLessThanOrEqualTo(Short value) {
            addCriterion("BATCH_ID <=", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdIn(List<Short> values) {
            addCriterion("BATCH_ID in", values, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotIn(List<Short> values) {
            addCriterion("BATCH_ID not in", values, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdBetween(Short value1, Short value2) {
            addCriterion("BATCH_ID between", value1, value2, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotBetween(Short value1, Short value2) {
            addCriterion("BATCH_ID not between", value1, value2, "batchId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(Short value) {
            addCriterion("CREATE_USER =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(Short value) {
            addCriterion("CREATE_USER <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(Short value) {
            addCriterion("CREATE_USER >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(Short value) {
            addCriterion("CREATE_USER >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(Short value) {
            addCriterion("CREATE_USER <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(Short value) {
            addCriterion("CREATE_USER <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<Short> values) {
            addCriterion("CREATE_USER in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<Short> values) {
            addCriterion("CREATE_USER not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(Short value1, Short value2) {
            addCriterion("CREATE_USER between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(Short value1, Short value2) {
            addCriterion("CREATE_USER not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIsNull() {
            addCriterion("LAST_UPDATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIsNotNull() {
            addCriterion("LAST_UPDATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserEqualTo(Short value) {
            addCriterion("LAST_UPDATE_USER =", value, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserNotEqualTo(Short value) {
            addCriterion("LAST_UPDATE_USER <>", value, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserGreaterThan(Short value) {
            addCriterion("LAST_UPDATE_USER >", value, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserGreaterThanOrEqualTo(Short value) {
            addCriterion("LAST_UPDATE_USER >=", value, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserLessThan(Short value) {
            addCriterion("LAST_UPDATE_USER <", value, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserLessThanOrEqualTo(Short value) {
            addCriterion("LAST_UPDATE_USER <=", value, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIn(List<Short> values) {
            addCriterion("LAST_UPDATE_USER in", values, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserNotIn(List<Short> values) {
            addCriterion("LAST_UPDATE_USER not in", values, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserBetween(Short value1, Short value2) {
            addCriterion("LAST_UPDATE_USER between", value1, value2, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserNotBetween(Short value1, Short value2) {
            addCriterion("LAST_UPDATE_USER not between", value1, value2, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNull() {
            addCriterion("LAST_UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNotNull() {
            addCriterion("LAST_UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeEqualTo(Date value) {
            addCriterion("LAST_UPDATE_TIME =", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotEqualTo(Date value) {
            addCriterion("LAST_UPDATE_TIME <>", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThan(Date value) {
            addCriterion("LAST_UPDATE_TIME >", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_TIME >=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThan(Date value) {
            addCriterion("LAST_UPDATE_TIME <", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_TIME <=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIn(List<Date> values) {
            addCriterion("LAST_UPDATE_TIME in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotIn(List<Date> values) {
            addCriterion("LAST_UPDATE_TIME not in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATE_TIME between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATE_TIME not between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBusinessFromIsNull() {
            addCriterion("BUSINESS_FROM is null");
            return (Criteria) this;
        }

        public Criteria andBusinessFromIsNotNull() {
            addCriterion("BUSINESS_FROM is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessFromEqualTo(String value) {
            addCriterion("BUSINESS_FROM =", value, "businessFrom");
            return (Criteria) this;
        }

        public Criteria andBusinessFromNotEqualTo(String value) {
            addCriterion("BUSINESS_FROM <>", value, "businessFrom");
            return (Criteria) this;
        }

        public Criteria andBusinessFromGreaterThan(String value) {
            addCriterion("BUSINESS_FROM >", value, "businessFrom");
            return (Criteria) this;
        }

        public Criteria andBusinessFromGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_FROM >=", value, "businessFrom");
            return (Criteria) this;
        }

        public Criteria andBusinessFromLessThan(String value) {
            addCriterion("BUSINESS_FROM <", value, "businessFrom");
            return (Criteria) this;
        }

        public Criteria andBusinessFromLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_FROM <=", value, "businessFrom");
            return (Criteria) this;
        }

        public Criteria andBusinessFromLike(String value) {
            addCriterion("BUSINESS_FROM like", value, "businessFrom");
            return (Criteria) this;
        }

        public Criteria andBusinessFromNotLike(String value) {
            addCriterion("BUSINESS_FROM not like", value, "businessFrom");
            return (Criteria) this;
        }

        public Criteria andBusinessFromIn(List<String> values) {
            addCriterion("BUSINESS_FROM in", values, "businessFrom");
            return (Criteria) this;
        }

        public Criteria andBusinessFromNotIn(List<String> values) {
            addCriterion("BUSINESS_FROM not in", values, "businessFrom");
            return (Criteria) this;
        }

        public Criteria andBusinessFromBetween(String value1, String value2) {
            addCriterion("BUSINESS_FROM between", value1, value2, "businessFrom");
            return (Criteria) this;
        }

        public Criteria andBusinessFromNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_FROM not between", value1, value2, "businessFrom");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNull() {
            addCriterion("PAY_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNotNull() {
            addCriterion("PAY_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andPayStatusEqualTo(String value) {
            addCriterion("PAY_STATUS =", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotEqualTo(String value) {
            addCriterion("PAY_STATUS <>", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThan(String value) {
            addCriterion("PAY_STATUS >", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_STATUS >=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThan(String value) {
            addCriterion("PAY_STATUS <", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThanOrEqualTo(String value) {
            addCriterion("PAY_STATUS <=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLike(String value) {
            addCriterion("PAY_STATUS like", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotLike(String value) {
            addCriterion("PAY_STATUS not like", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIn(List<String> values) {
            addCriterion("PAY_STATUS in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotIn(List<String> values) {
            addCriterion("PAY_STATUS not in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusBetween(String value1, String value2) {
            addCriterion("PAY_STATUS between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotBetween(String value1, String value2) {
            addCriterion("PAY_STATUS not between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("PAY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("PAY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(String value) {
            addCriterion("PAY_TYPE =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(String value) {
            addCriterion("PAY_TYPE <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(String value) {
            addCriterion("PAY_TYPE >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_TYPE >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(String value) {
            addCriterion("PAY_TYPE <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(String value) {
            addCriterion("PAY_TYPE <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLike(String value) {
            addCriterion("PAY_TYPE like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotLike(String value) {
            addCriterion("PAY_TYPE not like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<String> values) {
            addCriterion("PAY_TYPE in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<String> values) {
            addCriterion("PAY_TYPE not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(String value1, String value2) {
            addCriterion("PAY_TYPE between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(String value1, String value2) {
            addCriterion("PAY_TYPE not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayObjIsNull() {
            addCriterion("PAY_OBJ is null");
            return (Criteria) this;
        }

        public Criteria andPayObjIsNotNull() {
            addCriterion("PAY_OBJ is not null");
            return (Criteria) this;
        }

        public Criteria andPayObjEqualTo(String value) {
            addCriterion("PAY_OBJ =", value, "payObj");
            return (Criteria) this;
        }

        public Criteria andPayObjNotEqualTo(String value) {
            addCriterion("PAY_OBJ <>", value, "payObj");
            return (Criteria) this;
        }

        public Criteria andPayObjGreaterThan(String value) {
            addCriterion("PAY_OBJ >", value, "payObj");
            return (Criteria) this;
        }

        public Criteria andPayObjGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_OBJ >=", value, "payObj");
            return (Criteria) this;
        }

        public Criteria andPayObjLessThan(String value) {
            addCriterion("PAY_OBJ <", value, "payObj");
            return (Criteria) this;
        }

        public Criteria andPayObjLessThanOrEqualTo(String value) {
            addCriterion("PAY_OBJ <=", value, "payObj");
            return (Criteria) this;
        }

        public Criteria andPayObjLike(String value) {
            addCriterion("PAY_OBJ like", value, "payObj");
            return (Criteria) this;
        }

        public Criteria andPayObjNotLike(String value) {
            addCriterion("PAY_OBJ not like", value, "payObj");
            return (Criteria) this;
        }

        public Criteria andPayObjIn(List<String> values) {
            addCriterion("PAY_OBJ in", values, "payObj");
            return (Criteria) this;
        }

        public Criteria andPayObjNotIn(List<String> values) {
            addCriterion("PAY_OBJ not in", values, "payObj");
            return (Criteria) this;
        }

        public Criteria andPayObjBetween(String value1, String value2) {
            addCriterion("PAY_OBJ between", value1, value2, "payObj");
            return (Criteria) this;
        }

        public Criteria andPayObjNotBetween(String value1, String value2) {
            addCriterion("PAY_OBJ not between", value1, value2, "payObj");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("MONEY is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(BigDecimal value) {
            addCriterion("MONEY =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(BigDecimal value) {
            addCriterion("MONEY <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(BigDecimal value) {
            addCriterion("MONEY >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MONEY >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(BigDecimal value) {
            addCriterion("MONEY <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MONEY <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<BigDecimal> values) {
            addCriterion("MONEY in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<BigDecimal> values) {
            addCriterion("MONEY not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONEY between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONEY not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andPayChannelIsNull() {
            addCriterion("PAY_CHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andPayChannelIsNotNull() {
            addCriterion("PAY_CHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andPayChannelEqualTo(String value) {
            addCriterion("PAY_CHANNEL =", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotEqualTo(String value) {
            addCriterion("PAY_CHANNEL <>", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelGreaterThan(String value) {
            addCriterion("PAY_CHANNEL >", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_CHANNEL >=", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelLessThan(String value) {
            addCriterion("PAY_CHANNEL <", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelLessThanOrEqualTo(String value) {
            addCriterion("PAY_CHANNEL <=", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelLike(String value) {
            addCriterion("PAY_CHANNEL like", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotLike(String value) {
            addCriterion("PAY_CHANNEL not like", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelIn(List<String> values) {
            addCriterion("PAY_CHANNEL in", values, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotIn(List<String> values) {
            addCriterion("PAY_CHANNEL not in", values, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelBetween(String value1, String value2) {
            addCriterion("PAY_CHANNEL between", value1, value2, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotBetween(String value1, String value2) {
            addCriterion("PAY_CHANNEL not between", value1, value2, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayResultIsNull() {
            addCriterion("PAY_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andPayResultIsNotNull() {
            addCriterion("PAY_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andPayResultEqualTo(String value) {
            addCriterion("PAY_RESULT =", value, "payResult");
            return (Criteria) this;
        }

        public Criteria andPayResultNotEqualTo(String value) {
            addCriterion("PAY_RESULT <>", value, "payResult");
            return (Criteria) this;
        }

        public Criteria andPayResultGreaterThan(String value) {
            addCriterion("PAY_RESULT >", value, "payResult");
            return (Criteria) this;
        }

        public Criteria andPayResultGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_RESULT >=", value, "payResult");
            return (Criteria) this;
        }

        public Criteria andPayResultLessThan(String value) {
            addCriterion("PAY_RESULT <", value, "payResult");
            return (Criteria) this;
        }

        public Criteria andPayResultLessThanOrEqualTo(String value) {
            addCriterion("PAY_RESULT <=", value, "payResult");
            return (Criteria) this;
        }

        public Criteria andPayResultLike(String value) {
            addCriterion("PAY_RESULT like", value, "payResult");
            return (Criteria) this;
        }

        public Criteria andPayResultNotLike(String value) {
            addCriterion("PAY_RESULT not like", value, "payResult");
            return (Criteria) this;
        }

        public Criteria andPayResultIn(List<String> values) {
            addCriterion("PAY_RESULT in", values, "payResult");
            return (Criteria) this;
        }

        public Criteria andPayResultNotIn(List<String> values) {
            addCriterion("PAY_RESULT not in", values, "payResult");
            return (Criteria) this;
        }

        public Criteria andPayResultBetween(String value1, String value2) {
            addCriterion("PAY_RESULT between", value1, value2, "payResult");
            return (Criteria) this;
        }

        public Criteria andPayResultNotBetween(String value1, String value2) {
            addCriterion("PAY_RESULT not between", value1, value2, "payResult");
            return (Criteria) this;
        }

        public Criteria andPayDescriptionIsNull() {
            addCriterion("PAY_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andPayDescriptionIsNotNull() {
            addCriterion("PAY_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andPayDescriptionEqualTo(String value) {
            addCriterion("PAY_DESCRIPTION =", value, "payDescription");
            return (Criteria) this;
        }

        public Criteria andPayDescriptionNotEqualTo(String value) {
            addCriterion("PAY_DESCRIPTION <>", value, "payDescription");
            return (Criteria) this;
        }

        public Criteria andPayDescriptionGreaterThan(String value) {
            addCriterion("PAY_DESCRIPTION >", value, "payDescription");
            return (Criteria) this;
        }

        public Criteria andPayDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_DESCRIPTION >=", value, "payDescription");
            return (Criteria) this;
        }

        public Criteria andPayDescriptionLessThan(String value) {
            addCriterion("PAY_DESCRIPTION <", value, "payDescription");
            return (Criteria) this;
        }

        public Criteria andPayDescriptionLessThanOrEqualTo(String value) {
            addCriterion("PAY_DESCRIPTION <=", value, "payDescription");
            return (Criteria) this;
        }

        public Criteria andPayDescriptionLike(String value) {
            addCriterion("PAY_DESCRIPTION like", value, "payDescription");
            return (Criteria) this;
        }

        public Criteria andPayDescriptionNotLike(String value) {
            addCriterion("PAY_DESCRIPTION not like", value, "payDescription");
            return (Criteria) this;
        }

        public Criteria andPayDescriptionIn(List<String> values) {
            addCriterion("PAY_DESCRIPTION in", values, "payDescription");
            return (Criteria) this;
        }

        public Criteria andPayDescriptionNotIn(List<String> values) {
            addCriterion("PAY_DESCRIPTION not in", values, "payDescription");
            return (Criteria) this;
        }

        public Criteria andPayDescriptionBetween(String value1, String value2) {
            addCriterion("PAY_DESCRIPTION between", value1, value2, "payDescription");
            return (Criteria) this;
        }

        public Criteria andPayDescriptionNotBetween(String value1, String value2) {
            addCriterion("PAY_DESCRIPTION not between", value1, value2, "payDescription");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeIsNull() {
            addCriterion("BUSINESS_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeIsNotNull() {
            addCriterion("BUSINESS_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeEqualTo(Date value) {
            addCriterion("BUSINESS_TIME =", value, "businessTime");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeNotEqualTo(Date value) {
            addCriterion("BUSINESS_TIME <>", value, "businessTime");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeGreaterThan(Date value) {
            addCriterion("BUSINESS_TIME >", value, "businessTime");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BUSINESS_TIME >=", value, "businessTime");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeLessThan(Date value) {
            addCriterion("BUSINESS_TIME <", value, "businessTime");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeLessThanOrEqualTo(Date value) {
            addCriterion("BUSINESS_TIME <=", value, "businessTime");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeIn(List<Date> values) {
            addCriterion("BUSINESS_TIME in", values, "businessTime");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeNotIn(List<Date> values) {
            addCriterion("BUSINESS_TIME not in", values, "businessTime");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeBetween(Date value1, Date value2) {
            addCriterion("BUSINESS_TIME between", value1, value2, "businessTime");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeNotBetween(Date value1, Date value2) {
            addCriterion("BUSINESS_TIME not between", value1, value2, "businessTime");
            return (Criteria) this;
        }

        public Criteria andBusinessSeqIsNull() {
            addCriterion("BUSINESS_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andBusinessSeqIsNotNull() {
            addCriterion("BUSINESS_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessSeqEqualTo(String value) {
            addCriterion("BUSINESS_SEQ =", value, "businessSeq");
            return (Criteria) this;
        }

        public Criteria andBusinessSeqNotEqualTo(String value) {
            addCriterion("BUSINESS_SEQ <>", value, "businessSeq");
            return (Criteria) this;
        }

        public Criteria andBusinessSeqGreaterThan(String value) {
            addCriterion("BUSINESS_SEQ >", value, "businessSeq");
            return (Criteria) this;
        }

        public Criteria andBusinessSeqGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_SEQ >=", value, "businessSeq");
            return (Criteria) this;
        }

        public Criteria andBusinessSeqLessThan(String value) {
            addCriterion("BUSINESS_SEQ <", value, "businessSeq");
            return (Criteria) this;
        }

        public Criteria andBusinessSeqLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_SEQ <=", value, "businessSeq");
            return (Criteria) this;
        }

        public Criteria andBusinessSeqLike(String value) {
            addCriterion("BUSINESS_SEQ like", value, "businessSeq");
            return (Criteria) this;
        }

        public Criteria andBusinessSeqNotLike(String value) {
            addCriterion("BUSINESS_SEQ not like", value, "businessSeq");
            return (Criteria) this;
        }

        public Criteria andBusinessSeqIn(List<String> values) {
            addCriterion("BUSINESS_SEQ in", values, "businessSeq");
            return (Criteria) this;
        }

        public Criteria andBusinessSeqNotIn(List<String> values) {
            addCriterion("BUSINESS_SEQ not in", values, "businessSeq");
            return (Criteria) this;
        }

        public Criteria andBusinessSeqBetween(String value1, String value2) {
            addCriterion("BUSINESS_SEQ between", value1, value2, "businessSeq");
            return (Criteria) this;
        }

        public Criteria andBusinessSeqNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_SEQ not between", value1, value2, "businessSeq");
            return (Criteria) this;
        }

        public Criteria andBusinessNoIsNull() {
            addCriterion("BUSINESS_NO is null");
            return (Criteria) this;
        }

        public Criteria andBusinessNoIsNotNull() {
            addCriterion("BUSINESS_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessNoEqualTo(String value) {
            addCriterion("BUSINESS_NO =", value, "businessNo");
            return (Criteria) this;
        }

        public Criteria andBusinessNoNotEqualTo(String value) {
            addCriterion("BUSINESS_NO <>", value, "businessNo");
            return (Criteria) this;
        }

        public Criteria andBusinessNoGreaterThan(String value) {
            addCriterion("BUSINESS_NO >", value, "businessNo");
            return (Criteria) this;
        }

        public Criteria andBusinessNoGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_NO >=", value, "businessNo");
            return (Criteria) this;
        }

        public Criteria andBusinessNoLessThan(String value) {
            addCriterion("BUSINESS_NO <", value, "businessNo");
            return (Criteria) this;
        }

        public Criteria andBusinessNoLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_NO <=", value, "businessNo");
            return (Criteria) this;
        }

        public Criteria andBusinessNoLike(String value) {
            addCriterion("BUSINESS_NO like", value, "businessNo");
            return (Criteria) this;
        }

        public Criteria andBusinessNoNotLike(String value) {
            addCriterion("BUSINESS_NO not like", value, "businessNo");
            return (Criteria) this;
        }

        public Criteria andBusinessNoIn(List<String> values) {
            addCriterion("BUSINESS_NO in", values, "businessNo");
            return (Criteria) this;
        }

        public Criteria andBusinessNoNotIn(List<String> values) {
            addCriterion("BUSINESS_NO not in", values, "businessNo");
            return (Criteria) this;
        }

        public Criteria andBusinessNoBetween(String value1, String value2) {
            addCriterion("BUSINESS_NO between", value1, value2, "businessNo");
            return (Criteria) this;
        }

        public Criteria andBusinessNoNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_NO not between", value1, value2, "businessNo");
            return (Criteria) this;
        }

        public Criteria andMbrNameIsNull() {
            addCriterion("MBR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMbrNameIsNotNull() {
            addCriterion("MBR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMbrNameEqualTo(String value) {
            addCriterion("MBR_NAME =", value, "mbrName");
            return (Criteria) this;
        }

        public Criteria andMbrNameNotEqualTo(String value) {
            addCriterion("MBR_NAME <>", value, "mbrName");
            return (Criteria) this;
        }

        public Criteria andMbrNameGreaterThan(String value) {
            addCriterion("MBR_NAME >", value, "mbrName");
            return (Criteria) this;
        }

        public Criteria andMbrNameGreaterThanOrEqualTo(String value) {
            addCriterion("MBR_NAME >=", value, "mbrName");
            return (Criteria) this;
        }

        public Criteria andMbrNameLessThan(String value) {
            addCriterion("MBR_NAME <", value, "mbrName");
            return (Criteria) this;
        }

        public Criteria andMbrNameLessThanOrEqualTo(String value) {
            addCriterion("MBR_NAME <=", value, "mbrName");
            return (Criteria) this;
        }

        public Criteria andMbrNameLike(String value) {
            addCriterion("MBR_NAME like", value, "mbrName");
            return (Criteria) this;
        }

        public Criteria andMbrNameNotLike(String value) {
            addCriterion("MBR_NAME not like", value, "mbrName");
            return (Criteria) this;
        }

        public Criteria andMbrNameIn(List<String> values) {
            addCriterion("MBR_NAME in", values, "mbrName");
            return (Criteria) this;
        }

        public Criteria andMbrNameNotIn(List<String> values) {
            addCriterion("MBR_NAME not in", values, "mbrName");
            return (Criteria) this;
        }

        public Criteria andMbrNameBetween(String value1, String value2) {
            addCriterion("MBR_NAME between", value1, value2, "mbrName");
            return (Criteria) this;
        }

        public Criteria andMbrNameNotBetween(String value1, String value2) {
            addCriterion("MBR_NAME not between", value1, value2, "mbrName");
            return (Criteria) this;
        }

        public Criteria andMbrIdNumberIsNull() {
            addCriterion("MBR_ID_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andMbrIdNumberIsNotNull() {
            addCriterion("MBR_ID_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andMbrIdNumberEqualTo(String value) {
            addCriterion("MBR_ID_NUMBER =", value, "mbrIdNumber");
            return (Criteria) this;
        }

        public Criteria andMbrIdNumberNotEqualTo(String value) {
            addCriterion("MBR_ID_NUMBER <>", value, "mbrIdNumber");
            return (Criteria) this;
        }

        public Criteria andMbrIdNumberGreaterThan(String value) {
            addCriterion("MBR_ID_NUMBER >", value, "mbrIdNumber");
            return (Criteria) this;
        }

        public Criteria andMbrIdNumberGreaterThanOrEqualTo(String value) {
            addCriterion("MBR_ID_NUMBER >=", value, "mbrIdNumber");
            return (Criteria) this;
        }

        public Criteria andMbrIdNumberLessThan(String value) {
            addCriterion("MBR_ID_NUMBER <", value, "mbrIdNumber");
            return (Criteria) this;
        }

        public Criteria andMbrIdNumberLessThanOrEqualTo(String value) {
            addCriterion("MBR_ID_NUMBER <=", value, "mbrIdNumber");
            return (Criteria) this;
        }

        public Criteria andMbrIdNumberLike(String value) {
            addCriterion("MBR_ID_NUMBER like", value, "mbrIdNumber");
            return (Criteria) this;
        }

        public Criteria andMbrIdNumberNotLike(String value) {
            addCriterion("MBR_ID_NUMBER not like", value, "mbrIdNumber");
            return (Criteria) this;
        }

        public Criteria andMbrIdNumberIn(List<String> values) {
            addCriterion("MBR_ID_NUMBER in", values, "mbrIdNumber");
            return (Criteria) this;
        }

        public Criteria andMbrIdNumberNotIn(List<String> values) {
            addCriterion("MBR_ID_NUMBER not in", values, "mbrIdNumber");
            return (Criteria) this;
        }

        public Criteria andMbrIdNumberBetween(String value1, String value2) {
            addCriterion("MBR_ID_NUMBER between", value1, value2, "mbrIdNumber");
            return (Criteria) this;
        }

        public Criteria andMbrIdNumberNotBetween(String value1, String value2) {
            addCriterion("MBR_ID_NUMBER not between", value1, value2, "mbrIdNumber");
            return (Criteria) this;
        }

        public Criteria andMbrPhoneIsNull() {
            addCriterion("MBR_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andMbrPhoneIsNotNull() {
            addCriterion("MBR_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andMbrPhoneEqualTo(String value) {
            addCriterion("MBR_PHONE =", value, "mbrPhone");
            return (Criteria) this;
        }

        public Criteria andMbrPhoneNotEqualTo(String value) {
            addCriterion("MBR_PHONE <>", value, "mbrPhone");
            return (Criteria) this;
        }

        public Criteria andMbrPhoneGreaterThan(String value) {
            addCriterion("MBR_PHONE >", value, "mbrPhone");
            return (Criteria) this;
        }

        public Criteria andMbrPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("MBR_PHONE >=", value, "mbrPhone");
            return (Criteria) this;
        }

        public Criteria andMbrPhoneLessThan(String value) {
            addCriterion("MBR_PHONE <", value, "mbrPhone");
            return (Criteria) this;
        }

        public Criteria andMbrPhoneLessThanOrEqualTo(String value) {
            addCriterion("MBR_PHONE <=", value, "mbrPhone");
            return (Criteria) this;
        }

        public Criteria andMbrPhoneLike(String value) {
            addCriterion("MBR_PHONE like", value, "mbrPhone");
            return (Criteria) this;
        }

        public Criteria andMbrPhoneNotLike(String value) {
            addCriterion("MBR_PHONE not like", value, "mbrPhone");
            return (Criteria) this;
        }

        public Criteria andMbrPhoneIn(List<String> values) {
            addCriterion("MBR_PHONE in", values, "mbrPhone");
            return (Criteria) this;
        }

        public Criteria andMbrPhoneNotIn(List<String> values) {
            addCriterion("MBR_PHONE not in", values, "mbrPhone");
            return (Criteria) this;
        }

        public Criteria andMbrPhoneBetween(String value1, String value2) {
            addCriterion("MBR_PHONE between", value1, value2, "mbrPhone");
            return (Criteria) this;
        }

        public Criteria andMbrPhoneNotBetween(String value1, String value2) {
            addCriterion("MBR_PHONE not between", value1, value2, "mbrPhone");
            return (Criteria) this;
        }

        public Criteria andAppidIsNull() {
            addCriterion("APPID is null");
            return (Criteria) this;
        }

        public Criteria andAppidIsNotNull() {
            addCriterion("APPID is not null");
            return (Criteria) this;
        }

        public Criteria andAppidEqualTo(String value) {
            addCriterion("APPID =", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotEqualTo(String value) {
            addCriterion("APPID <>", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThan(String value) {
            addCriterion("APPID >", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThanOrEqualTo(String value) {
            addCriterion("APPID >=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThan(String value) {
            addCriterion("APPID <", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThanOrEqualTo(String value) {
            addCriterion("APPID <=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLike(String value) {
            addCriterion("APPID like", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotLike(String value) {
            addCriterion("APPID not like", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidIn(List<String> values) {
            addCriterion("APPID in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotIn(List<String> values) {
            addCriterion("APPID not in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidBetween(String value1, String value2) {
            addCriterion("APPID between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotBetween(String value1, String value2) {
            addCriterion("APPID not between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andMbrNicknameIsNull() {
            addCriterion("MBR_NICKNAME is null");
            return (Criteria) this;
        }

        public Criteria andMbrNicknameIsNotNull() {
            addCriterion("MBR_NICKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andMbrNicknameEqualTo(String value) {
            addCriterion("MBR_NICKNAME =", value, "mbrNickname");
            return (Criteria) this;
        }

        public Criteria andMbrNicknameNotEqualTo(String value) {
            addCriterion("MBR_NICKNAME <>", value, "mbrNickname");
            return (Criteria) this;
        }

        public Criteria andMbrNicknameGreaterThan(String value) {
            addCriterion("MBR_NICKNAME >", value, "mbrNickname");
            return (Criteria) this;
        }

        public Criteria andMbrNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("MBR_NICKNAME >=", value, "mbrNickname");
            return (Criteria) this;
        }

        public Criteria andMbrNicknameLessThan(String value) {
            addCriterion("MBR_NICKNAME <", value, "mbrNickname");
            return (Criteria) this;
        }

        public Criteria andMbrNicknameLessThanOrEqualTo(String value) {
            addCriterion("MBR_NICKNAME <=", value, "mbrNickname");
            return (Criteria) this;
        }

        public Criteria andMbrNicknameLike(String value) {
            addCriterion("MBR_NICKNAME like", value, "mbrNickname");
            return (Criteria) this;
        }

        public Criteria andMbrNicknameNotLike(String value) {
            addCriterion("MBR_NICKNAME not like", value, "mbrNickname");
            return (Criteria) this;
        }

        public Criteria andMbrNicknameIn(List<String> values) {
            addCriterion("MBR_NICKNAME in", values, "mbrNickname");
            return (Criteria) this;
        }

        public Criteria andMbrNicknameNotIn(List<String> values) {
            addCriterion("MBR_NICKNAME not in", values, "mbrNickname");
            return (Criteria) this;
        }

        public Criteria andMbrNicknameBetween(String value1, String value2) {
            addCriterion("MBR_NICKNAME between", value1, value2, "mbrNickname");
            return (Criteria) this;
        }

        public Criteria andMbrNicknameNotBetween(String value1, String value2) {
            addCriterion("MBR_NICKNAME not between", value1, value2, "mbrNickname");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNull() {
            addCriterion("BANK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("BANK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("BANK_NAME =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("BANK_NAME <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("BANK_NAME >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_NAME >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("BANK_NAME <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("BANK_NAME <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("BANK_NAME like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("BANK_NAME not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("BANK_NAME in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("BANK_NAME not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("BANK_NAME between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("BANK_NAME not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNull() {
            addCriterion("BANK_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNotNull() {
            addCriterion("BANK_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountEqualTo(String value) {
            addCriterion("BANK_ACCOUNT =", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotEqualTo(String value) {
            addCriterion("BANK_ACCOUNT <>", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThan(String value) {
            addCriterion("BANK_ACCOUNT >", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_ACCOUNT >=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThan(String value) {
            addCriterion("BANK_ACCOUNT <", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThanOrEqualTo(String value) {
            addCriterion("BANK_ACCOUNT <=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLike(String value) {
            addCriterion("BANK_ACCOUNT like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotLike(String value) {
            addCriterion("BANK_ACCOUNT not like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountIn(List<String> values) {
            addCriterion("BANK_ACCOUNT in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotIn(List<String> values) {
            addCriterion("BANK_ACCOUNT not in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountBetween(String value1, String value2) {
            addCriterion("BANK_ACCOUNT between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotBetween(String value1, String value2) {
            addCriterion("BANK_ACCOUNT not between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBatchNumberIsNull() {
            addCriterion("BATCH_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andBatchNumberIsNotNull() {
            addCriterion("BATCH_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andBatchNumberEqualTo(String value) {
            addCriterion("BATCH_NUMBER =", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberNotEqualTo(String value) {
            addCriterion("BATCH_NUMBER <>", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberGreaterThan(String value) {
            addCriterion("BATCH_NUMBER >", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberGreaterThanOrEqualTo(String value) {
            addCriterion("BATCH_NUMBER >=", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberLessThan(String value) {
            addCriterion("BATCH_NUMBER <", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberLessThanOrEqualTo(String value) {
            addCriterion("BATCH_NUMBER <=", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberLike(String value) {
            addCriterion("BATCH_NUMBER like", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberNotLike(String value) {
            addCriterion("BATCH_NUMBER not like", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberIn(List<String> values) {
            addCriterion("BATCH_NUMBER in", values, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberNotIn(List<String> values) {
            addCriterion("BATCH_NUMBER not in", values, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberBetween(String value1, String value2) {
            addCriterion("BATCH_NUMBER between", value1, value2, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberNotBetween(String value1, String value2) {
            addCriterion("BATCH_NUMBER not between", value1, value2, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andFirstSendTimeIsNull() {
            addCriterion("FIRST_SEND_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFirstSendTimeIsNotNull() {
            addCriterion("FIRST_SEND_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFirstSendTimeEqualTo(Date value) {
            addCriterion("FIRST_SEND_TIME =", value, "firstSendTime");
            return (Criteria) this;
        }

        public Criteria andFirstSendTimeNotEqualTo(Date value) {
            addCriterion("FIRST_SEND_TIME <>", value, "firstSendTime");
            return (Criteria) this;
        }

        public Criteria andFirstSendTimeGreaterThan(Date value) {
            addCriterion("FIRST_SEND_TIME >", value, "firstSendTime");
            return (Criteria) this;
        }

        public Criteria andFirstSendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FIRST_SEND_TIME >=", value, "firstSendTime");
            return (Criteria) this;
        }

        public Criteria andFirstSendTimeLessThan(Date value) {
            addCriterion("FIRST_SEND_TIME <", value, "firstSendTime");
            return (Criteria) this;
        }

        public Criteria andFirstSendTimeLessThanOrEqualTo(Date value) {
            addCriterion("FIRST_SEND_TIME <=", value, "firstSendTime");
            return (Criteria) this;
        }

        public Criteria andFirstSendTimeIn(List<Date> values) {
            addCriterion("FIRST_SEND_TIME in", values, "firstSendTime");
            return (Criteria) this;
        }

        public Criteria andFirstSendTimeNotIn(List<Date> values) {
            addCriterion("FIRST_SEND_TIME not in", values, "firstSendTime");
            return (Criteria) this;
        }

        public Criteria andFirstSendTimeBetween(Date value1, Date value2) {
            addCriterion("FIRST_SEND_TIME between", value1, value2, "firstSendTime");
            return (Criteria) this;
        }

        public Criteria andFirstSendTimeNotBetween(Date value1, Date value2) {
            addCriterion("FIRST_SEND_TIME not between", value1, value2, "firstSendTime");
            return (Criteria) this;
        }

        public Criteria andLastSendTimeIsNull() {
            addCriterion("LAST_SEND_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastSendTimeIsNotNull() {
            addCriterion("LAST_SEND_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastSendTimeEqualTo(Date value) {
            addCriterion("LAST_SEND_TIME =", value, "lastSendTime");
            return (Criteria) this;
        }

        public Criteria andLastSendTimeNotEqualTo(Date value) {
            addCriterion("LAST_SEND_TIME <>", value, "lastSendTime");
            return (Criteria) this;
        }

        public Criteria andLastSendTimeGreaterThan(Date value) {
            addCriterion("LAST_SEND_TIME >", value, "lastSendTime");
            return (Criteria) this;
        }

        public Criteria andLastSendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_SEND_TIME >=", value, "lastSendTime");
            return (Criteria) this;
        }

        public Criteria andLastSendTimeLessThan(Date value) {
            addCriterion("LAST_SEND_TIME <", value, "lastSendTime");
            return (Criteria) this;
        }

        public Criteria andLastSendTimeLessThanOrEqualTo(Date value) {
            addCriterion("LAST_SEND_TIME <=", value, "lastSendTime");
            return (Criteria) this;
        }

        public Criteria andLastSendTimeIn(List<Date> values) {
            addCriterion("LAST_SEND_TIME in", values, "lastSendTime");
            return (Criteria) this;
        }

        public Criteria andLastSendTimeNotIn(List<Date> values) {
            addCriterion("LAST_SEND_TIME not in", values, "lastSendTime");
            return (Criteria) this;
        }

        public Criteria andLastSendTimeBetween(Date value1, Date value2) {
            addCriterion("LAST_SEND_TIME between", value1, value2, "lastSendTime");
            return (Criteria) this;
        }

        public Criteria andLastSendTimeNotBetween(Date value1, Date value2) {
            addCriterion("LAST_SEND_TIME not between", value1, value2, "lastSendTime");
            return (Criteria) this;
        }

        public Criteria andPayResultTimeIsNull() {
            addCriterion("PAY_RESULT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPayResultTimeIsNotNull() {
            addCriterion("PAY_RESULT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPayResultTimeEqualTo(Date value) {
            addCriterion("PAY_RESULT_TIME =", value, "payResultTime");
            return (Criteria) this;
        }

        public Criteria andPayResultTimeNotEqualTo(Date value) {
            addCriterion("PAY_RESULT_TIME <>", value, "payResultTime");
            return (Criteria) this;
        }

        public Criteria andPayResultTimeGreaterThan(Date value) {
            addCriterion("PAY_RESULT_TIME >", value, "payResultTime");
            return (Criteria) this;
        }

        public Criteria andPayResultTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PAY_RESULT_TIME >=", value, "payResultTime");
            return (Criteria) this;
        }

        public Criteria andPayResultTimeLessThan(Date value) {
            addCriterion("PAY_RESULT_TIME <", value, "payResultTime");
            return (Criteria) this;
        }

        public Criteria andPayResultTimeLessThanOrEqualTo(Date value) {
            addCriterion("PAY_RESULT_TIME <=", value, "payResultTime");
            return (Criteria) this;
        }

        public Criteria andPayResultTimeIn(List<Date> values) {
            addCriterion("PAY_RESULT_TIME in", values, "payResultTime");
            return (Criteria) this;
        }

        public Criteria andPayResultTimeNotIn(List<Date> values) {
            addCriterion("PAY_RESULT_TIME not in", values, "payResultTime");
            return (Criteria) this;
        }

        public Criteria andPayResultTimeBetween(Date value1, Date value2) {
            addCriterion("PAY_RESULT_TIME between", value1, value2, "payResultTime");
            return (Criteria) this;
        }

        public Criteria andPayResultTimeNotBetween(Date value1, Date value2) {
            addCriterion("PAY_RESULT_TIME not between", value1, value2, "payResultTime");
            return (Criteria) this;
        }

        public Criteria andMchBillnoIsNull() {
            addCriterion("MCH_BILLNO is null");
            return (Criteria) this;
        }

        public Criteria andMchBillnoIsNotNull() {
            addCriterion("MCH_BILLNO is not null");
            return (Criteria) this;
        }

        public Criteria andMchBillnoEqualTo(String value) {
            addCriterion("MCH_BILLNO =", value, "mchBillno");
            return (Criteria) this;
        }

        public Criteria andMchBillnoNotEqualTo(String value) {
            addCriterion("MCH_BILLNO <>", value, "mchBillno");
            return (Criteria) this;
        }

        public Criteria andMchBillnoGreaterThan(String value) {
            addCriterion("MCH_BILLNO >", value, "mchBillno");
            return (Criteria) this;
        }

        public Criteria andMchBillnoGreaterThanOrEqualTo(String value) {
            addCriterion("MCH_BILLNO >=", value, "mchBillno");
            return (Criteria) this;
        }

        public Criteria andMchBillnoLessThan(String value) {
            addCriterion("MCH_BILLNO <", value, "mchBillno");
            return (Criteria) this;
        }

        public Criteria andMchBillnoLessThanOrEqualTo(String value) {
            addCriterion("MCH_BILLNO <=", value, "mchBillno");
            return (Criteria) this;
        }

        public Criteria andMchBillnoLike(String value) {
            addCriterion("MCH_BILLNO like", value, "mchBillno");
            return (Criteria) this;
        }

        public Criteria andMchBillnoNotLike(String value) {
            addCriterion("MCH_BILLNO not like", value, "mchBillno");
            return (Criteria) this;
        }

        public Criteria andMchBillnoIn(List<String> values) {
            addCriterion("MCH_BILLNO in", values, "mchBillno");
            return (Criteria) this;
        }

        public Criteria andMchBillnoNotIn(List<String> values) {
            addCriterion("MCH_BILLNO not in", values, "mchBillno");
            return (Criteria) this;
        }

        public Criteria andMchBillnoBetween(String value1, String value2) {
            addCriterion("MCH_BILLNO between", value1, value2, "mchBillno");
            return (Criteria) this;
        }

        public Criteria andMchBillnoNotBetween(String value1, String value2) {
            addCriterion("MCH_BILLNO not between", value1, value2, "mchBillno");
            return (Criteria) this;
        }

        public Criteria andRecBankaccIsNull() {
            addCriterion("REC_BANKACC is null");
            return (Criteria) this;
        }

        public Criteria andRecBankaccIsNotNull() {
            addCriterion("REC_BANKACC is not null");
            return (Criteria) this;
        }

        public Criteria andRecBankaccEqualTo(String value) {
            addCriterion("REC_BANKACC =", value, "recBankacc");
            return (Criteria) this;
        }

        public Criteria andRecBankaccNotEqualTo(String value) {
            addCriterion("REC_BANKACC <>", value, "recBankacc");
            return (Criteria) this;
        }

        public Criteria andRecBankaccGreaterThan(String value) {
            addCriterion("REC_BANKACC >", value, "recBankacc");
            return (Criteria) this;
        }

        public Criteria andRecBankaccGreaterThanOrEqualTo(String value) {
            addCriterion("REC_BANKACC >=", value, "recBankacc");
            return (Criteria) this;
        }

        public Criteria andRecBankaccLessThan(String value) {
            addCriterion("REC_BANKACC <", value, "recBankacc");
            return (Criteria) this;
        }

        public Criteria andRecBankaccLessThanOrEqualTo(String value) {
            addCriterion("REC_BANKACC <=", value, "recBankacc");
            return (Criteria) this;
        }

        public Criteria andRecBankaccLike(String value) {
            addCriterion("REC_BANKACC like", value, "recBankacc");
            return (Criteria) this;
        }

        public Criteria andRecBankaccNotLike(String value) {
            addCriterion("REC_BANKACC not like", value, "recBankacc");
            return (Criteria) this;
        }

        public Criteria andRecBankaccIn(List<String> values) {
            addCriterion("REC_BANKACC in", values, "recBankacc");
            return (Criteria) this;
        }

        public Criteria andRecBankaccNotIn(List<String> values) {
            addCriterion("REC_BANKACC not in", values, "recBankacc");
            return (Criteria) this;
        }

        public Criteria andRecBankaccBetween(String value1, String value2) {
            addCriterion("REC_BANKACC between", value1, value2, "recBankacc");
            return (Criteria) this;
        }

        public Criteria andRecBankaccNotBetween(String value1, String value2) {
            addCriterion("REC_BANKACC not between", value1, value2, "recBankacc");
            return (Criteria) this;
        }

        public Criteria andBankTypeIsNull() {
            addCriterion("BANK_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBankTypeIsNotNull() {
            addCriterion("BANK_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBankTypeEqualTo(String value) {
            addCriterion("BANK_TYPE =", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeNotEqualTo(String value) {
            addCriterion("BANK_TYPE <>", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeGreaterThan(String value) {
            addCriterion("BANK_TYPE >", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_TYPE >=", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeLessThan(String value) {
            addCriterion("BANK_TYPE <", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeLessThanOrEqualTo(String value) {
            addCriterion("BANK_TYPE <=", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeLike(String value) {
            addCriterion("BANK_TYPE like", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeNotLike(String value) {
            addCriterion("BANK_TYPE not like", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeIn(List<String> values) {
            addCriterion("BANK_TYPE in", values, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeNotIn(List<String> values) {
            addCriterion("BANK_TYPE not in", values, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeBetween(String value1, String value2) {
            addCriterion("BANK_TYPE between", value1, value2, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeNotBetween(String value1, String value2) {
            addCriterion("BANK_TYPE not between", value1, value2, "bankType");
            return (Criteria) this;
        }

        public Criteria andRecNameIsNull() {
            addCriterion("REC_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRecNameIsNotNull() {
            addCriterion("REC_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRecNameEqualTo(String value) {
            addCriterion("REC_NAME =", value, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameNotEqualTo(String value) {
            addCriterion("REC_NAME <>", value, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameGreaterThan(String value) {
            addCriterion("REC_NAME >", value, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameGreaterThanOrEqualTo(String value) {
            addCriterion("REC_NAME >=", value, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameLessThan(String value) {
            addCriterion("REC_NAME <", value, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameLessThanOrEqualTo(String value) {
            addCriterion("REC_NAME <=", value, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameLike(String value) {
            addCriterion("REC_NAME like", value, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameNotLike(String value) {
            addCriterion("REC_NAME not like", value, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameIn(List<String> values) {
            addCriterion("REC_NAME in", values, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameNotIn(List<String> values) {
            addCriterion("REC_NAME not in", values, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameBetween(String value1, String value2) {
            addCriterion("REC_NAME between", value1, value2, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameNotBetween(String value1, String value2) {
            addCriterion("REC_NAME not between", value1, value2, "recName");
            return (Criteria) this;
        }

        public Criteria andAccTypeIsNull() {
            addCriterion("ACC_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAccTypeIsNotNull() {
            addCriterion("ACC_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAccTypeEqualTo(String value) {
            addCriterion("ACC_TYPE =", value, "accType");
            return (Criteria) this;
        }

        public Criteria andAccTypeNotEqualTo(String value) {
            addCriterion("ACC_TYPE <>", value, "accType");
            return (Criteria) this;
        }

        public Criteria andAccTypeGreaterThan(String value) {
            addCriterion("ACC_TYPE >", value, "accType");
            return (Criteria) this;
        }

        public Criteria andAccTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ACC_TYPE >=", value, "accType");
            return (Criteria) this;
        }

        public Criteria andAccTypeLessThan(String value) {
            addCriterion("ACC_TYPE <", value, "accType");
            return (Criteria) this;
        }

        public Criteria andAccTypeLessThanOrEqualTo(String value) {
            addCriterion("ACC_TYPE <=", value, "accType");
            return (Criteria) this;
        }

        public Criteria andAccTypeLike(String value) {
            addCriterion("ACC_TYPE like", value, "accType");
            return (Criteria) this;
        }

        public Criteria andAccTypeNotLike(String value) {
            addCriterion("ACC_TYPE not like", value, "accType");
            return (Criteria) this;
        }

        public Criteria andAccTypeIn(List<String> values) {
            addCriterion("ACC_TYPE in", values, "accType");
            return (Criteria) this;
        }

        public Criteria andAccTypeNotIn(List<String> values) {
            addCriterion("ACC_TYPE not in", values, "accType");
            return (Criteria) this;
        }

        public Criteria andAccTypeBetween(String value1, String value2) {
            addCriterion("ACC_TYPE between", value1, value2, "accType");
            return (Criteria) this;
        }

        public Criteria andAccTypeNotBetween(String value1, String value2) {
            addCriterion("ACC_TYPE not between", value1, value2, "accType");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("AREA is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("AREA is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("AREA =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("AREA <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("AREA >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("AREA >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("AREA <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("AREA <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("AREA like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("AREA not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("AREA in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("AREA not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("AREA between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("AREA not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("CITY is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("CITY is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("CITY =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("CITY <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("CITY >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("CITY >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("CITY <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("CITY <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("CITY like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("CITY not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("CITY in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("CITY not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("CITY between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("CITY not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andSubbankNameIsNull() {
            addCriterion("SUBBANK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSubbankNameIsNotNull() {
            addCriterion("SUBBANK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSubbankNameEqualTo(String value) {
            addCriterion("SUBBANK_NAME =", value, "subbankName");
            return (Criteria) this;
        }

        public Criteria andSubbankNameNotEqualTo(String value) {
            addCriterion("SUBBANK_NAME <>", value, "subbankName");
            return (Criteria) this;
        }

        public Criteria andSubbankNameGreaterThan(String value) {
            addCriterion("SUBBANK_NAME >", value, "subbankName");
            return (Criteria) this;
        }

        public Criteria andSubbankNameGreaterThanOrEqualTo(String value) {
            addCriterion("SUBBANK_NAME >=", value, "subbankName");
            return (Criteria) this;
        }

        public Criteria andSubbankNameLessThan(String value) {
            addCriterion("SUBBANK_NAME <", value, "subbankName");
            return (Criteria) this;
        }

        public Criteria andSubbankNameLessThanOrEqualTo(String value) {
            addCriterion("SUBBANK_NAME <=", value, "subbankName");
            return (Criteria) this;
        }

        public Criteria andSubbankNameLike(String value) {
            addCriterion("SUBBANK_NAME like", value, "subbankName");
            return (Criteria) this;
        }

        public Criteria andSubbankNameNotLike(String value) {
            addCriterion("SUBBANK_NAME not like", value, "subbankName");
            return (Criteria) this;
        }

        public Criteria andSubbankNameIn(List<String> values) {
            addCriterion("SUBBANK_NAME in", values, "subbankName");
            return (Criteria) this;
        }

        public Criteria andSubbankNameNotIn(List<String> values) {
            addCriterion("SUBBANK_NAME not in", values, "subbankName");
            return (Criteria) this;
        }

        public Criteria andSubbankNameBetween(String value1, String value2) {
            addCriterion("SUBBANK_NAME between", value1, value2, "subbankName");
            return (Criteria) this;
        }

        public Criteria andSubbankNameNotBetween(String value1, String value2) {
            addCriterion("SUBBANK_NAME not between", value1, value2, "subbankName");
            return (Criteria) this;
        }

        public Criteria andPayTargetIsNull() {
            addCriterion("PAY_TARGET is null");
            return (Criteria) this;
        }

        public Criteria andPayTargetIsNotNull() {
            addCriterion("PAY_TARGET is not null");
            return (Criteria) this;
        }

        public Criteria andPayTargetEqualTo(String value) {
            addCriterion("PAY_TARGET =", value, "payTarget");
            return (Criteria) this;
        }

        public Criteria andPayTargetNotEqualTo(String value) {
            addCriterion("PAY_TARGET <>", value, "payTarget");
            return (Criteria) this;
        }

        public Criteria andPayTargetGreaterThan(String value) {
            addCriterion("PAY_TARGET >", value, "payTarget");
            return (Criteria) this;
        }

        public Criteria andPayTargetGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_TARGET >=", value, "payTarget");
            return (Criteria) this;
        }

        public Criteria andPayTargetLessThan(String value) {
            addCriterion("PAY_TARGET <", value, "payTarget");
            return (Criteria) this;
        }

        public Criteria andPayTargetLessThanOrEqualTo(String value) {
            addCriterion("PAY_TARGET <=", value, "payTarget");
            return (Criteria) this;
        }

        public Criteria andPayTargetLike(String value) {
            addCriterion("PAY_TARGET like", value, "payTarget");
            return (Criteria) this;
        }

        public Criteria andPayTargetNotLike(String value) {
            addCriterion("PAY_TARGET not like", value, "payTarget");
            return (Criteria) this;
        }

        public Criteria andPayTargetIn(List<String> values) {
            addCriterion("PAY_TARGET in", values, "payTarget");
            return (Criteria) this;
        }

        public Criteria andPayTargetNotIn(List<String> values) {
            addCriterion("PAY_TARGET not in", values, "payTarget");
            return (Criteria) this;
        }

        public Criteria andPayTargetBetween(String value1, String value2) {
            addCriterion("PAY_TARGET between", value1, value2, "payTarget");
            return (Criteria) this;
        }

        public Criteria andPayTargetNotBetween(String value1, String value2) {
            addCriterion("PAY_TARGET not between", value1, value2, "payTarget");
            return (Criteria) this;
        }

        public Criteria andBillNoIsNull() {
            addCriterion("BILL_NO is null");
            return (Criteria) this;
        }

        public Criteria andBillNoIsNotNull() {
            addCriterion("BILL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBillNoEqualTo(String value) {
            addCriterion("BILL_NO =", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoNotEqualTo(String value) {
            addCriterion("BILL_NO <>", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoGreaterThan(String value) {
            addCriterion("BILL_NO >", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoGreaterThanOrEqualTo(String value) {
            addCriterion("BILL_NO >=", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoLessThan(String value) {
            addCriterion("BILL_NO <", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoLessThanOrEqualTo(String value) {
            addCriterion("BILL_NO <=", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoLike(String value) {
            addCriterion("BILL_NO like", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoNotLike(String value) {
            addCriterion("BILL_NO not like", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoIn(List<String> values) {
            addCriterion("BILL_NO in", values, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoNotIn(List<String> values) {
            addCriterion("BILL_NO not in", values, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoBetween(String value1, String value2) {
            addCriterion("BILL_NO between", value1, value2, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoNotBetween(String value1, String value2) {
            addCriterion("BILL_NO not between", value1, value2, "billNo");
            return (Criteria) this;
        }

        public Criteria andPrePaydataIdIsNull() {
            addCriterion("PRE_PAYDATA_ID is null");
            return (Criteria) this;
        }

        public Criteria andPrePaydataIdIsNotNull() {
            addCriterion("PRE_PAYDATA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPrePaydataIdEqualTo(Short value) {
            addCriterion("PRE_PAYDATA_ID =", value, "prePaydataId");
            return (Criteria) this;
        }

        public Criteria andPrePaydataIdNotEqualTo(Short value) {
            addCriterion("PRE_PAYDATA_ID <>", value, "prePaydataId");
            return (Criteria) this;
        }

        public Criteria andPrePaydataIdGreaterThan(Short value) {
            addCriterion("PRE_PAYDATA_ID >", value, "prePaydataId");
            return (Criteria) this;
        }

        public Criteria andPrePaydataIdGreaterThanOrEqualTo(Short value) {
            addCriterion("PRE_PAYDATA_ID >=", value, "prePaydataId");
            return (Criteria) this;
        }

        public Criteria andPrePaydataIdLessThan(Short value) {
            addCriterion("PRE_PAYDATA_ID <", value, "prePaydataId");
            return (Criteria) this;
        }

        public Criteria andPrePaydataIdLessThanOrEqualTo(Short value) {
            addCriterion("PRE_PAYDATA_ID <=", value, "prePaydataId");
            return (Criteria) this;
        }

        public Criteria andPrePaydataIdIn(List<Short> values) {
            addCriterion("PRE_PAYDATA_ID in", values, "prePaydataId");
            return (Criteria) this;
        }

        public Criteria andPrePaydataIdNotIn(List<Short> values) {
            addCriterion("PRE_PAYDATA_ID not in", values, "prePaydataId");
            return (Criteria) this;
        }

        public Criteria andPrePaydataIdBetween(Short value1, Short value2) {
            addCriterion("PRE_PAYDATA_ID between", value1, value2, "prePaydataId");
            return (Criteria) this;
        }

        public Criteria andPrePaydataIdNotBetween(Short value1, Short value2) {
            addCriterion("PRE_PAYDATA_ID not between", value1, value2, "prePaydataId");
            return (Criteria) this;
        }

        public Criteria andPaydataBatchSeqIsNull() {
            addCriterion("PAYDATA_BATCH_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andPaydataBatchSeqIsNotNull() {
            addCriterion("PAYDATA_BATCH_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andPaydataBatchSeqEqualTo(Short value) {
            addCriterion("PAYDATA_BATCH_SEQ =", value, "paydataBatchSeq");
            return (Criteria) this;
        }

        public Criteria andPaydataBatchSeqNotEqualTo(Short value) {
            addCriterion("PAYDATA_BATCH_SEQ <>", value, "paydataBatchSeq");
            return (Criteria) this;
        }

        public Criteria andPaydataBatchSeqGreaterThan(Short value) {
            addCriterion("PAYDATA_BATCH_SEQ >", value, "paydataBatchSeq");
            return (Criteria) this;
        }

        public Criteria andPaydataBatchSeqGreaterThanOrEqualTo(Short value) {
            addCriterion("PAYDATA_BATCH_SEQ >=", value, "paydataBatchSeq");
            return (Criteria) this;
        }

        public Criteria andPaydataBatchSeqLessThan(Short value) {
            addCriterion("PAYDATA_BATCH_SEQ <", value, "paydataBatchSeq");
            return (Criteria) this;
        }

        public Criteria andPaydataBatchSeqLessThanOrEqualTo(Short value) {
            addCriterion("PAYDATA_BATCH_SEQ <=", value, "paydataBatchSeq");
            return (Criteria) this;
        }

        public Criteria andPaydataBatchSeqIn(List<Short> values) {
            addCriterion("PAYDATA_BATCH_SEQ in", values, "paydataBatchSeq");
            return (Criteria) this;
        }

        public Criteria andPaydataBatchSeqNotIn(List<Short> values) {
            addCriterion("PAYDATA_BATCH_SEQ not in", values, "paydataBatchSeq");
            return (Criteria) this;
        }

        public Criteria andPaydataBatchSeqBetween(Short value1, Short value2) {
            addCriterion("PAYDATA_BATCH_SEQ between", value1, value2, "paydataBatchSeq");
            return (Criteria) this;
        }

        public Criteria andPaydataBatchSeqNotBetween(Short value1, Short value2) {
            addCriterion("PAYDATA_BATCH_SEQ not between", value1, value2, "paydataBatchSeq");
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