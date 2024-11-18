package com.test;

class A2
{
	final int A = 10;  //error         
	public void setData()
	{
		 A = 10;  
		 System.out.println("A value is :"+A);
	}
}
class FinalVarEx 
{
	public static void main(String[] args) 
	{
		final A2 a1 = new A2();
		a1.setData();
		
		a1 = new A2(); //error
		a1.setData();
	}
}
