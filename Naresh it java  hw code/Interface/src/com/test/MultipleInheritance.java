package com.test;

interface A
{
	void m1();
}
interface B
{
	void m1();
}
class Implementer implements A,B
{
	@Override
	public void m1() 
	{
		System.out.println("Multiple Inheritance is possible");		
	}	
}

public class MultipleInheritance {

	public static void main(String[] args) 
	{
		Implementer i = new Implementer();
		i.m1();

	}

}

