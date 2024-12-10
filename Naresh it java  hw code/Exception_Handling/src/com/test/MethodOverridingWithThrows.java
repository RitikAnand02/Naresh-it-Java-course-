package com.test;

import java.io.FileNotFoundException;

class Base
{
	public void show() throws FileNotFoundException
	{
		System.out.println("Super class method ");
	}
}
class Derived extends Base
{
	public void show() //throws IOException
	{
		System.out.println("Sub class method ");
	}
}

public class MethodOverridingWithThrows 
{
	public static void main(String[] args) 
	{
	  System.out.println("Overridden method may or may not throw checked exception but if it is throwing then must be same or sub class");	
	}

}