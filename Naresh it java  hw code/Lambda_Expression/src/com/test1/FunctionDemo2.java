package com.test1;

import java.util.Scanner;
import java.util.function.Function;

//finding the length of the String 
public class FunctionDemo2 
{
	public static void main(String[] args) 
	{
		Function<String, Integer> fn2 = str -> str.length();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name :");
		String name = sc.nextLine();
		
		
		Integer length = fn2.apply(name);
		System.out.println("Length of :"+name+ " is :"+length);
		sc.close();
		

	}

}
