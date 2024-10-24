package com.test2;

 class Bike extends Vehicle {
    protected String type;

	public Bike(String make, String model, int year, String type) {
		super(make, model, year);
		this.type = type;
	}
    
	public void displayDetails() {
		System.out.println("Vehicle Make"+make);
		System.out.println("Vehicle Model"+model);
		System.out.println("Vehicle Year"+year);
		System.out.println("Vehicle Type"+type);
	}
}
