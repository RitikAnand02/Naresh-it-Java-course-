package com.test5;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmployeeData(111, "Scott", 99000);
		emp.calculateEmployeeGrade();
		System.out.println(emp);

	}

}
