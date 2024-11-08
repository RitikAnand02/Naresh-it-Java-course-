package com.test3;

public class Employee {
	private double hoursWorked;        
	private double hourlyRate;            
	private double annualSalary;	      
	private double salesAmount;
	private float commissionRate;
	public Employee(double hoursWorked,double hourlyRate) {
		super();
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}
	
	public Employee(double annualSalary) {
		super();
		this.annualSalary = annualSalary;
	}


	public Employee(double salesAmount, float commissionRate) {
		super();
		this.salesAmount = salesAmount;
		this.commissionRate = commissionRate;
	}

	public double calculateSalary() {
	     double result = this.hoursWorked * this.hourlyRate;
	     return result;
	}
	
	public double calculateSalary(double annualSalary) {
		double result = this.annualSalary /12.0;
		return result;
	}
	
	public double calculateSalary(double salesAmount, float commissionRate) {
		double result = this.salesAmount*this.commissionRate;
		return result;
	}

}
