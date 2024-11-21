package com.test3;

public class Triangle extends Shape {
	public double base;
	public double height;
	

	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	@Override
	public double getArea() {
		double result = (this.base*this.height)/2;
		return result;
	}

	@Override
	public double printDetails() {
		System.out.println("Area Of Triangle: "+getArea());
		return 0;
	}

}
