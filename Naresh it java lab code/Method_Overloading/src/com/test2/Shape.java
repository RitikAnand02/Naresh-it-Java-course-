package com.test2;

public class Shape {
	
	public double calculateVolumeparameter (double sideLength) {
		if(sideLength<0) {
			System.err.println("Error: Side length cannot be negative.");
			System.exit(0);
		}
		else {
		double result1 = sideLength * sideLength * sideLength;
		return result1;
		}
        return 0.0;
		
	}
	public double calculateVolumeparameter (double radius,double height) {
		if(radius<0||height<0)
		{
			System.err.println("Error: Values cannot be negative");
			System.exit(0);
		}
	else {
		final double pi = 3.14;
		double result2 = pi * radius *radius * height;
		return result2;
		}
		return 0.0;
		
	}
	public double calculateVolumeparameter (float radius) {
		if(radius<0)
		{
			System.err.println("Error: Side length cannot be negative.");
			System.exit(0);
		}
		else {
		final double pi = 3.14;
		double result3 = 4/3*(pi*radius*radius);
		return result3;
		}
		return 0.0;
		
	}

}
