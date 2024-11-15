package com.test;

class Shape
{
	public void draw()
	{
		System.out.println("Generic Draw");
	}
}
class Square extends Shape
{
	@Override
	protected void draw()  //error
	{
		System.out.println("Drawing Square");
	}
}
public class MethodOverriding 
{
	public static void main(String[] args) 
	{
		Shape s = new Square();
		s.draw();
	}
}