package com.test;

class Vehicle
{
	public int getHorsePower()
	{
		return 1000;
	}
	
	public void printHorsePower()
	{
		System.out.println(this.getHorsePower());
	}
	
}

class Car extends Vehicle
{
	@Override
	public int getHorsePower()
	{
		return 1200;
	}
	
	public void printHorsePower()
	{
		System.out.println(super.getHorsePower());
	}
}

public class MethodOverriding {

	public static void main(String[] args) 
	{
		Vehicle v = new Car();
		v.printHorsePower();

	}

}
