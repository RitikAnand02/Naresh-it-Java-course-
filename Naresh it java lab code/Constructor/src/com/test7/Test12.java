package com.test7;

public class Test12 {
	int x;
	int y;
	void m1(Test12 t)
	{
	System.out.println("\t t:"+t);
	t=new Test12();
	System.out.println("\t t:"+t);
	}
	public static void main(String[] args)
	{
	Test12 t1=new Test12();
	Test12 t2=new Test12();
	System.out.println("t2:"+t2);
	t1.m1(t2);
	System.out.println("t2:"+t2);
	}

}
