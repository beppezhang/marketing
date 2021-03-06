package bz.sunlight.entity;

public class Brand {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column brand.id
	 * @mbggenerated
	 */
	private String id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column brand.code
	 * @mbggenerated
	 */
	private String code;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column brand.name
	 * @mbggenerated
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column brand.pinyin
	 * @mbggenerated
	 */
	private String pinyin;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column brand.status
	 * @mbggenerated
	 */
	private Short status;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column brand.id
	 * @return  the value of brand.id
	 * @mbggenerated
	 */
	public String getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column brand.id
	 * @param id  the value for brand.id
	 * @mbggenerated
	 */
	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column brand.code
	 * @return  the value of brand.code
	 * @mbggenerated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column brand.code
	 * @param code  the value for brand.code
	 * @mbggenerated
	 */
	public void setCode(String code) {
		this.code = code == null ? null : code.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column brand.name
	 * @return  the value of brand.name
	 * @mbggenerated
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column brand.name
	 * @param name  the value for brand.name
	 * @mbggenerated
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column brand.pinyin
	 * @return  the value of brand.pinyin
	 * @mbggenerated
	 */
	public String getPinyin() {
		return pinyin;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column brand.pinyin
	 * @param pinyin  the value for brand.pinyin
	 * @mbggenerated
	 */
	public void setPinyin(String pinyin) {
		this.pinyin = pinyin == null ? null : pinyin.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column brand.status
	 * @return  the value of brand.status
	 * @mbggenerated
	 */
	public Short getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column brand.status
	 * @param status  the value for brand.status
	 * @mbggenerated
	 */
	public void setStatus(Short status) {
		this.status = status;
	}
}