package bz.sunlight.dao;



import bz.sunlight.entity.KeyValueItem;
import bz.sunlight.entity.KeyValueItemExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface KeyValueItemMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table key_value_item
	 * @mbggenerated
	 */
	int countByExample(KeyValueItemExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table key_value_item
	 * @mbggenerated
	 */
	int deleteByExample(KeyValueItemExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table key_value_item
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table key_value_item
	 * @mbggenerated
	 */
	int insert(KeyValueItem record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table key_value_item
	 * @mbggenerated
	 */
	int insertSelective(KeyValueItem record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table key_value_item
	 * @mbggenerated
	 */
	List<KeyValueItem> selectByExample(KeyValueItemExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table key_value_item
	 * @mbggenerated
	 */
	KeyValueItem selectByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table key_value_item
	 * @mbggenerated
	 */
	int updateByExampleSelective(@Param("record") KeyValueItem record,
			@Param("example") KeyValueItemExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table key_value_item
	 * @mbggenerated
	 */
	int updateByExample(@Param("record") KeyValueItem record,
			@Param("example") KeyValueItemExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table key_value_item
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(KeyValueItem record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table key_value_item
	 * @mbggenerated
	 */
	int updateByPrimaryKey(KeyValueItem record);

	Short selectMax(String categotyId);
}