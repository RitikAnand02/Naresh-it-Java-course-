package com.test2;

public class DeepCopy {

	public static void main(String[] args) {
		Customer c1 = new Customer(111, "Virat");
		Customer c2 = new Customer();
		c2.setCustomerId(c1.getCustomerId());
		c2.setCustomerName(c1.getCustomerName());
		
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println("After Modification");
		c2.setCustomerId(999);
		c2.setCustomerName("Rohit");
		System.out.println(c1);
		System.out.println(c2);
	}

}
