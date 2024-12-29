package com.test;

public class Test1
{
	public static void main(String[] args) 
	{
		enum Month
		{
			JANUARY, FEBRUARY,MARCH     //public + static + final
		}

		System.out.println(Month.MARCH);
	}
}

//We can write an enum inside a method.
