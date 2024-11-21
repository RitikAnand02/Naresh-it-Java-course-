package com.test4;

public class Test extends Car {

	@Override
	public void display() {
	    System.out.println("Car Brand: " + carBrand());
        System.out.println("Car Model: " + carModel());
        System.out.println("Car Mileage: " + carMileage() + " km/l");
        System.out.println("Car Top Speed: " + carTopSpeed() + " km/h");
        System.out.println("Year of Manufacturing: " + carYear());
		
	}

}
