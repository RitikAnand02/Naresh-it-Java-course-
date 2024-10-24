package com.test2;

 class Car extends Vehicle {
	 protected int numberOfDoors;

	public Car(String make, String model, int year, int numberOfDoors) {
		super(make, model, year);
		this.numberOfDoors = numberOfDoors;
	}
	 
	public void displayDetails() {
		System.out.println("Vehicle Make"+make);
		System.out.println("Vehicle Model"+model);
		System.out.println("Vehicle Year"+year);
		System.out.println("Vehicle Number Of Doors"+numberOfDoors);
	}
	

}
