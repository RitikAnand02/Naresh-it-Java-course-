package com.test;

abstract class Shape
{
	public abstract void draw();  
}

class Square extends Shape
{
	@Override
    public void draw()
	{
		System.out.println("Drawing Square");
	}
}
class Rectangle extends Shape
{
	@Override
    public void draw()
	{
		System.out.println("Drawing Rectangle");
	}
}

public class AbstractMethodDemo1 
{
	public static void main(String[] args) 
	{
		Shape s = null;
		s = new Square(); s.draw();
		s = new Rectangle(); s.draw();
	}
}