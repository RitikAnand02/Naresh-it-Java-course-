package com.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithCatchInsideCatch 
{	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		try(sc )
		{			
			System.out.print("Enter your Roll number :");
			int roll = sc.nextInt();
			System.out.println("Your Roll is :"+roll);			
			
		}	
		catch(InputMismatchException e)
		{
			System.err.println("Provide Valid input!!");
			
			try
			{
				System.out.println(10/0);
			}
			catch(ArithmeticException e1)
			{
			  System.err.println("Divide by zero problem");	
			}
			
		}
		finally
		{
			try
			{
				throw new ArrayIndexOutOfBoundsException("Array is out of bounds");
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.err.println("Array is out of Bounds");
			}
		}
	}

}
//Note : inside finally block we can write try catch block.
