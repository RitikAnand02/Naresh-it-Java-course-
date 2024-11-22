package com.test;

interface Alpha
{
	default void m1() //JDK 1.8
	{
		System.out.println("Default Method of Alpha interface");
	}
}

class Beta 
{
	public void m1()
	{
		System.out.println("Concrete Method of Beta class");
	}
}

class Gamma extends Beta implements Alpha 
{
}

public class MethodPriority 
{
	public static void main(String[] args) 
	{
		Gamma g = new Gamma();
		g.m1();
	}

}