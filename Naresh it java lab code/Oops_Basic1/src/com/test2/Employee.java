package com.test2;

import java.util.Scanner;

public class Employee {
	int Employeeid;
	String Employeename;
	double Employeesalary;

	public void setEmployeeData() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Employee Id is: ");

		Employeeid = sc.nextInt();

		System.out.print("Enter Employee Name is: ");

		Employeename = sc.nextLine();

		System.out.print("Enter Employee Salary is: ");

		Employeesalary = sc.nextDouble();
		sc.close();
	}

	public void getEmployeeData() {
		System.out.println("The Employee Idis: " + Employeeid);
		System.out.println("The Employee Name is: " + Employeename);

		System.out.println("The Employee Salary is: " + Employeesalary);
	}
}
