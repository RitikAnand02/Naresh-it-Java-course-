package com.test;

class Sample
{
	int x;
	
	public Sample()
	{
		System.out.println("x value is :"+x);
	}
	
	{
		 x = 100;
		 System.out.println("Object creation in Progress....");
	}
	
}

public class InstanceBlockDemo3 {
	public static void main(String[] args) 
	{
		Sample s1 = new Sample();
		Sample s2 = new Sample();

	}

}

//Note : Can initialize the instance variable using NSB
