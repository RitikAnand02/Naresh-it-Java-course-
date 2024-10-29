package com.test;

class Sample
{
	private int x;
	
	public Sample(int x)
	{
		this.x = x;
	}
	public static void access()
	{
		//System.out.println(x); //error	
	}
	
}
public class Test10 
{		
	public static void main(String[] args) 
	{
		Sample s = new Sample(10);
		Sample.access();
	}
}
