package com.test;

class Test1
{
	@Override
	public String toString()
	{
		return "NIT";
	}
}

public class ToStringDemo2 
{

	public static void main(String[] args) 
	{
		Test1 t1 = new Test1();
		System.out.println(t1);//NIT

	}

}
