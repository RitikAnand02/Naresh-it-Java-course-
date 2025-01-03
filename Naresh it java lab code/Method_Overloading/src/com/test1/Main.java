package com.test1;

public class Main {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle(500, 50);
		double calculateFuelEfficiency = v1.calculateFuelEfficiency(500, 50);
		System.out.println("Fuel Efficiency (km/l): " + calculateFuelEfficiency);
		double calculateFuelEfficiency2 = v1.calculateFuelEfficiency();
		System.out.println("Fuel Efficiency (miles/gallon): " + calculateFuelEfficiency2);
		System.out.println();

		Car c1 = new Car(10.0, 1.0);
		double calculateFuelEfficiency3 = c1.calculateFuelEfficiency();
		System.out.println("Car Fuel Efficiency (miles/gallon): " + calculateFuelEfficiency3);
		System.out.println("Fuel Efficiency (km/l): " + c1.calculateFuelEfficiency(500,50));
	}

}
