package com.test;

class Super1
{
	
	{
		System.out.println("NSB");
	    try
	    {
			throw new ArithmeticException();
	    }
	    catch (ArithmeticException e)
	    {
			System.out.println("Handled");
	    }
	}
}

public class ExceptionDemo4 
{
	public static void main(String[] args) 
	{
		new Super1();      
	}	
}