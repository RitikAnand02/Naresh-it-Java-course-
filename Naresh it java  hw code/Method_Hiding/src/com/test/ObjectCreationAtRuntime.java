package com.test;

class Employee{}

class Student{}

public class ObjectCreationAtRuntime 
{
	public static void main(String[] args) throws Exception
	{
		Object obj = Class.forName(args[0]).newInstance();
		System.out.println("Object created for :"+obj.getClass().getName());
	}
}

//Note : At runtime by using command line argument, we can pass
//       class name so object will be created for the corresponding class.