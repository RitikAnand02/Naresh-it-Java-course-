package com.test;

public class ExceptionDemo3 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Inside Try!!!");
			throw new OutOfMemoryError();
		}
		catch (Exception e)
		{
			System.out.println("Inside Catch!!!");
			System.out.println(e);
		}
	}
}

//Note : OutOfMemoryError can't be handled by Exception class.
