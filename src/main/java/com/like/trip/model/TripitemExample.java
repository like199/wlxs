package com.like.trip.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TripitemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TripitemExample() {
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

    /**
     * 
     * 
     * @author wcyong
     * 
     * @date 2018-07-15
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

        public Criteria andIdIsNull() {
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
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

        public Criteria andCoverImageW640IsNull() {
            addCriterion("cover_image_w640 is null");
            return (Criteria) this;
        }

        public Criteria andCoverImageW640IsNotNull() {
            addCriterion("cover_image_w640 is not null");
            return (Criteria) this;
        }

        public Criteria andCoverImageW640EqualTo(String value) {
            addCriterion("cover_image_w640 =", value, "coverImageW640");
            return (Criteria) this;
        }

        public Criteria andCoverImageW640NotEqualTo(String value) {
            addCriterion("cover_image_w640 <>", value, "coverImageW640");
            return (Criteria) this;
        }

        public Criteria andCoverImageW640GreaterThan(String value) {
            addCriterion("cover_image_w640 >", value, "coverImageW640");
            return (Criteria) this;
        }

        public Criteria andCoverImageW640GreaterThanOrEqualTo(String value) {
            addCriterion("cover_image_w640 >=", value, "coverImageW640");
            return (Criteria) this;
        }

        public Criteria andCoverImageW640LessThan(String value) {
            addCriterion("cover_image_w640 <", value, "coverImageW640");
            return (Criteria) this;
        }

        public Criteria andCoverImageW640LessThanOrEqualTo(String value) {
            addCriterion("cover_image_w640 <=", value, "coverImageW640");
            return (Criteria) this;
        }

        public Criteria andCoverImageW640Like(String value) {
            addCriterion("cover_image_w640 like", value, "coverImageW640");
            return (Criteria) this;
        }

        public Criteria andCoverImageW640NotLike(String value) {
            addCriterion("cover_image_w640 not like", value, "coverImageW640");
            return (Criteria) this;
        }

        public Criteria andCoverImageW640In(List<String> values) {
            addCriterion("cover_image_w640 in", values, "coverImageW640");
            return (Criteria) this;
        }

        public Criteria andCoverImageW640NotIn(List<String> values) {
            addCriterion("cover_image_w640 not in", values, "coverImageW640");
            return (Criteria) this;
        }

        public Criteria andCoverImageW640Between(String value1, String value2) {
            addCriterion("cover_image_w640 between", value1, value2, "coverImageW640");
            return (Criteria) this;
        }

        public Criteria andCoverImageW640NotBetween(String value1, String value2) {
            addCriterion("cover_image_w640 not between", value1, value2, "coverImageW640");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andDayCountIsNull() {
            addCriterion("day_count is null");
            return (Criteria) this;
        }

        public Criteria andDayCountIsNotNull() {
            addCriterion("day_count is not null");
            return (Criteria) this;
        }

        public Criteria andDayCountEqualTo(Integer value) {
            addCriterion("day_count =", value, "dayCount");
            return (Criteria) this;
        }

        public Criteria andDayCountNotEqualTo(Integer value) {
            addCriterion("day_count <>", value, "dayCount");
            return (Criteria) this;
        }

        public Criteria andDayCountGreaterThan(Integer value) {
            addCriterion("day_count >", value, "dayCount");
            return (Criteria) this;
        }

        public Criteria andDayCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("day_count >=", value, "dayCount");
            return (Criteria) this;
        }

        public Criteria andDayCountLessThan(Integer value) {
            addCriterion("day_count <", value, "dayCount");
            return (Criteria) this;
        }

        public Criteria andDayCountLessThanOrEqualTo(Integer value) {
            addCriterion("day_count <=", value, "dayCount");
            return (Criteria) this;
        }

        public Criteria andDayCountIn(List<Integer> values) {
            addCriterion("day_count in", values, "dayCount");
            return (Criteria) this;
        }

        public Criteria andDayCountNotIn(List<Integer> values) {
            addCriterion("day_count not in", values, "dayCount");
            return (Criteria) this;
        }

        public Criteria andDayCountBetween(Integer value1, Integer value2) {
            addCriterion("day_count between", value1, value2, "dayCount");
            return (Criteria) this;
        }

        public Criteria andDayCountNotBetween(Integer value1, Integer value2) {
            addCriterion("day_count not between", value1, value2, "dayCount");
            return (Criteria) this;
        }

        public Criteria andViewCountIsNull() {
            addCriterion("view_count is null");
            return (Criteria) this;
        }

        public Criteria andViewCountIsNotNull() {
            addCriterion("view_count is not null");
            return (Criteria) this;
        }

        public Criteria andViewCountEqualTo(String value) {
            addCriterion("view_count =", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountNotEqualTo(String value) {
            addCriterion("view_count <>", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountGreaterThan(String value) {
            addCriterion("view_count >", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountGreaterThanOrEqualTo(String value) {
            addCriterion("view_count >=", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountLessThan(String value) {
            addCriterion("view_count <", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountLessThanOrEqualTo(String value) {
            addCriterion("view_count <=", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountLike(String value) {
            addCriterion("view_count like", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountNotLike(String value) {
            addCriterion("view_count not like", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountIn(List<String> values) {
            addCriterion("view_count in", values, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountNotIn(List<String> values) {
            addCriterion("view_count not in", values, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountBetween(String value1, String value2) {
            addCriterion("view_count between", value1, value2, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountNotBetween(String value1, String value2) {
            addCriterion("view_count not between", value1, value2, "viewCount");
            return (Criteria) this;
        }

        public Criteria andPopularPlaceStrIsNull() {
            addCriterion("popular_place_str is null");
            return (Criteria) this;
        }

        public Criteria andPopularPlaceStrIsNotNull() {
            addCriterion("popular_place_str is not null");
            return (Criteria) this;
        }

        public Criteria andPopularPlaceStrEqualTo(String value) {
            addCriterion("popular_place_str =", value, "popularPlaceStr");
            return (Criteria) this;
        }

        public Criteria andPopularPlaceStrNotEqualTo(String value) {
            addCriterion("popular_place_str <>", value, "popularPlaceStr");
            return (Criteria) this;
        }

        public Criteria andPopularPlaceStrGreaterThan(String value) {
            addCriterion("popular_place_str >", value, "popularPlaceStr");
            return (Criteria) this;
        }

        public Criteria andPopularPlaceStrGreaterThanOrEqualTo(String value) {
            addCriterion("popular_place_str >=", value, "popularPlaceStr");
            return (Criteria) this;
        }

        public Criteria andPopularPlaceStrLessThan(String value) {
            addCriterion("popular_place_str <", value, "popularPlaceStr");
            return (Criteria) this;
        }

        public Criteria andPopularPlaceStrLessThanOrEqualTo(String value) {
            addCriterion("popular_place_str <=", value, "popularPlaceStr");
            return (Criteria) this;
        }

        public Criteria andPopularPlaceStrLike(String value) {
            addCriterion("popular_place_str like", value, "popularPlaceStr");
            return (Criteria) this;
        }

        public Criteria andPopularPlaceStrNotLike(String value) {
            addCriterion("popular_place_str not like", value, "popularPlaceStr");
            return (Criteria) this;
        }

        public Criteria andPopularPlaceStrIn(List<String> values) {
            addCriterion("popular_place_str in", values, "popularPlaceStr");
            return (Criteria) this;
        }

        public Criteria andPopularPlaceStrNotIn(List<String> values) {
            addCriterion("popular_place_str not in", values, "popularPlaceStr");
            return (Criteria) this;
        }

        public Criteria andPopularPlaceStrBetween(String value1, String value2) {
            addCriterion("popular_place_str between", value1, value2, "popularPlaceStr");
            return (Criteria) this;
        }

        public Criteria andPopularPlaceStrNotBetween(String value1, String value2) {
            addCriterion("popular_place_str not between", value1, value2, "popularPlaceStr");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(Integer value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(Integer value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(Integer value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(Integer value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(Integer value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<Integer> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<Integer> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(Integer value1, Integer value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(Integer value1, Integer value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andWaypointsIsNull() {
            addCriterion("waypoints is null");
            return (Criteria) this;
        }

        public Criteria andWaypointsIsNotNull() {
            addCriterion("waypoints is not null");
            return (Criteria) this;
        }

        public Criteria andWaypointsEqualTo(String value) {
            addCriterion("waypoints =", value, "waypoints");
            return (Criteria) this;
        }

        public Criteria andWaypointsNotEqualTo(String value) {
            addCriterion("waypoints <>", value, "waypoints");
            return (Criteria) this;
        }

        public Criteria andWaypointsGreaterThan(String value) {
            addCriterion("waypoints >", value, "waypoints");
            return (Criteria) this;
        }

        public Criteria andWaypointsGreaterThanOrEqualTo(String value) {
            addCriterion("waypoints >=", value, "waypoints");
            return (Criteria) this;
        }

        public Criteria andWaypointsLessThan(String value) {
            addCriterion("waypoints <", value, "waypoints");
            return (Criteria) this;
        }

        public Criteria andWaypointsLessThanOrEqualTo(String value) {
            addCriterion("waypoints <=", value, "waypoints");
            return (Criteria) this;
        }

        public Criteria andWaypointsLike(String value) {
            addCriterion("waypoints like", value, "waypoints");
            return (Criteria) this;
        }

        public Criteria andWaypointsNotLike(String value) {
            addCriterion("waypoints not like", value, "waypoints");
            return (Criteria) this;
        }

        public Criteria andWaypointsIn(List<String> values) {
            addCriterion("waypoints in", values, "waypoints");
            return (Criteria) this;
        }

        public Criteria andWaypointsNotIn(List<String> values) {
            addCriterion("waypoints not in", values, "waypoints");
            return (Criteria) this;
        }

        public Criteria andWaypointsBetween(String value1, String value2) {
            addCriterion("waypoints between", value1, value2, "waypoints");
            return (Criteria) this;
        }

        public Criteria andWaypointsNotBetween(String value1, String value2) {
            addCriterion("waypoints not between", value1, value2, "waypoints");
            return (Criteria) this;
        }

        public Criteria andRecommendationsIsNull() {
            addCriterion("recommendations is null");
            return (Criteria) this;
        }

        public Criteria andRecommendationsIsNotNull() {
            addCriterion("recommendations is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendationsEqualTo(String value) {
            addCriterion("recommendations =", value, "recommendations");
            return (Criteria) this;
        }

        public Criteria andRecommendationsNotEqualTo(String value) {
            addCriterion("recommendations <>", value, "recommendations");
            return (Criteria) this;
        }

        public Criteria andRecommendationsGreaterThan(String value) {
            addCriterion("recommendations >", value, "recommendations");
            return (Criteria) this;
        }

        public Criteria andRecommendationsGreaterThanOrEqualTo(String value) {
            addCriterion("recommendations >=", value, "recommendations");
            return (Criteria) this;
        }

        public Criteria andRecommendationsLessThan(String value) {
            addCriterion("recommendations <", value, "recommendations");
            return (Criteria) this;
        }

        public Criteria andRecommendationsLessThanOrEqualTo(String value) {
            addCriterion("recommendations <=", value, "recommendations");
            return (Criteria) this;
        }

        public Criteria andRecommendationsLike(String value) {
            addCriterion("recommendations like", value, "recommendations");
            return (Criteria) this;
        }

        public Criteria andRecommendationsNotLike(String value) {
            addCriterion("recommendations not like", value, "recommendations");
            return (Criteria) this;
        }

        public Criteria andRecommendationsIn(List<String> values) {
            addCriterion("recommendations in", values, "recommendations");
            return (Criteria) this;
        }

        public Criteria andRecommendationsNotIn(List<String> values) {
            addCriterion("recommendations not in", values, "recommendations");
            return (Criteria) this;
        }

        public Criteria andRecommendationsBetween(String value1, String value2) {
            addCriterion("recommendations between", value1, value2, "recommendations");
            return (Criteria) this;
        }

        public Criteria andRecommendationsNotBetween(String value1, String value2) {
            addCriterion("recommendations not between", value1, value2, "recommendations");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 
     * 
     * @author wcyong
     * 
     * @date 2018-07-15
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