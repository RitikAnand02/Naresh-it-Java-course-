package com.test2;

import java.util.Scanner;

public class SportsDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Sport Name: ");
		String sportName = sc.nextLine();
		
		System.out.println("Enter Team Size: ");
		int teamSize = sc.nextInt();
		
		System.out.println("Enter Sport Type: ");
		String sportType = sc.nextLine();
		sportType = sc.nextLine();
		
		Sports s1 = new Sports();
		Sports s2 = new Sports(sportName,teamSize);
		Sports s3 = new Sports(sportName,teamSize,sportType);
		s1.displayInfo();
		s2.displayInfo();
		s3.displayInfo();
  	    sc.close();

	}

}
