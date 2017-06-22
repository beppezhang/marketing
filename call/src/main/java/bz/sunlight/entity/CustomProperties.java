package bz.sunlight.entity;

import java.util.Date;

public class CustomProperties {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column custom_properties.id
	 * @mbggenerated
	 */
	private String id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column custom_properties.code
	 * @mbggenerated
	 */
	private Integer code;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column custom_properties.value
	 * @mbggenerated
	 */
	private String value;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column custom_properties.type
	 * @mbggenerated
	 */
	private Short type;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column custom_properties.status
	 * @mbggenerated
	 */
	private Short status;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column custom_properties.create_time
	 * @mbggenerated
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column custom_properties.enterprise_id
	 * @mbggenerated
	 */
	private String enterpriseId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column custom_properties.property
	 * @mbggenerated
	 */
	private Short property;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column custom_properties.id
	 * @return  the value of custom_properties.id
	 * @mbggenerated
	 */
	public String getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column custom_properties.id
	 * @param id  the value for custom_properties.id
	 * @mbggenerated
	 */
	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column custom_properties.code
	 * @return  the value of custom_properties.code
	 * @mbggenerated
	 */
	public Integer getCode() {
		return code;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column custom_properties.code
	 * @param code  the value for custom_properties.code
	 * @mbggenerated
	 */
	public void setCode(Integer code) {
		this.code = code;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column custom_properties.value
	 * @return  the value of custom_properties.value
	 * @mbggenerated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column custom_properties.value
	 * @param value  the value for custom_properties.value
	 * @mbggenerated
	 */
	public void setValue(String value) {
		this.value = value == null ? null : value.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column custom_properties.type
	 * @return  the value of custom_properties.type
	 * @mbggenerated
	 */
	public Short getType() {
		return type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column custom_properties.type
	 * @param type  the value for custom_properties.type
	 * @mbggenerated
	 */
	public void setType(Short type) {
		this.type = type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column custom_properties.status
	 * @return  the value of custom_properties.status
	 * @mbggenerated
	 */
	public Short getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column custom_properties.status
	 * @param status  the value for custom_properties.status
	 * @mbggenerated
	 */
	public void setStatus(Short status) {
		this.status = status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column custom_properties.create_time
	 * @return  the value of custom_properties.create_time
	 * @mbggenerated
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column custom_properties.create_time
	 * @param createTime  the value for custom_properties.create_time
	 * @mbggenerated
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column custom_properties.enterprise_id
	 * @return  the value of custom_properties.enterprise_id
	 * @mbggenerated
	 */
	public String getEnterpriseId() {
		return enterpriseId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column custom_properties.enterprise_id
	 * @param enterpriseId  the value for custom_properties.enterprise_id
	 * @mbggenerated
	 */
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId == null ? null : enterpriseId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column custom_properties.property
	 * @return  the value of custom_properties.property
	 * @mbggenerated
	 */
	public Short getProperty() {
		return property;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column custom_properties.property
	 * @param property  the value for custom_properties.property
	 * @mbggenerated
	 */
	public void setProperty(Short property) {
		this.property = property;
	}
}