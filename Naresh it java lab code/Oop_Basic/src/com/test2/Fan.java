package com.test2;

public class Fan {
	String name;
	String coil;
	int wings;

	public void switchOn() {

		System.out.println("Fan company name is: " + name);

		System.out.println("Fan coil is: " + coil);

		System.out.println("No of Wings is: " + wings);
	}

	public void switchOff() {
		System.out.println("The fan is switch off!!!");
	}
}
