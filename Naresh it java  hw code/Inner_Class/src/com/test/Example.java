package com.test;

class FooOuter
{
	 int x = 15;
	 
	{
		System.out.println("Outer class non static block");
	}
	
	 class Inner  
	{
		 
		{
			System.out.println("Inner class non static block");
		}
		
		public  void m1()
		{
			System.out.println("m1 static method :"+x);
		}		
	}
}
public class Example 
{
  public static void main(String[] args) 
  {
	 FooOuter fo = new FooOuter(); //Outer class object
	 
	 FooOuter.Inner in = fo.new Inner(); //inner class object
	  in.m1();
   }
}

//Note : Here first of all Outer class non static block will be executed and then only inner class non static block will be executed because first we are creating the object for Outer class and it is required because inner class is a non static member of Outer class.
