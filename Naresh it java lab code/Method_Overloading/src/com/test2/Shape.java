package com.test2;

public class Shape {
	
	public double calculateVolumeparameter (double sideLength) {
		double result1 = sideLength * sideLength * sideLength;
		return result1;
		
	}
	public double calculateVolumeparameter (double radius,double height) {
		final double pi = 3.14;
		double result2 = pi * radius *radius * height;
		return result2;
		
	}
	public double calculateVolumeparameter (float radius) {
		final double pi = 3.14;
		double result3 = 4/3*(pi*radius*radius);
		return result3;
		
	}

}
