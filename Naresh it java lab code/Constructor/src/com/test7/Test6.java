package com.test7;

public class Test6 {
	int a ;
	public static void main(String args[ ])
	{
	new Test6();
	}
	{
	System.out.println(this.a);
	this.a = 100 ;
	}
	Test6()
	{
	System.out.println(this.a);
	}

}
