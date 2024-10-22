package com.test4;

public class VariableHiding {
	public static void main(String[] args) 
	{
		Car car = new Car();
		car.getEngineDetails();
	}

}

//Note : Here Vehicle class property (engineType) is by default available to Car class due to Inheritance so we can access using this keyword.