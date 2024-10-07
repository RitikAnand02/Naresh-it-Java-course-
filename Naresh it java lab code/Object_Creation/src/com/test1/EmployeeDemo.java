
package com.test1;

import java.util.Scanner;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your First Name:");
		String firstName = sc.nextLine();

		System.out.println("Enter Your Last Name:");
		String lastName = sc.nextLine();

		System.out.println("Enter Your Employee Id:");
		int employeeId = sc.nextInt();

		System.out.println("Enter Your Salary:");
		double salary = sc.nextDouble();

		System.out.println("Enter Your No Of Project:");
		int noOfProject = sc.nextInt();
		e1.setEmployeeData(firstName, lastName, employeeId, salary, noOfProject);
		e1.calculateSalary();
		System.out.println(e1);
		sc.close();
	}

}
