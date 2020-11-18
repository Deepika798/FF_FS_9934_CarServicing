package com.hcl.springmvc.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="BillDetails")
public class BillDetails {
	 @Id
	 @Column(name="Id")
     private String id;
	 @Column(name="BillAmount")
     private double billAmount;
	 @Column(name="UserId")
     private int userId;
	 @Column(name="ServiceCenterId")
     private String serviceCenterId;
     
     
	public BillDetails() {
		
	}
	/**
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
	 * @return the billAmount
	 */
	public double getBillAmount() {
		return billAmount;
	}
	/**
	 * @param billAmount the billAmount to set
	 */
	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	
	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * @return the serviceCenterId
	 */
	public String getServiceCenterId() {
		return serviceCenterId;
	}
	/**
	 * @param serviceCenterId the serviceCenterId to set
	 */
	public void setServiceCenterId(String serviceCenterId) {
		this.serviceCenterId = serviceCenterId;
	}
     
     
}
