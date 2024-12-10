package com.test;

//WAP to develop custom Unchecked Exception :

import java.util.Scanner;

@SuppressWarnings("serial")
class GreaterMarksException extends RuntimeException
{
	public GreaterMarksException()
	{		
	}
	public GreaterMarksException(String errorMessage)
	{
		super(errorMessage);
	}
}


public class CustomUnchecked 
{
	public static void main(String[] args) 
	{
		validateStudentMarks();
    }
	
	
	public static void validateStudentMarks()
	{
		Scanner sc = new Scanner(System.in);
		try(sc)
		{
			System.out.println("Enter your marks :");
			int marks = sc.nextInt();
			
			if(marks > 100)
			{
				throw new GreaterMarksException("Invalid Marks");
			}
			else
			{
				System.out.println("Your Marks is :"+marks);
			}
		}
		catch(GreaterMarksException e)
		{
			e.printStackTrace();
			System.out.println("..........");
			System.out.println(e.getMessage());
		}
		
	}

}