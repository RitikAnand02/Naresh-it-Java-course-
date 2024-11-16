package com.test;

class Base3
{
	public static void m1()
	{
		System.out.println("Static method of Base class");
	}
}
class Derived3 extends Base3
{
	
	public static void m1() //Method Hiding
	{
		System.out.println("Static method of Derived class");	
	}
}

public class StaticDemo4 
{
	public static void main(String[] args) 
	{
	   Base3 b = new Derived3();
	   b.m1();
	}
}