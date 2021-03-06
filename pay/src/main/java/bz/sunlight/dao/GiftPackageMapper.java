package bz.sunlight.dao;

import bz.sunlight.entity.GiftPackage;
import bz.sunlight.entity.GiftPackageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GiftPackageMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table gift_package
	 * @mbggenerated
	 */
	int countByExample(GiftPackageExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table gift_package
	 * @mbggenerated
	 */
	int deleteByExample(GiftPackageExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table gift_package
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table gift_package
	 * @mbggenerated
	 */
	int insert(GiftPackage record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table gift_package
	 * @mbggenerated
	 */
	int insertSelective(GiftPackage record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table gift_package
	 * @mbggenerated
	 */
	List<GiftPackage> selectByExample(GiftPackageExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table gift_package
	 * @mbggenerated
	 */
	GiftPackage selectByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table gift_package
	 * @mbggenerated
	 */
	int updateByExampleSelective(@Param("record") GiftPackage record,
			@Param("example") GiftPackageExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table gift_package
	 * @mbggenerated
	 */
	int updateByExample(@Param("record") GiftPackage record,
			@Param("example") GiftPackageExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table gift_package
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(GiftPackage record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table gift_package
	 * @mbggenerated
	 */
	int updateByPrimaryKey(GiftPackage record);
	
	List<Double> getGiftPackage(short status);
}