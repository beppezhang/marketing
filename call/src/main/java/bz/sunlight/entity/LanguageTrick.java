package bz.sunlight.entity;

public class LanguageTrick {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column language_trick.id
	 * @mbggenerated
	 */
	private String id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column language_trick.enterprise_id
	 * @mbggenerated
	 */
	private String enterpriseId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column language_trick.content
	 * @mbggenerated
	 */
	private String content;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column language_trick.title
	 * @mbggenerated
	 */
	private String title;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column language_trick.status
	 * @mbggenerated
	 */
	private Short status;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column language_trick.id
	 * @return  the value of language_trick.id
	 * @mbggenerated
	 */
	public String getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column language_trick.id
	 * @param id  the value for language_trick.id
	 * @mbggenerated
	 */
	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column language_trick.enterprise_id
	 * @return  the value of language_trick.enterprise_id
	 * @mbggenerated
	 */
	public String getEnterpriseId() {
		return enterpriseId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column language_trick.enterprise_id
	 * @param enterpriseId  the value for language_trick.enterprise_id
	 * @mbggenerated
	 */
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId == null ? null : enterpriseId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column language_trick.content
	 * @return  the value of language_trick.content
	 * @mbggenerated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column language_trick.content
	 * @param content  the value for language_trick.content
	 * @mbggenerated
	 */
	public void setContent(String content) {
		this.content = content == null ? null : content.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column language_trick.title
	 * @return  the value of language_trick.title
	 * @mbggenerated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column language_trick.title
	 * @param title  the value for language_trick.title
	 * @mbggenerated
	 */
	public void setTitle(String title) {
		this.title = title == null ? null : title.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column language_trick.status
	 * @return  the value of language_trick.status
	 * @mbggenerated
	 */
	public Short getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column language_trick.status
	 * @param status  the value for language_trick.status
	 * @mbggenerated
	 */
	public void setStatus(Short status) {
		this.status = status;
	}

	private DefaultLangugeTrick defaultLangugeTrick;

	public DefaultLangugeTrick getDefaultLangugeTrick() {
		return defaultLangugeTrick;
	}

	public void setDefaultLangugeTrick(DefaultLangugeTrick defaultLangugeTrick) {
		this.defaultLangugeTrick = defaultLangugeTrick;
	}
	
	
}