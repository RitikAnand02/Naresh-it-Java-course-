package com.test;

//Static block of Outer and Inner class

class Outer3
{
	static int x = 100;
	static
	{
		System.out.println("Outer class static block");
	}

	static class Inner
	{
		static
	    {
		System.out.println("Inner class static block");
	    }

      public static void m1()
		{
			System.out.println("Static Method of inner class "+x);
		}

	}
}
public class Demo 
{	
	public static void main(String[] args) 
	{	 
	   Outer3.Inner.m1();
	}
}