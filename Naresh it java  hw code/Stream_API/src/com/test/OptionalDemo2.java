package com.test;

//Writing different style of setter and getter

import java.util.Optional;

class Employee2
{
	private Integer employeeId;
	private String employeeName;
	
	public Employee2() 
	{
		super();		
	}

	public Employee2(Integer employeeId, String employeeName) 
	{
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	public Optional<Integer> getEmployeeId() 
	{
		return Optional.ofNullable(employeeId);
	}

	public Optional<String> getEmployeeName() 
	{
		return Optional.ofNullable(employeeName);
	}
}

public class OptionalDemo2 {

	public static void main(String[] args) 
	{
		//Employee emp1 = new Employee();
		Employee2 emp1 = new Employee2(111,"Scott");
		
		
		//Approach 1
		Optional<Integer> employeeId = emp1.getEmployeeId();
		
		if(employeeId.isPresent())
		{
			System.out.println("Id is :"+employeeId.get());
		}
		else
		{
			System.err.println("employeeid is not available");
		}
		
		//Approach2
		  Optional<String> employeeName = emp1.getEmployeeName();
		  String empName = employeeName.orElse("employee name is not available");
        System.out.println("Name is :"+empName);
        
       
        
	}

}