package com.test1;

class AA
{
	public Object m1()
	{
		System.out.println("AA class m1 method");
		return this;
	}
}
class BB extends AA
{
	@Override
	public Integer m1()
	{
		System.out.println("BB class m1 method");
		return null;
	}
}

public class CoVariantDemo2 {

	public static void main(String[] args) 
	{
	   AA a = new BB();
	   a.m1();

	}

}
