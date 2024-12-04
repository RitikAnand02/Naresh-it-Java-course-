package com.test;

import java.util.Scanner;

public class TryDemo 
{
	public static void main(String[] args)  
	{		
		   System.out.println("Main method started....");	
		   Scanner sc = new Scanner(System.in);
		   
		   try
		   {
			   System.out.print("Enter the value of x :");
			   int x = sc.nextInt();
			   
			   System.out.print("Enter the value of y :");
			   int y = sc.nextInt();
			   
			   int result = x/y;
			   System.out.println("Result is :"+result);
			   System.out.println("End of try block");
			   
		   }
		   catch(Exception e)
		   {
			  System.out.println("Inside Catch Block");
			  System.err.println(e); 
		   }
		   System.out.println("Main method ended....");
		   sc.close();
	}
}


//In the above program if we put the value of y as 0 but still program will be executed normally because we have used try-catch so it is a 
//normal termination even we have an exception in the program.
