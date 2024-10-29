package com.test;

class Foo2
{
	static
	{
		System.out.println("static block of Foo class");
	}
}
public class ClassNotFoundExceptionDemo 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("Player");
	}
}

//Note : Here Player.class file is not available at runtime so, we will get java.lang.ClassNotFoundException.