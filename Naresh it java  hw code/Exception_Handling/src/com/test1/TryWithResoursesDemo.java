package com.test1;

public class TryWithResoursesDemo {

	public static void main(String[] args) throws Exception
	{
		DatabaseResourse dr = new DatabaseResourse();
		FileResourse fr = new FileResourse();
		
		try(dr; fr)
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.err.println("Don't put zero here");
		}
		
	}

}