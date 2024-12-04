//WAP that describes that whenever an exception is encounter in the program then program will be terminated in the middle.


package com.test;

import java.util.Scanner;

public class AbnormalTermination 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method Started!!!");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of x :");
		int x = sc.nextInt();
		
		System.out.print("Enter the value of y :");
		int y = sc.nextInt();
		
		int result = x/y;
		System.out.println("Result is :"+result);
		
		System.out.println("Main method Completed!!!");
		sc.close();	
	
	}
}


//In the above program, If we put the value of y as 0 then program will be terminated in the middle, IT IS CALLED ABNORMAL TERMINATION.
//Actually JVM has a default exception handler which is responsible to handle the execption and terminate the program in the middle abnormaly.