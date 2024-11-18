package com.test;

final class Test
{
	private int data = 100;

	public Test(int data)
	{
		this.data = data;
		System.out.println("Data value is :"+data);
	}
}
public class FinalClassEx1 
{
	public static void main(String[] args) 
	{
		Test t1 = new Test(200);
		
	}
}

//We can create an object for final class as well as we can the modify the data.
