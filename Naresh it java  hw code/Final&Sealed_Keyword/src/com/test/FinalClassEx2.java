package com.test;

final class Sample
{
	private Sample() //Private Constructor
	{
	}
	public void m1()
	{
		System.out.println("Sample class m1 method");
	}
}
public class FinalClassEx2 
{
	public static void main(String[] args) 
	{
		
	}
}

//Note : If a class contains private constructor then we should declare that class with final access modifier because we can't create sub class for the class which contains private constructor as shown in the program.
