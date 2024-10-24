package com.test4;

public class Circle {
	protected double radius;
	{
		this.radius=0.0;
		
	}
	public Circle(double radius) {
		super();
		
		if(radius<=0) {
			System.err.println("Error Invalid Input");
			System.exit(0);
		}
		this.radius = radius;
	}
	
	public double getArea() {
		final double Pi = 3.14;
		if(this.radius>=0) {
		double area = Pi*radius*radius;
		return area;
	}
		else {
			return -1;
		}
	}

}
