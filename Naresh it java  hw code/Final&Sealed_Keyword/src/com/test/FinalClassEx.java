package com.test;

final class A
{
	private int x = 100;

	public void setData()
	{
		x = 120;
		System.out.println(x);
	}
}
class B extends A  //error [super class is final]
{   
}
public class FinalClassEx
{
	public static void main(String[] args)
	{
		B b1 = new B();
		b1.setData();		
	}
}

//Here A class is final so, we can't inherit class A hence we will get compilation error.