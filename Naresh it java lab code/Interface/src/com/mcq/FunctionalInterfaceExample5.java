package com.mcq;

import java.util.function.Predicate;

public class FunctionalInterfaceExample5{
	public static void main(String[] args) 
	{
		String str[]= {"Java","Python","Naresh","IT"};
		
		Predicate<String> prediacte = p -> p.endsWith("va");
		for(String s: str) 
		{
			if(prediacte.test(s))
				System.out.println(s);
		}
	}
}
