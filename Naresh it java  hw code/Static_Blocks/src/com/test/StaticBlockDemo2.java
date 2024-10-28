package com.test;

class Foo1
{	
	static int x;

    static
	{		
		System.out.println("x value is :"+x);
	}	
}

public class StaticBlockDemo2 
{
	public static void main(String[] args) 
	{
		 new Foo1();
	}
}
//Note : static variables are also having default value.