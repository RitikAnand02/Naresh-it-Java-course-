package com.test1;

import java.util.function.*;
public class BinaryOperator1  
{
	public static void main(String[] args) 
	{
		BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(3, 5));  
	}
}