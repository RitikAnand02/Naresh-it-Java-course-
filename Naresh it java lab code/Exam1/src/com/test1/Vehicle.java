package com.test1;

public class Vehicle {
	String vehicleModel;
	String licensePlate;
	String color;
	double engineCapacity;

	public void setVehicleDetails(String vehicleModel, String licensePlate, String color, double engineCapacity) {

		this.vehicleModel = vehicleModel;
		this.licensePlate = licensePlate;
		this.engineCapacity = engineCapacity;
	}

	public String getVehicleDetails() {

		return "vehicleModel: " + vehicleModel + "\n" + "licensePlate: " + licensePlate + "\n" + "color: " + color
				+ "\n" + "engineCapacity: " + engineCapacity;

	}
}
