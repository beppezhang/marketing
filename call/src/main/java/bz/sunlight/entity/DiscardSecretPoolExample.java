package bz.sunlight.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DiscardSecretPoolExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table discard_secret_pool
	 * @mbggenerated
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table discard_secret_pool
	 * @mbggenerated
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table discard_secret_pool
	 * @mbggenerated
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table discard_secret_pool
	 * @mbggenerated
	 */
	public DiscardSecretPoolExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table discard_secret_pool
	 * @mbggenerated
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table discard_secret_pool
	 * @mbggenerated
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table discard_secret_pool
	 * @mbggenerated
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table discard_secret_pool
	 * @mbggenerated
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table discard_secret_pool
	 * @mbggenerated
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table discard_secret_pool
	 * @mbggenerated
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table discard_secret_pool
	 * @mbggenerated
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table discard_secret_pool
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table discard_secret_pool
	 * @mbggenerated
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table discard_secret_pool
	 * @mbggenerated
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table discard_secret_pool
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

		public Criteria andAdIsNull() {
			addCriterion("ad is null");
			return (Criteria) this;
		}

		public Criteria andAdIsNotNull() {
			addCriterion("ad is not null");
			return (Criteria) this;
		}

		public Criteria andAdEqualTo(String value) {
			addCriterion("ad =", value, "ad");
			return (Criteria) this;
		}

		public Criteria andAdNotEqualTo(String value) {
			addCriterion("ad <>", value, "ad");
			return (Criteria) this;
		}

		public Criteria andAdGreaterThan(String value) {
			addCriterion("ad >", value, "ad");
			return (Criteria) this;
		}

		public Criteria andAdGreaterThanOrEqualTo(String value) {
			addCriterion("ad >=", value, "ad");
			return (Criteria) this;
		}

		public Criteria andAdLessThan(String value) {
			addCriterion("ad <", value, "ad");
			return (Criteria) this;
		}

		public Criteria andAdLessThanOrEqualTo(String value) {
			addCriterion("ad <=", value, "ad");
			return (Criteria) this;
		}

		public Criteria andAdLike(String value) {
			addCriterion("ad like", value, "ad");
			return (Criteria) this;
		}

		public Criteria andAdNotLike(String value) {
			addCriterion("ad not like", value, "ad");
			return (Criteria) this;
		}

		public Criteria andAdIn(List<String> values) {
			addCriterion("ad in", values, "ad");
			return (Criteria) this;
		}

		public Criteria andAdNotIn(List<String> values) {
			addCriterion("ad not in", values, "ad");
			return (Criteria) this;
		}

		public Criteria andAdBetween(String value1, String value2) {
			addCriterion("ad between", value1, value2, "ad");
			return (Criteria) this;
		}

		public Criteria andAdNotBetween(String value1, String value2) {
			addCriterion("ad not between", value1, value2, "ad");
			return (Criteria) this;
		}

		public Criteria andDiscardTimeIsNull() {
			addCriterion("discard_time is null");
			return (Criteria) this;
		}

		public Criteria andDiscardTimeIsNotNull() {
			addCriterion("discard_time is not null");
			return (Criteria) this;
		}

		public Criteria andDiscardTimeEqualTo(Date value) {
			addCriterion("discard_time =", value, "discardTime");
			return (Criteria) this;
		}

		public Criteria andDiscardTimeNotEqualTo(Date value) {
			addCriterion("discard_time <>", value, "discardTime");
			return (Criteria) this;
		}

		public Criteria andDiscardTimeGreaterThan(Date value) {
			addCriterion("discard_time >", value, "discardTime");
			return (Criteria) this;
		}

		public Criteria andDiscardTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("discard_time >=", value, "discardTime");
			return (Criteria) this;
		}

		public Criteria andDiscardTimeLessThan(Date value) {
			addCriterion("discard_time <", value, "discardTime");
			return (Criteria) this;
		}

		public Criteria andDiscardTimeLessThanOrEqualTo(Date value) {
			addCriterion("discard_time <=", value, "discardTime");
			return (Criteria) this;
		}

		public Criteria andDiscardTimeIn(List<Date> values) {
			addCriterion("discard_time in", values, "discardTime");
			return (Criteria) this;
		}

		public Criteria andDiscardTimeNotIn(List<Date> values) {
			addCriterion("discard_time not in", values, "discardTime");
			return (Criteria) this;
		}

		public Criteria andDiscardTimeBetween(Date value1, Date value2) {
			addCriterion("discard_time between", value1, value2, "discardTime");
			return (Criteria) this;
		}

		public Criteria andDiscardTimeNotBetween(Date value1, Date value2) {
			addCriterion("discard_time not between", value1, value2,
					"discardTime");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table discard_secret_pool
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
     * This class corresponds to the database table discard_secret_pool
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}