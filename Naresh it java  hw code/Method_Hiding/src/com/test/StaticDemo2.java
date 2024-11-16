//We can't override a static method with non static method because static method belongs to class and non static method belongs to object, If we try to override static method with non static method then it will generate an error i.e overridden method is static as shown below.


package com.test;

class Base1
{
	public static void m1()
	{
		System.out.println("Static method of Base class");
	}
}
class Derived1 extends Base1
{
	public void m1() //error
	{
		System.out.println("Non static method");
		
	}
}

public class StaticDemo2 
{
	public static void main(String[] args) 
	{
	  
	}
}
