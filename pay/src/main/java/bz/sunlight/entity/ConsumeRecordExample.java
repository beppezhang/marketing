package bz.sunlight.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConsumeRecordExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table consume_record
	 * @mbggenerated
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table consume_record
	 * @mbggenerated
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table consume_record
	 * @mbggenerated
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table consume_record
	 * @mbggenerated
	 */
	public ConsumeRecordExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table consume_record
	 * @mbggenerated
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table consume_record
	 * @mbggenerated
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table consume_record
	 * @mbggenerated
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table consume_record
	 * @mbggenerated
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table consume_record
	 * @mbggenerated
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table consume_record
	 * @mbggenerated
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table consume_record
	 * @mbggenerated
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table consume_record
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table consume_record
	 * @mbggenerated
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table consume_record
	 * @mbggenerated
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table consume_record
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

		public Criteria andAccountIsNull() {
			addCriterion("account is null");
			return (Criteria) this;
		}

		public Criteria andAccountIsNotNull() {
			addCriterion("account is not null");
			return (Criteria) this;
		}

		public Criteria andAccountEqualTo(Double value) {
			addCriterion("account =", value, "account");
			return (Criteria) this;
		}

		public Criteria andAccountNotEqualTo(Double value) {
			addCriterion("account <>", value, "account");
			return (Criteria) this;
		}

		public Criteria andAccountGreaterThan(Double value) {
			addCriterion("account >", value, "account");
			return (Criteria) this;
		}

		public Criteria andAccountGreaterThanOrEqualTo(Double value) {
			addCriterion("account >=", value, "account");
			return (Criteria) this;
		}

		public Criteria andAccountLessThan(Double value) {
			addCriterion("account <", value, "account");
			return (Criteria) this;
		}

		public Criteria andAccountLessThanOrEqualTo(Double value) {
			addCriterion("account <=", value, "account");
			return (Criteria) this;
		}

		public Criteria andAccountIn(List<Double> values) {
			addCriterion("account in", values, "account");
			return (Criteria) this;
		}

		public Criteria andAccountNotIn(List<Double> values) {
			addCriterion("account not in", values, "account");
			return (Criteria) this;
		}

		public Criteria andAccountBetween(Double value1, Double value2) {
			addCriterion("account between", value1, value2, "account");
			return (Criteria) this;
		}

		public Criteria andAccountNotBetween(Double value1, Double value2) {
			addCriterion("account not between", value1, value2, "account");
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

		public Criteria andTypeEqualTo(Short value) {
			addCriterion("type =", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotEqualTo(Short value) {
			addCriterion("type <>", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeGreaterThan(Short value) {
			addCriterion("type >", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeGreaterThanOrEqualTo(Short value) {
			addCriterion("type >=", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLessThan(Short value) {
			addCriterion("type <", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLessThanOrEqualTo(Short value) {
			addCriterion("type <=", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeIn(List<Short> values) {
			addCriterion("type in", values, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotIn(List<Short> values) {
			addCriterion("type not in", values, "type");
			return (Criteria) this;
		}

		public Criteria andTypeBetween(Short value1, Short value2) {
			addCriterion("type between", value1, value2, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotBetween(Short value1, Short value2) {
			addCriterion("type not between", value1, value2, "type");
			return (Criteria) this;
		}

		public Criteria andConsumeTimeIsNull() {
			addCriterion("consume_time is null");
			return (Criteria) this;
		}

		public Criteria andConsumeTimeIsNotNull() {
			addCriterion("consume_time is not null");
			return (Criteria) this;
		}

		public Criteria andConsumeTimeEqualTo(Date value) {
			addCriterion("consume_time =", value, "consumeTime");
			return (Criteria) this;
		}

		public Criteria andConsumeTimeNotEqualTo(Date value) {
			addCriterion("consume_time <>", value, "consumeTime");
			return (Criteria) this;
		}

		public Criteria andConsumeTimeGreaterThan(Date value) {
			addCriterion("consume_time >", value, "consumeTime");
			return (Criteria) this;
		}

		public Criteria andConsumeTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("consume_time >=", value, "consumeTime");
			return (Criteria) this;
		}

		public Criteria andConsumeTimeLessThan(Date value) {
			addCriterion("consume_time <", value, "consumeTime");
			return (Criteria) this;
		}

		public Criteria andConsumeTimeLessThanOrEqualTo(Date value) {
			addCriterion("consume_time <=", value, "consumeTime");
			return (Criteria) this;
		}

		public Criteria andConsumeTimeIn(List<Date> values) {
			addCriterion("consume_time in", values, "consumeTime");
			return (Criteria) this;
		}

		public Criteria andConsumeTimeNotIn(List<Date> values) {
			addCriterion("consume_time not in", values, "consumeTime");
			return (Criteria) this;
		}

		public Criteria andConsumeTimeBetween(Date value1, Date value2) {
			addCriterion("consume_time between", value1, value2, "consumeTime");
			return (Criteria) this;
		}

		public Criteria andConsumeTimeNotBetween(Date value1, Date value2) {
			addCriterion("consume_time not between", value1, value2,
					"consumeTime");
			return (Criteria) this;
		}

		public Criteria andEnterpriseIdIsNull() {
			addCriterion("enterprise_id is null");
			return (Criteria) this;
		}

		public Criteria andEnterpriseIdIsNotNull() {
			addCriterion("enterprise_id is not null");
			return (Criteria) this;
		}

		public Criteria andEnterpriseIdEqualTo(String value) {
			addCriterion("enterprise_id =", value, "enterpriseId");
			return (Criteria) this;
		}

		public Criteria andEnterpriseIdNotEqualTo(String value) {
			addCriterion("enterprise_id <>", value, "enterpriseId");
			return (Criteria) this;
		}

		public Criteria andEnterpriseIdGreaterThan(String value) {
			addCriterion("enterprise_id >", value, "enterpriseId");
			return (Criteria) this;
		}

		public Criteria andEnterpriseIdGreaterThanOrEqualTo(String value) {
			addCriterion("enterprise_id >=", value, "enterpriseId");
			return (Criteria) this;
		}

		public Criteria andEnterpriseIdLessThan(String value) {
			addCriterion("enterprise_id <", value, "enterpriseId");
			return (Criteria) this;
		}

		public Criteria andEnterpriseIdLessThanOrEqualTo(String value) {
			addCriterion("enterprise_id <=", value, "enterpriseId");
			return (Criteria) this;
		}

		public Criteria andEnterpriseIdLike(String value) {
			addCriterion("enterprise_id like", value, "enterpriseId");
			return (Criteria) this;
		}

		public Criteria andEnterpriseIdNotLike(String value) {
			addCriterion("enterprise_id not like", value, "enterpriseId");
			return (Criteria) this;
		}

		public Criteria andEnterpriseIdIn(List<String> values) {
			addCriterion("enterprise_id in", values, "enterpriseId");
			return (Criteria) this;
		}

		public Criteria andEnterpriseIdNotIn(List<String> values) {
			addCriterion("enterprise_id not in", values, "enterpriseId");
			return (Criteria) this;
		}

		public Criteria andEnterpriseIdBetween(String value1, String value2) {
			addCriterion("enterprise_id between", value1, value2,
					"enterpriseId");
			return (Criteria) this;
		}

		public Criteria andEnterpriseIdNotBetween(String value1, String value2) {
			addCriterion("enterprise_id not between", value1, value2,
					"enterpriseId");
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

		public Criteria andCurrentIsNull() {
			addCriterion("current is null");
			return (Criteria) this;
		}

		public Criteria andCurrentIsNotNull() {
			addCriterion("current is not null");
			return (Criteria) this;
		}

		public Criteria andCurrentEqualTo(Double value) {
			addCriterion("current =", value, "current");
			return (Criteria) this;
		}

		public Criteria andCurrentNotEqualTo(Double value) {
			addCriterion("current <>", value, "current");
			return (Criteria) this;
		}

		public Criteria andCurrentGreaterThan(Double value) {
			addCriterion("current >", value, "current");
			return (Criteria) this;
		}

		public Criteria andCurrentGreaterThanOrEqualTo(Double value) {
			addCriterion("current >=", value, "current");
			return (Criteria) this;
		}

		public Criteria andCurrentLessThan(Double value) {
			addCriterion("current <", value, "current");
			return (Criteria) this;
		}

		public Criteria andCurrentLessThanOrEqualTo(Double value) {
			addCriterion("current <=", value, "current");
			return (Criteria) this;
		}

		public Criteria andCurrentIn(List<Double> values) {
			addCriterion("current in", values, "current");
			return (Criteria) this;
		}

		public Criteria andCurrentNotIn(List<Double> values) {
			addCriterion("current not in", values, "current");
			return (Criteria) this;
		}

		public Criteria andCurrentBetween(Double value1, Double value2) {
			addCriterion("current between", value1, value2, "current");
			return (Criteria) this;
		}

		public Criteria andCurrentNotBetween(Double value1, Double value2) {
			addCriterion("current not between", value1, value2, "current");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table consume_record
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
     * This class corresponds to the database table consume_record
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}