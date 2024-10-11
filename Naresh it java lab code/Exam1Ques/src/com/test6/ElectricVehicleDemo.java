package com.test6;

import java.util.Scanner;

public class ElectricVehicleDemo {

	public static void main(String[] args) {
		ElectricVehicle e1 = new ElectricVehicle();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Vehicle Model");
		String vehicleModel = sc.nextLine();
		
		System.out.println("Enter License Plate");
		String licensePlate = sc.nextLine();
		
		System.out.println("Enter Battery Capacity");
		double batteryCapacity = sc.nextDouble();
		
		System.out.println("Enter Rental Price Per Hour");
		double rentalPricePerHour = sc.nextDouble();
		
		e1.setElectricVehicleDetails(vehicleModel, licensePlate, batteryCapacity, rentalPricePerHour);
		
		System.out.println(e1.toString());
		sc.close();
		
		
		
		

	}

}
