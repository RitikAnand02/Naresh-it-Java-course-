package com.test;


class Test
{	
	public Test()
	{
		System.out.println("No Argument Constructor...");
	}
	
	{
		System.out.println("Non static Block1");
	}
	
	{
		System.out.println("Non static Block2");
	}
	
}


public class InstanceBlockDemo1 {

	public static void main(String[] args) 
	{
		Test t1 = new Test();
		Test t2 = new Test();
	}

}

//Note : NSB will be exected before the constructor body.
