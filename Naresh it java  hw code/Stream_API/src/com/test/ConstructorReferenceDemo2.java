package com.test;

import java.util.function.Function;

class Accept
{
	private int x;
	
	public Accept(int x)    
	{
		this.x = x;
	}
	
	public int getX()
	{
		return this.x;
	}	
}

public class ConstructorReferenceDemo2 
{
	public static void main(String[] args) 
	{
      Function<Integer,Accept> fn1 = Accept::new;                  
      Accept obj = fn1.apply(90);
      
      System.out.println("The value of x :"+obj.getX());
	}

}
