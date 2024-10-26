package com.test1;

public class Test2 
{
	public static void main(String[] args)
	{
		ClassLoader parent = Test.class.getClassLoader().getParent().getParent();
		System.out.println(parent);
	}

}

//Note :- Here we will get the output  as null because it is built in class loader for JVM which is used for internal purpose (loading only predefined .class file) so implementation is not provided hence we are getting null.
