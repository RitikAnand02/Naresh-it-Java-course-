package com.test4;

public class Employee {
	public int employeeNumber;
	public String employeeName;
	public double employeeSalary;
	public Employee(int employeeNumber, String employeeName, double employeeSalary) {
		super();
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	
	
	public int getEmployeeNumber() {
		return employeeNumber;
	}


	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public double getEmployeeSalary() {
		return employeeSalary;
	}


	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}



	
	

}
