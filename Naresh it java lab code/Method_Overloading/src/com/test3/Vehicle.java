package com.test3;

public class Vehicle {
	private FuelTank fueltank;

	public Vehicle(FuelTank fueltank) {
		super();
		this.fueltank = fueltank;
	} 
	
	public void displayFuelLevel() {
		System.out.println( "Current fuel level: " + fueltank.getFuelLevel() + " liters");
	}

}
