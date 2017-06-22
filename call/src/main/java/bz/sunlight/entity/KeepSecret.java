package bz.sunlight.entity;

import java.util.Date;

import bz.sunlight.dto.CustomPropertiesDTO;

public class KeepSecret {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column keep_secret.id
	 * @mbggenerated
	 */
	private String id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column keep_secret.secret_id
	 * @mbggenerated
	 */
	private String secretId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column keep_secret.enterpirse_id
	 * @mbggenerated
	 */
	private String enterpirseId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column keep_secret.user_info_id
	 * @mbggenerated
	 */
	private String userInfoId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column keep_secret.keep_time
	 * @mbggenerated
	 */
	private Date keepTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column keep_secret.freed_time
	 * @mbggenerated
	 */
	private Date freedTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column keep_secret.custom_properties_id1
	 * @mbggenerated
	 */
	private String customPropertiesId1;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column keep_secret.custom_properties_id2
	 * @mbggenerated
	 */
	private String customPropertiesId2;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column keep_secret.custom_properties3
	 * @mbggenerated
	 */
	private String customProperties3;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column keep_secret.id
	 * @return  the value of keep_secret.id
	 * @mbggenerated
	 */
	public String getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column keep_secret.id
	 * @param id  the value for keep_secret.id
	 * @mbggenerated
	 */
	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column keep_secret.secret_id
	 * @return  the value of keep_secret.secret_id
	 * @mbggenerated
	 */
	public String getSecretId() {
		return secretId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column keep_secret.secret_id
	 * @param secretId  the value for keep_secret.secret_id
	 * @mbggenerated
	 */
	public void setSecretId(String secretId) {
		this.secretId = secretId == null ? null : secretId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column keep_secret.enterpirse_id
	 * @return  the value of keep_secret.enterpirse_id
	 * @mbggenerated
	 */
	public String getEnterpirseId() {
		return enterpirseId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column keep_secret.enterpirse_id
	 * @param enterpirseId  the value for keep_secret.enterpirse_id
	 * @mbggenerated
	 */
	public void setEnterpirseId(String enterpirseId) {
		this.enterpirseId = enterpirseId == null ? null : enterpirseId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column keep_secret.user_info_id
	 * @return  the value of keep_secret.user_info_id
	 * @mbggenerated
	 */
	public String getUserInfoId() {
		return userInfoId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column keep_secret.user_info_id
	 * @param userInfoId  the value for keep_secret.user_info_id
	 * @mbggenerated
	 */
	public void setUserInfoId(String userInfoId) {
		this.userInfoId = userInfoId == null ? null : userInfoId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column keep_secret.keep_time
	 * @return  the value of keep_secret.keep_time
	 * @mbggenerated
	 */
	public Date getKeepTime() {
		return keepTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column keep_secret.keep_time
	 * @param keepTime  the value for keep_secret.keep_time
	 * @mbggenerated
	 */
	public void setKeepTime(Date keepTime) {
		this.keepTime = keepTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column keep_secret.freed_time
	 * @return  the value of keep_secret.freed_time
	 * @mbggenerated
	 */
	public Date getFreedTime() {
		return freedTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column keep_secret.freed_time
	 * @param freedTime  the value for keep_secret.freed_time
	 * @mbggenerated
	 */
	public void setFreedTime(Date freedTime) {
		this.freedTime = freedTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column keep_secret.custom_properties_id1
	 * @return  the value of keep_secret.custom_properties_id1
	 * @mbggenerated
	 */
	public String getCustomPropertiesId1() {
		return customPropertiesId1;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column keep_secret.custom_properties_id1
	 * @param customPropertiesId1  the value for keep_secret.custom_properties_id1
	 * @mbggenerated
	 */
	public void setCustomPropertiesId1(String customPropertiesId1) {
		this.customPropertiesId1 = customPropertiesId1 == null ? null
				: customPropertiesId1.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column keep_secret.custom_properties_id2
	 * @return  the value of keep_secret.custom_properties_id2
	 * @mbggenerated
	 */
	public String getCustomPropertiesId2() {
		return customPropertiesId2;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column keep_secret.custom_properties_id2
	 * @param customPropertiesId2  the value for keep_secret.custom_properties_id2
	 * @mbggenerated
	 */
	public void setCustomPropertiesId2(String customPropertiesId2) {
		this.customPropertiesId2 = customPropertiesId2 == null ? null
				: customPropertiesId2.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column keep_secret.custom_properties3
	 * @return  the value of keep_secret.custom_properties3
	 * @mbggenerated
	 */
	public String getCustomProperties3() {
		return customProperties3;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column keep_secret.custom_properties3
	 * @param customProperties3  the value for keep_secret.custom_properties3
	 * @mbggenerated
	 */
	public void setCustomProperties3(String customProperties3) {
		this.customProperties3 = customProperties3 == null ? null
				: customProperties3.trim();
	}
	
	private SecretPool secretPool;

	public SecretPool getSecretPool() {
		return secretPool;
	}

	public void setSecretPool(SecretPool secretPool) {
		this.secretPool = secretPool;
	}
	private CustomPropertiesDTO customProperties;

	public CustomPropertiesDTO getCustomProperties() {
		return customProperties;
	}

	public void setCustomProperties(CustomPropertiesDTO customProperties) {
		this.customProperties = customProperties;
	}
	
	private Short keepDay;

	public Short getKeepDay() {
		return keepDay;
	}

	public void setKeepDay(Short keepDay) {
		this.keepDay = keepDay;
	}
	
	
	
	
	
}