package com.test;

import java.util.Scanner;

public class CustomerDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome client, Welcome to my application");
		Scanner sc = new Scanner(System.in);
		
		try
		{
			System.out.print("Enter the value of a :");
			int a = sc.nextInt();			
			
			System.out.print("Enter the value of b :");
			int b = sc.nextInt();			
			
			int result = a/b;
			System.out.println("Result is :"+result);
		}
		catch(Exception e)
		{
		   System.err.println("Sir, Don't put zero here");	
		}	
		
		sc.close();
		System.out.println("Thank you 4 visiting my application");

	}

}
//Note : The main purpose of exception handling to provide user-friendly message so client can enjoy the services of software/websites.
//
//Exception handlinag = No Abnormal Termination + User-friendly message on wrong input given by the client.
