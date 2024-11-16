package com.test1;

class Alpha
{
	public Alpha m1()
	{
		System.out.println("Alpha class m1 method");
		return this;
	}
}
class Beta extends Alpha
{
	public Beta m1()
	{
		System.out.println("Beta class m1 method");
		return this;
	}
}
public class CoVariantDemo1 {

	public static void main(String[] args) 
	{
		Alpha a = new Beta();
		a.m1();

	}

}
