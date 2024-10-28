package com.test;

//static block
class Foo
{	
	
	Foo()
	{
		System.out.println("No Argument constructor..");
	}

	{
		System.out.println("Instance block..");
	}

	static
	{
		System.out.println("Static block...");
	}
	
}
public class StaticBlockDemo 
{	
	public static void main(String [] args) 
	{ 			
	
      System.out.println("Main Method Executed ");		
	}
	 
}

//Here Foo.class file is not loaded into JVM Memory so static block of Foo class will not be executed.

