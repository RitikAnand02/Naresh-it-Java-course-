package com.test1;

import java.util.Scanner;

public class VehicleDemo {

	public static void main(String[] args) {

		Vehicle v1 = new Vehicle();

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Vehical model");
		String vehicleModel = sc.nextLine();

		System.out.print("Enter License Plate");
		String licensePlate = sc.nextLine();

		System.out.print("Enter Color");
		String color = sc.nextLine();

		System.out.print("Enter Engine Capacity");
		Double engineCapacity = sc.nextDouble();

		v1.setVehicleDetails(vehicleModel, licensePlate, color, engineCapacity);
		System.out.println(v1.getVehicleDetails());

		sc.close();
	}

}
