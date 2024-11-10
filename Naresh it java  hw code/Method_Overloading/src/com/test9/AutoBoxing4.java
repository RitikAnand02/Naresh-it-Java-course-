package com.test9;

public class AutoBoxing4 
{
	public static void main(String[] args) 
	{
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		System.out.println(i1==i2);

		Integer a1 = Integer.valueOf(15);
		Integer a2 = Integer.valueOf(15);
		System.out.println(a1==a2);
	}
}

//== operator always compares the memory address so it is returning false (two object are created using new keyword), on the other hand valueOf() return the same object so it will provide true.