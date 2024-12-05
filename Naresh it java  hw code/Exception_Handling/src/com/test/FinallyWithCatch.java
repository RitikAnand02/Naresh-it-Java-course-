package com.test;

public class FinallyWithCatch 
{
	public static void main(String[] args) 
	{		
		try
		{			
		    int []x = new int[-2];	
		    x[0] = 12;
		    x[1] = 15;
		    System.out.println(x[0]+" : "+x[1]);	   
		   
		}
		catch(NegativeArraySizeException e)
		{		
			System.err.println("Array Size is in negative value...");
			 
		}
		finally
		{
		   System.out.println("Resources will be handled here!!");		   
		}
		System.out.println("Main method ended!!!");
	}
}

//In the above program exception and resourses both are handled because we have a combination of try-catch and finally.
//
//Note :- In the try block if we write System.exit(0) and if this line is executed then finally block will not be executed.
