package com.test4;

class Super1
{
	private void show()
	{
		System.out.println("Show method of super class!!!!");
	}
}
class Sub1 extends Super1
{
	
	public void show() 
	{
		System.out.println("Show method of sub class!!!!");
	}
}
public class VisibilityMode1 
{
	public static void main(String[] args) 
	{
		Super1 s = new Sub1();
		s.show();
	}
}
