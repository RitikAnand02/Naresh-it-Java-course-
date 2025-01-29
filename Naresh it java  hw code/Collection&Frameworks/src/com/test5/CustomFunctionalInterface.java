package com.test5;

@FunctionalInterface
interface TriFunction<T,U,V,R>
{
	R apply(T a, U b, V c);
}

public class CustomFunctionalInterface 
{
	public static void main(String[] args) 
	{
		TriFunction<Integer, Integer, Integer, String> fn1 = (a,b,c)-> ""+a+b+c;
		System.out.println("Concatenation is :"+fn1.apply(100, 200, 300));
	}

}