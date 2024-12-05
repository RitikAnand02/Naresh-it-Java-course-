package com.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyLimitation 
{
	public static void main(String[] args) 
	{
	   Scanner sc = null;
       try
       {
    	   sc = new Scanner(System.in);
    	   System.out.println("Enter your Marks :");
    	   int marks = sc.nextInt();
    	   System.out.println("Marks is :"+marks);    	   
       }
       catch(InputMismatchException e)
       {
    	   System.err.println("Input is invalid");
       }
       finally
       {
    	   System.out.println("Finally block");
    	   sc.close();
       }
		
	}
}
