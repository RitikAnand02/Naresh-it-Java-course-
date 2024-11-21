package com.test3;

public class Circle extends Shape {
	public double radius;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getArea() {
		 final double pi = 3.14;
		double result = pi * this.radius*this.radius;
		return result;
	}

	@Override
	public double printDetails() {
		System.out.println("Area Of Circle: "+getArea());
		return 0;
	}

}
