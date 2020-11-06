package com.hcl.springmvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;


@Entity
@Table(name="servicecenter")
public class ServiceCenter {
	@Id
	@Column(name = "Id")
	private String id;
	@Column(name="centerName")
	private String centerName;
	@Column(name="FullAddress")
	private String fullAddress;
	@Column(name="contactNumber")
	private String contactNumber;
	@Column(name="StartDate")
	private String startDate;
	@Column(name="EndDate")
	private String endDate;
	@Column(name="rating")
	private float rating;
	@Column(name="deliveryBoyId")
	private int deliveryBoyId;

	public ServiceCenter() {
	}
	/**
	 * @param i 
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the centerName
	 */
	public String getCenterName() {
		return centerName;
	}
	/**
	 * @param centerName the centerName to set
	 */
	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}
	/**
	 * @return the fullAddress
	 */
	public String getFullAddress() {
		return fullAddress;
	}
	/**
	 * @param fullAddress the fullAddress to set
	 */
	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}
	/**
	 * @return the contactNumber
	 */
	public String getContactNumber() {
		return contactNumber;
	}
	/**
	 * @param contactNumber the contactNumber to set
	 */
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	/**
	 * @return the startDate
	 */
	public String getStartDate() {
		return startDate;
	}
	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	/**
	 * @return the endDate
	 */
	public String getEndDate() {
		return endDate;
	}
	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	/**
	 * @return the rating
	 */
	public float getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(float rating) {
		this.rating = rating;
	}
	/**
	 * @return the deliveryBoyId
	 */
	public int getDeliveryBoyId() {
		return deliveryBoyId;
	}
	/**
	 * @param deliveryBoyId the deliveryBoyId to set
	 */
	public void setDeliveryBoyId(int deliveryBoyId) {
		this.deliveryBoyId = deliveryBoyId;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ServiceCenter [id=" + id + ", centerName=" + centerName + ", fullAddress=" + fullAddress
				+ ", contactNumber=" + contactNumber + ", startDate=" + startDate + ", endDate=" + endDate + ", rating="
				+ rating + ", deliveryBoyId=" + deliveryBoyId + "]";
	}
	
}
