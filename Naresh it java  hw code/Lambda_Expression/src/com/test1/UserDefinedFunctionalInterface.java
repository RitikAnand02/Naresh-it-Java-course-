package com.test1;

@FunctionalInterface
interface MyInterface<T,U,V,R>
{
	public abstract R apply(T t, U u, V v);
}

public class UserDefinedFunctionalInterface 
{
	public static void main(String[] args) 
	{
	    MyInterface<Integer,Integer, Integer, String> m1 = (a,b,c)-> ""+a+b+c;
	    System.out.println(m1.apply(100, 200, 300));
	}
}

//Note : It is clear that we can define our own functional interface.
