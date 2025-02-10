package com.test;

@FunctionalInterface
interface Vehicle
{
	void move();  //SAM(Single Abstract Method)
}

class Test18 
{
	public static void main(String[] args) 
	{
		//Anonymous inner class
		Vehicle car = new Vehicle()
		{
			@Override
			public void move()
			{
				System.out.println("Moving with Car...");
			}	

		};
		car.move();

       Vehicle bike = new Vehicle()
		{
			@Override
			public void move()
			{
				System.out.println("Moving with Bike...");
			}
		};
		bike.move();
	}
}
