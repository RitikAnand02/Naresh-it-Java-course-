package com.test;

class OuterClass 
{
	private int x = 200;
	
	class InnerClass
	{
		public void display()  //Inner class display method
		{
		System.out.println("Inner class display method");
		}
		
		public void getValue()
		{
			display();
			System.out.println("Can access outer private var :"+x);
		}
	}
       
		public void display()  //Outer class display method
		{
			System.out.println("Outer class display");
		}	
}
public class Test9
{
	public static void main(String [] args)
	{
		OuterClass.InnerClass inobj = new OuterClass().new InnerClass();
		inobj.getValue();
		
		System.out.println("...............");

		new OuterClass().display();

	}
}
