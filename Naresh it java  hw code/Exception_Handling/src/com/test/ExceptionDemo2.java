package com.test;

class Ravi
{
	
}

public class ExceptionDemo2 
{
	public static void main(String[] args) 
	{
		try
		{
			throw new Ravi();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}

//Note : We will get compiletion error because Ravi class does not belong to exception hierarchy so it is not a throwable object.
