package com.microservice.rabbitmq.devices.entity;

import java.util.ArrayList;
import java.util.List;

public class DevInterfaceInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DevInterfaceInfoExample() {
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

        public Criteria andInterfaceNameIsNull() {
            addCriterion("interface_name is null");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameIsNotNull() {
            addCriterion("interface_name is not null");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameEqualTo(String value) {
            addCriterion("interface_name =", value, "interfaceName");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameNotEqualTo(String value) {
            addCriterion("interface_name <>", value, "interfaceName");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameGreaterThan(String value) {
            addCriterion("interface_name >", value, "interfaceName");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameGreaterThanOrEqualTo(String value) {
            addCriterion("interface_name >=", value, "interfaceName");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameLessThan(String value) {
            addCriterion("interface_name <", value, "interfaceName");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameLessThanOrEqualTo(String value) {
            addCriterion("interface_name <=", value, "interfaceName");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameLike(String value) {
            addCriterion("interface_name like", value, "interfaceName");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameNotLike(String value) {
            addCriterion("interface_name not like", value, "interfaceName");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameIn(List<String> values) {
            addCriterion("interface_name in", values, "interfaceName");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameNotIn(List<String> values) {
            addCriterion("interface_name not in", values, "interfaceName");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameBetween(String value1, String value2) {
            addCriterion("interface_name between", value1, value2, "interfaceName");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameNotBetween(String value1, String value2) {
            addCriterion("interface_name not between", value1, value2, "interfaceName");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeIsNull() {
            addCriterion("interface_type is null");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeIsNotNull() {
            addCriterion("interface_type is not null");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeEqualTo(String value) {
            addCriterion("interface_type =", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeNotEqualTo(String value) {
            addCriterion("interface_type <>", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeGreaterThan(String value) {
            addCriterion("interface_type >", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("interface_type >=", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeLessThan(String value) {
            addCriterion("interface_type <", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeLessThanOrEqualTo(String value) {
            addCriterion("interface_type <=", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeLike(String value) {
            addCriterion("interface_type like", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeNotLike(String value) {
            addCriterion("interface_type not like", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeIn(List<String> values) {
            addCriterion("interface_type in", values, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeNotIn(List<String> values) {
            addCriterion("interface_type not in", values, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeBetween(String value1, String value2) {
            addCriterion("interface_type between", value1, value2, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeNotBetween(String value1, String value2) {
            addCriterion("interface_type not between", value1, value2, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceSlotIsNull() {
            addCriterion("interface_slot is null");
            return (Criteria) this;
        }

        public Criteria andInterfaceSlotIsNotNull() {
            addCriterion("interface_slot is not null");
            return (Criteria) this;
        }

        public Criteria andInterfaceSlotEqualTo(String value) {
            addCriterion("interface_slot =", value, "interfaceSlot");
            return (Criteria) this;
        }

        public Criteria andInterfaceSlotNotEqualTo(String value) {
            addCriterion("interface_slot <>", value, "interfaceSlot");
            return (Criteria) this;
        }

        public Criteria andInterfaceSlotGreaterThan(String value) {
            addCriterion("interface_slot >", value, "interfaceSlot");
            return (Criteria) this;
        }

        public Criteria andInterfaceSlotGreaterThanOrEqualTo(String value) {
            addCriterion("interface_slot >=", value, "interfaceSlot");
            return (Criteria) this;
        }

        public Criteria andInterfaceSlotLessThan(String value) {
            addCriterion("interface_slot <", value, "interfaceSlot");
            return (Criteria) this;
        }

        public Criteria andInterfaceSlotLessThanOrEqualTo(String value) {
            addCriterion("interface_slot <=", value, "interfaceSlot");
            return (Criteria) this;
        }

        public Criteria andInterfaceSlotLike(String value) {
            addCriterion("interface_slot like", value, "interfaceSlot");
            return (Criteria) this;
        }

        public Criteria andInterfaceSlotNotLike(String value) {
            addCriterion("interface_slot not like", value, "interfaceSlot");
            return (Criteria) this;
        }

        public Criteria andInterfaceSlotIn(List<String> values) {
            addCriterion("interface_slot in", values, "interfaceSlot");
            return (Criteria) this;
        }

        public Criteria andInterfaceSlotNotIn(List<String> values) {
            addCriterion("interface_slot not in", values, "interfaceSlot");
            return (Criteria) this;
        }

        public Criteria andInterfaceSlotBetween(String value1, String value2) {
            addCriterion("interface_slot between", value1, value2, "interfaceSlot");
            return (Criteria) this;
        }

        public Criteria andInterfaceSlotNotBetween(String value1, String value2) {
            addCriterion("interface_slot not between", value1, value2, "interfaceSlot");
            return (Criteria) this;
        }

        public Criteria andInUtiIsNull() {
            addCriterion("in_uti is null");
            return (Criteria) this;
        }

        public Criteria andInUtiIsNotNull() {
            addCriterion("in_uti is not null");
            return (Criteria) this;
        }

        public Criteria andInUtiEqualTo(String value) {
            addCriterion("in_uti =", value, "inUti");
            return (Criteria) this;
        }

        public Criteria andInUtiNotEqualTo(String value) {
            addCriterion("in_uti <>", value, "inUti");
            return (Criteria) this;
        }

        public Criteria andInUtiGreaterThan(String value) {
            addCriterion("in_uti >", value, "inUti");
            return (Criteria) this;
        }

        public Criteria andInUtiGreaterThanOrEqualTo(String value) {
            addCriterion("in_uti >=", value, "inUti");
            return (Criteria) this;
        }

        public Criteria andInUtiLessThan(String value) {
            addCriterion("in_uti <", value, "inUti");
            return (Criteria) this;
        }

        public Criteria andInUtiLessThanOrEqualTo(String value) {
            addCriterion("in_uti <=", value, "inUti");
            return (Criteria) this;
        }

        public Criteria andInUtiLike(String value) {
            addCriterion("in_uti like", value, "inUti");
            return (Criteria) this;
        }

        public Criteria andInUtiNotLike(String value) {
            addCriterion("in_uti not like", value, "inUti");
            return (Criteria) this;
        }

        public Criteria andInUtiIn(List<String> values) {
            addCriterion("in_uti in", values, "inUti");
            return (Criteria) this;
        }

        public Criteria andInUtiNotIn(List<String> values) {
            addCriterion("in_uti not in", values, "inUti");
            return (Criteria) this;
        }

        public Criteria andInUtiBetween(String value1, String value2) {
            addCriterion("in_uti between", value1, value2, "inUti");
            return (Criteria) this;
        }

        public Criteria andInUtiNotBetween(String value1, String value2) {
            addCriterion("in_uti not between", value1, value2, "inUti");
            return (Criteria) this;
        }

        public Criteria andOutUtiIsNull() {
            addCriterion("out_uti is null");
            return (Criteria) this;
        }

        public Criteria andOutUtiIsNotNull() {
            addCriterion("out_uti is not null");
            return (Criteria) this;
        }

        public Criteria andOutUtiEqualTo(String value) {
            addCriterion("out_uti =", value, "outUti");
            return (Criteria) this;
        }

        public Criteria andOutUtiNotEqualTo(String value) {
            addCriterion("out_uti <>", value, "outUti");
            return (Criteria) this;
        }

        public Criteria andOutUtiGreaterThan(String value) {
            addCriterion("out_uti >", value, "outUti");
            return (Criteria) this;
        }

        public Criteria andOutUtiGreaterThanOrEqualTo(String value) {
            addCriterion("out_uti >=", value, "outUti");
            return (Criteria) this;
        }

        public Criteria andOutUtiLessThan(String value) {
            addCriterion("out_uti <", value, "outUti");
            return (Criteria) this;
        }

        public Criteria andOutUtiLessThanOrEqualTo(String value) {
            addCriterion("out_uti <=", value, "outUti");
            return (Criteria) this;
        }

        public Criteria andOutUtiLike(String value) {
            addCriterion("out_uti like", value, "outUti");
            return (Criteria) this;
        }

        public Criteria andOutUtiNotLike(String value) {
            addCriterion("out_uti not like", value, "outUti");
            return (Criteria) this;
        }

        public Criteria andOutUtiIn(List<String> values) {
            addCriterion("out_uti in", values, "outUti");
            return (Criteria) this;
        }

        public Criteria andOutUtiNotIn(List<String> values) {
            addCriterion("out_uti not in", values, "outUti");
            return (Criteria) this;
        }

        public Criteria andOutUtiBetween(String value1, String value2) {
            addCriterion("out_uti between", value1, value2, "outUti");
            return (Criteria) this;
        }

        public Criteria andOutUtiNotBetween(String value1, String value2) {
            addCriterion("out_uti not between", value1, value2, "outUti");
            return (Criteria) this;
        }

        public Criteria andPhyStatusIsNull() {
            addCriterion("phy_status is null");
            return (Criteria) this;
        }

        public Criteria andPhyStatusIsNotNull() {
            addCriterion("phy_status is not null");
            return (Criteria) this;
        }

        public Criteria andPhyStatusEqualTo(String value) {
            addCriterion("phy_status =", value, "phyStatus");
            return (Criteria) this;
        }

        public Criteria andPhyStatusNotEqualTo(String value) {
            addCriterion("phy_status <>", value, "phyStatus");
            return (Criteria) this;
        }

        public Criteria andPhyStatusGreaterThan(String value) {
            addCriterion("phy_status >", value, "phyStatus");
            return (Criteria) this;
        }

        public Criteria andPhyStatusGreaterThanOrEqualTo(String value) {
            addCriterion("phy_status >=", value, "phyStatus");
            return (Criteria) this;
        }

        public Criteria andPhyStatusLessThan(String value) {
            addCriterion("phy_status <", value, "phyStatus");
            return (Criteria) this;
        }

        public Criteria andPhyStatusLessThanOrEqualTo(String value) {
            addCriterion("phy_status <=", value, "phyStatus");
            return (Criteria) this;
        }

        public Criteria andPhyStatusLike(String value) {
            addCriterion("phy_status like", value, "phyStatus");
            return (Criteria) this;
        }

        public Criteria andPhyStatusNotLike(String value) {
            addCriterion("phy_status not like", value, "phyStatus");
            return (Criteria) this;
        }

        public Criteria andPhyStatusIn(List<String> values) {
            addCriterion("phy_status in", values, "phyStatus");
            return (Criteria) this;
        }

        public Criteria andPhyStatusNotIn(List<String> values) {
            addCriterion("phy_status not in", values, "phyStatus");
            return (Criteria) this;
        }

        public Criteria andPhyStatusBetween(String value1, String value2) {
            addCriterion("phy_status between", value1, value2, "phyStatus");
            return (Criteria) this;
        }

        public Criteria andPhyStatusNotBetween(String value1, String value2) {
            addCriterion("phy_status not between", value1, value2, "phyStatus");
            return (Criteria) this;
        }

        public Criteria andProtocalStatusIsNull() {
            addCriterion("protocal_status is null");
            return (Criteria) this;
        }

        public Criteria andProtocalStatusIsNotNull() {
            addCriterion("protocal_status is not null");
            return (Criteria) this;
        }

        public Criteria andProtocalStatusEqualTo(String value) {
            addCriterion("protocal_status =", value, "protocalStatus");
            return (Criteria) this;
        }

        public Criteria andProtocalStatusNotEqualTo(String value) {
            addCriterion("protocal_status <>", value, "protocalStatus");
            return (Criteria) this;
        }

        public Criteria andProtocalStatusGreaterThan(String value) {
            addCriterion("protocal_status >", value, "protocalStatus");
            return (Criteria) this;
        }

        public Criteria andProtocalStatusGreaterThanOrEqualTo(String value) {
            addCriterion("protocal_status >=", value, "protocalStatus");
            return (Criteria) this;
        }

        public Criteria andProtocalStatusLessThan(String value) {
            addCriterion("protocal_status <", value, "protocalStatus");
            return (Criteria) this;
        }

        public Criteria andProtocalStatusLessThanOrEqualTo(String value) {
            addCriterion("protocal_status <=", value, "protocalStatus");
            return (Criteria) this;
        }

        public Criteria andProtocalStatusLike(String value) {
            addCriterion("protocal_status like", value, "protocalStatus");
            return (Criteria) this;
        }

        public Criteria andProtocalStatusNotLike(String value) {
            addCriterion("protocal_status not like", value, "protocalStatus");
            return (Criteria) this;
        }

        public Criteria andProtocalStatusIn(List<String> values) {
            addCriterion("protocal_status in", values, "protocalStatus");
            return (Criteria) this;
        }

        public Criteria andProtocalStatusNotIn(List<String> values) {
            addCriterion("protocal_status not in", values, "protocalStatus");
            return (Criteria) this;
        }

        public Criteria andProtocalStatusBetween(String value1, String value2) {
            addCriterion("protocal_status between", value1, value2, "protocalStatus");
            return (Criteria) this;
        }

        public Criteria andProtocalStatusNotBetween(String value1, String value2) {
            addCriterion("protocal_status not between", value1, value2, "protocalStatus");
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