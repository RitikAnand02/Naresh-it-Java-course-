package com.test6;

public class ElectricVehicle {


   String vehicleModel;
   String licensePlate;
   double batteryCapacity;
   double rentalPricePerHour;
public void setElectricVehicleDetails(String vehicleModel, String licensePlate, double batteryCapacity, double rentalPricePerHour) 
{

	this.vehicleModel = vehicleModel;
	this.licensePlate = licensePlate;
	this.batteryCapacity = batteryCapacity;
	this.rentalPricePerHour = rentalPricePerHour;
}
@Override
public String toString() {
	return "ElectricVehicle [vehicleModel=" + vehicleModel + ", licensePlate=" + licensePlate + ", batteryCapacity="
			+ batteryCapacity + ", rentalPricePerHour=" + rentalPricePerHour + "]";
}


   
   
}
