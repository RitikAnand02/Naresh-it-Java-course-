package com.test4;

class Super2
{
	public void access(int ...x)
	{
	  System.out.println("Var args method :"+x[0]);	
	}
}
class Sub2 extends Super2
{	
	public void access(int x)
	{
	  System.out.println("Instance method :"+x);	
	}
	
}
public class Test6 
{
	public static void main(String[] args)
	{
		Super2 s1 = new Super2();  s1.access(10);
		
		Sub2 s2 = new Sub2(); s2.access(20);
		
		Super2 s3 = new Sub2(); s3.access(30);
	}
}