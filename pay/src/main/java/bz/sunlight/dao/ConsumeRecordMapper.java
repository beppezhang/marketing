package bz.sunlight.dao;

import bz.sunlight.entity.ConsumeRecord;
import bz.sunlight.entity.ConsumeRecordExample;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ConsumeRecordMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table consume_record
	 * @mbggenerated
	 */
	int countByExample(ConsumeRecordExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table consume_record
	 * @mbggenerated
	 */
	int deleteByExample(ConsumeRecordExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table consume_record
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table consume_record
	 * @mbggenerated
	 */
	int insert(ConsumeRecord record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table consume_record
	 * @mbggenerated
	 */
	int insertSelective(ConsumeRecord record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table consume_record
	 * @mbggenerated
	 */
	List<ConsumeRecord> selectByExample(ConsumeRecordExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table consume_record
	 * @mbggenerated
	 */
	ConsumeRecord selectByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table consume_record
	 * @mbggenerated
	 */
	int updateByExampleSelective(@Param("record") ConsumeRecord record,
			@Param("example") ConsumeRecordExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table consume_record
	 * @mbggenerated
	 */
	int updateByExample(@Param("record") ConsumeRecord record,
			@Param("example") ConsumeRecordExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table consume_record
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(ConsumeRecord record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table consume_record
	 * @mbggenerated
	 */
	int updateByPrimaryKey(ConsumeRecord record);

	List<ConsumeRecord> selectBySelective(Map map);
	
	int selectBySelectiveCount(@Param("type") Short type,@Param("startConsumeTime") Date startConsumeTime,
			@Param("endConsumeTime") Date endConsumeTime,@Param("enterpriseId") String enterpriseId);

	/* --------------- lby --------------- */
	List<String> selectEnterpriseByTime(@Param("start") Date start, @Param("end") Date end);
}