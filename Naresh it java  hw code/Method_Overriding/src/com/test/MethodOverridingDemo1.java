package com.test;

class Bird
{
	public void fly()
	{
		System.out.println("Generic bird is flying..");
	}
}
class Parrot extends Bird
{
	public void fly()
	{
		System.out.println("Parrot bird is flying..");
	}
}
class Sparrow extends Bird
{
	public void fly()
	{
		System.out.println("Sparrow bird is flying..");
	}
}

public class MethodOverridingDemo1 
{
	public static void main(String[] args) 
	{
		Bird b = null;
		
		b = new Parrot(); b.fly(); //Dynamic Method Dispatch
		
		b = new Sparrow(); b.fly(); //Dynamic Method Dispatch

	}
}
