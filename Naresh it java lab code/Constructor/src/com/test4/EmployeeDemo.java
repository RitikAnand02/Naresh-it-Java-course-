package com.test4;

import java.util.Scanner;

public class EmployeeDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter empolyee Number");
		int employeeNumber = sc.nextInt();
		 sc.nextLine();
		
		
		System.out.println("Enter empolyee Name");
		String employeeName = sc.nextLine();
		
		System.out.println("Enter empolyee Salary");
		double employeeSalary = sc.nextDouble();
		
		Employee e1 = new Employee(employeeNumber,employeeName,employeeSalary);
		
		String ename = e1.getEmployeeName();
		double esalary = e1.getEmployeeSalary();
		int eid = e1.getEmployeeNumber();
		if(eid<0)
		{
			System.err.println("id must be always positive integer");
			System.exit(0);
		}
		else if(esalary<0.0)
		{
			System.err.println("Salary cannot be negative");
			System.exit(0);
		}
		else if(ename=="") {
			System.err.println("name must initialize with any default name");
			System.exit(0);
		}
		else if(esalary>=60000)
		{
			System.out.println(ename+" is a Developer");
		}
		else if(esalary>=40000 && esalary<60000)
		{
			System.out.println(ename+" is a Designer");
		}
		else
		{
			System.out.println(ename+" is a Tester");
		}
		sc.close();

	}

}
