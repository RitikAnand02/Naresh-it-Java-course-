package com.test;

public class PrintStackTrace 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started...");		
		try
		{
			String x = "NIT";
			int y = Integer.parseInt(x); 
			System.out.println(y);	
		}
		catch(Exception e)
		{
			e.printStackTrace(); //For complete Exception details
			System.out.println("---------------------------");
			System.out.println("............................");
			System.err.println(e.getMessage()); //only for Exception message	
			System.out.println("..............");
			System.err.println(e.toString());
		}
		System.out.println("Main method ended...");		

	}

}
