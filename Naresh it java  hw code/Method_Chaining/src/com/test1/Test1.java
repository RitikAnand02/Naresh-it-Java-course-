package com.test1;


public class Test1 
{
	public static void main(String[] args)
	{
		System.out.println("Super class of Application class loader is :"+Test.class.getClassLoader().getParent());
	}

}

