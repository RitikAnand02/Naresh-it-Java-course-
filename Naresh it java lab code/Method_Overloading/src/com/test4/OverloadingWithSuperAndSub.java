package com.test4;

class Super3
{
	public void access(long x)
	{
	  System.out.println("Widening");	
	}
}
class Sub3 extends Super3
{	
	public void access(Integer x)
	{
	  System.out.println("Autoboxing");	
	}
	
}
public class OverloadingWithSuperAndSub 
{

	public static void main(String[] args)
	{
		Sub3 s1 = new Sub3(); s1.access(30);
	}
}
