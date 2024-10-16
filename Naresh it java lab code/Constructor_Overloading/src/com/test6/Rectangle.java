package com.test6;

public class Rectangle {
	private double width;
	private double height;
	
	{
		width=0;
		height=0;
		
	}

	public Rectangle(double width, double height) {
		super();
				this.width = width;
				this.height = height;

	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public double getArea() {
		double Area = this.width*this.height;
		return Area;
		}
	
	public double getPerimeter() {
		double Perimeter = 2*(this.width+this.height);
		return Perimeter;
		}
}
