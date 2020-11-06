package com.hcl.springmvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="servicesprovided")
public class ServicesProvided {
	@Id
	@Column(name="ServiceName")
	private String serviceName;
	@Column(name="ServiceCost")
	private int serviceCost;
	@Column(name="ServiceCenterId")
	private String serviceCenterId;

	public ServicesProvided() {
	
	}
	/**
	 * @return the serviceName
	 */
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * @param serviceName
	 *            the serviceName to set
	 */            
	 
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	/**
	 * @return the serviceCost
	 */
	public int getServiceCost() {
		return serviceCost;
	}

	/**
	 * @param serviceCost
	 *            the serviceCost to set
	 */
	public void setServiceCost(int serviceCost) {
		this.serviceCost = serviceCost;
	}

	/**
	 * @return the serviceCenterId
	 */
	public String getServiceCenterId() {
		return serviceCenterId;
	}

	/**
	 * @param serviceCenterId
	 *            the serviceCenterId to set
	 */
	public void setServiceCenterId(String serviceCenterId) {
		this.serviceCenterId = serviceCenterId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ServicesProvided [ serviceName=" + serviceName + ", serviceCost=" + serviceCost
				+ ", serviceCenterId=" + serviceCenterId + "]";
	}

}
