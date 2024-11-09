package com.test4;

public class Vehicle {
	private String vehicleName;
	private int maxSpeed;
	private String fuelType;
	public Vehicle() {
		super();
	}
	public Vehicle(String vehicleName, int maxSpeed) {
		super();
		if(maxSpeed<=0)
		{
			System.err.println("Maximum Speed must be positive.");
			System.exit(0);
		}
		if(vehicleName==null || vehicleName.length()==0)
		{
			System.err.println("Vehicle Name Cannot be Empty");
			System.exit(0);
		}
		this.vehicleName = vehicleName;
		this.maxSpeed = maxSpeed;
	}
	public Vehicle(String vehicleName, int maxSpeed, String fuelType) {
		super();
		if(maxSpeed<=0)
		{
			System.err.println("Maximum Speed must be positive.");
			System.exit(0);
		}
		if(vehicleName==null || vehicleName.length()==0)
		{
			System.err.println("Vehicle Name Cannot be Empty");
			System.exit(0);
		}
		
		if(fuelType==null || fuelType.length()==0)
		{
			System.err.println("Fuel Type Cannot be Empty");
			System.exit(0);
		}
		this.vehicleName = vehicleName;
		this.maxSpeed = maxSpeed;
		this.fuelType = fuelType;
	}
	
	public void displayInfo() {
		System.out.println("Vehicle Name: "+vehicleName);
		System.out.println("Max Speed: "+maxSpeed);
		System.out.println("Fuel Type: "+fuelType);
	}
	
	

}
