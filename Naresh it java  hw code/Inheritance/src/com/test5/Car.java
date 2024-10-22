package com.test5;

 class Car extends Vehicle {
protected String engineType = "Battery"; //Variable Hiding
	
	public void getEngineDetails()
	{
		System.out.println("Vehicle Engine type :"+super.engineType);
		System.out.println("Car Engine type :"+this.engineType);
	}

}
