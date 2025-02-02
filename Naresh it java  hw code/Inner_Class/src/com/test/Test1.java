package com.test;

class Outer 
{
	private int a = 15;

	class Inner 
	{
		public void displayValue() 
		{
			System.out.println("Value of a is " + a);
		}
	}
}
public class Test1
{
	public static void main(String... args)  
	{		
		Outer out = new Outer();

		Outer.Inner in = out.new Inner();

		in.displayValue();
		
	}
}
//Note : An inner class can directly access the private data of Outer class.