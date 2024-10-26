package com.test1;

public class Test 
{
	public static void main(String[] args)
	{
		System.out.println("Test.class file will be loaded by :"+Test.class.getClassLoader());
	}

}

//Note : Test.class statement, return type is java.lang.Class so further we can call any method of java.lang.Class class