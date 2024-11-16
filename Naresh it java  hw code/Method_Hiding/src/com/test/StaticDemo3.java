package com.test;

//We can't override any non static method with static method, If we try then it will generate an error, Overriding method is static.

class Base2
{
	public void m1()
	{
		System.out.println("Static method of Base class");
	}
}
class Derived2 extends Base2
{
	public static void m1() //error
	{
		System.out.println("Non static method");	
	}
}
public class StaticDemo3 
{
	public static void main(String[] args) 
	{	  
	}
}

//So, the conclusion is we cannot overide static with non static method as well as non-static with static method because static method belongs to class and non-static method belongs to object.
