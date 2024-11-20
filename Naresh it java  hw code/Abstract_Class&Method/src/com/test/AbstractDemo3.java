package com.test;

abstract class Shape1
{
	protected String shapeType;

	public Shape1(String shapeType) 
	{
		super();
		this.shapeType = shapeType;
	}
	
	public abstract void draw();	
}

class Rectangle1 extends Shape1
{	
	public Rectangle1(String shapeType)
	{
		super(shapeType);
	}
	
	@Override
	public void draw()
	{
		System.out.println("Drawing "+shapeType);
	}
}

class Circle1 extends Shape1
{
	public Circle1(String shapeType)
	{
		super(shapeType);
	}
	
	@Override
	public void draw()
	{
		System.out.println("Drawing "+shapeType);
	}
}

public class AbstractDemo3 
{
	public static void main(String[] args) 
	{
		Shape1 ss = new Rectangle1("Rectangle");
		ss.draw();
		
		ss = new Circle1("Circle");
		ss.draw();

	}

}
