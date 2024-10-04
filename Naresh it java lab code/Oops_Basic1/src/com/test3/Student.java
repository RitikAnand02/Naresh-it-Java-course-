package com.test3;

import java.util.Scanner;

public class Student {
	int Studentid;
	String Studentname;
	double Studentfees;

	public void setStudentData() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Student Id is: ");

		Studentid = sc.nextInt();

		System.out.print("Enter Student Name is: ");

		Studentname = sc.nextLine();

		System.out.print("Enter Student Fees is: ");

		Studentfees = sc.nextDouble();
		sc.close();
	}

	public void getStudentData() {
		System.out.println("The Student Id is: " + Studentid);
		System.out.println("The Student Name is: " + Studentname);

		System.out.println("The Student Fees is: " + Studentfees);
	}

}
