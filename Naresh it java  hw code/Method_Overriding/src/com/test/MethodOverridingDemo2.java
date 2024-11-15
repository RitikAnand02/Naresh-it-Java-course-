package com.test;

class Animal
{
	public void sleep()
	{
		System.out.println("Generic Animal is sleeping");
	}
}

class Dog extends Animal
{
	public void sleep()
	{
		System.out.println("Dog Animal is sleeping");
	}
}
class Puppy extends Dog
{
	@Override
	public void sleep()
	{
		System.out.println("Puppy Animal is sleeping");
	}
}
public class MethodOverridingDemo2 
{
	public static void main(String[] args)
	{
		Animal a = new Puppy();
		a.sleep();
	}
}