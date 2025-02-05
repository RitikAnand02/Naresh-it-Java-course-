package com.test;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo1 {

	public static void main(String[] args) 
	{
		
		UnaryOperator<String> fn1 = str -> str.concat(" World");
		String concat = fn1.apply("Hello");
		System.out.println(concat);
		
		UnaryOperator<Integer> square = x -> x * x;
        System.out.println(square.apply(5));

	}

}
