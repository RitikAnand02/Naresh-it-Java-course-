package com.test4;

import java.util.Scanner;

public class PlanetDemo {

	public static void main(String[] args) {
		Planet p1 = new Planet();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Planet Name");
		String planetName = sc.nextLine();
		
		System.out.println("Enter mass");
		double mass = sc.nextDouble();
		
		System.out.println("Enter radius");
		double radius = sc.nextDouble();
		
		p1.setPlanetDetails(planetName, mass, radius);
		System.out.println(p1.toString());
		sc.close();

	}

}
