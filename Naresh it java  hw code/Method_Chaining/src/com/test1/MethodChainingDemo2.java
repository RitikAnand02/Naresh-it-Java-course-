package com.test1;

public class MethodChainingDemo2 
{
	public static void main(String[] args) 
	{
		String str = "india";
		int length = str.concat(" is great").length();
		System.out.println(length);
	}

}
