package com.test;

//Program to close Scanner class automatically using try with resourses

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerAutoClose {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		try(sc)
		{
			System.out.println("Enter your Roll Number :");
			int roll = sc.nextInt();
			System.out.println("Your Roll number is :"+roll);
		}
		catch(InputMismatchException e)
		{
			System.err.println("Input is not in a proper format");
		}

		System.out.println("Exception and resourses both are handled");
	}

}


//Note :- Scanner class internally implementing Closeable interface so it is providing auto closing facility from java 1.7, as a user we need to pass the reference of Scanner class inside try with resources try()
//
//
//Whenver we write try with resourses then automatically compiler will generate finally block internally to close the resourses automatically.
