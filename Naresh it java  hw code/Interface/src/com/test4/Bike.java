package com.test4;

public class Bike implements Vehicle 
{
	@Override
	public void run() 
	{
		System.out.println("Bike is Running");
	}

	@Override
	public void horn() 
	{
		System.out.println("Bike is having horn");		
	}
}