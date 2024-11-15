package com.test1;

public class Vehicle {
	private double totalDistance;
	private double totalFuelConsumed;
	public Vehicle(double totalDistance, double totalFuelConsumed) {
		super();
		if(totalDistance<=0 || totalFuelConsumed<=0)
		{
			System.err.println("Error: Fuel consumed cannot be zero.");
			System.exit(0);
		}
		else 
		{
		this.totalDistance = totalDistance;
		this.totalFuelConsumed = totalFuelConsumed;
		}
	}
	
	public double calculateFuelEfficiency(int totalDistance, int totalFuelConsumed) {
		double result = this.totalDistance /this.totalFuelConsumed ;
		return result;
	}
	
	public double calculateFuelEfficiency() {
		double result1 = this.totalDistance / this.totalFuelConsumed * 2.35215;
		return result1;
	}

}
