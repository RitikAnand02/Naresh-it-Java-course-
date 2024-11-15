package com.test;

class Animal2
{
	protected String name = "Animal";
	
	public String roam()
	{
		return "Generic Animal is roaming";
	}	
}

class Lion extends Animal2
{
	protected String name = "Lion";  //Variable Hiding
	
	@Override
	public String roam()
	{
		return "Lion is roaming";
	}	
}

public class MethodOverridingDemo4 
{
	public static void main(String[] args) 
	{
		Animal2 a = new Lion();
		System.out.println(a.name+" : "+a.roam());

	}

}