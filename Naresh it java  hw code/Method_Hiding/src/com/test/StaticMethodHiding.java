package com.test;

class Animal
{
	public static void makeNoise()
	{
		System.out.println("Generic Animal is making Noise");
	}
}
class Dog extends Animal
{
	public static void makeNoise() //Method Hiding
	{
		System.out.println("Dog is making Noise");
	}
}

class Horse extends Animal
{
	public static void makeNoise() //Method Hiding
	{
		System.out.println("Horse is making Noise");
	}
}
public class StaticMethodHiding {

	public static void main(String[] args) 
	{
		Animal a = new Horse();
		a.makeNoise();

	}

}