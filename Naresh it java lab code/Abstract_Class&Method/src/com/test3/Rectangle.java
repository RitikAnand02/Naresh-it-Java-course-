package com.test3;

public class Rectangle extends Shape{
	public double length;
	public double breadth;
	
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double getArea() {
		double result = this.length*this.breadth;
		return result;
	}

	@Override
	public double printDetails() {
		System.out.println("Area Of Rectangle: "+getArea());
		return 0;
	}

}
