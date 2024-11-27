package com.test1;

import java.util.function.*;
public class UnaryOperator1  
{
	public static void main(String[] args) 
	{
		UnaryOperator<Integer> square = x -> x * x;
        System.out.println(square.apply(5));

		UnaryOperator<String> concat = str -> 
         str.concat("base");
		 System.out.println(concat.apply("Data"));
	}
}