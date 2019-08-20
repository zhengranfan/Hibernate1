package com.fan.domain;

import java.io.Serializable;
/**
 *  客户实体类
 * @author ia
 *
 */

public class Customer implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Long cusId;
	private String custName;
	private int custAge;
	
	
	
	public Customer() {
		super();
	}



	public Customer(Long cusId, String custName, int custAge) {
		super();
		this.cusId = cusId;
		this.custName = custName;
		this.custAge = custAge;
	}



	public Long getCusId() {
		return cusId;
	}



	public void setCusId(Long cusId) {
		this.cusId = cusId;
	}



	public String getCustName() {
		return custName;
	}



	public void setCustName(String custName) {
		this.custName = custName;
	}



	public int getCustAge() {
		return custAge;
	}



	public void setCustAge(int custAge) {
		this.custAge = custAge;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	@Override
	public String toString() {
		return "Customer [cusId=" + cusId + ", custName=" + custName + ", custAge=" + custAge + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cusId == null) ? 0 : cusId.hashCode());
		result = prime * result + custAge;
		result = prime * result + ((custName == null) ? 0 : custName.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (cusId == null) {
			if (other.cusId != null)
				return false;
		} else if (!cusId.equals(other.cusId))
			return false;
		if (custAge != other.custAge)
			return false;
		if (custName == null) {
			if (other.custName != null)
				return false;
		} else if (!custName.equals(other.custName))
			return false;
		return true;
	}
	
	
	

	

}
