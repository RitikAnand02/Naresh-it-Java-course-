package com.test1;

public class MethodChainingDemo1 
{
	public static void main(String[] args) 
	{
		String str = "india";
		char ch = str.concat(" is great").toUpperCase().charAt(7);
        System.out.println(ch);
	}

}
