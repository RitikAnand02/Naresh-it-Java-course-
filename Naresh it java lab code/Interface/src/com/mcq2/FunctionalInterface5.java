package com.mcq2;

import java.util.function.Function;

public class FunctionalInterface5 {
	public static void main(String args[])
	{
		Function<Integer, Double> div = a -> a / 2.0;
		System.out.println(div.apply(15));
	}
}
