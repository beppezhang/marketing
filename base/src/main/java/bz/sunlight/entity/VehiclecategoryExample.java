package bz.sunlight.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VehiclecategoryExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table vehiclecategory
	 * @mbggenerated
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table vehiclecategory
	 * @mbggenerated
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table vehiclecategory
	 * @mbggenerated
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table vehiclecategory
	 * @mbggenerated
	 */
	public VehiclecategoryExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table vehiclecategory
	 * @mbggenerated
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table vehiclecategory
	 * @mbggenerated
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table vehiclecategory
	 * @mbggenerated
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table vehiclecategory
	 * @mbggenerated
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table vehiclecategory
	 * @mbggenerated
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table vehiclecategory
	 * @mbggenerated
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table vehiclecategory
	 * @mbggenerated
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table vehiclecategory
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table vehiclecategory
	 * @mbggenerated
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table vehiclecategory
	 * @mbggenerated
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table vehiclecategory
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

		public Criteria andBrandIdIsNull() {
			addCriterion("brand_id is null");
			return (Criteria) this;
		}

		public Criteria andBrandIdIsNotNull() {
			addCriterion("brand_id is not null");
			return (Criteria) this;
		}

		public Criteria andBrandIdEqualTo(String value) {
			addCriterion("brand_id =", value, "brandId");
			return (Criteria) this;
		}

		public Criteria andBrandIdNotEqualTo(String value) {
			addCriterion("brand_id <>", value, "brandId");
			return (Criteria) this;
		}

		public Criteria andBrandIdGreaterThan(String value) {
			addCriterion("brand_id >", value, "brandId");
			return (Criteria) this;
		}

		public Criteria andBrandIdGreaterThanOrEqualTo(String value) {
			addCriterion("brand_id >=", value, "brandId");
			return (Criteria) this;
		}

		public Criteria andBrandIdLessThan(String value) {
			addCriterion("brand_id <", value, "brandId");
			return (Criteria) this;
		}

		public Criteria andBrandIdLessThanOrEqualTo(String value) {
			addCriterion("brand_id <=", value, "brandId");
			return (Criteria) this;
		}

		public Criteria andBrandIdLike(String value) {
			addCriterion("brand_id like", value, "brandId");
			return (Criteria) this;
		}

		public Criteria andBrandIdNotLike(String value) {
			addCriterion("brand_id not like", value, "brandId");
			return (Criteria) this;
		}

		public Criteria andBrandIdIn(List<String> values) {
			addCriterion("brand_id in", values, "brandId");
			return (Criteria) this;
		}

		public Criteria andBrandIdNotIn(List<String> values) {
			addCriterion("brand_id not in", values, "brandId");
			return (Criteria) this;
		}

		public Criteria andBrandIdBetween(String value1, String value2) {
			addCriterion("brand_id between", value1, value2, "brandId");
			return (Criteria) this;
		}

		public Criteria andBrandIdNotBetween(String value1, String value2) {
			addCriterion("brand_id not between", value1, value2, "brandId");
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

		public Criteria andPinyinIsNull() {
			addCriterion("pinyin is null");
			return (Criteria) this;
		}

		public Criteria andPinyinIsNotNull() {
			addCriterion("pinyin is not null");
			return (Criteria) this;
		}

		public Criteria andPinyinEqualTo(String value) {
			addCriterion("pinyin =", value, "pinyin");
			return (Criteria) this;
		}

		public Criteria andPinyinNotEqualTo(String value) {
			addCriterion("pinyin <>", value, "pinyin");
			return (Criteria) this;
		}

		public Criteria andPinyinGreaterThan(String value) {
			addCriterion("pinyin >", value, "pinyin");
			return (Criteria) this;
		}

		public Criteria andPinyinGreaterThanOrEqualTo(String value) {
			addCriterion("pinyin >=", value, "pinyin");
			return (Criteria) this;
		}

		public Criteria andPinyinLessThan(String value) {
			addCriterion("pinyin <", value, "pinyin");
			return (Criteria) this;
		}

		public Criteria andPinyinLessThanOrEqualTo(String value) {
			addCriterion("pinyin <=", value, "pinyin");
			return (Criteria) this;
		}

		public Criteria andPinyinLike(String value) {
			addCriterion("pinyin like", value, "pinyin");
			return (Criteria) this;
		}

		public Criteria andPinyinNotLike(String value) {
			addCriterion("pinyin not like", value, "pinyin");
			return (Criteria) this;
		}

		public Criteria andPinyinIn(List<String> values) {
			addCriterion("pinyin in", values, "pinyin");
			return (Criteria) this;
		}

		public Criteria andPinyinNotIn(List<String> values) {
			addCriterion("pinyin not in", values, "pinyin");
			return (Criteria) this;
		}

		public Criteria andPinyinBetween(String value1, String value2) {
			addCriterion("pinyin between", value1, value2, "pinyin");
			return (Criteria) this;
		}

		public Criteria andPinyinNotBetween(String value1, String value2) {
			addCriterion("pinyin not between", value1, value2, "pinyin");
			return (Criteria) this;
		}

		public Criteria andManufacturerCodeIsNull() {
			addCriterion("manufacturer_code is null");
			return (Criteria) this;
		}

		public Criteria andManufacturerCodeIsNotNull() {
			addCriterion("manufacturer_code is not null");
			return (Criteria) this;
		}

		public Criteria andManufacturerCodeEqualTo(String value) {
			addCriterion("manufacturer_code =", value, "manufacturerCode");
			return (Criteria) this;
		}

		public Criteria andManufacturerCodeNotEqualTo(String value) {
			addCriterion("manufacturer_code <>", value, "manufacturerCode");
			return (Criteria) this;
		}

		public Criteria andManufacturerCodeGreaterThan(String value) {
			addCriterion("manufacturer_code >", value, "manufacturerCode");
			return (Criteria) this;
		}

		public Criteria andManufacturerCodeGreaterThanOrEqualTo(String value) {
			addCriterion("manufacturer_code >=", value, "manufacturerCode");
			return (Criteria) this;
		}

		public Criteria andManufacturerCodeLessThan(String value) {
			addCriterion("manufacturer_code <", value, "manufacturerCode");
			return (Criteria) this;
		}

		public Criteria andManufacturerCodeLessThanOrEqualTo(String value) {
			addCriterion("manufacturer_code <=", value, "manufacturerCode");
			return (Criteria) this;
		}

		public Criteria andManufacturerCodeLike(String value) {
			addCriterion("manufacturer_code like", value, "manufacturerCode");
			return (Criteria) this;
		}

		public Criteria andManufacturerCodeNotLike(String value) {
			addCriterion("manufacturer_code not like", value,
					"manufacturerCode");
			return (Criteria) this;
		}

		public Criteria andManufacturerCodeIn(List<String> values) {
			addCriterion("manufacturer_code in", values, "manufacturerCode");
			return (Criteria) this;
		}

		public Criteria andManufacturerCodeNotIn(List<String> values) {
			addCriterion("manufacturer_code not in", values, "manufacturerCode");
			return (Criteria) this;
		}

		public Criteria andManufacturerCodeBetween(String value1, String value2) {
			addCriterion("manufacturer_code between", value1, value2,
					"manufacturerCode");
			return (Criteria) this;
		}

		public Criteria andManufacturerCodeNotBetween(String value1,
				String value2) {
			addCriterion("manufacturer_code not between", value1, value2,
					"manufacturerCode");
			return (Criteria) this;
		}

		public Criteria andManufacturerNameIsNull() {
			addCriterion("manufacturer_name is null");
			return (Criteria) this;
		}

		public Criteria andManufacturerNameIsNotNull() {
			addCriterion("manufacturer_name is not null");
			return (Criteria) this;
		}

		public Criteria andManufacturerNameEqualTo(String value) {
			addCriterion("manufacturer_name =", value, "manufacturerName");
			return (Criteria) this;
		}

		public Criteria andManufacturerNameNotEqualTo(String value) {
			addCriterion("manufacturer_name <>", value, "manufacturerName");
			return (Criteria) this;
		}

		public Criteria andManufacturerNameGreaterThan(String value) {
			addCriterion("manufacturer_name >", value, "manufacturerName");
			return (Criteria) this;
		}

		public Criteria andManufacturerNameGreaterThanOrEqualTo(String value) {
			addCriterion("manufacturer_name >=", value, "manufacturerName");
			return (Criteria) this;
		}

		public Criteria andManufacturerNameLessThan(String value) {
			addCriterion("manufacturer_name <", value, "manufacturerName");
			return (Criteria) this;
		}

		public Criteria andManufacturerNameLessThanOrEqualTo(String value) {
			addCriterion("manufacturer_name <=", value, "manufacturerName");
			return (Criteria) this;
		}

		public Criteria andManufacturerNameLike(String value) {
			addCriterion("manufacturer_name like", value, "manufacturerName");
			return (Criteria) this;
		}

		public Criteria andManufacturerNameNotLike(String value) {
			addCriterion("manufacturer_name not like", value,
					"manufacturerName");
			return (Criteria) this;
		}

		public Criteria andManufacturerNameIn(List<String> values) {
			addCriterion("manufacturer_name in", values, "manufacturerName");
			return (Criteria) this;
		}

		public Criteria andManufacturerNameNotIn(List<String> values) {
			addCriterion("manufacturer_name not in", values, "manufacturerName");
			return (Criteria) this;
		}

		public Criteria andManufacturerNameBetween(String value1, String value2) {
			addCriterion("manufacturer_name between", value1, value2,
					"manufacturerName");
			return (Criteria) this;
		}

		public Criteria andManufacturerNameNotBetween(String value1,
				String value2) {
			addCriterion("manufacturer_name not between", value1, value2,
					"manufacturerName");
			return (Criteria) this;
		}

		public Criteria andGuidePriceIsNull() {
			addCriterion("guide_price is null");
			return (Criteria) this;
		}

		public Criteria andGuidePriceIsNotNull() {
			addCriterion("guide_price is not null");
			return (Criteria) this;
		}

		public Criteria andGuidePriceEqualTo(String value) {
			addCriterion("guide_price =", value, "guidePrice");
			return (Criteria) this;
		}

		public Criteria andGuidePriceNotEqualTo(String value) {
			addCriterion("guide_price <>", value, "guidePrice");
			return (Criteria) this;
		}

		public Criteria andGuidePriceGreaterThan(String value) {
			addCriterion("guide_price >", value, "guidePrice");
			return (Criteria) this;
		}

		public Criteria andGuidePriceGreaterThanOrEqualTo(String value) {
			addCriterion("guide_price >=", value, "guidePrice");
			return (Criteria) this;
		}

		public Criteria andGuidePriceLessThan(String value) {
			addCriterion("guide_price <", value, "guidePrice");
			return (Criteria) this;
		}

		public Criteria andGuidePriceLessThanOrEqualTo(String value) {
			addCriterion("guide_price <=", value, "guidePrice");
			return (Criteria) this;
		}

		public Criteria andGuidePriceLike(String value) {
			addCriterion("guide_price like", value, "guidePrice");
			return (Criteria) this;
		}

		public Criteria andGuidePriceNotLike(String value) {
			addCriterion("guide_price not like", value, "guidePrice");
			return (Criteria) this;
		}

		public Criteria andGuidePriceIn(List<String> values) {
			addCriterion("guide_price in", values, "guidePrice");
			return (Criteria) this;
		}

		public Criteria andGuidePriceNotIn(List<String> values) {
			addCriterion("guide_price not in", values, "guidePrice");
			return (Criteria) this;
		}

		public Criteria andGuidePriceBetween(String value1, String value2) {
			addCriterion("guide_price between", value1, value2, "guidePrice");
			return (Criteria) this;
		}

		public Criteria andGuidePriceNotBetween(String value1, String value2) {
			addCriterion("guide_price not between", value1, value2,
					"guidePrice");
			return (Criteria) this;
		}

		public Criteria andGuidePriceStartIsNull() {
			addCriterion("guide_price_start is null");
			return (Criteria) this;
		}

		public Criteria andGuidePriceStartIsNotNull() {
			addCriterion("guide_price_start is not null");
			return (Criteria) this;
		}

		public Criteria andGuidePriceStartEqualTo(Double value) {
			addCriterion("guide_price_start =", value, "guidePriceStart");
			return (Criteria) this;
		}

		public Criteria andGuidePriceStartNotEqualTo(Double value) {
			addCriterion("guide_price_start <>", value, "guidePriceStart");
			return (Criteria) this;
		}

		public Criteria andGuidePriceStartGreaterThan(Double value) {
			addCriterion("guide_price_start >", value, "guidePriceStart");
			return (Criteria) this;
		}

		public Criteria andGuidePriceStartGreaterThanOrEqualTo(Double value) {
			addCriterion("guide_price_start >=", value, "guidePriceStart");
			return (Criteria) this;
		}

		public Criteria andGuidePriceStartLessThan(Double value) {
			addCriterion("guide_price_start <", value, "guidePriceStart");
			return (Criteria) this;
		}

		public Criteria andGuidePriceStartLessThanOrEqualTo(Double value) {
			addCriterion("guide_price_start <=", value, "guidePriceStart");
			return (Criteria) this;
		}

		public Criteria andGuidePriceStartIn(List<Double> values) {
			addCriterion("guide_price_start in", values, "guidePriceStart");
			return (Criteria) this;
		}

		public Criteria andGuidePriceStartNotIn(List<Double> values) {
			addCriterion("guide_price_start not in", values, "guidePriceStart");
			return (Criteria) this;
		}

		public Criteria andGuidePriceStartBetween(Double value1, Double value2) {
			addCriterion("guide_price_start between", value1, value2,
					"guidePriceStart");
			return (Criteria) this;
		}

		public Criteria andGuidePriceStartNotBetween(Double value1,
				Double value2) {
			addCriterion("guide_price_start not between", value1, value2,
					"guidePriceStart");
			return (Criteria) this;
		}

		public Criteria andGuidePriceEndIsNull() {
			addCriterion("guide_price_end is null");
			return (Criteria) this;
		}

		public Criteria andGuidePriceEndIsNotNull() {
			addCriterion("guide_price_end is not null");
			return (Criteria) this;
		}

		public Criteria andGuidePriceEndEqualTo(Double value) {
			addCriterion("guide_price_end =", value, "guidePriceEnd");
			return (Criteria) this;
		}

		public Criteria andGuidePriceEndNotEqualTo(Double value) {
			addCriterion("guide_price_end <>", value, "guidePriceEnd");
			return (Criteria) this;
		}

		public Criteria andGuidePriceEndGreaterThan(Double value) {
			addCriterion("guide_price_end >", value, "guidePriceEnd");
			return (Criteria) this;
		}

		public Criteria andGuidePriceEndGreaterThanOrEqualTo(Double value) {
			addCriterion("guide_price_end >=", value, "guidePriceEnd");
			return (Criteria) this;
		}

		public Criteria andGuidePriceEndLessThan(Double value) {
			addCriterion("guide_price_end <", value, "guidePriceEnd");
			return (Criteria) this;
		}

		public Criteria andGuidePriceEndLessThanOrEqualTo(Double value) {
			addCriterion("guide_price_end <=", value, "guidePriceEnd");
			return (Criteria) this;
		}

		public Criteria andGuidePriceEndIn(List<Double> values) {
			addCriterion("guide_price_end in", values, "guidePriceEnd");
			return (Criteria) this;
		}

		public Criteria andGuidePriceEndNotIn(List<Double> values) {
			addCriterion("guide_price_end not in", values, "guidePriceEnd");
			return (Criteria) this;
		}

		public Criteria andGuidePriceEndBetween(Double value1, Double value2) {
			addCriterion("guide_price_end between", value1, value2,
					"guidePriceEnd");
			return (Criteria) this;
		}

		public Criteria andGuidePriceEndNotBetween(Double value1, Double value2) {
			addCriterion("guide_price_end not between", value1, value2,
					"guidePriceEnd");
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
	 * This class was generated by MyBatis Generator. This class corresponds to the database table vehiclecategory
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
     * This class corresponds to the database table vehiclecategory
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}