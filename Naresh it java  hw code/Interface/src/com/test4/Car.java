package com.test4;

public class Car implements Vehicle 
{
	@Override
	public void run() 
	{
		System.out.println("Car is Running");
	}

	@Override
	public void horn() 
	{
		System.out.println("Car is having horn");		
	}
	
	@Override
	public void digitalMeter()  //JDK 1.8
        {
    	System.out.println("Car is having Digital Meter Facility");
        }  
}
