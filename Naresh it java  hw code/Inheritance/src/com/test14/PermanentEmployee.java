package com.test14;

public class PermanentEmployee extends Employee {
	protected String department;
	protected String designation;

	public PermanentEmployee(int employeeId, String employeeName, String employeeAddress, String department,	String designation)
	{
		super(employeeId, employeeName, employeeAddress);
		this.department = department;
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "PermanentEmployee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAddress="
				+ employeeAddress + ", department=" + department + ", designation=" + designation + "]";
	}

}