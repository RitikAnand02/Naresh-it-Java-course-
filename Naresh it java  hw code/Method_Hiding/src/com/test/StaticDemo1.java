package com.test;

class Base
{
	public static void m1()
	{
		System.out.println("Base class static method");
	}
}
class Derived extends Base
{
}

public class StaticDemo1 
{
	public static void main(String[] args) 
	{
	  Derived.m1();	
	  
	  Derived d = new Derived();
	  d.m1();
	}
}
