package com.microservice.rabbitmq.devices.entity;

import java.util.ArrayList;
import java.util.List;

public class DevChassisInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DevChassisInfoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBasicinfoIdIsNull() {
            addCriterion("basicinfo_id is null");
            return (Criteria) this;
        }

        public Criteria andBasicinfoIdIsNotNull() {
            addCriterion("basicinfo_id is not null");
            return (Criteria) this;
        }

        public Criteria andBasicinfoIdEqualTo(String value) {
            addCriterion("basicinfo_id =", value, "basicinfoId");
            return (Criteria) this;
        }

        public Criteria andBasicinfoIdNotEqualTo(String value) {
            addCriterion("basicinfo_id <>", value, "basicinfoId");
            return (Criteria) this;
        }

        public Criteria andBasicinfoIdGreaterThan(String value) {
            addCriterion("basicinfo_id >", value, "basicinfoId");
            return (Criteria) this;
        }

        public Criteria andBasicinfoIdGreaterThanOrEqualTo(String value) {
            addCriterion("basicinfo_id >=", value, "basicinfoId");
            return (Criteria) this;
        }

        public Criteria andBasicinfoIdLessThan(String value) {
            addCriterion("basicinfo_id <", value, "basicinfoId");
            return (Criteria) this;
        }

        public Criteria andBasicinfoIdLessThanOrEqualTo(String value) {
            addCriterion("basicinfo_id <=", value, "basicinfoId");
            return (Criteria) this;
        }

        public Criteria andBasicinfoIdLike(String value) {
            addCriterion("basicinfo_id like", value, "basicinfoId");
            return (Criteria) this;
        }

        public Criteria andBasicinfoIdNotLike(String value) {
            addCriterion("basicinfo_id not like", value, "basicinfoId");
            return (Criteria) this;
        }

        public Criteria andBasicinfoIdIn(List<String> values) {
            addCriterion("basicinfo_id in", values, "basicinfoId");
            return (Criteria) this;
        }

        public Criteria andBasicinfoIdNotIn(List<String> values) {
            addCriterion("basicinfo_id not in", values, "basicinfoId");
            return (Criteria) this;
        }

        public Criteria andBasicinfoIdBetween(String value1, String value2) {
            addCriterion("basicinfo_id between", value1, value2, "basicinfoId");
            return (Criteria) this;
        }

        public Criteria andBasicinfoIdNotBetween(String value1, String value2) {
            addCriterion("basicinfo_id not between", value1, value2, "basicinfoId");
            return (Criteria) this;
        }

        public Criteria andBoardIdIsNull() {
            addCriterion("board_id is null");
            return (Criteria) this;
        }

        public Criteria andBoardIdIsNotNull() {
            addCriterion("board_id is not null");
            return (Criteria) this;
        }

        public Criteria andBoardIdEqualTo(String value) {
            addCriterion("board_id =", value, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdNotEqualTo(String value) {
            addCriterion("board_id <>", value, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdGreaterThan(String value) {
            addCriterion("board_id >", value, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdGreaterThanOrEqualTo(String value) {
            addCriterion("board_id >=", value, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdLessThan(String value) {
            addCriterion("board_id <", value, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdLessThanOrEqualTo(String value) {
            addCriterion("board_id <=", value, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdLike(String value) {
            addCriterion("board_id like", value, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdNotLike(String value) {
            addCriterion("board_id not like", value, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdIn(List<String> values) {
            addCriterion("board_id in", values, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdNotIn(List<String> values) {
            addCriterion("board_id not in", values, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdBetween(String value1, String value2) {
            addCriterion("board_id between", value1, value2, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdNotBetween(String value1, String value2) {
            addCriterion("board_id not between", value1, value2, "boardId");
            return (Criteria) this;
        }

        public Criteria andChassisTypeIsNull() {
            addCriterion("chassis_type is null");
            return (Criteria) this;
        }

        public Criteria andChassisTypeIsNotNull() {
            addCriterion("chassis_type is not null");
            return (Criteria) this;
        }

        public Criteria andChassisTypeEqualTo(String value) {
            addCriterion("chassis_type =", value, "chassisType");
            return (Criteria) this;
        }

        public Criteria andChassisTypeNotEqualTo(String value) {
            addCriterion("chassis_type <>", value, "chassisType");
            return (Criteria) this;
        }

        public Criteria andChassisTypeGreaterThan(String value) {
            addCriterion("chassis_type >", value, "chassisType");
            return (Criteria) this;
        }

        public Criteria andChassisTypeGreaterThanOrEqualTo(String value) {
            addCriterion("chassis_type >=", value, "chassisType");
            return (Criteria) this;
        }

        public Criteria andChassisTypeLessThan(String value) {
            addCriterion("chassis_type <", value, "chassisType");
            return (Criteria) this;
        }

        public Criteria andChassisTypeLessThanOrEqualTo(String value) {
            addCriterion("chassis_type <=", value, "chassisType");
            return (Criteria) this;
        }

        public Criteria andChassisTypeLike(String value) {
            addCriterion("chassis_type like", value, "chassisType");
            return (Criteria) this;
        }

        public Criteria andChassisTypeNotLike(String value) {
            addCriterion("chassis_type not like", value, "chassisType");
            return (Criteria) this;
        }

        public Criteria andChassisTypeIn(List<String> values) {
            addCriterion("chassis_type in", values, "chassisType");
            return (Criteria) this;
        }

        public Criteria andChassisTypeNotIn(List<String> values) {
            addCriterion("chassis_type not in", values, "chassisType");
            return (Criteria) this;
        }

        public Criteria andChassisTypeBetween(String value1, String value2) {
            addCriterion("chassis_type between", value1, value2, "chassisType");
            return (Criteria) this;
        }

        public Criteria andChassisTypeNotBetween(String value1, String value2) {
            addCriterion("chassis_type not between", value1, value2, "chassisType");
            return (Criteria) this;
        }

        public Criteria andChassisNameIsNull() {
            addCriterion("chassis_name is null");
            return (Criteria) this;
        }

        public Criteria andChassisNameIsNotNull() {
            addCriterion("chassis_name is not null");
            return (Criteria) this;
        }

        public Criteria andChassisNameEqualTo(String value) {
            addCriterion("chassis_name =", value, "chassisName");
            return (Criteria) this;
        }

        public Criteria andChassisNameNotEqualTo(String value) {
            addCriterion("chassis_name <>", value, "chassisName");
            return (Criteria) this;
        }

        public Criteria andChassisNameGreaterThan(String value) {
            addCriterion("chassis_name >", value, "chassisName");
            return (Criteria) this;
        }

        public Criteria andChassisNameGreaterThanOrEqualTo(String value) {
            addCriterion("chassis_name >=", value, "chassisName");
            return (Criteria) this;
        }

        public Criteria andChassisNameLessThan(String value) {
            addCriterion("chassis_name <", value, "chassisName");
            return (Criteria) this;
        }

        public Criteria andChassisNameLessThanOrEqualTo(String value) {
            addCriterion("chassis_name <=", value, "chassisName");
            return (Criteria) this;
        }

        public Criteria andChassisNameLike(String value) {
            addCriterion("chassis_name like", value, "chassisName");
            return (Criteria) this;
        }

        public Criteria andChassisNameNotLike(String value) {
            addCriterion("chassis_name not like", value, "chassisName");
            return (Criteria) this;
        }

        public Criteria andChassisNameIn(List<String> values) {
            addCriterion("chassis_name in", values, "chassisName");
            return (Criteria) this;
        }

        public Criteria andChassisNameNotIn(List<String> values) {
            addCriterion("chassis_name not in", values, "chassisName");
            return (Criteria) this;
        }

        public Criteria andChassisNameBetween(String value1, String value2) {
            addCriterion("chassis_name between", value1, value2, "chassisName");
            return (Criteria) this;
        }

        public Criteria andChassisNameNotBetween(String value1, String value2) {
            addCriterion("chassis_name not between", value1, value2, "chassisName");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIsNull() {
            addCriterion("device_type is null");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIsNotNull() {
            addCriterion("device_type is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeEqualTo(String value) {
            addCriterion("device_type =", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotEqualTo(String value) {
            addCriterion("device_type <>", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeGreaterThan(String value) {
            addCriterion("device_type >", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("device_type >=", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLessThan(String value) {
            addCriterion("device_type <", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLessThanOrEqualTo(String value) {
            addCriterion("device_type <=", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLike(String value) {
            addCriterion("device_type like", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotLike(String value) {
            addCriterion("device_type not like", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIn(List<String> values) {
            addCriterion("device_type in", values, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotIn(List<String> values) {
            addCriterion("device_type not in", values, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeBetween(String value1, String value2) {
            addCriterion("device_type between", value1, value2, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotBetween(String value1, String value2) {
            addCriterion("device_type not between", value1, value2, "deviceType");
            return (Criteria) this;
        }

        public Criteria andTotalPowerIsNull() {
            addCriterion("total_power is null");
            return (Criteria) this;
        }

        public Criteria andTotalPowerIsNotNull() {
            addCriterion("total_power is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPowerEqualTo(String value) {
            addCriterion("total_power =", value, "totalPower");
            return (Criteria) this;
        }

        public Criteria andTotalPowerNotEqualTo(String value) {
            addCriterion("total_power <>", value, "totalPower");
            return (Criteria) this;
        }

        public Criteria andTotalPowerGreaterThan(String value) {
            addCriterion("total_power >", value, "totalPower");
            return (Criteria) this;
        }

        public Criteria andTotalPowerGreaterThanOrEqualTo(String value) {
            addCriterion("total_power >=", value, "totalPower");
            return (Criteria) this;
        }

        public Criteria andTotalPowerLessThan(String value) {
            addCriterion("total_power <", value, "totalPower");
            return (Criteria) this;
        }

        public Criteria andTotalPowerLessThanOrEqualTo(String value) {
            addCriterion("total_power <=", value, "totalPower");
            return (Criteria) this;
        }

        public Criteria andTotalPowerLike(String value) {
            addCriterion("total_power like", value, "totalPower");
            return (Criteria) this;
        }

        public Criteria andTotalPowerNotLike(String value) {
            addCriterion("total_power not like", value, "totalPower");
            return (Criteria) this;
        }

        public Criteria andTotalPowerIn(List<String> values) {
            addCriterion("total_power in", values, "totalPower");
            return (Criteria) this;
        }

        public Criteria andTotalPowerNotIn(List<String> values) {
            addCriterion("total_power not in", values, "totalPower");
            return (Criteria) this;
        }

        public Criteria andTotalPowerBetween(String value1, String value2) {
            addCriterion("total_power between", value1, value2, "totalPower");
            return (Criteria) this;
        }

        public Criteria andTotalPowerNotBetween(String value1, String value2) {
            addCriterion("total_power not between", value1, value2, "totalPower");
            return (Criteria) this;
        }

        public Criteria andNeedPowerIsNull() {
            addCriterion("need_power is null");
            return (Criteria) this;
        }

        public Criteria andNeedPowerIsNotNull() {
            addCriterion("need_power is not null");
            return (Criteria) this;
        }

        public Criteria andNeedPowerEqualTo(String value) {
            addCriterion("need_power =", value, "needPower");
            return (Criteria) this;
        }

        public Criteria andNeedPowerNotEqualTo(String value) {
            addCriterion("need_power <>", value, "needPower");
            return (Criteria) this;
        }

        public Criteria andNeedPowerGreaterThan(String value) {
            addCriterion("need_power >", value, "needPower");
            return (Criteria) this;
        }

        public Criteria andNeedPowerGreaterThanOrEqualTo(String value) {
            addCriterion("need_power >=", value, "needPower");
            return (Criteria) this;
        }

        public Criteria andNeedPowerLessThan(String value) {
            addCriterion("need_power <", value, "needPower");
            return (Criteria) this;
        }

        public Criteria andNeedPowerLessThanOrEqualTo(String value) {
            addCriterion("need_power <=", value, "needPower");
            return (Criteria) this;
        }

        public Criteria andNeedPowerLike(String value) {
            addCriterion("need_power like", value, "needPower");
            return (Criteria) this;
        }

        public Criteria andNeedPowerNotLike(String value) {
            addCriterion("need_power not like", value, "needPower");
            return (Criteria) this;
        }

        public Criteria andNeedPowerIn(List<String> values) {
            addCriterion("need_power in", values, "needPower");
            return (Criteria) this;
        }

        public Criteria andNeedPowerNotIn(List<String> values) {
            addCriterion("need_power not in", values, "needPower");
            return (Criteria) this;
        }

        public Criteria andNeedPowerBetween(String value1, String value2) {
            addCriterion("need_power between", value1, value2, "needPower");
            return (Criteria) this;
        }

        public Criteria andNeedPowerNotBetween(String value1, String value2) {
            addCriterion("need_power not between", value1, value2, "needPower");
            return (Criteria) this;
        }

        public Criteria andRemainPowerIsNull() {
            addCriterion("remain_power is null");
            return (Criteria) this;
        }

        public Criteria andRemainPowerIsNotNull() {
            addCriterion("remain_power is not null");
            return (Criteria) this;
        }

        public Criteria andRemainPowerEqualTo(String value) {
            addCriterion("remain_power =", value, "remainPower");
            return (Criteria) this;
        }

        public Criteria andRemainPowerNotEqualTo(String value) {
            addCriterion("remain_power <>", value, "remainPower");
            return (Criteria) this;
        }

        public Criteria andRemainPowerGreaterThan(String value) {
            addCriterion("remain_power >", value, "remainPower");
            return (Criteria) this;
        }

        public Criteria andRemainPowerGreaterThanOrEqualTo(String value) {
            addCriterion("remain_power >=", value, "remainPower");
            return (Criteria) this;
        }

        public Criteria andRemainPowerLessThan(String value) {
            addCriterion("remain_power <", value, "remainPower");
            return (Criteria) this;
        }

        public Criteria andRemainPowerLessThanOrEqualTo(String value) {
            addCriterion("remain_power <=", value, "remainPower");
            return (Criteria) this;
        }

        public Criteria andRemainPowerLike(String value) {
            addCriterion("remain_power like", value, "remainPower");
            return (Criteria) this;
        }

        public Criteria andRemainPowerNotLike(String value) {
            addCriterion("remain_power not like", value, "remainPower");
            return (Criteria) this;
        }

        public Criteria andRemainPowerIn(List<String> values) {
            addCriterion("remain_power in", values, "remainPower");
            return (Criteria) this;
        }

        public Criteria andRemainPowerNotIn(List<String> values) {
            addCriterion("remain_power not in", values, "remainPower");
            return (Criteria) this;
        }

        public Criteria andRemainPowerBetween(String value1, String value2) {
            addCriterion("remain_power between", value1, value2, "remainPower");
            return (Criteria) this;
        }

        public Criteria andRemainPowerNotBetween(String value1, String value2) {
            addCriterion("remain_power not between", value1, value2, "remainPower");
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