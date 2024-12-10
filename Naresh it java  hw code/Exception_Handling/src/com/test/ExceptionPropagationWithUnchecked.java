package com.test;

//Program that describes Exception propagation with Unchecked Exception

public class ExceptionPropagationWithUnchecked 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started..."); //1
		try
		{
			m1();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Hanled in main");
		}
		System.out.println("Main method ended...");
	}
	
	public static void m1()
	{
		System.out.println("M1 method started..."); //2
		m2();
		System.out.println("M1 method ended...");
	}

	public static void m2()
	{
		System.out.println(10/0);  //3
	}
}