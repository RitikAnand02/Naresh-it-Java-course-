package com.test;
class Foo
{
	int x;
	
	public Foo()
	{
		x = 400;
		System.out.println("x value is :"+x);
	}
	
	{
		x = 100;
		System.out.println("x value is :"+x);
	}
	
	{
		x = 200;
		System.out.println("x value is :"+x);
	}
	
	{
		x = 300;
		System.out.println("x value is :"+x);
	}
}

public class InstanceBlockDemo4 {
	public static void main(String[] args) 
	{
		new Foo();
	}

}

//Note : Execution of the NSB from top to bottom
