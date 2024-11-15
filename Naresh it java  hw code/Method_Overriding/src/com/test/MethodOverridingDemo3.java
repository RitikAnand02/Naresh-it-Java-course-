package com.test;

class Bird1
{
	public void fly()
	{
		System.out.println("Genric Bird is flying");
	}
	
	public void roam()
	{
		System.out.println("Generic Bird is roamig");
	}	
}
class Parrot1 extends Bird1
{
	//Method Overloading
	public double fly(double height)
	{		
		System.out.println("Parrot is flying with "+height+" feet height");
		return height;
	}
		
	
	@Override
	public void roam()
	{
		System.out.println("Parrot Bird is roamig");
		
	}
}
public class MethodOverridingDemo3 
{
	public static void main(String[] args) 
	{
		Parrot1 p = new Parrot1();
		p.fly(15.6);
		p.roam();
	}

}