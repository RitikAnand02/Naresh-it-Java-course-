package com.test1;

class A1
{
}
class B1 extends A1
{
}
class Super1
{
	public A1 show()
	{
		System.out.println("Super class show Method");
		return null;
	}
}
class Sub1 extends Super1
{
	@Override
	public B1 show()  //B class Object we can assign to A
	{
		System.out.println("Sub class show Method");
		return null;
	}
}

public class CoVariant 
{
	public static void main(String[] args) 
	{
		Super s = new Sub();
		s.show();
	}
}