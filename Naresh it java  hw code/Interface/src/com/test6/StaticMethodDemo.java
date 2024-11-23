package com.test6;

//The following program explains that static method of an interface can be accessible through interface only.

interface Printable
{
	static void print()
	{
		System.out.println("Static Method of interface");
	}
}

class Print implements Printable
{
}

public class StaticMethodDemo 
{
	public static void main(String[] args) 
	{
		//Print.print();  //Invalid
		Print p1 = new Print();
		//p1.print();  //Invalid
		
		Printable.print();
	}
}
