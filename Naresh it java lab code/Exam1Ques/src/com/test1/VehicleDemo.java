package com.test1;

import java.util.Scanner;

public class VehicleDemo {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Vehicle Model");
		String vehicleModel = sc.nextLine();
		System.out.println("Enter License Plate");
		String licensePlate = sc.nextLine();
		System.out.println("Enter color");
		String color = sc.nextLine();
		System.out.println("Enter Engine Capacity");
		double engineCapacity = sc.nextDouble();
		
		v1.setVehicleDetails(vehicleModel, licensePlate, color, engineCapacity);
		System.out.println(v1.toString());
		sc.close();
				

	}

}
