package bz.sunlight.dao;

import bz.sunlight.entity.DefaultLangugeTrick;
import bz.sunlight.entity.DefaultLangugeTrickExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DefaultLangugeTrickMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table default_languge_trick
	 * @mbggenerated
	 */
	int countByExample(DefaultLangugeTrickExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table default_languge_trick
	 * @mbggenerated
	 */
	int deleteByExample(DefaultLangugeTrickExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table default_languge_trick
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table default_languge_trick
	 * @mbggenerated
	 */
	int insert(DefaultLangugeTrick record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table default_languge_trick
	 * @mbggenerated
	 */
	int insertSelective(DefaultLangugeTrick record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table default_languge_trick
	 * @mbggenerated
	 */
	List<DefaultLangugeTrick> selectByExample(DefaultLangugeTrickExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table default_languge_trick
	 * @mbggenerated
	 */
	DefaultLangugeTrick selectByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table default_languge_trick
	 * @mbggenerated
	 */
	int updateByExampleSelective(@Param("record") DefaultLangugeTrick record,
			@Param("example") DefaultLangugeTrickExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table default_languge_trick
	 * @mbggenerated
	 */
	int updateByExample(@Param("record") DefaultLangugeTrick record,
			@Param("example") DefaultLangugeTrickExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table default_languge_trick
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(DefaultLangugeTrick record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table default_languge_trick
	 * @mbggenerated
	 */
	int updateByPrimaryKey(DefaultLangugeTrick record);
	
	
	
	
}