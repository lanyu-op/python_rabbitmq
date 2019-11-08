package com.microservice.rabbitmq.devices.entity;

import java.util.ArrayList;
import java.util.List;

public class DevBoardInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DevBoardInfoExample() {
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

        public Criteria andBasicInfoIdIsNull() {
            addCriterion("basic_info_id is null");
            return (Criteria) this;
        }

        public Criteria andBasicInfoIdIsNotNull() {
            addCriterion("basic_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andBasicInfoIdEqualTo(String value) {
            addCriterion("basic_info_id =", value, "basicInfoId");
            return (Criteria) this;
        }

        public Criteria andBasicInfoIdNotEqualTo(String value) {
            addCriterion("basic_info_id <>", value, "basicInfoId");
            return (Criteria) this;
        }

        public Criteria andBasicInfoIdGreaterThan(String value) {
            addCriterion("basic_info_id >", value, "basicInfoId");
            return (Criteria) this;
        }

        public Criteria andBasicInfoIdGreaterThanOrEqualTo(String value) {
            addCriterion("basic_info_id >=", value, "basicInfoId");
            return (Criteria) this;
        }

        public Criteria andBasicInfoIdLessThan(String value) {
            addCriterion("basic_info_id <", value, "basicInfoId");
            return (Criteria) this;
        }

        public Criteria andBasicInfoIdLessThanOrEqualTo(String value) {
            addCriterion("basic_info_id <=", value, "basicInfoId");
            return (Criteria) this;
        }

        public Criteria andBasicInfoIdLike(String value) {
            addCriterion("basic_info_id like", value, "basicInfoId");
            return (Criteria) this;
        }

        public Criteria andBasicInfoIdNotLike(String value) {
            addCriterion("basic_info_id not like", value, "basicInfoId");
            return (Criteria) this;
        }

        public Criteria andBasicInfoIdIn(List<String> values) {
            addCriterion("basic_info_id in", values, "basicInfoId");
            return (Criteria) this;
        }

        public Criteria andBasicInfoIdNotIn(List<String> values) {
            addCriterion("basic_info_id not in", values, "basicInfoId");
            return (Criteria) this;
        }

        public Criteria andBasicInfoIdBetween(String value1, String value2) {
            addCriterion("basic_info_id between", value1, value2, "basicInfoId");
            return (Criteria) this;
        }

        public Criteria andBasicInfoIdNotBetween(String value1, String value2) {
            addCriterion("basic_info_id not between", value1, value2, "basicInfoId");
            return (Criteria) this;
        }

        public Criteria andChassisIdIsNull() {
            addCriterion("chassis_id is null");
            return (Criteria) this;
        }

        public Criteria andChassisIdIsNotNull() {
            addCriterion("chassis_id is not null");
            return (Criteria) this;
        }

        public Criteria andChassisIdEqualTo(String value) {
            addCriterion("chassis_id =", value, "chassisId");
            return (Criteria) this;
        }

        public Criteria andChassisIdNotEqualTo(String value) {
            addCriterion("chassis_id <>", value, "chassisId");
            return (Criteria) this;
        }

        public Criteria andChassisIdGreaterThan(String value) {
            addCriterion("chassis_id >", value, "chassisId");
            return (Criteria) this;
        }

        public Criteria andChassisIdGreaterThanOrEqualTo(String value) {
            addCriterion("chassis_id >=", value, "chassisId");
            return (Criteria) this;
        }

        public Criteria andChassisIdLessThan(String value) {
            addCriterion("chassis_id <", value, "chassisId");
            return (Criteria) this;
        }

        public Criteria andChassisIdLessThanOrEqualTo(String value) {
            addCriterion("chassis_id <=", value, "chassisId");
            return (Criteria) this;
        }

        public Criteria andChassisIdLike(String value) {
            addCriterion("chassis_id like", value, "chassisId");
            return (Criteria) this;
        }

        public Criteria andChassisIdNotLike(String value) {
            addCriterion("chassis_id not like", value, "chassisId");
            return (Criteria) this;
        }

        public Criteria andChassisIdIn(List<String> values) {
            addCriterion("chassis_id in", values, "chassisId");
            return (Criteria) this;
        }

        public Criteria andChassisIdNotIn(List<String> values) {
            addCriterion("chassis_id not in", values, "chassisId");
            return (Criteria) this;
        }

        public Criteria andChassisIdBetween(String value1, String value2) {
            addCriterion("chassis_id between", value1, value2, "chassisId");
            return (Criteria) this;
        }

        public Criteria andChassisIdNotBetween(String value1, String value2) {
            addCriterion("chassis_id not between", value1, value2, "chassisId");
            return (Criteria) this;
        }

        public Criteria andBoardTypeIsNull() {
            addCriterion("board_type is null");
            return (Criteria) this;
        }

        public Criteria andBoardTypeIsNotNull() {
            addCriterion("board_type is not null");
            return (Criteria) this;
        }

        public Criteria andBoardTypeEqualTo(String value) {
            addCriterion("board_type =", value, "boardType");
            return (Criteria) this;
        }

        public Criteria andBoardTypeNotEqualTo(String value) {
            addCriterion("board_type <>", value, "boardType");
            return (Criteria) this;
        }

        public Criteria andBoardTypeGreaterThan(String value) {
            addCriterion("board_type >", value, "boardType");
            return (Criteria) this;
        }

        public Criteria andBoardTypeGreaterThanOrEqualTo(String value) {
            addCriterion("board_type >=", value, "boardType");
            return (Criteria) this;
        }

        public Criteria andBoardTypeLessThan(String value) {
            addCriterion("board_type <", value, "boardType");
            return (Criteria) this;
        }

        public Criteria andBoardTypeLessThanOrEqualTo(String value) {
            addCriterion("board_type <=", value, "boardType");
            return (Criteria) this;
        }

        public Criteria andBoardTypeLike(String value) {
            addCriterion("board_type like", value, "boardType");
            return (Criteria) this;
        }

        public Criteria andBoardTypeNotLike(String value) {
            addCriterion("board_type not like", value, "boardType");
            return (Criteria) this;
        }

        public Criteria andBoardTypeIn(List<String> values) {
            addCriterion("board_type in", values, "boardType");
            return (Criteria) this;
        }

        public Criteria andBoardTypeNotIn(List<String> values) {
            addCriterion("board_type not in", values, "boardType");
            return (Criteria) this;
        }

        public Criteria andBoardTypeBetween(String value1, String value2) {
            addCriterion("board_type between", value1, value2, "boardType");
            return (Criteria) this;
        }

        public Criteria andBoardTypeNotBetween(String value1, String value2) {
            addCriterion("board_type not between", value1, value2, "boardType");
            return (Criteria) this;
        }

        public Criteria andSlotIsNull() {
            addCriterion("slot is null");
            return (Criteria) this;
        }

        public Criteria andSlotIsNotNull() {
            addCriterion("slot is not null");
            return (Criteria) this;
        }

        public Criteria andSlotEqualTo(String value) {
            addCriterion("slot =", value, "slot");
            return (Criteria) this;
        }

        public Criteria andSlotNotEqualTo(String value) {
            addCriterion("slot <>", value, "slot");
            return (Criteria) this;
        }

        public Criteria andSlotGreaterThan(String value) {
            addCriterion("slot >", value, "slot");
            return (Criteria) this;
        }

        public Criteria andSlotGreaterThanOrEqualTo(String value) {
            addCriterion("slot >=", value, "slot");
            return (Criteria) this;
        }

        public Criteria andSlotLessThan(String value) {
            addCriterion("slot <", value, "slot");
            return (Criteria) this;
        }

        public Criteria andSlotLessThanOrEqualTo(String value) {
            addCriterion("slot <=", value, "slot");
            return (Criteria) this;
        }

        public Criteria andSlotLike(String value) {
            addCriterion("slot like", value, "slot");
            return (Criteria) this;
        }

        public Criteria andSlotNotLike(String value) {
            addCriterion("slot not like", value, "slot");
            return (Criteria) this;
        }

        public Criteria andSlotIn(List<String> values) {
            addCriterion("slot in", values, "slot");
            return (Criteria) this;
        }

        public Criteria andSlotNotIn(List<String> values) {
            addCriterion("slot not in", values, "slot");
            return (Criteria) this;
        }

        public Criteria andSlotBetween(String value1, String value2) {
            addCriterion("slot between", value1, value2, "slot");
            return (Criteria) this;
        }

        public Criteria andSlotNotBetween(String value1, String value2) {
            addCriterion("slot not between", value1, value2, "slot");
            return (Criteria) this;
        }

        public Criteria andSlotStatusIsNull() {
            addCriterion("slot_status is null");
            return (Criteria) this;
        }

        public Criteria andSlotStatusIsNotNull() {
            addCriterion("slot_status is not null");
            return (Criteria) this;
        }

        public Criteria andSlotStatusEqualTo(Integer value) {
            addCriterion("slot_status =", value, "slotStatus");
            return (Criteria) this;
        }

        public Criteria andSlotStatusNotEqualTo(Integer value) {
            addCriterion("slot_status <>", value, "slotStatus");
            return (Criteria) this;
        }

        public Criteria andSlotStatusGreaterThan(Integer value) {
            addCriterion("slot_status >", value, "slotStatus");
            return (Criteria) this;
        }

        public Criteria andSlotStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("slot_status >=", value, "slotStatus");
            return (Criteria) this;
        }

        public Criteria andSlotStatusLessThan(Integer value) {
            addCriterion("slot_status <", value, "slotStatus");
            return (Criteria) this;
        }

        public Criteria andSlotStatusLessThanOrEqualTo(Integer value) {
            addCriterion("slot_status <=", value, "slotStatus");
            return (Criteria) this;
        }

        public Criteria andSlotStatusIn(List<Integer> values) {
            addCriterion("slot_status in", values, "slotStatus");
            return (Criteria) this;
        }

        public Criteria andSlotStatusNotIn(List<Integer> values) {
            addCriterion("slot_status not in", values, "slotStatus");
            return (Criteria) this;
        }

        public Criteria andSlotStatusBetween(Integer value1, Integer value2) {
            addCriterion("slot_status between", value1, value2, "slotStatus");
            return (Criteria) this;
        }

        public Criteria andSlotStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("slot_status not between", value1, value2, "slotStatus");
            return (Criteria) this;
        }

        public Criteria andBoardNameIsNull() {
            addCriterion("board_name is null");
            return (Criteria) this;
        }

        public Criteria andBoardNameIsNotNull() {
            addCriterion("board_name is not null");
            return (Criteria) this;
        }

        public Criteria andBoardNameEqualTo(String value) {
            addCriterion("board_name =", value, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameNotEqualTo(String value) {
            addCriterion("board_name <>", value, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameGreaterThan(String value) {
            addCriterion("board_name >", value, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameGreaterThanOrEqualTo(String value) {
            addCriterion("board_name >=", value, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameLessThan(String value) {
            addCriterion("board_name <", value, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameLessThanOrEqualTo(String value) {
            addCriterion("board_name <=", value, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameLike(String value) {
            addCriterion("board_name like", value, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameNotLike(String value) {
            addCriterion("board_name not like", value, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameIn(List<String> values) {
            addCriterion("board_name in", values, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameNotIn(List<String> values) {
            addCriterion("board_name not in", values, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameBetween(String value1, String value2) {
            addCriterion("board_name between", value1, value2, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameNotBetween(String value1, String value2) {
            addCriterion("board_name not between", value1, value2, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardPcbVersionIsNull() {
            addCriterion("board_pcb_version is null");
            return (Criteria) this;
        }

        public Criteria andBoardPcbVersionIsNotNull() {
            addCriterion("board_pcb_version is not null");
            return (Criteria) this;
        }

        public Criteria andBoardPcbVersionEqualTo(String value) {
            addCriterion("board_pcb_version =", value, "boardPcbVersion");
            return (Criteria) this;
        }

        public Criteria andBoardPcbVersionNotEqualTo(String value) {
            addCriterion("board_pcb_version <>", value, "boardPcbVersion");
            return (Criteria) this;
        }

        public Criteria andBoardPcbVersionGreaterThan(String value) {
            addCriterion("board_pcb_version >", value, "boardPcbVersion");
            return (Criteria) this;
        }

        public Criteria andBoardPcbVersionGreaterThanOrEqualTo(String value) {
            addCriterion("board_pcb_version >=", value, "boardPcbVersion");
            return (Criteria) this;
        }

        public Criteria andBoardPcbVersionLessThan(String value) {
            addCriterion("board_pcb_version <", value, "boardPcbVersion");
            return (Criteria) this;
        }

        public Criteria andBoardPcbVersionLessThanOrEqualTo(String value) {
            addCriterion("board_pcb_version <=", value, "boardPcbVersion");
            return (Criteria) this;
        }

        public Criteria andBoardPcbVersionLike(String value) {
            addCriterion("board_pcb_version like", value, "boardPcbVersion");
            return (Criteria) this;
        }

        public Criteria andBoardPcbVersionNotLike(String value) {
            addCriterion("board_pcb_version not like", value, "boardPcbVersion");
            return (Criteria) this;
        }

        public Criteria andBoardPcbVersionIn(List<String> values) {
            addCriterion("board_pcb_version in", values, "boardPcbVersion");
            return (Criteria) this;
        }

        public Criteria andBoardPcbVersionNotIn(List<String> values) {
            addCriterion("board_pcb_version not in", values, "boardPcbVersion");
            return (Criteria) this;
        }

        public Criteria andBoardPcbVersionBetween(String value1, String value2) {
            addCriterion("board_pcb_version between", value1, value2, "boardPcbVersion");
            return (Criteria) this;
        }

        public Criteria andBoardPcbVersionNotBetween(String value1, String value2) {
            addCriterion("board_pcb_version not between", value1, value2, "boardPcbVersion");
            return (Criteria) this;
        }

        public Criteria andCpuUsageRateIsNull() {
            addCriterion("cpu_usage_rate is null");
            return (Criteria) this;
        }

        public Criteria andCpuUsageRateIsNotNull() {
            addCriterion("cpu_usage_rate is not null");
            return (Criteria) this;
        }

        public Criteria andCpuUsageRateEqualTo(Double value) {
            addCriterion("cpu_usage_rate =", value, "cpuUsageRate");
            return (Criteria) this;
        }

        public Criteria andCpuUsageRateNotEqualTo(Double value) {
            addCriterion("cpu_usage_rate <>", value, "cpuUsageRate");
            return (Criteria) this;
        }

        public Criteria andCpuUsageRateGreaterThan(Double value) {
            addCriterion("cpu_usage_rate >", value, "cpuUsageRate");
            return (Criteria) this;
        }

        public Criteria andCpuUsageRateGreaterThanOrEqualTo(Double value) {
            addCriterion("cpu_usage_rate >=", value, "cpuUsageRate");
            return (Criteria) this;
        }

        public Criteria andCpuUsageRateLessThan(Double value) {
            addCriterion("cpu_usage_rate <", value, "cpuUsageRate");
            return (Criteria) this;
        }

        public Criteria andCpuUsageRateLessThanOrEqualTo(Double value) {
            addCriterion("cpu_usage_rate <=", value, "cpuUsageRate");
            return (Criteria) this;
        }

        public Criteria andCpuUsageRateIn(List<Double> values) {
            addCriterion("cpu_usage_rate in", values, "cpuUsageRate");
            return (Criteria) this;
        }

        public Criteria andCpuUsageRateNotIn(List<Double> values) {
            addCriterion("cpu_usage_rate not in", values, "cpuUsageRate");
            return (Criteria) this;
        }

        public Criteria andCpuUsageRateBetween(Double value1, Double value2) {
            addCriterion("cpu_usage_rate between", value1, value2, "cpuUsageRate");
            return (Criteria) this;
        }

        public Criteria andCpuUsageRateNotBetween(Double value1, Double value2) {
            addCriterion("cpu_usage_rate not between", value1, value2, "cpuUsageRate");
            return (Criteria) this;
        }

        public Criteria andMemUsageRateIsNull() {
            addCriterion("mem_usage_rate is null");
            return (Criteria) this;
        }

        public Criteria andMemUsageRateIsNotNull() {
            addCriterion("mem_usage_rate is not null");
            return (Criteria) this;
        }

        public Criteria andMemUsageRateEqualTo(Double value) {
            addCriterion("mem_usage_rate =", value, "memUsageRate");
            return (Criteria) this;
        }

        public Criteria andMemUsageRateNotEqualTo(Double value) {
            addCriterion("mem_usage_rate <>", value, "memUsageRate");
            return (Criteria) this;
        }

        public Criteria andMemUsageRateGreaterThan(Double value) {
            addCriterion("mem_usage_rate >", value, "memUsageRate");
            return (Criteria) this;
        }

        public Criteria andMemUsageRateGreaterThanOrEqualTo(Double value) {
            addCriterion("mem_usage_rate >=", value, "memUsageRate");
            return (Criteria) this;
        }

        public Criteria andMemUsageRateLessThan(Double value) {
            addCriterion("mem_usage_rate <", value, "memUsageRate");
            return (Criteria) this;
        }

        public Criteria andMemUsageRateLessThanOrEqualTo(Double value) {
            addCriterion("mem_usage_rate <=", value, "memUsageRate");
            return (Criteria) this;
        }

        public Criteria andMemUsageRateIn(List<Double> values) {
            addCriterion("mem_usage_rate in", values, "memUsageRate");
            return (Criteria) this;
        }

        public Criteria andMemUsageRateNotIn(List<Double> values) {
            addCriterion("mem_usage_rate not in", values, "memUsageRate");
            return (Criteria) this;
        }

        public Criteria andMemUsageRateBetween(Double value1, Double value2) {
            addCriterion("mem_usage_rate between", value1, value2, "memUsageRate");
            return (Criteria) this;
        }

        public Criteria andMemUsageRateNotBetween(Double value1, Double value2) {
            addCriterion("mem_usage_rate not between", value1, value2, "memUsageRate");
            return (Criteria) this;
        }

        public Criteria andMemUsedIsNull() {
            addCriterion("mem_used is null");
            return (Criteria) this;
        }

        public Criteria andMemUsedIsNotNull() {
            addCriterion("mem_used is not null");
            return (Criteria) this;
        }

        public Criteria andMemUsedEqualTo(String value) {
            addCriterion("mem_used =", value, "memUsed");
            return (Criteria) this;
        }

        public Criteria andMemUsedNotEqualTo(String value) {
            addCriterion("mem_used <>", value, "memUsed");
            return (Criteria) this;
        }

        public Criteria andMemUsedGreaterThan(String value) {
            addCriterion("mem_used >", value, "memUsed");
            return (Criteria) this;
        }

        public Criteria andMemUsedGreaterThanOrEqualTo(String value) {
            addCriterion("mem_used >=", value, "memUsed");
            return (Criteria) this;
        }

        public Criteria andMemUsedLessThan(String value) {
            addCriterion("mem_used <", value, "memUsed");
            return (Criteria) this;
        }

        public Criteria andMemUsedLessThanOrEqualTo(String value) {
            addCriterion("mem_used <=", value, "memUsed");
            return (Criteria) this;
        }

        public Criteria andMemUsedLike(String value) {
            addCriterion("mem_used like", value, "memUsed");
            return (Criteria) this;
        }

        public Criteria andMemUsedNotLike(String value) {
            addCriterion("mem_used not like", value, "memUsed");
            return (Criteria) this;
        }

        public Criteria andMemUsedIn(List<String> values) {
            addCriterion("mem_used in", values, "memUsed");
            return (Criteria) this;
        }

        public Criteria andMemUsedNotIn(List<String> values) {
            addCriterion("mem_used not in", values, "memUsed");
            return (Criteria) this;
        }

        public Criteria andMemUsedBetween(String value1, String value2) {
            addCriterion("mem_used between", value1, value2, "memUsed");
            return (Criteria) this;
        }

        public Criteria andMemUsedNotBetween(String value1, String value2) {
            addCriterion("mem_used not between", value1, value2, "memUsed");
            return (Criteria) this;
        }

        public Criteria andMemTotalIsNull() {
            addCriterion("mem_total is null");
            return (Criteria) this;
        }

        public Criteria andMemTotalIsNotNull() {
            addCriterion("mem_total is not null");
            return (Criteria) this;
        }

        public Criteria andMemTotalEqualTo(String value) {
            addCriterion("mem_total =", value, "memTotal");
            return (Criteria) this;
        }

        public Criteria andMemTotalNotEqualTo(String value) {
            addCriterion("mem_total <>", value, "memTotal");
            return (Criteria) this;
        }

        public Criteria andMemTotalGreaterThan(String value) {
            addCriterion("mem_total >", value, "memTotal");
            return (Criteria) this;
        }

        public Criteria andMemTotalGreaterThanOrEqualTo(String value) {
            addCriterion("mem_total >=", value, "memTotal");
            return (Criteria) this;
        }

        public Criteria andMemTotalLessThan(String value) {
            addCriterion("mem_total <", value, "memTotal");
            return (Criteria) this;
        }

        public Criteria andMemTotalLessThanOrEqualTo(String value) {
            addCriterion("mem_total <=", value, "memTotal");
            return (Criteria) this;
        }

        public Criteria andMemTotalLike(String value) {
            addCriterion("mem_total like", value, "memTotal");
            return (Criteria) this;
        }

        public Criteria andMemTotalNotLike(String value) {
            addCriterion("mem_total not like", value, "memTotal");
            return (Criteria) this;
        }

        public Criteria andMemTotalIn(List<String> values) {
            addCriterion("mem_total in", values, "memTotal");
            return (Criteria) this;
        }

        public Criteria andMemTotalNotIn(List<String> values) {
            addCriterion("mem_total not in", values, "memTotal");
            return (Criteria) this;
        }

        public Criteria andMemTotalBetween(String value1, String value2) {
            addCriterion("mem_total between", value1, value2, "memTotal");
            return (Criteria) this;
        }

        public Criteria andMemTotalNotBetween(String value1, String value2) {
            addCriterion("mem_total not between", value1, value2, "memTotal");
            return (Criteria) this;
        }

        public Criteria andSdramIsNull() {
            addCriterion("sdram is null");
            return (Criteria) this;
        }

        public Criteria andSdramIsNotNull() {
            addCriterion("sdram is not null");
            return (Criteria) this;
        }

        public Criteria andSdramEqualTo(String value) {
            addCriterion("sdram =", value, "sdram");
            return (Criteria) this;
        }

        public Criteria andSdramNotEqualTo(String value) {
            addCriterion("sdram <>", value, "sdram");
            return (Criteria) this;
        }

        public Criteria andSdramGreaterThan(String value) {
            addCriterion("sdram >", value, "sdram");
            return (Criteria) this;
        }

        public Criteria andSdramGreaterThanOrEqualTo(String value) {
            addCriterion("sdram >=", value, "sdram");
            return (Criteria) this;
        }

        public Criteria andSdramLessThan(String value) {
            addCriterion("sdram <", value, "sdram");
            return (Criteria) this;
        }

        public Criteria andSdramLessThanOrEqualTo(String value) {
            addCriterion("sdram <=", value, "sdram");
            return (Criteria) this;
        }

        public Criteria andSdramLike(String value) {
            addCriterion("sdram like", value, "sdram");
            return (Criteria) this;
        }

        public Criteria andSdramNotLike(String value) {
            addCriterion("sdram not like", value, "sdram");
            return (Criteria) this;
        }

        public Criteria andSdramIn(List<String> values) {
            addCriterion("sdram in", values, "sdram");
            return (Criteria) this;
        }

        public Criteria andSdramNotIn(List<String> values) {
            addCriterion("sdram not in", values, "sdram");
            return (Criteria) this;
        }

        public Criteria andSdramBetween(String value1, String value2) {
            addCriterion("sdram between", value1, value2, "sdram");
            return (Criteria) this;
        }

        public Criteria andSdramNotBetween(String value1, String value2) {
            addCriterion("sdram not between", value1, value2, "sdram");
            return (Criteria) this;
        }

        public Criteria andFlashIsNull() {
            addCriterion("flash is null");
            return (Criteria) this;
        }

        public Criteria andFlashIsNotNull() {
            addCriterion("flash is not null");
            return (Criteria) this;
        }

        public Criteria andFlashEqualTo(String value) {
            addCriterion("flash =", value, "flash");
            return (Criteria) this;
        }

        public Criteria andFlashNotEqualTo(String value) {
            addCriterion("flash <>", value, "flash");
            return (Criteria) this;
        }

        public Criteria andFlashGreaterThan(String value) {
            addCriterion("flash >", value, "flash");
            return (Criteria) this;
        }

        public Criteria andFlashGreaterThanOrEqualTo(String value) {
            addCriterion("flash >=", value, "flash");
            return (Criteria) this;
        }

        public Criteria andFlashLessThan(String value) {
            addCriterion("flash <", value, "flash");
            return (Criteria) this;
        }

        public Criteria andFlashLessThanOrEqualTo(String value) {
            addCriterion("flash <=", value, "flash");
            return (Criteria) this;
        }

        public Criteria andFlashLike(String value) {
            addCriterion("flash like", value, "flash");
            return (Criteria) this;
        }

        public Criteria andFlashNotLike(String value) {
            addCriterion("flash not like", value, "flash");
            return (Criteria) this;
        }

        public Criteria andFlashIn(List<String> values) {
            addCriterion("flash in", values, "flash");
            return (Criteria) this;
        }

        public Criteria andFlashNotIn(List<String> values) {
            addCriterion("flash not in", values, "flash");
            return (Criteria) this;
        }

        public Criteria andFlashBetween(String value1, String value2) {
            addCriterion("flash between", value1, value2, "flash");
            return (Criteria) this;
        }

        public Criteria andFlashNotBetween(String value1, String value2) {
            addCriterion("flash not between", value1, value2, "flash");
            return (Criteria) this;
        }

        public Criteria andNvramIsNull() {
            addCriterion("nvram is null");
            return (Criteria) this;
        }

        public Criteria andNvramIsNotNull() {
            addCriterion("nvram is not null");
            return (Criteria) this;
        }

        public Criteria andNvramEqualTo(String value) {
            addCriterion("nvram =", value, "nvram");
            return (Criteria) this;
        }

        public Criteria andNvramNotEqualTo(String value) {
            addCriterion("nvram <>", value, "nvram");
            return (Criteria) this;
        }

        public Criteria andNvramGreaterThan(String value) {
            addCriterion("nvram >", value, "nvram");
            return (Criteria) this;
        }

        public Criteria andNvramGreaterThanOrEqualTo(String value) {
            addCriterion("nvram >=", value, "nvram");
            return (Criteria) this;
        }

        public Criteria andNvramLessThan(String value) {
            addCriterion("nvram <", value, "nvram");
            return (Criteria) this;
        }

        public Criteria andNvramLessThanOrEqualTo(String value) {
            addCriterion("nvram <=", value, "nvram");
            return (Criteria) this;
        }

        public Criteria andNvramLike(String value) {
            addCriterion("nvram like", value, "nvram");
            return (Criteria) this;
        }

        public Criteria andNvramNotLike(String value) {
            addCriterion("nvram not like", value, "nvram");
            return (Criteria) this;
        }

        public Criteria andNvramIn(List<String> values) {
            addCriterion("nvram in", values, "nvram");
            return (Criteria) this;
        }

        public Criteria andNvramNotIn(List<String> values) {
            addCriterion("nvram not in", values, "nvram");
            return (Criteria) this;
        }

        public Criteria andNvramBetween(String value1, String value2) {
            addCriterion("nvram between", value1, value2, "nvram");
            return (Criteria) this;
        }

        public Criteria andNvramNotBetween(String value1, String value2) {
            addCriterion("nvram not between", value1, value2, "nvram");
            return (Criteria) this;
        }

        public Criteria andCfcardMemIsNull() {
            addCriterion("cfcard_mem is null");
            return (Criteria) this;
        }

        public Criteria andCfcardMemIsNotNull() {
            addCriterion("cfcard_mem is not null");
            return (Criteria) this;
        }

        public Criteria andCfcardMemEqualTo(String value) {
            addCriterion("cfcard_mem =", value, "cfcardMem");
            return (Criteria) this;
        }

        public Criteria andCfcardMemNotEqualTo(String value) {
            addCriterion("cfcard_mem <>", value, "cfcardMem");
            return (Criteria) this;
        }

        public Criteria andCfcardMemGreaterThan(String value) {
            addCriterion("cfcard_mem >", value, "cfcardMem");
            return (Criteria) this;
        }

        public Criteria andCfcardMemGreaterThanOrEqualTo(String value) {
            addCriterion("cfcard_mem >=", value, "cfcardMem");
            return (Criteria) this;
        }

        public Criteria andCfcardMemLessThan(String value) {
            addCriterion("cfcard_mem <", value, "cfcardMem");
            return (Criteria) this;
        }

        public Criteria andCfcardMemLessThanOrEqualTo(String value) {
            addCriterion("cfcard_mem <=", value, "cfcardMem");
            return (Criteria) this;
        }

        public Criteria andCfcardMemLike(String value) {
            addCriterion("cfcard_mem like", value, "cfcardMem");
            return (Criteria) this;
        }

        public Criteria andCfcardMemNotLike(String value) {
            addCriterion("cfcard_mem not like", value, "cfcardMem");
            return (Criteria) this;
        }

        public Criteria andCfcardMemIn(List<String> values) {
            addCriterion("cfcard_mem in", values, "cfcardMem");
            return (Criteria) this;
        }

        public Criteria andCfcardMemNotIn(List<String> values) {
            addCriterion("cfcard_mem not in", values, "cfcardMem");
            return (Criteria) this;
        }

        public Criteria andCfcardMemBetween(String value1, String value2) {
            addCriterion("cfcard_mem between", value1, value2, "cfcardMem");
            return (Criteria) this;
        }

        public Criteria andCfcardMemNotBetween(String value1, String value2) {
            addCriterion("cfcard_mem not between", value1, value2, "cfcardMem");
            return (Criteria) this;
        }

        public Criteria andBoardUpTimeIsNull() {
            addCriterion("board_up_time is null");
            return (Criteria) this;
        }

        public Criteria andBoardUpTimeIsNotNull() {
            addCriterion("board_up_time is not null");
            return (Criteria) this;
        }

        public Criteria andBoardUpTimeEqualTo(String value) {
            addCriterion("board_up_time =", value, "boardUpTime");
            return (Criteria) this;
        }

        public Criteria andBoardUpTimeNotEqualTo(String value) {
            addCriterion("board_up_time <>", value, "boardUpTime");
            return (Criteria) this;
        }

        public Criteria andBoardUpTimeGreaterThan(String value) {
            addCriterion("board_up_time >", value, "boardUpTime");
            return (Criteria) this;
        }

        public Criteria andBoardUpTimeGreaterThanOrEqualTo(String value) {
            addCriterion("board_up_time >=", value, "boardUpTime");
            return (Criteria) this;
        }

        public Criteria andBoardUpTimeLessThan(String value) {
            addCriterion("board_up_time <", value, "boardUpTime");
            return (Criteria) this;
        }

        public Criteria andBoardUpTimeLessThanOrEqualTo(String value) {
            addCriterion("board_up_time <=", value, "boardUpTime");
            return (Criteria) this;
        }

        public Criteria andBoardUpTimeLike(String value) {
            addCriterion("board_up_time like", value, "boardUpTime");
            return (Criteria) this;
        }

        public Criteria andBoardUpTimeNotLike(String value) {
            addCriterion("board_up_time not like", value, "boardUpTime");
            return (Criteria) this;
        }

        public Criteria andBoardUpTimeIn(List<String> values) {
            addCriterion("board_up_time in", values, "boardUpTime");
            return (Criteria) this;
        }

        public Criteria andBoardUpTimeNotIn(List<String> values) {
            addCriterion("board_up_time not in", values, "boardUpTime");
            return (Criteria) this;
        }

        public Criteria andBoardUpTimeBetween(String value1, String value2) {
            addCriterion("board_up_time between", value1, value2, "boardUpTime");
            return (Criteria) this;
        }

        public Criteria andBoardUpTimeNotBetween(String value1, String value2) {
            addCriterion("board_up_time not between", value1, value2, "boardUpTime");
            return (Criteria) this;
        }

        public Criteria andUserCountIsNull() {
            addCriterion("user_count is null");
            return (Criteria) this;
        }

        public Criteria andUserCountIsNotNull() {
            addCriterion("user_count is not null");
            return (Criteria) this;
        }

        public Criteria andUserCountEqualTo(String value) {
            addCriterion("user_count =", value, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountNotEqualTo(String value) {
            addCriterion("user_count <>", value, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountGreaterThan(String value) {
            addCriterion("user_count >", value, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountGreaterThanOrEqualTo(String value) {
            addCriterion("user_count >=", value, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountLessThan(String value) {
            addCriterion("user_count <", value, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountLessThanOrEqualTo(String value) {
            addCriterion("user_count <=", value, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountLike(String value) {
            addCriterion("user_count like", value, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountNotLike(String value) {
            addCriterion("user_count not like", value, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountIn(List<String> values) {
            addCriterion("user_count in", values, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountNotIn(List<String> values) {
            addCriterion("user_count not in", values, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountBetween(String value1, String value2) {
            addCriterion("user_count between", value1, value2, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountNotBetween(String value1, String value2) {
            addCriterion("user_count not between", value1, value2, "userCount");
            return (Criteria) this;
        }

        public Criteria andIpv4UserCountIsNull() {
            addCriterion("ipv4_user_count is null");
            return (Criteria) this;
        }

        public Criteria andIpv4UserCountIsNotNull() {
            addCriterion("ipv4_user_count is not null");
            return (Criteria) this;
        }

        public Criteria andIpv4UserCountEqualTo(String value) {
            addCriterion("ipv4_user_count =", value, "ipv4UserCount");
            return (Criteria) this;
        }

        public Criteria andIpv4UserCountNotEqualTo(String value) {
            addCriterion("ipv4_user_count <>", value, "ipv4UserCount");
            return (Criteria) this;
        }

        public Criteria andIpv4UserCountGreaterThan(String value) {
            addCriterion("ipv4_user_count >", value, "ipv4UserCount");
            return (Criteria) this;
        }

        public Criteria andIpv4UserCountGreaterThanOrEqualTo(String value) {
            addCriterion("ipv4_user_count >=", value, "ipv4UserCount");
            return (Criteria) this;
        }

        public Criteria andIpv4UserCountLessThan(String value) {
            addCriterion("ipv4_user_count <", value, "ipv4UserCount");
            return (Criteria) this;
        }

        public Criteria andIpv4UserCountLessThanOrEqualTo(String value) {
            addCriterion("ipv4_user_count <=", value, "ipv4UserCount");
            return (Criteria) this;
        }

        public Criteria andIpv4UserCountLike(String value) {
            addCriterion("ipv4_user_count like", value, "ipv4UserCount");
            return (Criteria) this;
        }

        public Criteria andIpv4UserCountNotLike(String value) {
            addCriterion("ipv4_user_count not like", value, "ipv4UserCount");
            return (Criteria) this;
        }

        public Criteria andIpv4UserCountIn(List<String> values) {
            addCriterion("ipv4_user_count in", values, "ipv4UserCount");
            return (Criteria) this;
        }

        public Criteria andIpv4UserCountNotIn(List<String> values) {
            addCriterion("ipv4_user_count not in", values, "ipv4UserCount");
            return (Criteria) this;
        }

        public Criteria andIpv4UserCountBetween(String value1, String value2) {
            addCriterion("ipv4_user_count between", value1, value2, "ipv4UserCount");
            return (Criteria) this;
        }

        public Criteria andIpv4UserCountNotBetween(String value1, String value2) {
            addCriterion("ipv4_user_count not between", value1, value2, "ipv4UserCount");
            return (Criteria) this;
        }

        public Criteria andIpv6UserCountIsNull() {
            addCriterion("ipv6_user_count is null");
            return (Criteria) this;
        }

        public Criteria andIpv6UserCountIsNotNull() {
            addCriterion("ipv6_user_count is not null");
            return (Criteria) this;
        }

        public Criteria andIpv6UserCountEqualTo(String value) {
            addCriterion("ipv6_user_count =", value, "ipv6UserCount");
            return (Criteria) this;
        }

        public Criteria andIpv6UserCountNotEqualTo(String value) {
            addCriterion("ipv6_user_count <>", value, "ipv6UserCount");
            return (Criteria) this;
        }

        public Criteria andIpv6UserCountGreaterThan(String value) {
            addCriterion("ipv6_user_count >", value, "ipv6UserCount");
            return (Criteria) this;
        }

        public Criteria andIpv6UserCountGreaterThanOrEqualTo(String value) {
            addCriterion("ipv6_user_count >=", value, "ipv6UserCount");
            return (Criteria) this;
        }

        public Criteria andIpv6UserCountLessThan(String value) {
            addCriterion("ipv6_user_count <", value, "ipv6UserCount");
            return (Criteria) this;
        }

        public Criteria andIpv6UserCountLessThanOrEqualTo(String value) {
            addCriterion("ipv6_user_count <=", value, "ipv6UserCount");
            return (Criteria) this;
        }

        public Criteria andIpv6UserCountLike(String value) {
            addCriterion("ipv6_user_count like", value, "ipv6UserCount");
            return (Criteria) this;
        }

        public Criteria andIpv6UserCountNotLike(String value) {
            addCriterion("ipv6_user_count not like", value, "ipv6UserCount");
            return (Criteria) this;
        }

        public Criteria andIpv6UserCountIn(List<String> values) {
            addCriterion("ipv6_user_count in", values, "ipv6UserCount");
            return (Criteria) this;
        }

        public Criteria andIpv6UserCountNotIn(List<String> values) {
            addCriterion("ipv6_user_count not in", values, "ipv6UserCount");
            return (Criteria) this;
        }

        public Criteria andIpv6UserCountBetween(String value1, String value2) {
            addCriterion("ipv6_user_count between", value1, value2, "ipv6UserCount");
            return (Criteria) this;
        }

        public Criteria andIpv6UserCountNotBetween(String value1, String value2) {
            addCriterion("ipv6_user_count not between", value1, value2, "ipv6UserCount");
            return (Criteria) this;
        }

        public Criteria andMacInUsedIsNull() {
            addCriterion("mac_in_used is null");
            return (Criteria) this;
        }

        public Criteria andMacInUsedIsNotNull() {
            addCriterion("mac_in_used is not null");
            return (Criteria) this;
        }

        public Criteria andMacInUsedEqualTo(String value) {
            addCriterion("mac_in_used =", value, "macInUsed");
            return (Criteria) this;
        }

        public Criteria andMacInUsedNotEqualTo(String value) {
            addCriterion("mac_in_used <>", value, "macInUsed");
            return (Criteria) this;
        }

        public Criteria andMacInUsedGreaterThan(String value) {
            addCriterion("mac_in_used >", value, "macInUsed");
            return (Criteria) this;
        }

        public Criteria andMacInUsedGreaterThanOrEqualTo(String value) {
            addCriterion("mac_in_used >=", value, "macInUsed");
            return (Criteria) this;
        }

        public Criteria andMacInUsedLessThan(String value) {
            addCriterion("mac_in_used <", value, "macInUsed");
            return (Criteria) this;
        }

        public Criteria andMacInUsedLessThanOrEqualTo(String value) {
            addCriterion("mac_in_used <=", value, "macInUsed");
            return (Criteria) this;
        }

        public Criteria andMacInUsedLike(String value) {
            addCriterion("mac_in_used like", value, "macInUsed");
            return (Criteria) this;
        }

        public Criteria andMacInUsedNotLike(String value) {
            addCriterion("mac_in_used not like", value, "macInUsed");
            return (Criteria) this;
        }

        public Criteria andMacInUsedIn(List<String> values) {
            addCriterion("mac_in_used in", values, "macInUsed");
            return (Criteria) this;
        }

        public Criteria andMacInUsedNotIn(List<String> values) {
            addCriterion("mac_in_used not in", values, "macInUsed");
            return (Criteria) this;
        }

        public Criteria andMacInUsedBetween(String value1, String value2) {
            addCriterion("mac_in_used between", value1, value2, "macInUsed");
            return (Criteria) this;
        }

        public Criteria andMacInUsedNotBetween(String value1, String value2) {
            addCriterion("mac_in_used not between", value1, value2, "macInUsed");
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