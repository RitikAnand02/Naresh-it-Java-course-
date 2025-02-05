package com.test;

@FunctionalInterface
interface Worker4
{
	void work(double salary);
}

public class MethodRefDemo3
{
	public static void main(String[] args)
	{
	   Worker4 w1 = new Employee5()::salary;
	   w1.work(55000);

	}
}

class Employee5
{
	public void salary(double salary)
	{
		System.out.println("Employee Salary is :"+salary);
	}
}