package com.test;

public class Demo1 {
	public static void main(String[] args) 
	{
		int x = 100;
		accept(x);
		System.out.println(x);
	}
	
	public static void accept(int y)
	{
		y = 200;
	}

}

//Here x will provide the output as 100 because we are only passing the copy of x to y variable.