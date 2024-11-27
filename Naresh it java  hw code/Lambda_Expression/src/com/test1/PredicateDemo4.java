package com.test1;

import java.util.function.*;
import java.util.*;

public class PredicateDemo4 
{
	public static void main(String[] args) 
	{
		Predicate<String> p4 =  str -> str.equalsIgnoreCase("Ravi");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Name :");
		String name = sc.next();
		
		System.out.println("Are you Ravi :"+p4.test(name));
		sc.close();
		
	}
}
