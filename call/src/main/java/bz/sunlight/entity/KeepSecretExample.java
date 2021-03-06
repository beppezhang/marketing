package bz.sunlight.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KeepSecretExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table keep_secret
	 * @mbggenerated
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table keep_secret
	 * @mbggenerated
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table keep_secret
	 * @mbggenerated
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table keep_secret
	 * @mbggenerated
	 */
	public KeepSecretExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table keep_secret
	 * @mbggenerated
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table keep_secret
	 * @mbggenerated
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table keep_secret
	 * @mbggenerated
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table keep_secret
	 * @mbggenerated
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table keep_secret
	 * @mbggenerated
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table keep_secret
	 * @mbggenerated
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table keep_secret
	 * @mbggenerated
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table keep_secret
	 * @mbggenerated
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table keep_secret
	 * @mbggenerated
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table keep_secret
	 * @mbggenerated
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table keep_secret
	 * @mbggenerated
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

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
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

		public Criteria andSecretIdIsNull() {
			addCriterion("secret_id is null");
			return (Criteria) this;
		}

		public Criteria andSecretIdIsNotNull() {
			addCriterion("secret_id is not null");
			return (Criteria) this;
		}

		public Criteria andSecretIdEqualTo(String value) {
			addCriterion("secret_id =", value, "secretId");
			return (Criteria) this;
		}

		public Criteria andSecretIdNotEqualTo(String value) {
			addCriterion("secret_id <>", value, "secretId");
			return (Criteria) this;
		}

		public Criteria andSecretIdGreaterThan(String value) {
			addCriterion("secret_id >", value, "secretId");
			return (Criteria) this;
		}

		public Criteria andSecretIdGreaterThanOrEqualTo(String value) {
			addCriterion("secret_id >=", value, "secretId");
			return (Criteria) this;
		}

		public Criteria andSecretIdLessThan(String value) {
			addCriterion("secret_id <", value, "secretId");
			return (Criteria) this;
		}

		public Criteria andSecretIdLessThanOrEqualTo(String value) {
			addCriterion("secret_id <=", value, "secretId");
			return (Criteria) this;
		}

		public Criteria andSecretIdLike(String value) {
			addCriterion("secret_id like", value, "secretId");
			return (Criteria) this;
		}

		public Criteria andSecretIdNotLike(String value) {
			addCriterion("secret_id not like", value, "secretId");
			return (Criteria) this;
		}

		public Criteria andSecretIdIn(List<String> values) {
			addCriterion("secret_id in", values, "secretId");
			return (Criteria) this;
		}

		public Criteria andSecretIdNotIn(List<String> values) {
			addCriterion("secret_id not in", values, "secretId");
			return (Criteria) this;
		}

		public Criteria andSecretIdBetween(String value1, String value2) {
			addCriterion("secret_id between", value1, value2, "secretId");
			return (Criteria) this;
		}

		public Criteria andSecretIdNotBetween(String value1, String value2) {
			addCriterion("secret_id not between", value1, value2, "secretId");
			return (Criteria) this;
		}

		public Criteria andEnterpirseIdIsNull() {
			addCriterion("enterpirse_id is null");
			return (Criteria) this;
		}

		public Criteria andEnterpirseIdIsNotNull() {
			addCriterion("enterpirse_id is not null");
			return (Criteria) this;
		}

		public Criteria andEnterpirseIdEqualTo(String value) {
			addCriterion("enterpirse_id =", value, "enterpirseId");
			return (Criteria) this;
		}

		public Criteria andEnterpirseIdNotEqualTo(String value) {
			addCriterion("enterpirse_id <>", value, "enterpirseId");
			return (Criteria) this;
		}

		public Criteria andEnterpirseIdGreaterThan(String value) {
			addCriterion("enterpirse_id >", value, "enterpirseId");
			return (Criteria) this;
		}

		public Criteria andEnterpirseIdGreaterThanOrEqualTo(String value) {
			addCriterion("enterpirse_id >=", value, "enterpirseId");
			return (Criteria) this;
		}

		public Criteria andEnterpirseIdLessThan(String value) {
			addCriterion("enterpirse_id <", value, "enterpirseId");
			return (Criteria) this;
		}

		public Criteria andEnterpirseIdLessThanOrEqualTo(String value) {
			addCriterion("enterpirse_id <=", value, "enterpirseId");
			return (Criteria) this;
		}

		public Criteria andEnterpirseIdLike(String value) {
			addCriterion("enterpirse_id like", value, "enterpirseId");
			return (Criteria) this;
		}

		public Criteria andEnterpirseIdNotLike(String value) {
			addCriterion("enterpirse_id not like", value, "enterpirseId");
			return (Criteria) this;
		}

		public Criteria andEnterpirseIdIn(List<String> values) {
			addCriterion("enterpirse_id in", values, "enterpirseId");
			return (Criteria) this;
		}

		public Criteria andEnterpirseIdNotIn(List<String> values) {
			addCriterion("enterpirse_id not in", values, "enterpirseId");
			return (Criteria) this;
		}

		public Criteria andEnterpirseIdBetween(String value1, String value2) {
			addCriterion("enterpirse_id between", value1, value2,
					"enterpirseId");
			return (Criteria) this;
		}

		public Criteria andEnterpirseIdNotBetween(String value1, String value2) {
			addCriterion("enterpirse_id not between", value1, value2,
					"enterpirseId");
			return (Criteria) this;
		}

		public Criteria andUserInfoIdIsNull() {
			addCriterion("user_info_id is null");
			return (Criteria) this;
		}

		public Criteria andUserInfoIdIsNotNull() {
			addCriterion("user_info_id is not null");
			return (Criteria) this;
		}

		public Criteria andUserInfoIdEqualTo(String value) {
			addCriterion("user_info_id =", value, "userInfoId");
			return (Criteria) this;
		}

		public Criteria andUserInfoIdNotEqualTo(String value) {
			addCriterion("user_info_id <>", value, "userInfoId");
			return (Criteria) this;
		}

		public Criteria andUserInfoIdGreaterThan(String value) {
			addCriterion("user_info_id >", value, "userInfoId");
			return (Criteria) this;
		}

		public Criteria andUserInfoIdGreaterThanOrEqualTo(String value) {
			addCriterion("user_info_id >=", value, "userInfoId");
			return (Criteria) this;
		}

		public Criteria andUserInfoIdLessThan(String value) {
			addCriterion("user_info_id <", value, "userInfoId");
			return (Criteria) this;
		}

		public Criteria andUserInfoIdLessThanOrEqualTo(String value) {
			addCriterion("user_info_id <=", value, "userInfoId");
			return (Criteria) this;
		}

		public Criteria andUserInfoIdLike(String value) {
			addCriterion("user_info_id like", value, "userInfoId");
			return (Criteria) this;
		}

		public Criteria andUserInfoIdNotLike(String value) {
			addCriterion("user_info_id not like", value, "userInfoId");
			return (Criteria) this;
		}

		public Criteria andUserInfoIdIn(List<String> values) {
			addCriterion("user_info_id in", values, "userInfoId");
			return (Criteria) this;
		}

		public Criteria andUserInfoIdNotIn(List<String> values) {
			addCriterion("user_info_id not in", values, "userInfoId");
			return (Criteria) this;
		}

		public Criteria andUserInfoIdBetween(String value1, String value2) {
			addCriterion("user_info_id between", value1, value2, "userInfoId");
			return (Criteria) this;
		}

		public Criteria andUserInfoIdNotBetween(String value1, String value2) {
			addCriterion("user_info_id not between", value1, value2,
					"userInfoId");
			return (Criteria) this;
		}

		public Criteria andKeepTimeIsNull() {
			addCriterion("keep_time is null");
			return (Criteria) this;
		}

		public Criteria andKeepTimeIsNotNull() {
			addCriterion("keep_time is not null");
			return (Criteria) this;
		}

		public Criteria andKeepTimeEqualTo(Date value) {
			addCriterion("keep_time =", value, "keepTime");
			return (Criteria) this;
		}

		public Criteria andKeepTimeNotEqualTo(Date value) {
			addCriterion("keep_time <>", value, "keepTime");
			return (Criteria) this;
		}

		public Criteria andKeepTimeGreaterThan(Date value) {
			addCriterion("keep_time >", value, "keepTime");
			return (Criteria) this;
		}

		public Criteria andKeepTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("keep_time >=", value, "keepTime");
			return (Criteria) this;
		}

		public Criteria andKeepTimeLessThan(Date value) {
			addCriterion("keep_time <", value, "keepTime");
			return (Criteria) this;
		}

		public Criteria andKeepTimeLessThanOrEqualTo(Date value) {
			addCriterion("keep_time <=", value, "keepTime");
			return (Criteria) this;
		}

		public Criteria andKeepTimeIn(List<Date> values) {
			addCriterion("keep_time in", values, "keepTime");
			return (Criteria) this;
		}

		public Criteria andKeepTimeNotIn(List<Date> values) {
			addCriterion("keep_time not in", values, "keepTime");
			return (Criteria) this;
		}

		public Criteria andKeepTimeBetween(Date value1, Date value2) {
			addCriterion("keep_time between", value1, value2, "keepTime");
			return (Criteria) this;
		}

		public Criteria andKeepTimeNotBetween(Date value1, Date value2) {
			addCriterion("keep_time not between", value1, value2, "keepTime");
			return (Criteria) this;
		}

		public Criteria andFreedTimeIsNull() {
			addCriterion("freed_time is null");
			return (Criteria) this;
		}

		public Criteria andFreedTimeIsNotNull() {
			addCriterion("freed_time is not null");
			return (Criteria) this;
		}

		public Criteria andFreedTimeEqualTo(Date value) {
			addCriterion("freed_time =", value, "freedTime");
			return (Criteria) this;
		}

		public Criteria andFreedTimeNotEqualTo(Date value) {
			addCriterion("freed_time <>", value, "freedTime");
			return (Criteria) this;
		}

		public Criteria andFreedTimeGreaterThan(Date value) {
			addCriterion("freed_time >", value, "freedTime");
			return (Criteria) this;
		}

		public Criteria andFreedTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("freed_time >=", value, "freedTime");
			return (Criteria) this;
		}

		public Criteria andFreedTimeLessThan(Date value) {
			addCriterion("freed_time <", value, "freedTime");
			return (Criteria) this;
		}

		public Criteria andFreedTimeLessThanOrEqualTo(Date value) {
			addCriterion("freed_time <=", value, "freedTime");
			return (Criteria) this;
		}

		public Criteria andFreedTimeIn(List<Date> values) {
			addCriterion("freed_time in", values, "freedTime");
			return (Criteria) this;
		}

		public Criteria andFreedTimeNotIn(List<Date> values) {
			addCriterion("freed_time not in", values, "freedTime");
			return (Criteria) this;
		}

		public Criteria andFreedTimeBetween(Date value1, Date value2) {
			addCriterion("freed_time between", value1, value2, "freedTime");
			return (Criteria) this;
		}

		public Criteria andFreedTimeNotBetween(Date value1, Date value2) {
			addCriterion("freed_time not between", value1, value2, "freedTime");
			return (Criteria) this;
		}

		public Criteria andCustomPropertiesId1IsNull() {
			addCriterion("custom_properties_id1 is null");
			return (Criteria) this;
		}

		public Criteria andCustomPropertiesId1IsNotNull() {
			addCriterion("custom_properties_id1 is not null");
			return (Criteria) this;
		}

		public Criteria andCustomPropertiesId1EqualTo(String value) {
			addCriterion("custom_properties_id1 =", value,
					"customPropertiesId1");
			return (Criteria) this;
		}

		public Criteria andCustomPropertiesId1NotEqualTo(String value) {
			addCriterion("custom_properties_id1 <>", value,
					"customPropertiesId1");
			return (Criteria) this;
		}

		public Criteria andCustomPropertiesId1GreaterThan(String value) {
			addCriterion("custom_properties_id1 >", value,
					"customPropertiesId1");
			return (Criteria) this;
		}

		public Criteria andCustomPropertiesId1GreaterThanOrEqualTo(String value) {
			addCriterion("custom_properties_id1 >=", value,
					"customPropertiesId1");
			return (Criteria) this;
		}

		public Criteria andCustomPropertiesId1LessThan(String value) {
			addCriterion("custom_properties_id1 <", value,
					"customPropertiesId1");
			return (Criteria) this;
		}

		public Criteria andCustomPropertiesId1LessThanOrEqualTo(String value) {
			addCriterion("custom_properties_id1 <=", value,
					"customPropertiesId1");
			return (Criteria) this;
		}

		public Criteria andCustomPropertiesId1Like(String value) {
			addCriterion("custom_properties_id1 like", value,
					"customPropertiesId1");
			return (Criteria) this;
		}

		public Criteria andCustomPropertiesId1NotLike(String value) {
			addCriterion("custom_properties_id1 not like", value,
					"customPropertiesId1");
			return (Criteria) this;
		}

		public Criteria andCustomPropertiesId1In(List<String> values) {
			addCriterion("custom_properties_id1 in", values,
					"customPropertiesId1");
			return (Criteria) this;
		}

		public Criteria andCustomPropertiesId1NotIn(List<String> values) {
			addCriterion("custom_properties_id1 not in", values,
					"customPropertiesId1");
			return (Criteria) this;
		}

		public Criteria andCustomPropertiesId1Between(String value1,
				String value2) {
			addCriterion("custom_properties_id1 between", value1, value2,
					"customPropertiesId1");
			return (Criteria) this;
		}

		public Criteria andCustomPropertiesId1NotBetween(String value1,
				String value2) {
			addCriterion("custom_properties_id1 not between", value1, value2,
					"customPropertiesId1");
			return (Criteria) this;
		}

		public Criteria andCustomPropertiesId2IsNull() {
			addCriterion("custom_properties_id2 is null");
			return (Criteria) this;
		}

		public Criteria andCustomPropertiesId2IsNotNull() {
			addCriterion("custom_properties_id2 is not null");
			return (Criteria) this;
		}

		public Criteria andCustomPropertiesId2EqualTo(String value) {
			addCriterion("custom_properties_id2 =", value,
					"customPropertiesId2");
			return (Criteria) this;
		}

		public Criteria andCustomPropertiesId2NotEqualTo(String value) {
			addCriterion("custom_properties_id2 <>", value,
					"customPropertiesId2");
			return (Criteria) this;
		}

		public Criteria andCustomPropertiesId2GreaterThan(String value) {
			addCriterion("custom_properties_id2 >", value,
					"customPropertiesId2");
			return (Criteria) this;
		}

		public Criteria andCustomPropertiesId2GreaterThanOrEqualTo(String value) {
			addCriterion("custom_properties_id2 >=", value,
					"customPropertiesId2");
			return (Criteria) this;
		}

		public Criteria andCustomPropertiesId2LessThan(String value) {
			addCriterion("custom_properties_id2 <", value,
					"customPropertiesId2");
			return (Criteria) this;
		}

		public Criteria andCustomPropertiesId2LessThanOrEqualTo(String value) {
			addCriterion("custom_properties_id2 <=", value,
					"customPropertiesId2");
			return (Criteria) this;
		}

		public Criteria andCustomPropertiesId2Like(String value) {
			addCriterion("custom_properties_id2 like", value,
					"customPropertiesId2");
			return (Criteria) this;
		}

		public Criteria andCustomPropertiesId2NotLike(String value) {
			addCriterion("custom_properties_id2 not like", value,
					"customPropertiesId2");
			return (Criteria) this;
		}

		public Criteria andCustomPropertiesId2In(List<String> values) {
			addCriterion("custom_properties_id2 in", values,
					"customPropertiesId2");
			return (Criteria) this;
		}

		public Criteria andCustomPropertiesId2NotIn(List<String> values) {
			addCriterion("custom_properties_id2 not in", values,
					"customPropertiesId2");
			return (Criteria) this;
		}

		public Criteria andCustomPropertiesId2Between(String value1,
				String value2) {
			addCriterion("custom_properties_id2 between", value1, value2,
					"customPropertiesId2");
			return (Criteria) this;
		}

		public Criteria andCustomPropertiesId2NotBetween(String value1,
				String value2) {
			addCriterion("custom_properties_id2 not between", value1, value2,
					"customPropertiesId2");
			return (Criteria) this;
		}

		public Criteria andCustomProperties3IsNull() {
			addCriterion("custom_properties3 is null");
			return (Criteria) this;
		}

		public Criteria andCustomProperties3IsNotNull() {
			addCriterion("custom_properties3 is not null");
			return (Criteria) this;
		}

		public Criteria andCustomProperties3EqualTo(String value) {
			addCriterion("custom_properties3 =", value, "customProperties3");
			return (Criteria) this;
		}

		public Criteria andCustomProperties3NotEqualTo(String value) {
			addCriterion("custom_properties3 <>", value, "customProperties3");
			return (Criteria) this;
		}

		public Criteria andCustomProperties3GreaterThan(String value) {
			addCriterion("custom_properties3 >", value, "customProperties3");
			return (Criteria) this;
		}

		public Criteria andCustomProperties3GreaterThanOrEqualTo(String value) {
			addCriterion("custom_properties3 >=", value, "customProperties3");
			return (Criteria) this;
		}

		public Criteria andCustomProperties3LessThan(String value) {
			addCriterion("custom_properties3 <", value, "customProperties3");
			return (Criteria) this;
		}

		public Criteria andCustomProperties3LessThanOrEqualTo(String value) {
			addCriterion("custom_properties3 <=", value, "customProperties3");
			return (Criteria) this;
		}

		public Criteria andCustomProperties3Like(String value) {
			addCriterion("custom_properties3 like", value, "customProperties3");
			return (Criteria) this;
		}

		public Criteria andCustomProperties3NotLike(String value) {
			addCriterion("custom_properties3 not like", value,
					"customProperties3");
			return (Criteria) this;
		}

		public Criteria andCustomProperties3In(List<String> values) {
			addCriterion("custom_properties3 in", values, "customProperties3");
			return (Criteria) this;
		}

		public Criteria andCustomProperties3NotIn(List<String> values) {
			addCriterion("custom_properties3 not in", values,
					"customProperties3");
			return (Criteria) this;
		}

		public Criteria andCustomProperties3Between(String value1, String value2) {
			addCriterion("custom_properties3 between", value1, value2,
					"customProperties3");
			return (Criteria) this;
		}

		public Criteria andCustomProperties3NotBetween(String value1,
				String value2) {
			addCriterion("custom_properties3 not between", value1, value2,
					"customProperties3");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table keep_secret
	 * @mbggenerated
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

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table keep_secret
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}