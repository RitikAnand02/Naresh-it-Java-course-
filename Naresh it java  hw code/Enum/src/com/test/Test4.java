package com.test;

public class Test4 
{
	private enum Season   //private, public, protected, static
	{
	SPRING, SUMMER, WINTER, RAINY;
	}

	public static void main(String[] args) 
	{
		System.out.println(Season.RAINY);
	}
}

//An enum defined inside a class can be private, static, default, public and protected, It can't be final and abstract.