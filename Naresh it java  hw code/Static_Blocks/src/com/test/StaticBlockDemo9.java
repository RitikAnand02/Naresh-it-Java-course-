package com.test;

class Test1
{   
  public static final Test1 t1 = new Test1();   //t1 = null
	 
   static
	{
	   System.out.println("static block");
	}

	{
	   System.out.println("Non static block");
	}

	Test1()
	{
		System.out.println("No Argument Constructor");
	}
	
	
	
}

public class StaticBlockDemo9 
{
	public static void main(String[] args) 
	{
		new Test1();
	}
}

//Note : First non static block, constructor then only static block will be executed.
