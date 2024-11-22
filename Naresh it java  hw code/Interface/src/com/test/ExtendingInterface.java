package com.test;

interface A1
{
	void m1();
}
interface B1 extends A1
{
	void m2();
}
class Implementer1 implements B1
{
	@Override
	public void m1() 
	{
		System.out.println("m1 method Implemented!!!");		
	}

	@Override
	public void m2() 
	{
		System.out.println("m2 method Implemented!!!");			
	}	
}

public class ExtendingInterface 
{
	public static void main(String[] args) 
	{
		Implementer1 i = new Implementer1();
		i.m1();  i.m2();

	}

}