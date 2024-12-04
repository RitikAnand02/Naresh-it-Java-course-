package com.test;

public class ExceptionDemo1 
{
	public static void main(String[] args) 
	{
		try
		{
		  // System.out.println(10/0);	
			         //OR
		  throw	new ArithmeticException("Ravi is dividing by zero");
		  
		}
		catch (Exception e)
		{
			System.out.println("Inside Catch block");
			System.out.println(e);
		}
	}
}

//From the above program it is clear that try block implicitly creating the exception object with the help of JVM and throwing the execption object to the nearest catch block.