package com.test13;

 class Rectangle extends Shape {
	protected int breadth;
	public Rectangle(int length, int breadth) //2   5
	{
		super(length);
		this.breadth = breadth;		
	}
	
	public void getAreaOfRectangle()
	{
		double area = super.x * this.breadth; 
		System.out.println("Area of Rectangle is :"+area);
	}

}
