package com.test1;

import java.util.Scanner;

public class Employee {
	private int employeeId;
    private String employeeName;
    private double employeeSalary;
	public Employee(int employeeId, String employeeName, double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	} 
    
    public static Employee getEmployeeObject() {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter Employee Id: ");
    	int employeeId = sc.nextInt();
    	sc.nextLine();
    	
    	if(employeeId<0)
    	{
    		System.err.println("Employee Id Must Be Positive");
    		//System.exit(0);
    		return null;
    	}
    	
    	System.out.println("Enter Employee Name: ");
    	String employeeName = sc.nextLine();
    	
    	System.out.println("Enter Employee Salary: ");
    	double employeeSalary = sc.nextDouble();
    	
    	return new Employee(employeeId,employeeName,employeeSalary);
    	
    }
    
}

