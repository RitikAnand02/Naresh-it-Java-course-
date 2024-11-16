package com.test;

//Can we show that the following program is Method Hiding but not Overriding :

class A
{
	public static void m1()
	{
	}
}
class B extends A
{
	public static int m1() //Method Hiding
	{
		return 0;
	}
}
public class Test 
{		
	public static void main(String[] args) 
	{
		
	}
}

//From the above program it is clear that :
//Method Hiding belons to static Method 
////Method Overriding belons to non-static Method 
