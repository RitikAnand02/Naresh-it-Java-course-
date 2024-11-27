package com.mcq2;

import java.util.function.Function;

public class FunctionalInterfaceExample4
{
  public static void main(String[] args)
  {
    Function<String, Boolean> fun = str -> str.startsWith("A");	
		
		System.out.println(fun.apply("Ankit"));
	}
}
