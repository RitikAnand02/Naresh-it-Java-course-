package com.test1;

import java.util.Scanner;

public class EmployeeDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Frist name:");
		String firstName = sc.nextLine();
		System.out.println("Enter your Last name:");
		String LastName = sc.nextLine();
		System.out.println("Enter your Employee Id:");
		int employeeId = sc.nextInt();
		System.out.println("Enter your Salary:");
		double Salary = sc.nextDouble();
		System.out.println("Enter your No Of Project:");
		int noOfProject = sc.nextInt();
		Employee e1 = new Employee(firstName,LastName,employeeId,Salary,noOfProject);

		
	
		e1.calculateSalary();
		System.out.println(e1.toString());
		sc.close();
		
	}

}
