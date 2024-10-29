package com.test;

class Demo3
{
	static int x = 10;
	static
	{
		System.out.println("Static Block of Demo class Executed!!! :"+x);
	}
}
public class ClassLoading 
{
	public static void main(String[] args) 
	{	
		System.out.println("Main Method");
		//new Demo();
	    System.out.println(Demo3.x);	
	}
}
