package com.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SpecificException 
{
	public static void main(String[] args) 
	{
       System.out.println("Main started");
		
		Scanner sc = new Scanner(System.in);
		
		try
		{			
			System.out.print("Enter your Roll :");
			int roll = sc.nextInt();
			System.out.println("Your Roll is :"+roll);
			
		}
		catch(InputMismatchException e)
		{
			e.printStackTrace();
		}		
		sc.close();
		System.out.println("Main ended");
	}
}