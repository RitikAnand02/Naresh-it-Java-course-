package com.test;

//Interview Question

class Hello
{
	int x = 100;
}

enum Direction extends Hello
{
	EAST, WEST, NORTH, SOUTH;

	
}

class Test5 
{
	public static void main(String[] args) 
	{
		System.out.println(Direction.SOUTH);
	}
}

//By default every enum extends from java.lang.Enum class so enum can't extend a class explicitly.
