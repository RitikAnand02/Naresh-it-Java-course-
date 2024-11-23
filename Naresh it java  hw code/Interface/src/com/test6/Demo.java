package com.test6;

class A
{
	public static void m1()
	{
		System.out.println("Static method A");
	}
}
class B extends A
{
	
}
public class Demo
{
	public static void main(String [] args)
	{
		        A.m1();
                B.m1();  //valid
	            new B().m1(); //valid
	}
}