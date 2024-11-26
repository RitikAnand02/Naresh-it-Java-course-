package com.test1;

public class Main 
{
	public static void main(String[] args) 
	{
		EmployeeClass e1 = new EmployeeClass(111, "Scott");
		System.out.println(e1);
		EmployeeClass e2 = new EmployeeClass(111, "Scott");
		System.out.println(e1.equals(e2));
		System.out.println(e1.getEmpName());
		
		System.out.println("....................");
		
		EmployeeRecord r1 = new EmployeeRecord(222, "Virat");
		System.out.println(r1);
		EmployeeRecord r2 = new EmployeeRecord(222, "Virat");
		System.out.println(r1.equals(r2));
		System.out.println(r1.empName());
		

	}

}