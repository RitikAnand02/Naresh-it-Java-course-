package com.test2;

 class Vehicle {
	protected String make;
	protected String model;
	protected int year;
	public Vehicle(String make, String model, int year) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		if(year<=0) {
			System.err.println("Error Invalid Input For Year");
			System.exit(0);
		}
	}
	
	public void displayDetails()  {
		System.out.println("Vehicle Make"+make);
		System.out.println("Vehicle Model"+model);
		System.out.println("Vehicle Year"+year);
	}
	
	
	
	

}
