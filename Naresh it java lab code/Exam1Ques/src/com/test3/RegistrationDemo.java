package com.test3;

import java.util.Scanner;

public class RegistrationDemo {

	public static void main(String[] args) {
		Registration r1 = new Registration();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Vehicle");
		String vehicle = sc.nextLine();
		
		System.out.println("Enter Owner");
		String owner = sc.nextLine();
		
		System.out.println("Enter Registration Date");
		String registrationDate = sc.nextLine();
		
		r1.setRegistrationDetails(vehicle, owner, registrationDate);
		System.out.println(r1.toString());
		sc.close();

	}

}
