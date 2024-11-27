package com.test2;

//Canonical Constructor (Components are final)
public record EmployeeRecord(int empId, String empName) 
{	
	//Compact constructor (Validate the outer World Data)
  public EmployeeRecord
  {
	   if(empId <= 0)
	   {
		   System.err.println("EmpId is invalid");
	   }	   
  }
}