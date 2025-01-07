package com.test1;

public record Employee(Integer employeeId, String employeeName) implements Comparable<Employee>
{
	@Override
	public int compareTo(Employee e2) 
	{
		return this.employeeName().compareTo(e2.employeeName());
	}

}
