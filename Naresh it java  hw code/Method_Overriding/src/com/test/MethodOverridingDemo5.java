package com.test;

class Vehicle
{
	private void digitalMeter()
	{
		System.out.println("Generic Digital Meter");
	}
}
class Car extends Vehicle
{
	//Re-declaration of Method [Not an Overridden Method]
	public void digitalMeter()
	{
		System.out.println("Car Digital Meter");
	}
}


public class MethodOverridingDemo5 
{
	public static void main(String[] args) 
	{
		new Car().digitalMeter();
		
	}
}

//Note :- private method of super class is not available or not inherited in the sub class so if the sub class declare the method with same signature then it is not overridden method, actually it is re-declared in the sub class. 
