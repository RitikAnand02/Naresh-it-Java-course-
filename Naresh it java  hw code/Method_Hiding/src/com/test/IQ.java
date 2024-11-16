package com.test;

class Bird
{
	protected int weathers = 2;
	
	public static void fly()
	{
		System.out.println("Bird is flying");
	}
}
class Parrot extends Bird
{
   protected int weathers = 4;
	
	public static void fly()
	{
		System.out.println("Parrot is flying");
	}
}

public class IQ {

	public static void main(String[] args) 
	{
		Parrot p = new Parrot();		
		Bird b = p;
		System.out.println(p.weathers);
		System.out.println(b.weathers);
		
		System.out.println("..........");
		p.fly();
		b.fly();

	}

}
