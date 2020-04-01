package com.nemil.demoHibernate2;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer 
{
	@Id
	private int customerId;
	private String customerName;
	private int customerBought;
	
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerBought="
				+ customerBought + "]";
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerBought() {
		return customerBought;
	}
	public void setCustomerBought(int customerBought) {
		this.customerBought = customerBought;
	}
	
	

}
