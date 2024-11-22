package com.test;


interface A2
{
	default void m1()
	{
		System.out.println("Default method of interface A");
	}
}

interface B2
{
	default void m1()
	{
		System.out.println("Default method of interface B");
	}
}

class C implements A2,B2
{	
	@Override
	public void m1() 
	{
	   A2.super.m1();
	   B2.super.m1();
	   System.out.println("MI is possible");	
	}	
}

public class MultipleInheritanceUsingDefaultMethod 
{
	public static void main(String[] args)
	{
		C c1 = new C();
		c1.m1();
	}

}
