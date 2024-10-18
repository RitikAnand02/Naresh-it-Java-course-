package com.test;
class Demo
{
	public Demo()
	{
		this(10);
		System.out.println("No Argument Constructor");
	}
	
	public Demo(int x)
	{
		System.out.println("Parameterized Constructor :"+x);
	}
	
	{
		System.out.println("Non static Block");
	}
}

public class InstanceBlockDemo2 {
	public static void main(String[] args) 
	{
		new Demo();
	}

}

//Note : Compiiler will add NSB in the constructor which contains 
//super()
