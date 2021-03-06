package bz.sunlight.entity;

import java.math.BigDecimal;

public class Product {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product.id
	 * @mbggenerated
	 */
	private String id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product.price
	 * @mbggenerated
	 */
	private Float price;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product.call_quantity
	 * @mbggenerated
	 */
	private Integer callQuantity;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product.seat_quantity
	 * @mbggenerated
	 */
	private Integer seatQuantity;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product.status
	 * @mbggenerated
	 */
	private Short status;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product.id
	 * @return  the value of product.id
	 * @mbggenerated
	 */
	public String getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product.id
	 * @param id  the value for product.id
	 * @mbggenerated
	 */
	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product.price
	 * @return  the value of product.price
	 * @mbggenerated
	 */
	public Float getPrice() {
		return price;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product.price
	 * @param price  the value for product.price
	 * @mbggenerated
	 */
	public void setPrice(Float price) {
		this.price = price;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product.call_quantity
	 * @return  the value of product.call_quantity
	 * @mbggenerated
	 */
	public Integer getCallQuantity() {
		return callQuantity;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product.call_quantity
	 * @param callQuantity  the value for product.call_quantity
	 * @mbggenerated
	 */
	public void setCallQuantity(Integer callQuantity) {
		this.callQuantity = callQuantity;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product.seat_quantity
	 * @return  the value of product.seat_quantity
	 * @mbggenerated
	 */
	public Integer getSeatQuantity() {
		return seatQuantity;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product.seat_quantity
	 * @param seatQuantity  the value for product.seat_quantity
	 * @mbggenerated
	 */
	public void setSeatQuantity(Integer seatQuantity) {
		this.seatQuantity = seatQuantity;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product.status
	 * @return  the value of product.status
	 * @mbggenerated
	 */
	public Short getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product.status
	 * @param status  the value for product.status
	 * @mbggenerated
	 */
	public void setStatus(Short status) {
		this.status = status;
	}
}