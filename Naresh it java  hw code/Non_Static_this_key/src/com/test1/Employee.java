package com.test1;

public class Employee {
	int employeeId = 111;
	String employeeName = "Raj";

	public void getData() {
		int employeeId = 222;
		String employeeName = "Smith";

		System.out.println("Employee Id is :" + employeeId);
		System.out.println("Employee Name is :" + employeeName);
		System.out.println("Employee Id is :" + this.employeeId);
		System.out.println("Employee Name is :" + this.employeeName);
	}
}
