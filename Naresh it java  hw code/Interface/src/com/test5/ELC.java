package com.test5;

public class ELC 
{
	public static void main(String[] args) 
	{
		double result = Calculator.getSquare(4);
		System.out.println("Square is :"+result);
		
		result = Calculator.getCube(8);
		System.out.println("Cube is :"+result);

	}

}

//Note : From the above program, It is clear that static method contains public access modifier so it is by default accessible from any package.
