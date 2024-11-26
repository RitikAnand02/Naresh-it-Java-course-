package com.test1;

import java.util.Objects;

public class EmployeeClass {
	private int empId;
	private String empName;

	public EmployeeClass(int empId, String empName)
	{
		super();
		this.empId = empId;
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "EmployeeClass [empId=" + empId + ", empName=" + empName + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(empId, empName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeClass other = (EmployeeClass) obj;
		return empId == other.empId && Objects.equals(empName, other.empName);
	}	

}
