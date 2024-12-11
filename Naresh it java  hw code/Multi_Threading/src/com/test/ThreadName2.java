package com.test;

import java.util.InputMismatchException;
import java.util.Scanner;

class BatchAssignment extends Thread
{
	@Override
	public void run()
	{
		String name = Thread.currentThread().getName();
		
		if(name !=null && name.equalsIgnoreCase("Placement"))
		{
			this.placementBatch();
		}
		else if(name !=null && name.equalsIgnoreCase("Regular"))
		{
			this.regularBatch();
		}
		else
		{
			throw new NullPointerException("Name can't be null");
		}
	}
	
	public void placementBatch()
	{
		System.out.println("I am a placement batch student.");
	}
	
	public void regularBatch()
	{
		System.out.println("I am a Regular batch student.");
	}
}


public class ThreadName2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);	
		try(sc)
		{
			System.out.print("Enter your Batch Title :");
			String title = sc.next();
			
			BatchAssignment b = new BatchAssignment();
			b.setName(title);
			
			b.start();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalid Input");
		}
		
		
	}

}