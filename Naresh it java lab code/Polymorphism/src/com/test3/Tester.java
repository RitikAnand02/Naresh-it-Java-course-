package com.test3;

public class Tester {
	public static void main(String[] args) {
		Employee e1 = new Employee(160d,15d);
		double calculateSalary = e1.calculateSalary();
		System.out.println("Monthly salary of hourly employee: "+calculateSalary);
		System.out.println();
		
		Employee e2 = new Employee(60000d);
		double calculateSalary2 = e2.calculateSalary(60000d);
		System.out.println("Monthly salary of salaried employee: "+calculateSalary2);
		System.out.println();
		
		Employee e3 = new Employee(50000d, 0.10f);
		double calculateSalary3 = e3.calculateSalary(50000d, 0.10f);
		System.out.println("Commission of employee: "+calculateSalary3);
	}

}
