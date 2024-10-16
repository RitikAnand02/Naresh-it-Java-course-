package com.test7;

public class Example1 {
	int a=10;
	int b=20;
	public static void main(String[] args)
	{
	Example1 e1=new Example1();
	Example1 e2=new Example1();
	System.out.println(e1.a+". .."+e1.b);
	System.out.println(e2.a+". .."+e2.b);
	e1.a=50;
	e2.b=60;
	System.out.println(e2.a+". .."+e2.b);
	System.out.println(e2.a+". .."+e2.b);
	}

}
