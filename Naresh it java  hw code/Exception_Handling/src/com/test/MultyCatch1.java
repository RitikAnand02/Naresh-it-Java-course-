package com.test;

public class MultyCatch1 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started!!!");
		try
		{
		   String str1 = null;
		   System.out.println(str1.toUpperCase()); //NULL
		   
		   String str2 = "Ravi";
		   int x = Integer.parseInt(str2);
		   System.out.println("Number is :"+x);
		}
		catch(NumberFormatException  | NullPointerException  e)
		{
		  if(e instanceof NumberFormatException)
		  {
			  System.err.println("Number is not in a proper format");
		  }
		  else if(e instanceof NullPointerException)
		  {
			  System.err.println("ref variable is pointing to null");
		  }
		}

		System.out.println("Main method ended!!");
	}

}
