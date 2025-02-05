package com.test;

@FunctionalInterface
interface Worker3
{
	void work();
}

public class MethodRefDemo2 
{
	public static void main(String[] args)
	{
	  Worker3 w1 = Employee4::salary;
	  w1.work();

	}

}


class Employee4
{
	public static void salary()
	{
		System.out.println("Employee is Working for Salary");
	}
}
