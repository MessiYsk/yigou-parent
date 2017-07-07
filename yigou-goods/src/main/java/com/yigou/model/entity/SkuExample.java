package com.yigou.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SkuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SkuExample() {
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

        public Criteria andSpIdIsNull() {
            addCriterion("sp_id is null");
            return (Criteria) this;
        }

        public Criteria andSpIdIsNotNull() {
            addCriterion("sp_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpIdEqualTo(String value) {
            addCriterion("sp_id =", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdNotEqualTo(String value) {
            addCriterion("sp_id <>", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdGreaterThan(String value) {
            addCriterion("sp_id >", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdGreaterThanOrEqualTo(String value) {
            addCriterion("sp_id >=", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdLessThan(String value) {
            addCriterion("sp_id <", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdLessThanOrEqualTo(String value) {
            addCriterion("sp_id <=", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdLike(String value) {
            addCriterion("sp_id like", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdNotLike(String value) {
            addCriterion("sp_id not like", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdIn(List<String> values) {
            addCriterion("sp_id in", values, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdNotIn(List<String> values) {
            addCriterion("sp_id not in", values, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdBetween(String value1, String value2) {
            addCriterion("sp_id between", value1, value2, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdNotBetween(String value1, String value2) {
            addCriterion("sp_id not between", value1, value2, "spId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andFullnameIsNull() {
            addCriterion("fullname is null");
            return (Criteria) this;
        }

        public Criteria andFullnameIsNotNull() {
            addCriterion("fullname is not null");
            return (Criteria) this;
        }

        public Criteria andFullnameEqualTo(String value) {
            addCriterion("fullname =", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotEqualTo(String value) {
            addCriterion("fullname <>", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameGreaterThan(String value) {
            addCriterion("fullname >", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameGreaterThanOrEqualTo(String value) {
            addCriterion("fullname >=", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameLessThan(String value) {
            addCriterion("fullname <", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameLessThanOrEqualTo(String value) {
            addCriterion("fullname <=", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameLike(String value) {
            addCriterion("fullname like", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotLike(String value) {
            addCriterion("fullname not like", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameIn(List<String> values) {
            addCriterion("fullname in", values, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotIn(List<String> values) {
            addCriterion("fullname not in", values, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameBetween(String value1, String value2) {
            addCriterion("fullname between", value1, value2, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotBetween(String value1, String value2) {
            addCriterion("fullname not between", value1, value2, "fullname");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCtIdIsNull() {
            addCriterion("ct_id is null");
            return (Criteria) this;
        }

        public Criteria andCtIdIsNotNull() {
            addCriterion("ct_id is not null");
            return (Criteria) this;
        }

        public Criteria andCtIdEqualTo(String value) {
            addCriterion("ct_id =", value, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdNotEqualTo(String value) {
            addCriterion("ct_id <>", value, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdGreaterThan(String value) {
            addCriterion("ct_id >", value, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdGreaterThanOrEqualTo(String value) {
            addCriterion("ct_id >=", value, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdLessThan(String value) {
            addCriterion("ct_id <", value, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdLessThanOrEqualTo(String value) {
            addCriterion("ct_id <=", value, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdLike(String value) {
            addCriterion("ct_id like", value, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdNotLike(String value) {
            addCriterion("ct_id not like", value, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdIn(List<String> values) {
            addCriterion("ct_id in", values, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdNotIn(List<String> values) {
            addCriterion("ct_id not in", values, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdBetween(String value1, String value2) {
            addCriterion("ct_id between", value1, value2, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdNotBetween(String value1, String value2) {
            addCriterion("ct_id not between", value1, value2, "ctId");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andConfigIsNull() {
            addCriterion("config is null");
            return (Criteria) this;
        }

        public Criteria andConfigIsNotNull() {
            addCriterion("config is not null");
            return (Criteria) this;
        }

        public Criteria andConfigEqualTo(String value) {
            addCriterion("config =", value, "config");
            return (Criteria) this;
        }

        public Criteria andConfigNotEqualTo(String value) {
            addCriterion("config <>", value, "config");
            return (Criteria) this;
        }

        public Criteria andConfigGreaterThan(String value) {
            addCriterion("config >", value, "config");
            return (Criteria) this;
        }

        public Criteria andConfigGreaterThanOrEqualTo(String value) {
            addCriterion("config >=", value, "config");
            return (Criteria) this;
        }

        public Criteria andConfigLessThan(String value) {
            addCriterion("config <", value, "config");
            return (Criteria) this;
        }

        public Criteria andConfigLessThanOrEqualTo(String value) {
            addCriterion("config <=", value, "config");
            return (Criteria) this;
        }

        public Criteria andConfigLike(String value) {
            addCriterion("config like", value, "config");
            return (Criteria) this;
        }

        public Criteria andConfigNotLike(String value) {
            addCriterion("config not like", value, "config");
            return (Criteria) this;
        }

        public Criteria andConfigIn(List<String> values) {
            addCriterion("config in", values, "config");
            return (Criteria) this;
        }

        public Criteria andConfigNotIn(List<String> values) {
            addCriterion("config not in", values, "config");
            return (Criteria) this;
        }

        public Criteria andConfigBetween(String value1, String value2) {
            addCriterion("config between", value1, value2, "config");
            return (Criteria) this;
        }

        public Criteria andConfigNotBetween(String value1, String value2) {
            addCriterion("config not between", value1, value2, "config");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andColorIsNull() {
            addCriterion("color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("color like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("color not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("color not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andIschIsNull() {
            addCriterion("isch is null");
            return (Criteria) this;
        }

        public Criteria andIschIsNotNull() {
            addCriterion("isch is not null");
            return (Criteria) this;
        }

        public Criteria andIschEqualTo(String value) {
            addCriterion("isch =", value, "isch");
            return (Criteria) this;
        }

        public Criteria andIschNotEqualTo(String value) {
            addCriterion("isch <>", value, "isch");
            return (Criteria) this;
        }

        public Criteria andIschGreaterThan(String value) {
            addCriterion("isch >", value, "isch");
            return (Criteria) this;
        }

        public Criteria andIschGreaterThanOrEqualTo(String value) {
            addCriterion("isch >=", value, "isch");
            return (Criteria) this;
        }

        public Criteria andIschLessThan(String value) {
            addCriterion("isch <", value, "isch");
            return (Criteria) this;
        }

        public Criteria andIschLessThanOrEqualTo(String value) {
            addCriterion("isch <=", value, "isch");
            return (Criteria) this;
        }

        public Criteria andIschLike(String value) {
            addCriterion("isch like", value, "isch");
            return (Criteria) this;
        }

        public Criteria andIschNotLike(String value) {
            addCriterion("isch not like", value, "isch");
            return (Criteria) this;
        }

        public Criteria andIschIn(List<String> values) {
            addCriterion("isch in", values, "isch");
            return (Criteria) this;
        }

        public Criteria andIschNotIn(List<String> values) {
            addCriterion("isch not in", values, "isch");
            return (Criteria) this;
        }

        public Criteria andIschBetween(String value1, String value2) {
            addCriterion("isch between", value1, value2, "isch");
            return (Criteria) this;
        }

        public Criteria andIschNotBetween(String value1, String value2) {
            addCriterion("isch not between", value1, value2, "isch");
            return (Criteria) this;
        }

        public Criteria andChcdIsNull() {
            addCriterion("chcd is null");
            return (Criteria) this;
        }

        public Criteria andChcdIsNotNull() {
            addCriterion("chcd is not null");
            return (Criteria) this;
        }

        public Criteria andChcdEqualTo(Integer value) {
            addCriterion("chcd =", value, "chcd");
            return (Criteria) this;
        }

        public Criteria andChcdNotEqualTo(Integer value) {
            addCriterion("chcd <>", value, "chcd");
            return (Criteria) this;
        }

        public Criteria andChcdGreaterThan(Integer value) {
            addCriterion("chcd >", value, "chcd");
            return (Criteria) this;
        }

        public Criteria andChcdGreaterThanOrEqualTo(Integer value) {
            addCriterion("chcd >=", value, "chcd");
            return (Criteria) this;
        }

        public Criteria andChcdLessThan(Integer value) {
            addCriterion("chcd <", value, "chcd");
            return (Criteria) this;
        }

        public Criteria andChcdLessThanOrEqualTo(Integer value) {
            addCriterion("chcd <=", value, "chcd");
            return (Criteria) this;
        }

        public Criteria andChcdIn(List<Integer> values) {
            addCriterion("chcd in", values, "chcd");
            return (Criteria) this;
        }

        public Criteria andChcdNotIn(List<Integer> values) {
            addCriterion("chcd not in", values, "chcd");
            return (Criteria) this;
        }

        public Criteria andChcdBetween(Integer value1, Integer value2) {
            addCriterion("chcd between", value1, value2, "chcd");
            return (Criteria) this;
        }

        public Criteria andChcdNotBetween(Integer value1, Integer value2) {
            addCriterion("chcd not between", value1, value2, "chcd");
            return (Criteria) this;
        }

        public Criteria andKcMaxIsNull() {
            addCriterion("kc_max is null");
            return (Criteria) this;
        }

        public Criteria andKcMaxIsNotNull() {
            addCriterion("kc_max is not null");
            return (Criteria) this;
        }

        public Criteria andKcMaxEqualTo(Integer value) {
            addCriterion("kc_max =", value, "kcMax");
            return (Criteria) this;
        }

        public Criteria andKcMaxNotEqualTo(Integer value) {
            addCriterion("kc_max <>", value, "kcMax");
            return (Criteria) this;
        }

        public Criteria andKcMaxGreaterThan(Integer value) {
            addCriterion("kc_max >", value, "kcMax");
            return (Criteria) this;
        }

        public Criteria andKcMaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("kc_max >=", value, "kcMax");
            return (Criteria) this;
        }

        public Criteria andKcMaxLessThan(Integer value) {
            addCriterion("kc_max <", value, "kcMax");
            return (Criteria) this;
        }

        public Criteria andKcMaxLessThanOrEqualTo(Integer value) {
            addCriterion("kc_max <=", value, "kcMax");
            return (Criteria) this;
        }

        public Criteria andKcMaxIn(List<Integer> values) {
            addCriterion("kc_max in", values, "kcMax");
            return (Criteria) this;
        }

        public Criteria andKcMaxNotIn(List<Integer> values) {
            addCriterion("kc_max not in", values, "kcMax");
            return (Criteria) this;
        }

        public Criteria andKcMaxBetween(Integer value1, Integer value2) {
            addCriterion("kc_max between", value1, value2, "kcMax");
            return (Criteria) this;
        }

        public Criteria andKcMaxNotBetween(Integer value1, Integer value2) {
            addCriterion("kc_max not between", value1, value2, "kcMax");
            return (Criteria) this;
        }

        public Criteria andKcMinIsNull() {
            addCriterion("kc_min is null");
            return (Criteria) this;
        }

        public Criteria andKcMinIsNotNull() {
            addCriterion("kc_min is not null");
            return (Criteria) this;
        }

        public Criteria andKcMinEqualTo(Integer value) {
            addCriterion("kc_min =", value, "kcMin");
            return (Criteria) this;
        }

        public Criteria andKcMinNotEqualTo(Integer value) {
            addCriterion("kc_min <>", value, "kcMin");
            return (Criteria) this;
        }

        public Criteria andKcMinGreaterThan(Integer value) {
            addCriterion("kc_min >", value, "kcMin");
            return (Criteria) this;
        }

        public Criteria andKcMinGreaterThanOrEqualTo(Integer value) {
            addCriterion("kc_min >=", value, "kcMin");
            return (Criteria) this;
        }

        public Criteria andKcMinLessThan(Integer value) {
            addCriterion("kc_min <", value, "kcMin");
            return (Criteria) this;
        }

        public Criteria andKcMinLessThanOrEqualTo(Integer value) {
            addCriterion("kc_min <=", value, "kcMin");
            return (Criteria) this;
        }

        public Criteria andKcMinIn(List<Integer> values) {
            addCriterion("kc_min in", values, "kcMin");
            return (Criteria) this;
        }

        public Criteria andKcMinNotIn(List<Integer> values) {
            addCriterion("kc_min not in", values, "kcMin");
            return (Criteria) this;
        }

        public Criteria andKcMinBetween(Integer value1, Integer value2) {
            addCriterion("kc_min between", value1, value2, "kcMin");
            return (Criteria) this;
        }

        public Criteria andKcMinNotBetween(Integer value1, Integer value2) {
            addCriterion("kc_min not between", value1, value2, "kcMin");
            return (Criteria) this;
        }

        public Criteria andImageUrlIsNull() {
            addCriterion("image_url is null");
            return (Criteria) this;
        }

        public Criteria andImageUrlIsNotNull() {
            addCriterion("image_url is not null");
            return (Criteria) this;
        }

        public Criteria andImageUrlEqualTo(String value) {
            addCriterion("image_url =", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotEqualTo(String value) {
            addCriterion("image_url <>", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlGreaterThan(String value) {
            addCriterion("image_url >", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("image_url >=", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLessThan(String value) {
            addCriterion("image_url <", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLessThanOrEqualTo(String value) {
            addCriterion("image_url <=", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLike(String value) {
            addCriterion("image_url like", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotLike(String value) {
            addCriterion("image_url not like", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlIn(List<String> values) {
            addCriterion("image_url in", values, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotIn(List<String> values) {
            addCriterion("image_url not in", values, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlBetween(String value1, String value2) {
            addCriterion("image_url between", value1, value2, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotBetween(String value1, String value2) {
            addCriterion("image_url not between", value1, value2, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andXnspProfitIsNull() {
            addCriterion("xnsp_profit is null");
            return (Criteria) this;
        }

        public Criteria andXnspProfitIsNotNull() {
            addCriterion("xnsp_profit is not null");
            return (Criteria) this;
        }

        public Criteria andXnspProfitEqualTo(Float value) {
            addCriterion("xnsp_profit =", value, "xnspProfit");
            return (Criteria) this;
        }

        public Criteria andXnspProfitNotEqualTo(Float value) {
            addCriterion("xnsp_profit <>", value, "xnspProfit");
            return (Criteria) this;
        }

        public Criteria andXnspProfitGreaterThan(Float value) {
            addCriterion("xnsp_profit >", value, "xnspProfit");
            return (Criteria) this;
        }

        public Criteria andXnspProfitGreaterThanOrEqualTo(Float value) {
            addCriterion("xnsp_profit >=", value, "xnspProfit");
            return (Criteria) this;
        }

        public Criteria andXnspProfitLessThan(Float value) {
            addCriterion("xnsp_profit <", value, "xnspProfit");
            return (Criteria) this;
        }

        public Criteria andXnspProfitLessThanOrEqualTo(Float value) {
            addCriterion("xnsp_profit <=", value, "xnspProfit");
            return (Criteria) this;
        }

        public Criteria andXnspProfitIn(List<Float> values) {
            addCriterion("xnsp_profit in", values, "xnspProfit");
            return (Criteria) this;
        }

        public Criteria andXnspProfitNotIn(List<Float> values) {
            addCriterion("xnsp_profit not in", values, "xnspProfit");
            return (Criteria) this;
        }

        public Criteria andXnspProfitBetween(Float value1, Float value2) {
            addCriterion("xnsp_profit between", value1, value2, "xnspProfit");
            return (Criteria) this;
        }

        public Criteria andXnspProfitNotBetween(Float value1, Float value2) {
            addCriterion("xnsp_profit not between", value1, value2, "xnspProfit");
            return (Criteria) this;
        }

        public Criteria andInventoryIsNull() {
            addCriterion("inventory is null");
            return (Criteria) this;
        }

        public Criteria andInventoryIsNotNull() {
            addCriterion("inventory is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryEqualTo(Integer value) {
            addCriterion("inventory =", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryNotEqualTo(Integer value) {
            addCriterion("inventory <>", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryGreaterThan(Integer value) {
            addCriterion("inventory >", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("inventory >=", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryLessThan(Integer value) {
            addCriterion("inventory <", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryLessThanOrEqualTo(Integer value) {
            addCriterion("inventory <=", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryIn(List<Integer> values) {
            addCriterion("inventory in", values, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryNotIn(List<Integer> values) {
            addCriterion("inventory not in", values, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryBetween(Integer value1, Integer value2) {
            addCriterion("inventory between", value1, value2, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryNotBetween(Integer value1, Integer value2) {
            addCriterion("inventory not between", value1, value2, "inventory");
            return (Criteria) this;
        }

        public Criteria andSpecDataIsNull() {
            addCriterion("spec_data is null");
            return (Criteria) this;
        }

        public Criteria andSpecDataIsNotNull() {
            addCriterion("spec_data is not null");
            return (Criteria) this;
        }

        public Criteria andSpecDataEqualTo(String value) {
            addCriterion("spec_data =", value, "specData");
            return (Criteria) this;
        }

        public Criteria andSpecDataNotEqualTo(String value) {
            addCriterion("spec_data <>", value, "specData");
            return (Criteria) this;
        }

        public Criteria andSpecDataGreaterThan(String value) {
            addCriterion("spec_data >", value, "specData");
            return (Criteria) this;
        }

        public Criteria andSpecDataGreaterThanOrEqualTo(String value) {
            addCriterion("spec_data >=", value, "specData");
            return (Criteria) this;
        }

        public Criteria andSpecDataLessThan(String value) {
            addCriterion("spec_data <", value, "specData");
            return (Criteria) this;
        }

        public Criteria andSpecDataLessThanOrEqualTo(String value) {
            addCriterion("spec_data <=", value, "specData");
            return (Criteria) this;
        }

        public Criteria andSpecDataLike(String value) {
            addCriterion("spec_data like", value, "specData");
            return (Criteria) this;
        }

        public Criteria andSpecDataNotLike(String value) {
            addCriterion("spec_data not like", value, "specData");
            return (Criteria) this;
        }

        public Criteria andSpecDataIn(List<String> values) {
            addCriterion("spec_data in", values, "specData");
            return (Criteria) this;
        }

        public Criteria andSpecDataNotIn(List<String> values) {
            addCriterion("spec_data not in", values, "specData");
            return (Criteria) this;
        }

        public Criteria andSpecDataBetween(String value1, String value2) {
            addCriterion("spec_data between", value1, value2, "specData");
            return (Criteria) this;
        }

        public Criteria andSpecDataNotBetween(String value1, String value2) {
            addCriterion("spec_data not between", value1, value2, "specData");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Float value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Float value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Float value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Float value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Float value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Float> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Float> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Float value1, Float value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Float value1, Float value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWunitIsNull() {
            addCriterion("wunit is null");
            return (Criteria) this;
        }

        public Criteria andWunitIsNotNull() {
            addCriterion("wunit is not null");
            return (Criteria) this;
        }

        public Criteria andWunitEqualTo(String value) {
            addCriterion("wunit =", value, "wunit");
            return (Criteria) this;
        }

        public Criteria andWunitNotEqualTo(String value) {
            addCriterion("wunit <>", value, "wunit");
            return (Criteria) this;
        }

        public Criteria andWunitGreaterThan(String value) {
            addCriterion("wunit >", value, "wunit");
            return (Criteria) this;
        }

        public Criteria andWunitGreaterThanOrEqualTo(String value) {
            addCriterion("wunit >=", value, "wunit");
            return (Criteria) this;
        }

        public Criteria andWunitLessThan(String value) {
            addCriterion("wunit <", value, "wunit");
            return (Criteria) this;
        }

        public Criteria andWunitLessThanOrEqualTo(String value) {
            addCriterion("wunit <=", value, "wunit");
            return (Criteria) this;
        }

        public Criteria andWunitLike(String value) {
            addCriterion("wunit like", value, "wunit");
            return (Criteria) this;
        }

        public Criteria andWunitNotLike(String value) {
            addCriterion("wunit not like", value, "wunit");
            return (Criteria) this;
        }

        public Criteria andWunitIn(List<String> values) {
            addCriterion("wunit in", values, "wunit");
            return (Criteria) this;
        }

        public Criteria andWunitNotIn(List<String> values) {
            addCriterion("wunit not in", values, "wunit");
            return (Criteria) this;
        }

        public Criteria andWunitBetween(String value1, String value2) {
            addCriterion("wunit between", value1, value2, "wunit");
            return (Criteria) this;
        }

        public Criteria andWunitNotBetween(String value1, String value2) {
            addCriterion("wunit not between", value1, value2, "wunit");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNull() {
            addCriterion("volume is null");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNotNull() {
            addCriterion("volume is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeEqualTo(Float value) {
            addCriterion("volume =", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotEqualTo(Float value) {
            addCriterion("volume <>", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThan(Float value) {
            addCriterion("volume >", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThanOrEqualTo(Float value) {
            addCriterion("volume >=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThan(Float value) {
            addCriterion("volume <", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThanOrEqualTo(Float value) {
            addCriterion("volume <=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeIn(List<Float> values) {
            addCriterion("volume in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotIn(List<Float> values) {
            addCriterion("volume not in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeBetween(Float value1, Float value2) {
            addCriterion("volume between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotBetween(Float value1, Float value2) {
            addCriterion("volume not between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andVunitIsNull() {
            addCriterion("vUnit is null");
            return (Criteria) this;
        }

        public Criteria andVunitIsNotNull() {
            addCriterion("vUnit is not null");
            return (Criteria) this;
        }

        public Criteria andVunitEqualTo(String value) {
            addCriterion("vUnit =", value, "vunit");
            return (Criteria) this;
        }

        public Criteria andVunitNotEqualTo(String value) {
            addCriterion("vUnit <>", value, "vunit");
            return (Criteria) this;
        }

        public Criteria andVunitGreaterThan(String value) {
            addCriterion("vUnit >", value, "vunit");
            return (Criteria) this;
        }

        public Criteria andVunitGreaterThanOrEqualTo(String value) {
            addCriterion("vUnit >=", value, "vunit");
            return (Criteria) this;
        }

        public Criteria andVunitLessThan(String value) {
            addCriterion("vUnit <", value, "vunit");
            return (Criteria) this;
        }

        public Criteria andVunitLessThanOrEqualTo(String value) {
            addCriterion("vUnit <=", value, "vunit");
            return (Criteria) this;
        }

        public Criteria andVunitLike(String value) {
            addCriterion("vUnit like", value, "vunit");
            return (Criteria) this;
        }

        public Criteria andVunitNotLike(String value) {
            addCriterion("vUnit not like", value, "vunit");
            return (Criteria) this;
        }

        public Criteria andVunitIn(List<String> values) {
            addCriterion("vUnit in", values, "vunit");
            return (Criteria) this;
        }

        public Criteria andVunitNotIn(List<String> values) {
            addCriterion("vUnit not in", values, "vunit");
            return (Criteria) this;
        }

        public Criteria andVunitBetween(String value1, String value2) {
            addCriterion("vUnit between", value1, value2, "vunit");
            return (Criteria) this;
        }

        public Criteria andVunitNotBetween(String value1, String value2) {
            addCriterion("vUnit not between", value1, value2, "vunit");
            return (Criteria) this;
        }

        public Criteria andLengthIsNull() {
            addCriterion("length is null");
            return (Criteria) this;
        }

        public Criteria andLengthIsNotNull() {
            addCriterion("length is not null");
            return (Criteria) this;
        }

        public Criteria andLengthEqualTo(Float value) {
            addCriterion("length =", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotEqualTo(Float value) {
            addCriterion("length <>", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThan(Float value) {
            addCriterion("length >", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThanOrEqualTo(Float value) {
            addCriterion("length >=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThan(Float value) {
            addCriterion("length <", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThanOrEqualTo(Float value) {
            addCriterion("length <=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthIn(List<Float> values) {
            addCriterion("length in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotIn(List<Float> values) {
            addCriterion("length not in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthBetween(Float value1, Float value2) {
            addCriterion("length between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotBetween(Float value1, Float value2) {
            addCriterion("length not between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andWidthIsNull() {
            addCriterion("width is null");
            return (Criteria) this;
        }

        public Criteria andWidthIsNotNull() {
            addCriterion("width is not null");
            return (Criteria) this;
        }

        public Criteria andWidthEqualTo(Float value) {
            addCriterion("width =", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotEqualTo(Float value) {
            addCriterion("width <>", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThan(Float value) {
            addCriterion("width >", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThanOrEqualTo(Float value) {
            addCriterion("width >=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThan(Float value) {
            addCriterion("width <", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThanOrEqualTo(Float value) {
            addCriterion("width <=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthIn(List<Float> values) {
            addCriterion("width in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotIn(List<Float> values) {
            addCriterion("width not in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthBetween(Float value1, Float value2) {
            addCriterion("width between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotBetween(Float value1, Float value2) {
            addCriterion("width not between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andLunitIsNull() {
            addCriterion("lUnit is null");
            return (Criteria) this;
        }

        public Criteria andLunitIsNotNull() {
            addCriterion("lUnit is not null");
            return (Criteria) this;
        }

        public Criteria andLunitEqualTo(String value) {
            addCriterion("lUnit =", value, "lunit");
            return (Criteria) this;
        }

        public Criteria andLunitNotEqualTo(String value) {
            addCriterion("lUnit <>", value, "lunit");
            return (Criteria) this;
        }

        public Criteria andLunitGreaterThan(String value) {
            addCriterion("lUnit >", value, "lunit");
            return (Criteria) this;
        }

        public Criteria andLunitGreaterThanOrEqualTo(String value) {
            addCriterion("lUnit >=", value, "lunit");
            return (Criteria) this;
        }

        public Criteria andLunitLessThan(String value) {
            addCriterion("lUnit <", value, "lunit");
            return (Criteria) this;
        }

        public Criteria andLunitLessThanOrEqualTo(String value) {
            addCriterion("lUnit <=", value, "lunit");
            return (Criteria) this;
        }

        public Criteria andLunitLike(String value) {
            addCriterion("lUnit like", value, "lunit");
            return (Criteria) this;
        }

        public Criteria andLunitNotLike(String value) {
            addCriterion("lUnit not like", value, "lunit");
            return (Criteria) this;
        }

        public Criteria andLunitIn(List<String> values) {
            addCriterion("lUnit in", values, "lunit");
            return (Criteria) this;
        }

        public Criteria andLunitNotIn(List<String> values) {
            addCriterion("lUnit not in", values, "lunit");
            return (Criteria) this;
        }

        public Criteria andLunitBetween(String value1, String value2) {
            addCriterion("lUnit between", value1, value2, "lunit");
            return (Criteria) this;
        }

        public Criteria andLunitNotBetween(String value1, String value2) {
            addCriterion("lUnit not between", value1, value2, "lunit");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(Float value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(Float value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(Float value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(Float value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(Float value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(Float value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<Float> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<Float> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(Float value1, Float value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(Float value1, Float value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andPackageTypeIsNull() {
            addCriterion("package_type is null");
            return (Criteria) this;
        }

        public Criteria andPackageTypeIsNotNull() {
            addCriterion("package_type is not null");
            return (Criteria) this;
        }

        public Criteria andPackageTypeEqualTo(Integer value) {
            addCriterion("package_type =", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeNotEqualTo(Integer value) {
            addCriterion("package_type <>", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeGreaterThan(Integer value) {
            addCriterion("package_type >", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("package_type >=", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeLessThan(Integer value) {
            addCriterion("package_type <", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeLessThanOrEqualTo(Integer value) {
            addCriterion("package_type <=", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeIn(List<Integer> values) {
            addCriterion("package_type in", values, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeNotIn(List<Integer> values) {
            addCriterion("package_type not in", values, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeBetween(Integer value1, Integer value2) {
            addCriterion("package_type between", value1, value2, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("package_type not between", value1, value2, "packageType");
            return (Criteria) this;
        }

        public Criteria andExpdateFlagIsNull() {
            addCriterion("expDate_flag is null");
            return (Criteria) this;
        }

        public Criteria andExpdateFlagIsNotNull() {
            addCriterion("expDate_flag is not null");
            return (Criteria) this;
        }

        public Criteria andExpdateFlagEqualTo(Boolean value) {
            addCriterion("expDate_flag =", value, "expdateFlag");
            return (Criteria) this;
        }

        public Criteria andExpdateFlagNotEqualTo(Boolean value) {
            addCriterion("expDate_flag <>", value, "expdateFlag");
            return (Criteria) this;
        }

        public Criteria andExpdateFlagGreaterThan(Boolean value) {
            addCriterion("expDate_flag >", value, "expdateFlag");
            return (Criteria) this;
        }

        public Criteria andExpdateFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("expDate_flag >=", value, "expdateFlag");
            return (Criteria) this;
        }

        public Criteria andExpdateFlagLessThan(Boolean value) {
            addCriterion("expDate_flag <", value, "expdateFlag");
            return (Criteria) this;
        }

        public Criteria andExpdateFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("expDate_flag <=", value, "expdateFlag");
            return (Criteria) this;
        }

        public Criteria andExpdateFlagIn(List<Boolean> values) {
            addCriterion("expDate_flag in", values, "expdateFlag");
            return (Criteria) this;
        }

        public Criteria andExpdateFlagNotIn(List<Boolean> values) {
            addCriterion("expDate_flag not in", values, "expdateFlag");
            return (Criteria) this;
        }

        public Criteria andExpdateFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("expDate_flag between", value1, value2, "expdateFlag");
            return (Criteria) this;
        }

        public Criteria andExpdateFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("expDate_flag not between", value1, value2, "expdateFlag");
            return (Criteria) this;
        }

        public Criteria andExpirationDateIsNull() {
            addCriterion("expiration_date is null");
            return (Criteria) this;
        }

        public Criteria andExpirationDateIsNotNull() {
            addCriterion("expiration_date is not null");
            return (Criteria) this;
        }

        public Criteria andExpirationDateEqualTo(Date value) {
            addCriterion("expiration_date =", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateNotEqualTo(Date value) {
            addCriterion("expiration_date <>", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateGreaterThan(Date value) {
            addCriterion("expiration_date >", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("expiration_date >=", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateLessThan(Date value) {
            addCriterion("expiration_date <", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateLessThanOrEqualTo(Date value) {
            addCriterion("expiration_date <=", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateIn(List<Date> values) {
            addCriterion("expiration_date in", values, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateNotIn(List<Date> values) {
            addCriterion("expiration_date not in", values, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateBetween(Date value1, Date value2) {
            addCriterion("expiration_date between", value1, value2, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateNotBetween(Date value1, Date value2) {
            addCriterion("expiration_date not between", value1, value2, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andBatchnoFlagIsNull() {
            addCriterion("batchNo_flag is null");
            return (Criteria) this;
        }

        public Criteria andBatchnoFlagIsNotNull() {
            addCriterion("batchNo_flag is not null");
            return (Criteria) this;
        }

        public Criteria andBatchnoFlagEqualTo(Boolean value) {
            addCriterion("batchNo_flag =", value, "batchnoFlag");
            return (Criteria) this;
        }

        public Criteria andBatchnoFlagNotEqualTo(Boolean value) {
            addCriterion("batchNo_flag <>", value, "batchnoFlag");
            return (Criteria) this;
        }

        public Criteria andBatchnoFlagGreaterThan(Boolean value) {
            addCriterion("batchNo_flag >", value, "batchnoFlag");
            return (Criteria) this;
        }

        public Criteria andBatchnoFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("batchNo_flag >=", value, "batchnoFlag");
            return (Criteria) this;
        }

        public Criteria andBatchnoFlagLessThan(Boolean value) {
            addCriterion("batchNo_flag <", value, "batchnoFlag");
            return (Criteria) this;
        }

        public Criteria andBatchnoFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("batchNo_flag <=", value, "batchnoFlag");
            return (Criteria) this;
        }

        public Criteria andBatchnoFlagIn(List<Boolean> values) {
            addCriterion("batchNo_flag in", values, "batchnoFlag");
            return (Criteria) this;
        }

        public Criteria andBatchnoFlagNotIn(List<Boolean> values) {
            addCriterion("batchNo_flag not in", values, "batchnoFlag");
            return (Criteria) this;
        }

        public Criteria andBatchnoFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("batchNo_flag between", value1, value2, "batchnoFlag");
            return (Criteria) this;
        }

        public Criteria andBatchnoFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("batchNo_flag not between", value1, value2, "batchnoFlag");
            return (Criteria) this;
        }

        public Criteria andWarmlineIsNull() {
            addCriterion("warmline is null");
            return (Criteria) this;
        }

        public Criteria andWarmlineIsNotNull() {
            addCriterion("warmline is not null");
            return (Criteria) this;
        }

        public Criteria andWarmlineEqualTo(Integer value) {
            addCriterion("warmline =", value, "warmline");
            return (Criteria) this;
        }

        public Criteria andWarmlineNotEqualTo(Integer value) {
            addCriterion("warmline <>", value, "warmline");
            return (Criteria) this;
        }

        public Criteria andWarmlineGreaterThan(Integer value) {
            addCriterion("warmline >", value, "warmline");
            return (Criteria) this;
        }

        public Criteria andWarmlineGreaterThanOrEqualTo(Integer value) {
            addCriterion("warmline >=", value, "warmline");
            return (Criteria) this;
        }

        public Criteria andWarmlineLessThan(Integer value) {
            addCriterion("warmline <", value, "warmline");
            return (Criteria) this;
        }

        public Criteria andWarmlineLessThanOrEqualTo(Integer value) {
            addCriterion("warmline <=", value, "warmline");
            return (Criteria) this;
        }

        public Criteria andWarmlineIn(List<Integer> values) {
            addCriterion("warmline in", values, "warmline");
            return (Criteria) this;
        }

        public Criteria andWarmlineNotIn(List<Integer> values) {
            addCriterion("warmline not in", values, "warmline");
            return (Criteria) this;
        }

        public Criteria andWarmlineBetween(Integer value1, Integer value2) {
            addCriterion("warmline between", value1, value2, "warmline");
            return (Criteria) this;
        }

        public Criteria andWarmlineNotBetween(Integer value1, Integer value2) {
            addCriterion("warmline not between", value1, value2, "warmline");
            return (Criteria) this;
        }

        public Criteria andSecurityCodeFlagIsNull() {
            addCriterion("security_code_flag is null");
            return (Criteria) this;
        }

        public Criteria andSecurityCodeFlagIsNotNull() {
            addCriterion("security_code_flag is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityCodeFlagEqualTo(Boolean value) {
            addCriterion("security_code_flag =", value, "securityCodeFlag");
            return (Criteria) this;
        }

        public Criteria andSecurityCodeFlagNotEqualTo(Boolean value) {
            addCriterion("security_code_flag <>", value, "securityCodeFlag");
            return (Criteria) this;
        }

        public Criteria andSecurityCodeFlagGreaterThan(Boolean value) {
            addCriterion("security_code_flag >", value, "securityCodeFlag");
            return (Criteria) this;
        }

        public Criteria andSecurityCodeFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("security_code_flag >=", value, "securityCodeFlag");
            return (Criteria) this;
        }

        public Criteria andSecurityCodeFlagLessThan(Boolean value) {
            addCriterion("security_code_flag <", value, "securityCodeFlag");
            return (Criteria) this;
        }

        public Criteria andSecurityCodeFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("security_code_flag <=", value, "securityCodeFlag");
            return (Criteria) this;
        }

        public Criteria andSecurityCodeFlagIn(List<Boolean> values) {
            addCriterion("security_code_flag in", values, "securityCodeFlag");
            return (Criteria) this;
        }

        public Criteria andSecurityCodeFlagNotIn(List<Boolean> values) {
            addCriterion("security_code_flag not in", values, "securityCodeFlag");
            return (Criteria) this;
        }

        public Criteria andSecurityCodeFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("security_code_flag between", value1, value2, "securityCodeFlag");
            return (Criteria) this;
        }

        public Criteria andSecurityCodeFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("security_code_flag not between", value1, value2, "securityCodeFlag");
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
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
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