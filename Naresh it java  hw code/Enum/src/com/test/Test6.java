package com.test;

//All enums are by default final so can't inherit

enum Pizza
{
	SMALL, MEDIUM, BIG;
}
class Test6 //extends Pizza
{
	public static void main(String[] args) 
	{
		System.out.println(Pizza.BIG);
	}
}

//An enum is implicitly final so any class can't extend enum
