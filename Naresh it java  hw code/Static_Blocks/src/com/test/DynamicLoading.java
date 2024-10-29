package com.test;

class Test2
{
	static
	{
		System.out.println("Class Loaded....");
	}
	
}
public class DynamicLoading 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.test.Test2");
	}
}

//Note : From the above program it is clear that Class.forName(String className) is used to load the given .class file dynamically at runtime.

//Eclipse IDE always accept Fully Qualified Name (FQN) [Package Name + Class Name]
