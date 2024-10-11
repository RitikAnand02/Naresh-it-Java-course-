package com.test2;

import java.util.Scanner;

public class OwnerDemo {

	public static void main(String[] args) {
		Owner o1 = new Owner();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Owner Name");
		String ownerName = sc.nextLine();
		System.out.println("Enter Owner Id");
		int ownerId = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Address");
		String address = sc.nextLine();
		
		o1.setOwnerDetails(ownerName, ownerId, address);
		System.out.println(o1.toString());
		sc.close();
		

	}

}
