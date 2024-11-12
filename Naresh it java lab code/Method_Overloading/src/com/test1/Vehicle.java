package com.test1;

public class Vehicle {
	private double totalDistance;
	private double totalFuelConsumed;
	public Vehicle(double totalDistance, double totalFuelConsumed) {
		super();
		this.totalDistance = totalDistance;
		this.totalFuelConsumed = totalFuelConsumed;
	}
	
	public double calculateFuelEfficiency(int totalDistance, int totalFuelConsumed) {
		double result = this.totalDistance * this.totalFuelConsumed ;
		return result;
	}
	
	public double calculateFuelEfficiency() {
		double result1 = this.totalDistance * this.totalFuelConsumed * 2.35215;
		return result1;
	}

}
