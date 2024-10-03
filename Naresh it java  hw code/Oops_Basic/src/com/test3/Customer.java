package com.test3;

public class Customer {
	int customerId;
	String customerName;
	double customerBill;

	// Initializing the object properties through Method
	public void setCustomerData() {
		customerId = 999;
		customerName = "Mr. Smith";
		customerBill = 24897.89;
	}

	public void getCustomerData() {
		System.out.println("Customer Id is :" + customerId);
		System.out.println("Customer Name is :" + customerName);
		System.out.println("Customer Bill is :" + customerBill);
	}

}
