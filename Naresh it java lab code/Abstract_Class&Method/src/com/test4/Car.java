package com.test4;

public abstract class Car {
	 protected String brand = "Default Brand";
	    protected String model = "Default Model";
	    protected int mileage = 0;
	    protected int top_speed = 0;
	    protected int yearOfManufacturing = 0;

	    public Car() {}

	 
	    public String carBrand() {
	        brand = "Toyota"; 
	        return brand;
	    }

	  
	    public String carModel() {
	        model = "Corolla"; 
	        return model;
	    }

	
	    public int carMileage() {
	        mileage = 30; 
	        return mileage;
	    }

	    
	    public int carTopSpeed() {
	        top_speed = 180; 
	        return top_speed;
	    }

	
	    public int carYear() {
	        yearOfManufacturing = 2022; 
	        return yearOfManufacturing;
	    }

	    public abstract void display();


}
