package bz.sunlight.dao;

import bz.sunlight.entity.SecretPool;
import bz.sunlight.entity.SecretPoolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecretPoolMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table secret_pool
	 * @mbggenerated
	 */
	int countByExample(SecretPoolExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table secret_pool
	 * @mbggenerated
	 */
	int deleteByExample(SecretPoolExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table secret_pool
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table secret_pool
	 * @mbggenerated
	 */
	int insert(SecretPool record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table secret_pool
	 * @mbggenerated
	 */
	int insertSelective(SecretPool record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table secret_pool
	 * @mbggenerated
	 */
	List<SecretPool> selectByExample(SecretPoolExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table secret_pool
	 * @mbggenerated
	 */
	SecretPool selectByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table secret_pool
	 * @mbggenerated
	 */
	int updateByExampleSelective(@Param("record") SecretPool record,
			@Param("example") SecretPoolExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table secret_pool
	 * @mbggenerated
	 */
	int updateByExample(@Param("record") SecretPool record,
			@Param("example") SecretPoolExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table secret_pool
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(SecretPool record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table secret_pool
	 * @mbggenerated
	 */
	int updateByPrimaryKey(SecretPool record);

	List<SecretPool> getSecretPool(@Param("keepStatus") Short keepStatus,@Param("status") Short status,@Param("brand") String brand,@Param("userId") String userId,
			@Param("area") String area,@Param("pageItemStart") Integer pageItemStart,@Param("pageSize") Integer pageSize,@Param("callStatus") Short callStatus);

	
	int getSecretPoolCount(@Param("keepStatus") Short keepStatus,@Param("status") Short status,@Param("brand") String brand,@Param("userId") String userId,
			@Param("area") String area,@Param("callStatus") Short callStatus);
	
	void updateSecretPool(@Param("keepStatus") Short keepStatus,@Param("secretId") String secretId);

}