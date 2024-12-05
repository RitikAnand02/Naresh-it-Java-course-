package com.test;

public class FinallyBlock 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		
		try
		{		
			System.out.println(10/0);			
		}		
		finally
		{	
			System.out.println("Finally Block");
		}
		
		System.out.println("Main method ended");
	}

}

//Note : Here we have an exception in the try block but still finally block will be executed.
