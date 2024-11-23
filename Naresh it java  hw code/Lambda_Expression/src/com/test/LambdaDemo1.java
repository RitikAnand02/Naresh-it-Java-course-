package com.test;

@FunctionalInterface
interface Vehicle
{
	void run();	
}

public class LambdaDemo1
{
	public static void main(String[] args) 
	{
		Vehicle car = ()-> System.out.println("Car is running");
		car.run();
		
		Vehicle bike = ()-> System.out.println("Bike is running");
		bike.run();
		
		Vehicle bus = ()-> System.out.println("Bus is running");
		bus.run();
		
		
	}

}