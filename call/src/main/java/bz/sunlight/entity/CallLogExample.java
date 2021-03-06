package bz.sunlight.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CallLogExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table call_log
	 * @mbggenerated
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table call_log
	 * @mbggenerated
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table call_log
	 * @mbggenerated
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table call_log
	 * @mbggenerated
	 */
	public CallLogExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table call_log
	 * @mbggenerated
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table call_log
	 * @mbggenerated
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table call_log
	 * @mbggenerated
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table call_log
	 * @mbggenerated
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table call_log
	 * @mbggenerated
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table call_log
	 * @mbggenerated
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table call_log
	 * @mbggenerated
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table call_log
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table call_log
	 * @mbggenerated
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table call_log
	 * @mbggenerated
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table call_log
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

		public Criteria andSessionIdIsNull() {
			addCriterion("session_id is null");
			return (Criteria) this;
		}

		public Criteria andSessionIdIsNotNull() {
			addCriterion("session_id is not null");
			return (Criteria) this;
		}

		public Criteria andSessionIdEqualTo(String value) {
			addCriterion("session_id =", value, "sessionId");
			return (Criteria) this;
		}

		public Criteria andSessionIdNotEqualTo(String value) {
			addCriterion("session_id <>", value, "sessionId");
			return (Criteria) this;
		}

		public Criteria andSessionIdGreaterThan(String value) {
			addCriterion("session_id >", value, "sessionId");
			return (Criteria) this;
		}

		public Criteria andSessionIdGreaterThanOrEqualTo(String value) {
			addCriterion("session_id >=", value, "sessionId");
			return (Criteria) this;
		}

		public Criteria andSessionIdLessThan(String value) {
			addCriterion("session_id <", value, "sessionId");
			return (Criteria) this;
		}

		public Criteria andSessionIdLessThanOrEqualTo(String value) {
			addCriterion("session_id <=", value, "sessionId");
			return (Criteria) this;
		}

		public Criteria andSessionIdLike(String value) {
			addCriterion("session_id like", value, "sessionId");
			return (Criteria) this;
		}

		public Criteria andSessionIdNotLike(String value) {
			addCriterion("session_id not like", value, "sessionId");
			return (Criteria) this;
		}

		public Criteria andSessionIdIn(List<String> values) {
			addCriterion("session_id in", values, "sessionId");
			return (Criteria) this;
		}

		public Criteria andSessionIdNotIn(List<String> values) {
			addCriterion("session_id not in", values, "sessionId");
			return (Criteria) this;
		}

		public Criteria andSessionIdBetween(String value1, String value2) {
			addCriterion("session_id between", value1, value2, "sessionId");
			return (Criteria) this;
		}

		public Criteria andSessionIdNotBetween(String value1, String value2) {
			addCriterion("session_id not between", value1, value2, "sessionId");
			return (Criteria) this;
		}

		public Criteria andCallTimeIsNull() {
			addCriterion("call_time is null");
			return (Criteria) this;
		}

		public Criteria andCallTimeIsNotNull() {
			addCriterion("call_time is not null");
			return (Criteria) this;
		}

		public Criteria andCallTimeEqualTo(Date value) {
			addCriterion("call_time =", value, "callTime");
			return (Criteria) this;
		}

		public Criteria andCallTimeNotEqualTo(Date value) {
			addCriterion("call_time <>", value, "callTime");
			return (Criteria) this;
		}

		public Criteria andCallTimeGreaterThan(Date value) {
			addCriterion("call_time >", value, "callTime");
			return (Criteria) this;
		}

		public Criteria andCallTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("call_time >=", value, "callTime");
			return (Criteria) this;
		}

		public Criteria andCallTimeLessThan(Date value) {
			addCriterion("call_time <", value, "callTime");
			return (Criteria) this;
		}

		public Criteria andCallTimeLessThanOrEqualTo(Date value) {
			addCriterion("call_time <=", value, "callTime");
			return (Criteria) this;
		}

		public Criteria andCallTimeIn(List<Date> values) {
			addCriterion("call_time in", values, "callTime");
			return (Criteria) this;
		}

		public Criteria andCallTimeNotIn(List<Date> values) {
			addCriterion("call_time not in", values, "callTime");
			return (Criteria) this;
		}

		public Criteria andCallTimeBetween(Date value1, Date value2) {
			addCriterion("call_time between", value1, value2, "callTime");
			return (Criteria) this;
		}

		public Criteria andCallTimeNotBetween(Date value1, Date value2) {
			addCriterion("call_time not between", value1, value2, "callTime");
			return (Criteria) this;
		}

		public Criteria andConnectTimeIsNull() {
			addCriterion("connect_time is null");
			return (Criteria) this;
		}

		public Criteria andConnectTimeIsNotNull() {
			addCriterion("connect_time is not null");
			return (Criteria) this;
		}

		public Criteria andConnectTimeEqualTo(Date value) {
			addCriterion("connect_time =", value, "connectTime");
			return (Criteria) this;
		}

		public Criteria andConnectTimeNotEqualTo(Date value) {
			addCriterion("connect_time <>", value, "connectTime");
			return (Criteria) this;
		}

		public Criteria andConnectTimeGreaterThan(Date value) {
			addCriterion("connect_time >", value, "connectTime");
			return (Criteria) this;
		}

		public Criteria andConnectTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("connect_time >=", value, "connectTime");
			return (Criteria) this;
		}

		public Criteria andConnectTimeLessThan(Date value) {
			addCriterion("connect_time <", value, "connectTime");
			return (Criteria) this;
		}

		public Criteria andConnectTimeLessThanOrEqualTo(Date value) {
			addCriterion("connect_time <=", value, "connectTime");
			return (Criteria) this;
		}

		public Criteria andConnectTimeIn(List<Date> values) {
			addCriterion("connect_time in", values, "connectTime");
			return (Criteria) this;
		}

		public Criteria andConnectTimeNotIn(List<Date> values) {
			addCriterion("connect_time not in", values, "connectTime");
			return (Criteria) this;
		}

		public Criteria andConnectTimeBetween(Date value1, Date value2) {
			addCriterion("connect_time between", value1, value2, "connectTime");
			return (Criteria) this;
		}

		public Criteria andConnectTimeNotBetween(Date value1, Date value2) {
			addCriterion("connect_time not between", value1, value2,
					"connectTime");
			return (Criteria) this;
		}

		public Criteria andHangUpTimeIsNull() {
			addCriterion("hang_up_time is null");
			return (Criteria) this;
		}

		public Criteria andHangUpTimeIsNotNull() {
			addCriterion("hang_up_time is not null");
			return (Criteria) this;
		}

		public Criteria andHangUpTimeEqualTo(Date value) {
			addCriterion("hang_up_time =", value, "hangUpTime");
			return (Criteria) this;
		}

		public Criteria andHangUpTimeNotEqualTo(Date value) {
			addCriterion("hang_up_time <>", value, "hangUpTime");
			return (Criteria) this;
		}

		public Criteria andHangUpTimeGreaterThan(Date value) {
			addCriterion("hang_up_time >", value, "hangUpTime");
			return (Criteria) this;
		}

		public Criteria andHangUpTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("hang_up_time >=", value, "hangUpTime");
			return (Criteria) this;
		}

		public Criteria andHangUpTimeLessThan(Date value) {
			addCriterion("hang_up_time <", value, "hangUpTime");
			return (Criteria) this;
		}

		public Criteria andHangUpTimeLessThanOrEqualTo(Date value) {
			addCriterion("hang_up_time <=", value, "hangUpTime");
			return (Criteria) this;
		}

		public Criteria andHangUpTimeIn(List<Date> values) {
			addCriterion("hang_up_time in", values, "hangUpTime");
			return (Criteria) this;
		}

		public Criteria andHangUpTimeNotIn(List<Date> values) {
			addCriterion("hang_up_time not in", values, "hangUpTime");
			return (Criteria) this;
		}

		public Criteria andHangUpTimeBetween(Date value1, Date value2) {
			addCriterion("hang_up_time between", value1, value2, "hangUpTime");
			return (Criteria) this;
		}

		public Criteria andHangUpTimeNotBetween(Date value1, Date value2) {
			addCriterion("hang_up_time not between", value1, value2,
					"hangUpTime");
			return (Criteria) this;
		}

		public Criteria andCallStatusIsNull() {
			addCriterion("call_status is null");
			return (Criteria) this;
		}

		public Criteria andCallStatusIsNotNull() {
			addCriterion("call_status is not null");
			return (Criteria) this;
		}

		public Criteria andCallStatusEqualTo(Short value) {
			addCriterion("call_status =", value, "callStatus");
			return (Criteria) this;
		}

		public Criteria andCallStatusNotEqualTo(Short value) {
			addCriterion("call_status <>", value, "callStatus");
			return (Criteria) this;
		}

		public Criteria andCallStatusGreaterThan(Short value) {
			addCriterion("call_status >", value, "callStatus");
			return (Criteria) this;
		}

		public Criteria andCallStatusGreaterThanOrEqualTo(Short value) {
			addCriterion("call_status >=", value, "callStatus");
			return (Criteria) this;
		}

		public Criteria andCallStatusLessThan(Short value) {
			addCriterion("call_status <", value, "callStatus");
			return (Criteria) this;
		}

		public Criteria andCallStatusLessThanOrEqualTo(Short value) {
			addCriterion("call_status <=", value, "callStatus");
			return (Criteria) this;
		}

		public Criteria andCallStatusIn(List<Short> values) {
			addCriterion("call_status in", values, "callStatus");
			return (Criteria) this;
		}

		public Criteria andCallStatusNotIn(List<Short> values) {
			addCriterion("call_status not in", values, "callStatus");
			return (Criteria) this;
		}

		public Criteria andCallStatusBetween(Short value1, Short value2) {
			addCriterion("call_status between", value1, value2, "callStatus");
			return (Criteria) this;
		}

		public Criteria andCallStatusNotBetween(Short value1, Short value2) {
			addCriterion("call_status not between", value1, value2,
					"callStatus");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table call_log
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
     * This class corresponds to the database table call_log
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}