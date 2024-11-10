package com.test9;

//Converting integer value to String
public class AutoBoxing5 
{
	public static void main(String[] args) 
	{
		int x = 12;
		String str = Integer.toString(x);
		System.out.println(str+2);
	}
}

//Integer class has a predefined static method toString(int x), which will convert int to String type.
