package com.microservice.rabbitmq.devices.entity;

import java.util.ArrayList;
import java.util.List;

public class DevSubboardInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DevSubboardInfoExample() {
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

        public Criteria andPicnameIsNull() {
            addCriterion("picName is null");
            return (Criteria) this;
        }

        public Criteria andPicnameIsNotNull() {
            addCriterion("picName is not null");
            return (Criteria) this;
        }

        public Criteria andPicnameEqualTo(String value) {
            addCriterion("picName =", value, "picname");
            return (Criteria) this;
        }

        public Criteria andPicnameNotEqualTo(String value) {
            addCriterion("picName <>", value, "picname");
            return (Criteria) this;
        }

        public Criteria andPicnameGreaterThan(String value) {
            addCriterion("picName >", value, "picname");
            return (Criteria) this;
        }

        public Criteria andPicnameGreaterThanOrEqualTo(String value) {
            addCriterion("picName >=", value, "picname");
            return (Criteria) this;
        }

        public Criteria andPicnameLessThan(String value) {
            addCriterion("picName <", value, "picname");
            return (Criteria) this;
        }

        public Criteria andPicnameLessThanOrEqualTo(String value) {
            addCriterion("picName <=", value, "picname");
            return (Criteria) this;
        }

        public Criteria andPicnameLike(String value) {
            addCriterion("picName like", value, "picname");
            return (Criteria) this;
        }

        public Criteria andPicnameNotLike(String value) {
            addCriterion("picName not like", value, "picname");
            return (Criteria) this;
        }

        public Criteria andPicnameIn(List<String> values) {
            addCriterion("picName in", values, "picname");
            return (Criteria) this;
        }

        public Criteria andPicnameNotIn(List<String> values) {
            addCriterion("picName not in", values, "picname");
            return (Criteria) this;
        }

        public Criteria andPicnameBetween(String value1, String value2) {
            addCriterion("picName between", value1, value2, "picname");
            return (Criteria) this;
        }

        public Criteria andPicnameNotBetween(String value1, String value2) {
            addCriterion("picName not between", value1, value2, "picname");
            return (Criteria) this;
        }

        public Criteria andPicSlotIsNull() {
            addCriterion("pic_slot is null");
            return (Criteria) this;
        }

        public Criteria andPicSlotIsNotNull() {
            addCriterion("pic_slot is not null");
            return (Criteria) this;
        }

        public Criteria andPicSlotEqualTo(String value) {
            addCriterion("pic_slot =", value, "picSlot");
            return (Criteria) this;
        }

        public Criteria andPicSlotNotEqualTo(String value) {
            addCriterion("pic_slot <>", value, "picSlot");
            return (Criteria) this;
        }

        public Criteria andPicSlotGreaterThan(String value) {
            addCriterion("pic_slot >", value, "picSlot");
            return (Criteria) this;
        }

        public Criteria andPicSlotGreaterThanOrEqualTo(String value) {
            addCriterion("pic_slot >=", value, "picSlot");
            return (Criteria) this;
        }

        public Criteria andPicSlotLessThan(String value) {
            addCriterion("pic_slot <", value, "picSlot");
            return (Criteria) this;
        }

        public Criteria andPicSlotLessThanOrEqualTo(String value) {
            addCriterion("pic_slot <=", value, "picSlot");
            return (Criteria) this;
        }

        public Criteria andPicSlotLike(String value) {
            addCriterion("pic_slot like", value, "picSlot");
            return (Criteria) this;
        }

        public Criteria andPicSlotNotLike(String value) {
            addCriterion("pic_slot not like", value, "picSlot");
            return (Criteria) this;
        }

        public Criteria andPicSlotIn(List<String> values) {
            addCriterion("pic_slot in", values, "picSlot");
            return (Criteria) this;
        }

        public Criteria andPicSlotNotIn(List<String> values) {
            addCriterion("pic_slot not in", values, "picSlot");
            return (Criteria) this;
        }

        public Criteria andPicSlotBetween(String value1, String value2) {
            addCriterion("pic_slot between", value1, value2, "picSlot");
            return (Criteria) this;
        }

        public Criteria andPicSlotNotBetween(String value1, String value2) {
            addCriterion("pic_slot not between", value1, value2, "picSlot");
            return (Criteria) this;
        }

        public Criteria andPicVersionIsNull() {
            addCriterion("pic_version is null");
            return (Criteria) this;
        }

        public Criteria andPicVersionIsNotNull() {
            addCriterion("pic_version is not null");
            return (Criteria) this;
        }

        public Criteria andPicVersionEqualTo(String value) {
            addCriterion("pic_version =", value, "picVersion");
            return (Criteria) this;
        }

        public Criteria andPicVersionNotEqualTo(String value) {
            addCriterion("pic_version <>", value, "picVersion");
            return (Criteria) this;
        }

        public Criteria andPicVersionGreaterThan(String value) {
            addCriterion("pic_version >", value, "picVersion");
            return (Criteria) this;
        }

        public Criteria andPicVersionGreaterThanOrEqualTo(String value) {
            addCriterion("pic_version >=", value, "picVersion");
            return (Criteria) this;
        }

        public Criteria andPicVersionLessThan(String value) {
            addCriterion("pic_version <", value, "picVersion");
            return (Criteria) this;
        }

        public Criteria andPicVersionLessThanOrEqualTo(String value) {
            addCriterion("pic_version <=", value, "picVersion");
            return (Criteria) this;
        }

        public Criteria andPicVersionLike(String value) {
            addCriterion("pic_version like", value, "picVersion");
            return (Criteria) this;
        }

        public Criteria andPicVersionNotLike(String value) {
            addCriterion("pic_version not like", value, "picVersion");
            return (Criteria) this;
        }

        public Criteria andPicVersionIn(List<String> values) {
            addCriterion("pic_version in", values, "picVersion");
            return (Criteria) this;
        }

        public Criteria andPicVersionNotIn(List<String> values) {
            addCriterion("pic_version not in", values, "picVersion");
            return (Criteria) this;
        }

        public Criteria andPicVersionBetween(String value1, String value2) {
            addCriterion("pic_version between", value1, value2, "picVersion");
            return (Criteria) this;
        }

        public Criteria andPicVersionNotBetween(String value1, String value2) {
            addCriterion("pic_version not between", value1, value2, "picVersion");
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