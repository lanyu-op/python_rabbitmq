package com.microservice.rabbitmq.devices.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DevBasicInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DevBasicInfoExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andFileTypeIsNull() {
            addCriterion("file_type is null");
            return (Criteria) this;
        }

        public Criteria andFileTypeIsNotNull() {
            addCriterion("file_type is not null");
            return (Criteria) this;
        }

        public Criteria andFileTypeEqualTo(String value) {
            addCriterion("file_type =", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotEqualTo(String value) {
            addCriterion("file_type <>", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeGreaterThan(String value) {
            addCriterion("file_type >", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeGreaterThanOrEqualTo(String value) {
            addCriterion("file_type >=", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLessThan(String value) {
            addCriterion("file_type <", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLessThanOrEqualTo(String value) {
            addCriterion("file_type <=", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLike(String value) {
            addCriterion("file_type like", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotLike(String value) {
            addCriterion("file_type not like", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeIn(List<String> values) {
            addCriterion("file_type in", values, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotIn(List<String> values) {
            addCriterion("file_type not in", values, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeBetween(String value1, String value2) {
            addCriterion("file_type between", value1, value2, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotBetween(String value1, String value2) {
            addCriterion("file_type not between", value1, value2, "fileType");
            return (Criteria) this;
        }

        public Criteria andSiteIdIsNull() {
            addCriterion("site_id is null");
            return (Criteria) this;
        }

        public Criteria andSiteIdIsNotNull() {
            addCriterion("site_id is not null");
            return (Criteria) this;
        }

        public Criteria andSiteIdEqualTo(String value) {
            addCriterion("site_id =", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotEqualTo(String value) {
            addCriterion("site_id <>", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdGreaterThan(String value) {
            addCriterion("site_id >", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdGreaterThanOrEqualTo(String value) {
            addCriterion("site_id >=", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLessThan(String value) {
            addCriterion("site_id <", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLessThanOrEqualTo(String value) {
            addCriterion("site_id <=", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLike(String value) {
            addCriterion("site_id like", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotLike(String value) {
            addCriterion("site_id not like", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdIn(List<String> values) {
            addCriterion("site_id in", values, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotIn(List<String> values) {
            addCriterion("site_id not in", values, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdBetween(String value1, String value2) {
            addCriterion("site_id between", value1, value2, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotBetween(String value1, String value2) {
            addCriterion("site_id not between", value1, value2, "siteId");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNull() {
            addCriterion("file_name is null");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNotNull() {
            addCriterion("file_name is not null");
            return (Criteria) this;
        }

        public Criteria andFileNameEqualTo(String value) {
            addCriterion("file_name =", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotEqualTo(String value) {
            addCriterion("file_name <>", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThan(String value) {
            addCriterion("file_name >", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("file_name >=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThan(String value) {
            addCriterion("file_name <", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThanOrEqualTo(String value) {
            addCriterion("file_name <=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLike(String value) {
            addCriterion("file_name like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotLike(String value) {
            addCriterion("file_name not like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameIn(List<String> values) {
            addCriterion("file_name in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotIn(List<String> values) {
            addCriterion("file_name not in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameBetween(String value1, String value2) {
            addCriterion("file_name between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotBetween(String value1, String value2) {
            addCriterion("file_name not between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFilePathIsNull() {
            addCriterion("file_path is null");
            return (Criteria) this;
        }

        public Criteria andFilePathIsNotNull() {
            addCriterion("file_path is not null");
            return (Criteria) this;
        }

        public Criteria andFilePathEqualTo(String value) {
            addCriterion("file_path =", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotEqualTo(String value) {
            addCriterion("file_path <>", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathGreaterThan(String value) {
            addCriterion("file_path >", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("file_path >=", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLessThan(String value) {
            addCriterion("file_path <", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLessThanOrEqualTo(String value) {
            addCriterion("file_path <=", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLike(String value) {
            addCriterion("file_path like", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotLike(String value) {
            addCriterion("file_path not like", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathIn(List<String> values) {
            addCriterion("file_path in", values, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotIn(List<String> values) {
            addCriterion("file_path not in", values, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathBetween(String value1, String value2) {
            addCriterion("file_path between", value1, value2, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotBetween(String value1, String value2) {
            addCriterion("file_path not between", value1, value2, "filePath");
            return (Criteria) this;
        }

        public Criteria andFileSizeIsNull() {
            addCriterion("file_size is null");
            return (Criteria) this;
        }

        public Criteria andFileSizeIsNotNull() {
            addCriterion("file_size is not null");
            return (Criteria) this;
        }

        public Criteria andFileSizeEqualTo(Double value) {
            addCriterion("file_size =", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotEqualTo(Double value) {
            addCriterion("file_size <>", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeGreaterThan(Double value) {
            addCriterion("file_size >", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeGreaterThanOrEqualTo(Double value) {
            addCriterion("file_size >=", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeLessThan(Double value) {
            addCriterion("file_size <", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeLessThanOrEqualTo(Double value) {
            addCriterion("file_size <=", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeIn(List<Double> values) {
            addCriterion("file_size in", values, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotIn(List<Double> values) {
            addCriterion("file_size not in", values, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeBetween(Double value1, Double value2) {
            addCriterion("file_size between", value1, value2, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotBetween(Double value1, Double value2) {
            addCriterion("file_size not between", value1, value2, "fileSize");
            return (Criteria) this;
        }

        public Criteria andCollectTimeIsNull() {
            addCriterion("collect_time is null");
            return (Criteria) this;
        }

        public Criteria andCollectTimeIsNotNull() {
            addCriterion("collect_time is not null");
            return (Criteria) this;
        }

        public Criteria andCollectTimeEqualTo(Date value) {
            addCriterion("collect_time =", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeNotEqualTo(Date value) {
            addCriterion("collect_time <>", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeGreaterThan(Date value) {
            addCriterion("collect_time >", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("collect_time >=", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeLessThan(Date value) {
            addCriterion("collect_time <", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeLessThanOrEqualTo(Date value) {
            addCriterion("collect_time <=", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeIn(List<Date> values) {
            addCriterion("collect_time in", values, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeNotIn(List<Date> values) {
            addCriterion("collect_time not in", values, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeBetween(Date value1, Date value2) {
            addCriterion("collect_time between", value1, value2, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeNotBetween(Date value1, Date value2) {
            addCriterion("collect_time not between", value1, value2, "collectTime");
            return (Criteria) this;
        }

        public Criteria andDeviceStartTimeIsNull() {
            addCriterion("device_start_time is null");
            return (Criteria) this;
        }

        public Criteria andDeviceStartTimeIsNotNull() {
            addCriterion("device_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceStartTimeEqualTo(String value) {
            addCriterion("device_start_time =", value, "deviceStartTime");
            return (Criteria) this;
        }

        public Criteria andDeviceStartTimeNotEqualTo(String value) {
            addCriterion("device_start_time <>", value, "deviceStartTime");
            return (Criteria) this;
        }

        public Criteria andDeviceStartTimeGreaterThan(String value) {
            addCriterion("device_start_time >", value, "deviceStartTime");
            return (Criteria) this;
        }

        public Criteria andDeviceStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("device_start_time >=", value, "deviceStartTime");
            return (Criteria) this;
        }

        public Criteria andDeviceStartTimeLessThan(String value) {
            addCriterion("device_start_time <", value, "deviceStartTime");
            return (Criteria) this;
        }

        public Criteria andDeviceStartTimeLessThanOrEqualTo(String value) {
            addCriterion("device_start_time <=", value, "deviceStartTime");
            return (Criteria) this;
        }

        public Criteria andDeviceStartTimeLike(String value) {
            addCriterion("device_start_time like", value, "deviceStartTime");
            return (Criteria) this;
        }

        public Criteria andDeviceStartTimeNotLike(String value) {
            addCriterion("device_start_time not like", value, "deviceStartTime");
            return (Criteria) this;
        }

        public Criteria andDeviceStartTimeIn(List<String> values) {
            addCriterion("device_start_time in", values, "deviceStartTime");
            return (Criteria) this;
        }

        public Criteria andDeviceStartTimeNotIn(List<String> values) {
            addCriterion("device_start_time not in", values, "deviceStartTime");
            return (Criteria) this;
        }

        public Criteria andDeviceStartTimeBetween(String value1, String value2) {
            addCriterion("device_start_time between", value1, value2, "deviceStartTime");
            return (Criteria) this;
        }

        public Criteria andDeviceStartTimeNotBetween(String value1, String value2) {
            addCriterion("device_start_time not between", value1, value2, "deviceStartTime");
            return (Criteria) this;
        }

        public Criteria andDeviceRunTimeIsNull() {
            addCriterion("device_run_time is null");
            return (Criteria) this;
        }

        public Criteria andDeviceRunTimeIsNotNull() {
            addCriterion("device_run_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceRunTimeEqualTo(String value) {
            addCriterion("device_run_time =", value, "deviceRunTime");
            return (Criteria) this;
        }

        public Criteria andDeviceRunTimeNotEqualTo(String value) {
            addCriterion("device_run_time <>", value, "deviceRunTime");
            return (Criteria) this;
        }

        public Criteria andDeviceRunTimeGreaterThan(String value) {
            addCriterion("device_run_time >", value, "deviceRunTime");
            return (Criteria) this;
        }

        public Criteria andDeviceRunTimeGreaterThanOrEqualTo(String value) {
            addCriterion("device_run_time >=", value, "deviceRunTime");
            return (Criteria) this;
        }

        public Criteria andDeviceRunTimeLessThan(String value) {
            addCriterion("device_run_time <", value, "deviceRunTime");
            return (Criteria) this;
        }

        public Criteria andDeviceRunTimeLessThanOrEqualTo(String value) {
            addCriterion("device_run_time <=", value, "deviceRunTime");
            return (Criteria) this;
        }

        public Criteria andDeviceRunTimeLike(String value) {
            addCriterion("device_run_time like", value, "deviceRunTime");
            return (Criteria) this;
        }

        public Criteria andDeviceRunTimeNotLike(String value) {
            addCriterion("device_run_time not like", value, "deviceRunTime");
            return (Criteria) this;
        }

        public Criteria andDeviceRunTimeIn(List<String> values) {
            addCriterion("device_run_time in", values, "deviceRunTime");
            return (Criteria) this;
        }

        public Criteria andDeviceRunTimeNotIn(List<String> values) {
            addCriterion("device_run_time not in", values, "deviceRunTime");
            return (Criteria) this;
        }

        public Criteria andDeviceRunTimeBetween(String value1, String value2) {
            addCriterion("device_run_time between", value1, value2, "deviceRunTime");
            return (Criteria) this;
        }

        public Criteria andDeviceRunTimeNotBetween(String value1, String value2) {
            addCriterion("device_run_time not between", value1, value2, "deviceRunTime");
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

        public Criteria andDeviceNameIsNull() {
            addCriterion("device_name is null");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIsNotNull() {
            addCriterion("device_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceNameEqualTo(String value) {
            addCriterion("device_name =", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotEqualTo(String value) {
            addCriterion("device_name <>", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameGreaterThan(String value) {
            addCriterion("device_name >", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameGreaterThanOrEqualTo(String value) {
            addCriterion("device_name >=", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLessThan(String value) {
            addCriterion("device_name <", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLessThanOrEqualTo(String value) {
            addCriterion("device_name <=", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLike(String value) {
            addCriterion("device_name like", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotLike(String value) {
            addCriterion("device_name not like", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIn(List<String> values) {
            addCriterion("device_name in", values, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotIn(List<String> values) {
            addCriterion("device_name not in", values, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameBetween(String value1, String value2) {
            addCriterion("device_name between", value1, value2, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotBetween(String value1, String value2) {
            addCriterion("device_name not between", value1, value2, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceVerisonIsNull() {
            addCriterion("device_verison is null");
            return (Criteria) this;
        }

        public Criteria andDeviceVerisonIsNotNull() {
            addCriterion("device_verison is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceVerisonEqualTo(String value) {
            addCriterion("device_verison =", value, "deviceVerison");
            return (Criteria) this;
        }

        public Criteria andDeviceVerisonNotEqualTo(String value) {
            addCriterion("device_verison <>", value, "deviceVerison");
            return (Criteria) this;
        }

        public Criteria andDeviceVerisonGreaterThan(String value) {
            addCriterion("device_verison >", value, "deviceVerison");
            return (Criteria) this;
        }

        public Criteria andDeviceVerisonGreaterThanOrEqualTo(String value) {
            addCriterion("device_verison >=", value, "deviceVerison");
            return (Criteria) this;
        }

        public Criteria andDeviceVerisonLessThan(String value) {
            addCriterion("device_verison <", value, "deviceVerison");
            return (Criteria) this;
        }

        public Criteria andDeviceVerisonLessThanOrEqualTo(String value) {
            addCriterion("device_verison <=", value, "deviceVerison");
            return (Criteria) this;
        }

        public Criteria andDeviceVerisonLike(String value) {
            addCriterion("device_verison like", value, "deviceVerison");
            return (Criteria) this;
        }

        public Criteria andDeviceVerisonNotLike(String value) {
            addCriterion("device_verison not like", value, "deviceVerison");
            return (Criteria) this;
        }

        public Criteria andDeviceVerisonIn(List<String> values) {
            addCriterion("device_verison in", values, "deviceVerison");
            return (Criteria) this;
        }

        public Criteria andDeviceVerisonNotIn(List<String> values) {
            addCriterion("device_verison not in", values, "deviceVerison");
            return (Criteria) this;
        }

        public Criteria andDeviceVerisonBetween(String value1, String value2) {
            addCriterion("device_verison between", value1, value2, "deviceVerison");
            return (Criteria) this;
        }

        public Criteria andDeviceVerisonNotBetween(String value1, String value2) {
            addCriterion("device_verison not between", value1, value2, "deviceVerison");
            return (Criteria) this;
        }

        public Criteria andDevicePatchIsNull() {
            addCriterion("device_patch is null");
            return (Criteria) this;
        }

        public Criteria andDevicePatchIsNotNull() {
            addCriterion("device_patch is not null");
            return (Criteria) this;
        }

        public Criteria andDevicePatchEqualTo(String value) {
            addCriterion("device_patch =", value, "devicePatch");
            return (Criteria) this;
        }

        public Criteria andDevicePatchNotEqualTo(String value) {
            addCriterion("device_patch <>", value, "devicePatch");
            return (Criteria) this;
        }

        public Criteria andDevicePatchGreaterThan(String value) {
            addCriterion("device_patch >", value, "devicePatch");
            return (Criteria) this;
        }

        public Criteria andDevicePatchGreaterThanOrEqualTo(String value) {
            addCriterion("device_patch >=", value, "devicePatch");
            return (Criteria) this;
        }

        public Criteria andDevicePatchLessThan(String value) {
            addCriterion("device_patch <", value, "devicePatch");
            return (Criteria) this;
        }

        public Criteria andDevicePatchLessThanOrEqualTo(String value) {
            addCriterion("device_patch <=", value, "devicePatch");
            return (Criteria) this;
        }

        public Criteria andDevicePatchLike(String value) {
            addCriterion("device_patch like", value, "devicePatch");
            return (Criteria) this;
        }

        public Criteria andDevicePatchNotLike(String value) {
            addCriterion("device_patch not like", value, "devicePatch");
            return (Criteria) this;
        }

        public Criteria andDevicePatchIn(List<String> values) {
            addCriterion("device_patch in", values, "devicePatch");
            return (Criteria) this;
        }

        public Criteria andDevicePatchNotIn(List<String> values) {
            addCriterion("device_patch not in", values, "devicePatch");
            return (Criteria) this;
        }

        public Criteria andDevicePatchBetween(String value1, String value2) {
            addCriterion("device_patch between", value1, value2, "devicePatch");
            return (Criteria) this;
        }

        public Criteria andDevicePatchNotBetween(String value1, String value2) {
            addCriterion("device_patch not between", value1, value2, "devicePatch");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusIsNull() {
            addCriterion("device_status is null");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusIsNotNull() {
            addCriterion("device_status is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusEqualTo(Integer value) {
            addCriterion("device_status =", value, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusNotEqualTo(Integer value) {
            addCriterion("device_status <>", value, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusGreaterThan(Integer value) {
            addCriterion("device_status >", value, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_status >=", value, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusLessThan(Integer value) {
            addCriterion("device_status <", value, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusLessThanOrEqualTo(Integer value) {
            addCriterion("device_status <=", value, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusIn(List<Integer> values) {
            addCriterion("device_status in", values, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusNotIn(List<Integer> values) {
            addCriterion("device_status not in", values, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusBetween(Integer value1, Integer value2) {
            addCriterion("device_status between", value1, value2, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("device_status not between", value1, value2, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andIpAddressIsNull() {
            addCriterion("ip_address is null");
            return (Criteria) this;
        }

        public Criteria andIpAddressIsNotNull() {
            addCriterion("ip_address is not null");
            return (Criteria) this;
        }

        public Criteria andIpAddressEqualTo(String value) {
            addCriterion("ip_address =", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotEqualTo(String value) {
            addCriterion("ip_address <>", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressGreaterThan(String value) {
            addCriterion("ip_address >", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ip_address >=", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressLessThan(String value) {
            addCriterion("ip_address <", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressLessThanOrEqualTo(String value) {
            addCriterion("ip_address <=", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressLike(String value) {
            addCriterion("ip_address like", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotLike(String value) {
            addCriterion("ip_address not like", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressIn(List<String> values) {
            addCriterion("ip_address in", values, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotIn(List<String> values) {
            addCriterion("ip_address not in", values, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressBetween(String value1, String value2) {
            addCriterion("ip_address between", value1, value2, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotBetween(String value1, String value2) {
            addCriterion("ip_address not between", value1, value2, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIsbkpIsNull() {
            addCriterion("isbkp is null");
            return (Criteria) this;
        }

        public Criteria andIsbkpIsNotNull() {
            addCriterion("isbkp is not null");
            return (Criteria) this;
        }

        public Criteria andIsbkpEqualTo(String value) {
            addCriterion("isbkp =", value, "isbkp");
            return (Criteria) this;
        }

        public Criteria andIsbkpNotEqualTo(String value) {
            addCriterion("isbkp <>", value, "isbkp");
            return (Criteria) this;
        }

        public Criteria andIsbkpGreaterThan(String value) {
            addCriterion("isbkp >", value, "isbkp");
            return (Criteria) this;
        }

        public Criteria andIsbkpGreaterThanOrEqualTo(String value) {
            addCriterion("isbkp >=", value, "isbkp");
            return (Criteria) this;
        }

        public Criteria andIsbkpLessThan(String value) {
            addCriterion("isbkp <", value, "isbkp");
            return (Criteria) this;
        }

        public Criteria andIsbkpLessThanOrEqualTo(String value) {
            addCriterion("isbkp <=", value, "isbkp");
            return (Criteria) this;
        }

        public Criteria andIsbkpLike(String value) {
            addCriterion("isbkp like", value, "isbkp");
            return (Criteria) this;
        }

        public Criteria andIsbkpNotLike(String value) {
            addCriterion("isbkp not like", value, "isbkp");
            return (Criteria) this;
        }

        public Criteria andIsbkpIn(List<String> values) {
            addCriterion("isbkp in", values, "isbkp");
            return (Criteria) this;
        }

        public Criteria andIsbkpNotIn(List<String> values) {
            addCriterion("isbkp not in", values, "isbkp");
            return (Criteria) this;
        }

        public Criteria andIsbkpBetween(String value1, String value2) {
            addCriterion("isbkp between", value1, value2, "isbkp");
            return (Criteria) this;
        }

        public Criteria andIsbkpNotBetween(String value1, String value2) {
            addCriterion("isbkp not between", value1, value2, "isbkp");
            return (Criteria) this;
        }

        public Criteria andBkpBoardTypeIsNull() {
            addCriterion("bkp_board_type is null");
            return (Criteria) this;
        }

        public Criteria andBkpBoardTypeIsNotNull() {
            addCriterion("bkp_board_type is not null");
            return (Criteria) this;
        }

        public Criteria andBkpBoardTypeEqualTo(String value) {
            addCriterion("bkp_board_type =", value, "bkpBoardType");
            return (Criteria) this;
        }

        public Criteria andBkpBoardTypeNotEqualTo(String value) {
            addCriterion("bkp_board_type <>", value, "bkpBoardType");
            return (Criteria) this;
        }

        public Criteria andBkpBoardTypeGreaterThan(String value) {
            addCriterion("bkp_board_type >", value, "bkpBoardType");
            return (Criteria) this;
        }

        public Criteria andBkpBoardTypeGreaterThanOrEqualTo(String value) {
            addCriterion("bkp_board_type >=", value, "bkpBoardType");
            return (Criteria) this;
        }

        public Criteria andBkpBoardTypeLessThan(String value) {
            addCriterion("bkp_board_type <", value, "bkpBoardType");
            return (Criteria) this;
        }

        public Criteria andBkpBoardTypeLessThanOrEqualTo(String value) {
            addCriterion("bkp_board_type <=", value, "bkpBoardType");
            return (Criteria) this;
        }

        public Criteria andBkpBoardTypeLike(String value) {
            addCriterion("bkp_board_type like", value, "bkpBoardType");
            return (Criteria) this;
        }

        public Criteria andBkpBoardTypeNotLike(String value) {
            addCriterion("bkp_board_type not like", value, "bkpBoardType");
            return (Criteria) this;
        }

        public Criteria andBkpBoardTypeIn(List<String> values) {
            addCriterion("bkp_board_type in", values, "bkpBoardType");
            return (Criteria) this;
        }

        public Criteria andBkpBoardTypeNotIn(List<String> values) {
            addCriterion("bkp_board_type not in", values, "bkpBoardType");
            return (Criteria) this;
        }

        public Criteria andBkpBoardTypeBetween(String value1, String value2) {
            addCriterion("bkp_board_type between", value1, value2, "bkpBoardType");
            return (Criteria) this;
        }

        public Criteria andBkpBoardTypeNotBetween(String value1, String value2) {
            addCriterion("bkp_board_type not between", value1, value2, "bkpBoardType");
            return (Criteria) this;
        }

        public Criteria andBkpPcbVersionIsNull() {
            addCriterion("bkp_pcb_version is null");
            return (Criteria) this;
        }

        public Criteria andBkpPcbVersionIsNotNull() {
            addCriterion("bkp_pcb_version is not null");
            return (Criteria) this;
        }

        public Criteria andBkpPcbVersionEqualTo(String value) {
            addCriterion("bkp_pcb_version =", value, "bkpPcbVersion");
            return (Criteria) this;
        }

        public Criteria andBkpPcbVersionNotEqualTo(String value) {
            addCriterion("bkp_pcb_version <>", value, "bkpPcbVersion");
            return (Criteria) this;
        }

        public Criteria andBkpPcbVersionGreaterThan(String value) {
            addCriterion("bkp_pcb_version >", value, "bkpPcbVersion");
            return (Criteria) this;
        }

        public Criteria andBkpPcbVersionGreaterThanOrEqualTo(String value) {
            addCriterion("bkp_pcb_version >=", value, "bkpPcbVersion");
            return (Criteria) this;
        }

        public Criteria andBkpPcbVersionLessThan(String value) {
            addCriterion("bkp_pcb_version <", value, "bkpPcbVersion");
            return (Criteria) this;
        }

        public Criteria andBkpPcbVersionLessThanOrEqualTo(String value) {
            addCriterion("bkp_pcb_version <=", value, "bkpPcbVersion");
            return (Criteria) this;
        }

        public Criteria andBkpPcbVersionLike(String value) {
            addCriterion("bkp_pcb_version like", value, "bkpPcbVersion");
            return (Criteria) this;
        }

        public Criteria andBkpPcbVersionNotLike(String value) {
            addCriterion("bkp_pcb_version not like", value, "bkpPcbVersion");
            return (Criteria) this;
        }

        public Criteria andBkpPcbVersionIn(List<String> values) {
            addCriterion("bkp_pcb_version in", values, "bkpPcbVersion");
            return (Criteria) this;
        }

        public Criteria andBkpPcbVersionNotIn(List<String> values) {
            addCriterion("bkp_pcb_version not in", values, "bkpPcbVersion");
            return (Criteria) this;
        }

        public Criteria andBkpPcbVersionBetween(String value1, String value2) {
            addCriterion("bkp_pcb_version between", value1, value2, "bkpPcbVersion");
            return (Criteria) this;
        }

        public Criteria andBkpPcbVersionNotBetween(String value1, String value2) {
            addCriterion("bkp_pcb_version not between", value1, value2, "bkpPcbVersion");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andLicenseStateIsNull() {
            addCriterion("license_state is null");
            return (Criteria) this;
        }

        public Criteria andLicenseStateIsNotNull() {
            addCriterion("license_state is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseStateEqualTo(String value) {
            addCriterion("license_state =", value, "licenseState");
            return (Criteria) this;
        }

        public Criteria andLicenseStateNotEqualTo(String value) {
            addCriterion("license_state <>", value, "licenseState");
            return (Criteria) this;
        }

        public Criteria andLicenseStateGreaterThan(String value) {
            addCriterion("license_state >", value, "licenseState");
            return (Criteria) this;
        }

        public Criteria andLicenseStateGreaterThanOrEqualTo(String value) {
            addCriterion("license_state >=", value, "licenseState");
            return (Criteria) this;
        }

        public Criteria andLicenseStateLessThan(String value) {
            addCriterion("license_state <", value, "licenseState");
            return (Criteria) this;
        }

        public Criteria andLicenseStateLessThanOrEqualTo(String value) {
            addCriterion("license_state <=", value, "licenseState");
            return (Criteria) this;
        }

        public Criteria andLicenseStateLike(String value) {
            addCriterion("license_state like", value, "licenseState");
            return (Criteria) this;
        }

        public Criteria andLicenseStateNotLike(String value) {
            addCriterion("license_state not like", value, "licenseState");
            return (Criteria) this;
        }

        public Criteria andLicenseStateIn(List<String> values) {
            addCriterion("license_state in", values, "licenseState");
            return (Criteria) this;
        }

        public Criteria andLicenseStateNotIn(List<String> values) {
            addCriterion("license_state not in", values, "licenseState");
            return (Criteria) this;
        }

        public Criteria andLicenseStateBetween(String value1, String value2) {
            addCriterion("license_state between", value1, value2, "licenseState");
            return (Criteria) this;
        }

        public Criteria andLicenseStateNotBetween(String value1, String value2) {
            addCriterion("license_state not between", value1, value2, "licenseState");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductVersionIsNull() {
            addCriterion("product_version is null");
            return (Criteria) this;
        }

        public Criteria andProductVersionIsNotNull() {
            addCriterion("product_version is not null");
            return (Criteria) this;
        }

        public Criteria andProductVersionEqualTo(String value) {
            addCriterion("product_version =", value, "productVersion");
            return (Criteria) this;
        }

        public Criteria andProductVersionNotEqualTo(String value) {
            addCriterion("product_version <>", value, "productVersion");
            return (Criteria) this;
        }

        public Criteria andProductVersionGreaterThan(String value) {
            addCriterion("product_version >", value, "productVersion");
            return (Criteria) this;
        }

        public Criteria andProductVersionGreaterThanOrEqualTo(String value) {
            addCriterion("product_version >=", value, "productVersion");
            return (Criteria) this;
        }

        public Criteria andProductVersionLessThan(String value) {
            addCriterion("product_version <", value, "productVersion");
            return (Criteria) this;
        }

        public Criteria andProductVersionLessThanOrEqualTo(String value) {
            addCriterion("product_version <=", value, "productVersion");
            return (Criteria) this;
        }

        public Criteria andProductVersionLike(String value) {
            addCriterion("product_version like", value, "productVersion");
            return (Criteria) this;
        }

        public Criteria andProductVersionNotLike(String value) {
            addCriterion("product_version not like", value, "productVersion");
            return (Criteria) this;
        }

        public Criteria andProductVersionIn(List<String> values) {
            addCriterion("product_version in", values, "productVersion");
            return (Criteria) this;
        }

        public Criteria andProductVersionNotIn(List<String> values) {
            addCriterion("product_version not in", values, "productVersion");
            return (Criteria) this;
        }

        public Criteria andProductVersionBetween(String value1, String value2) {
            addCriterion("product_version between", value1, value2, "productVersion");
            return (Criteria) this;
        }

        public Criteria andProductVersionNotBetween(String value1, String value2) {
            addCriterion("product_version not between", value1, value2, "productVersion");
            return (Criteria) this;
        }

        public Criteria andProductSerialNoIsNull() {
            addCriterion("product_serial_no is null");
            return (Criteria) this;
        }

        public Criteria andProductSerialNoIsNotNull() {
            addCriterion("product_serial_no is not null");
            return (Criteria) this;
        }

        public Criteria andProductSerialNoEqualTo(String value) {
            addCriterion("product_serial_no =", value, "productSerialNo");
            return (Criteria) this;
        }

        public Criteria andProductSerialNoNotEqualTo(String value) {
            addCriterion("product_serial_no <>", value, "productSerialNo");
            return (Criteria) this;
        }

        public Criteria andProductSerialNoGreaterThan(String value) {
            addCriterion("product_serial_no >", value, "productSerialNo");
            return (Criteria) this;
        }

        public Criteria andProductSerialNoGreaterThanOrEqualTo(String value) {
            addCriterion("product_serial_no >=", value, "productSerialNo");
            return (Criteria) this;
        }

        public Criteria andProductSerialNoLessThan(String value) {
            addCriterion("product_serial_no <", value, "productSerialNo");
            return (Criteria) this;
        }

        public Criteria andProductSerialNoLessThanOrEqualTo(String value) {
            addCriterion("product_serial_no <=", value, "productSerialNo");
            return (Criteria) this;
        }

        public Criteria andProductSerialNoLike(String value) {
            addCriterion("product_serial_no like", value, "productSerialNo");
            return (Criteria) this;
        }

        public Criteria andProductSerialNoNotLike(String value) {
            addCriterion("product_serial_no not like", value, "productSerialNo");
            return (Criteria) this;
        }

        public Criteria andProductSerialNoIn(List<String> values) {
            addCriterion("product_serial_no in", values, "productSerialNo");
            return (Criteria) this;
        }

        public Criteria andProductSerialNoNotIn(List<String> values) {
            addCriterion("product_serial_no not in", values, "productSerialNo");
            return (Criteria) this;
        }

        public Criteria andProductSerialNoBetween(String value1, String value2) {
            addCriterion("product_serial_no between", value1, value2, "productSerialNo");
            return (Criteria) this;
        }

        public Criteria andProductSerialNoNotBetween(String value1, String value2) {
            addCriterion("product_serial_no not between", value1, value2, "productSerialNo");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeIsNull() {
            addCriterion("expired_time is null");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeIsNotNull() {
            addCriterion("expired_time is not null");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeEqualTo(Date value) {
            addCriterion("expired_time =", value, "expiredTime");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeNotEqualTo(Date value) {
            addCriterion("expired_time <>", value, "expiredTime");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeGreaterThan(Date value) {
            addCriterion("expired_time >", value, "expiredTime");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("expired_time >=", value, "expiredTime");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeLessThan(Date value) {
            addCriterion("expired_time <", value, "expiredTime");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeLessThanOrEqualTo(Date value) {
            addCriterion("expired_time <=", value, "expiredTime");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeIn(List<Date> values) {
            addCriterion("expired_time in", values, "expiredTime");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeNotIn(List<Date> values) {
            addCriterion("expired_time not in", values, "expiredTime");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeBetween(Date value1, Date value2) {
            addCriterion("expired_time between", value1, value2, "expiredTime");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeNotBetween(Date value1, Date value2) {
            addCriterion("expired_time not between", value1, value2, "expiredTime");
            return (Criteria) this;
        }

        public Criteria andBoxNoIsNull() {
            addCriterion("box_no is null");
            return (Criteria) this;
        }

        public Criteria andBoxNoIsNotNull() {
            addCriterion("box_no is not null");
            return (Criteria) this;
        }

        public Criteria andBoxNoEqualTo(String value) {
            addCriterion("box_no =", value, "boxNo");
            return (Criteria) this;
        }

        public Criteria andBoxNoNotEqualTo(String value) {
            addCriterion("box_no <>", value, "boxNo");
            return (Criteria) this;
        }

        public Criteria andBoxNoGreaterThan(String value) {
            addCriterion("box_no >", value, "boxNo");
            return (Criteria) this;
        }

        public Criteria andBoxNoGreaterThanOrEqualTo(String value) {
            addCriterion("box_no >=", value, "boxNo");
            return (Criteria) this;
        }

        public Criteria andBoxNoLessThan(String value) {
            addCriterion("box_no <", value, "boxNo");
            return (Criteria) this;
        }

        public Criteria andBoxNoLessThanOrEqualTo(String value) {
            addCriterion("box_no <=", value, "boxNo");
            return (Criteria) this;
        }

        public Criteria andBoxNoLike(String value) {
            addCriterion("box_no like", value, "boxNo");
            return (Criteria) this;
        }

        public Criteria andBoxNoNotLike(String value) {
            addCriterion("box_no not like", value, "boxNo");
            return (Criteria) this;
        }

        public Criteria andBoxNoIn(List<String> values) {
            addCriterion("box_no in", values, "boxNo");
            return (Criteria) this;
        }

        public Criteria andBoxNoNotIn(List<String> values) {
            addCriterion("box_no not in", values, "boxNo");
            return (Criteria) this;
        }

        public Criteria andBoxNoBetween(String value1, String value2) {
            addCriterion("box_no between", value1, value2, "boxNo");
            return (Criteria) this;
        }

        public Criteria andBoxNoNotBetween(String value1, String value2) {
            addCriterion("box_no not between", value1, value2, "boxNo");
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