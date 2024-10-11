package com.test1;

public class Vehicle {

   String vehicleModel;
   String licensePlate;
   String color;
   double engineCapacity;
public void setVehicleDetails(String vehicleModel, String licensePlate, String color, double engineCapacity)
{
	
	this.vehicleModel = vehicleModel;
	this.licensePlate = licensePlate;
	this.color = color;
	this.engineCapacity = engineCapacity;
}
@Override
public String toString() {
	return "Vehicle [vehicleModel=" + vehicleModel + ", licensePlate=" + licensePlate + ", color=" + color
			+ ", engineCapacity=" + engineCapacity + "]";
}

   
   

}
