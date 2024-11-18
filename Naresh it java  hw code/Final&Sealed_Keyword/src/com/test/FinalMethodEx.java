package com.test;

class A1
{
	protected int a = 10;
	protected int b = 20;

     public final void calculate()
	 {
		int sum = a+b;
		System.out.println("Sum is :"+sum);
	 } 
}
class B1 extends A1
{	
	@Override
	public void calculate() //final
	{
		int mul = a*b;
		System.out.println("Mul is :"+mul);	
	}
}
public class FinalMethodEx 
{
	public static void main(String [] args) 
	{
		 A1 a1 = new B1();
		 a1.calculate();
	}
}
