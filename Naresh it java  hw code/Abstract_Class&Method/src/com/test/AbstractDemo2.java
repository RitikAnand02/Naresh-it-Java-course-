package com.test;

abstract class Bike
{
	protected int speed = 60;
	
	public Bike()
	{
		System.out.println("Bike class Constructor...");
	}
	
	public void getBikeDetails()
	{
		System.out.println("It has two wheels....");
	}
	
	public abstract void run();	
}

class Honda extends Bike
{
	
	@Override
	public void run() 
	{
		System.out.println("Honda Bike is Running");		
	}	
}

public class AbstractDemo2 
{
	public static void main(String[] args) 
	{
		Bike obj = new Honda();
		System.out.println("Bike speed is :"+obj.speed);
		obj.getBikeDetails();
		obj.run();
	}

}

//Note : Any constructor of abstract class will also be executed with sub class object using super keyword.
