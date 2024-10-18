package com.test;
class Sample1
{
	int x = 90;  //1st STEP
	
	public Sample1()  
	{
		super();
		x = 900; //STEP 3
	}
	
	{
		x = 120;  //STEP 2
	}
	
}

public class InstanceVeriableInitializationOrder {
	public static void main(String[] args) 
	{
		Sample1 s1 = new Sample1();
		System.out.println("x value is :"+s1.x);

	}

}
