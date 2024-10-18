package com.test;
class MyDemo
{
	public MyDemo()
	{
		System.out.println("My Demo Constructor");
		
		{
			System.out.println("Non static Block");
		}
	}
}

public class InstanceBlockDemo6 {
	public static void main(String[] args) 
	{		
        new MyDemo();
	}
	
}

//Note : If we wtite NSB in the constructor body then it will be executed as it is.