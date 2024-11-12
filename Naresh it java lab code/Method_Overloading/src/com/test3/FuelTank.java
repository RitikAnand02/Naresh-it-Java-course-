package com.test3;

public class FuelTank {
	private double fuelLevel;
	private final double maxCapacity;
	
	public FuelTank(double fuelLevel, double maxCapacity) {
		super();
		this.fuelLevel = fuelLevel;
		this.maxCapacity = maxCapacity;
	}

	public double getFuelLevel() {
		return fuelLevel;
	}
	
	public void refillFuel(double amount) {
		if(this.fuelLevel < this.maxCapacity && amount < this.maxCapacity) {
			this.fuelLevel += amount;
			System.out.println("Fuel refilled. Current fuel level: " + fuelLevel + " liters");
		}
		else {
			System.err.println("Cannot refill. Tank capacity exceeded.");
		}
	}
}
