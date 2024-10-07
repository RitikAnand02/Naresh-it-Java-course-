package com.test3;

public class Customer {
	int customerId;
	String customerName;

	public void setCustomerData(int customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;

	}

	public void getCustomerData() {
		System.out.println("Customer Id is :" + this.customerId);
		System.out.println("Customer Name is :" + this.customerName);
	}
}
