package bz.sunlight.dao;

import bz.sunlight.entity.CustomProperties;
import bz.sunlight.entity.CustomPropertiesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomPropertiesMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table custom_properties
	 * @mbggenerated
	 */
	int countByExample(CustomPropertiesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table custom_properties
	 * @mbggenerated
	 */
	int deleteByExample(CustomPropertiesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table custom_properties
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table custom_properties
	 * @mbggenerated
	 */
	int insert(CustomProperties record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table custom_properties
	 * @mbggenerated
	 */
	int insertSelective(CustomProperties record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table custom_properties
	 * @mbggenerated
	 */
	List<CustomProperties> selectByExample(CustomPropertiesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table custom_properties
	 * @mbggenerated
	 */
	CustomProperties selectByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table custom_properties
	 * @mbggenerated
	 */
	int updateByExampleSelective(@Param("record") CustomProperties record,
			@Param("example") CustomPropertiesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table custom_properties
	 * @mbggenerated
	 */
	int updateByExample(@Param("record") CustomProperties record,
			@Param("example") CustomPropertiesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table custom_properties
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(CustomProperties record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table custom_properties
	 * @mbggenerated
	 */
	int updateByPrimaryKey(CustomProperties record);
}