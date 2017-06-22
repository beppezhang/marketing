package bz.sunlight.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class UserInfoExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table user_info
	 * @mbggenerated
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table user_info
	 * @mbggenerated
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table user_info
	 * @mbggenerated
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_info
	 * @mbggenerated
	 */
	public UserInfoExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_info
	 * @mbggenerated
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_info
	 * @mbggenerated
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_info
	 * @mbggenerated
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_info
	 * @mbggenerated
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_info
	 * @mbggenerated
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_info
	 * @mbggenerated
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_info
	 * @mbggenerated
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_info
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_info
	 * @mbggenerated
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_info
	 * @mbggenerated
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table user_info
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

		public Criteria andGenderIsNull() {
			addCriterion("gender is null");
			return (Criteria) this;
		}

		public Criteria andGenderIsNotNull() {
			addCriterion("gender is not null");
			return (Criteria) this;
		}

		public Criteria andGenderEqualTo(Short value) {
			addCriterion("gender =", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderNotEqualTo(Short value) {
			addCriterion("gender <>", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderGreaterThan(Short value) {
			addCriterion("gender >", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderGreaterThanOrEqualTo(Short value) {
			addCriterion("gender >=", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderLessThan(Short value) {
			addCriterion("gender <", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderLessThanOrEqualTo(Short value) {
			addCriterion("gender <=", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderIn(List<Short> values) {
			addCriterion("gender in", values, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderNotIn(List<Short> values) {
			addCriterion("gender not in", values, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderBetween(Short value1, Short value2) {
			addCriterion("gender between", value1, value2, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderNotBetween(Short value1, Short value2) {
			addCriterion("gender not between", value1, value2, "gender");
			return (Criteria) this;
		}

		public Criteria andJobNumberIsNull() {
			addCriterion("job_number is null");
			return (Criteria) this;
		}

		public Criteria andJobNumberIsNotNull() {
			addCriterion("job_number is not null");
			return (Criteria) this;
		}

		public Criteria andJobNumberEqualTo(String value) {
			addCriterion("job_number =", value, "jobNumber");
			return (Criteria) this;
		}

		public Criteria andJobNumberNotEqualTo(String value) {
			addCriterion("job_number <>", value, "jobNumber");
			return (Criteria) this;
		}

		public Criteria andJobNumberGreaterThan(String value) {
			addCriterion("job_number >", value, "jobNumber");
			return (Criteria) this;
		}

		public Criteria andJobNumberGreaterThanOrEqualTo(String value) {
			addCriterion("job_number >=", value, "jobNumber");
			return (Criteria) this;
		}

		public Criteria andJobNumberLessThan(String value) {
			addCriterion("job_number <", value, "jobNumber");
			return (Criteria) this;
		}

		public Criteria andJobNumberLessThanOrEqualTo(String value) {
			addCriterion("job_number <=", value, "jobNumber");
			return (Criteria) this;
		}

		public Criteria andJobNumberLike(String value) {
			addCriterion("job_number like", value, "jobNumber");
			return (Criteria) this;
		}

		public Criteria andJobNumberNotLike(String value) {
			addCriterion("job_number not like", value, "jobNumber");
			return (Criteria) this;
		}

		public Criteria andJobNumberIn(List<String> values) {
			addCriterion("job_number in", values, "jobNumber");
			return (Criteria) this;
		}

		public Criteria andJobNumberNotIn(List<String> values) {
			addCriterion("job_number not in", values, "jobNumber");
			return (Criteria) this;
		}

		public Criteria andJobNumberBetween(String value1, String value2) {
			addCriterion("job_number between", value1, value2, "jobNumber");
			return (Criteria) this;
		}

		public Criteria andJobNumberNotBetween(String value1, String value2) {
			addCriterion("job_number not between", value1, value2, "jobNumber");
			return (Criteria) this;
		}

		public Criteria andPositionIsNull() {
			addCriterion("position is null");
			return (Criteria) this;
		}

		public Criteria andPositionIsNotNull() {
			addCriterion("position is not null");
			return (Criteria) this;
		}

		public Criteria andPositionEqualTo(Short value) {
			addCriterion("position =", value, "position");
			return (Criteria) this;
		}

		public Criteria andPositionNotEqualTo(Short value) {
			addCriterion("position <>", value, "position");
			return (Criteria) this;
		}

		public Criteria andPositionGreaterThan(Short value) {
			addCriterion("position >", value, "position");
			return (Criteria) this;
		}

		public Criteria andPositionGreaterThanOrEqualTo(Short value) {
			addCriterion("position >=", value, "position");
			return (Criteria) this;
		}

		public Criteria andPositionLessThan(Short value) {
			addCriterion("position <", value, "position");
			return (Criteria) this;
		}

		public Criteria andPositionLessThanOrEqualTo(Short value) {
			addCriterion("position <=", value, "position");
			return (Criteria) this;
		}

		public Criteria andPositionIn(List<Short> values) {
			addCriterion("position in", values, "position");
			return (Criteria) this;
		}

		public Criteria andPositionNotIn(List<Short> values) {
			addCriterion("position not in", values, "position");
			return (Criteria) this;
		}

		public Criteria andPositionBetween(Short value1, Short value2) {
			addCriterion("position between", value1, value2, "position");
			return (Criteria) this;
		}

		public Criteria andPositionNotBetween(Short value1, Short value2) {
			addCriterion("position not between", value1, value2, "position");
			return (Criteria) this;
		}

		public Criteria andMobileIsNull() {
			addCriterion("mobile is null");
			return (Criteria) this;
		}

		public Criteria andMobileIsNotNull() {
			addCriterion("mobile is not null");
			return (Criteria) this;
		}

		public Criteria andMobileEqualTo(String value) {
			addCriterion("mobile =", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileNotEqualTo(String value) {
			addCriterion("mobile <>", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileGreaterThan(String value) {
			addCriterion("mobile >", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileGreaterThanOrEqualTo(String value) {
			addCriterion("mobile >=", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileLessThan(String value) {
			addCriterion("mobile <", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileLessThanOrEqualTo(String value) {
			addCriterion("mobile <=", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileLike(String value) {
			addCriterion("mobile like", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileNotLike(String value) {
			addCriterion("mobile not like", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileIn(List<String> values) {
			addCriterion("mobile in", values, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileNotIn(List<String> values) {
			addCriterion("mobile not in", values, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileBetween(String value1, String value2) {
			addCriterion("mobile between", value1, value2, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileNotBetween(String value1, String value2) {
			addCriterion("mobile not between", value1, value2, "mobile");
			return (Criteria) this;
		}

		public Criteria andCallerMobileIsNull() {
			addCriterion("caller_mobile is null");
			return (Criteria) this;
		}

		public Criteria andCallerMobileIsNotNull() {
			addCriterion("caller_mobile is not null");
			return (Criteria) this;
		}

		public Criteria andCallerMobileEqualTo(String value) {
			addCriterion("caller_mobile =", value, "callerMobile");
			return (Criteria) this;
		}

		public Criteria andCallerMobileNotEqualTo(String value) {
			addCriterion("caller_mobile <>", value, "callerMobile");
			return (Criteria) this;
		}

		public Criteria andCallerMobileGreaterThan(String value) {
			addCriterion("caller_mobile >", value, "callerMobile");
			return (Criteria) this;
		}

		public Criteria andCallerMobileGreaterThanOrEqualTo(String value) {
			addCriterion("caller_mobile >=", value, "callerMobile");
			return (Criteria) this;
		}

		public Criteria andCallerMobileLessThan(String value) {
			addCriterion("caller_mobile <", value, "callerMobile");
			return (Criteria) this;
		}

		public Criteria andCallerMobileLessThanOrEqualTo(String value) {
			addCriterion("caller_mobile <=", value, "callerMobile");
			return (Criteria) this;
		}

		public Criteria andCallerMobileLike(String value) {
			addCriterion("caller_mobile like", value, "callerMobile");
			return (Criteria) this;
		}

		public Criteria andCallerMobileNotLike(String value) {
			addCriterion("caller_mobile not like", value, "callerMobile");
			return (Criteria) this;
		}

		public Criteria andCallerMobileIn(List<String> values) {
			addCriterion("caller_mobile in", values, "callerMobile");
			return (Criteria) this;
		}

		public Criteria andCallerMobileNotIn(List<String> values) {
			addCriterion("caller_mobile not in", values, "callerMobile");
			return (Criteria) this;
		}

		public Criteria andCallerMobileBetween(String value1, String value2) {
			addCriterion("caller_mobile between", value1, value2,
					"callerMobile");
			return (Criteria) this;
		}

		public Criteria andCallerMobileNotBetween(String value1, String value2) {
			addCriterion("caller_mobile not between", value1, value2,
					"callerMobile");
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
			addCriterion("create_time not between", value1, value2,
					"createTime");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table user_info
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
     * This class corresponds to the database table user_info
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}