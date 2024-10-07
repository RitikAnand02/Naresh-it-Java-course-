package com.test1;

public class Employee {
	String firstName;
	String lastName;
	int employeeId;
	int noOfProject;
	double salary;

	public void setEmployeeData(String firstName, String lastName, int employeeId, double salary, int noOfProject) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.salary = salary;
		this.noOfProject = noOfProject;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", employeeId=" + employeeId
				+ ", salary=" + salary + ", noOfProject=" + noOfProject + "]";
	}

	public void calculateSalary() {

		if ((this.noOfProject >= 5) && (this.noOfProject <= 10)) {
			this.salary = salary + 5000;

		} else if ((this.noOfProject > 10) && (this.noOfProject <= 20)) {
			this.salary = salary + 10000;
		} else {
			this.salary = salary + 20000;
		}
	}
}
