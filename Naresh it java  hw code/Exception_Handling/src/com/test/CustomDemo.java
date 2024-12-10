package com.test;

class Test extends Throwable
{
	public Test(String errorMessage)
	{
	  super(errorMessage);
	}
}

public class CustomDemo 
{
	public static void main(String[] args) 
	{		
		try
		{
			throw new Test("Test Problem");
		}
		catch(Throwable e)
		{			
		}

	}

}


//Here Test class is extending from Throwable class so it is throwable type of Object hence we can use throw keyword and it is also Checked Exception so handling is compulsory.