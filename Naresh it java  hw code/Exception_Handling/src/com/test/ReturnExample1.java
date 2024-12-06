package com.test;


public class ReturnExample1 {

	public static void main(String[] args)
	{
		System.out.println(m1());
	}

	@SuppressWarnings("finally")
	public static int m1()
	{	
		try
		{
			System.out.println("Inside try");
			return 100;
		}
		catch(Exception e)
		{
			System.out.println("Inside Catch");
			return 200;
		}
		finally
		{
			System.out.println("Inside finally");
			return 300;
		}
		
		// System.out.println("....");   Unreachable line
	}
}