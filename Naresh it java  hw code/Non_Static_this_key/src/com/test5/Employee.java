package com.test5;

public class Employee {
	int employeeId;
	String employeeName;
	double employeeSalary;
	char employeeGrade;

	public void setEmployeeData(int employeeId, String employeeName, double employeeSalary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", employeeGrade=" + employeeGrade + "]";
	}

	public void calculateEmployeeGrade() {
		if (this.employeeSalary >= 90000) {
			this.employeeGrade = 'A';
		} else if (this.employeeSalary >= 75000) {
			this.employeeGrade = 'B';
		} else if (this.employeeSalary >= 50000) {
			this.employeeGrade = 'C';
		} else {
			this.employeeGrade = 'D';
		}
	}

}
