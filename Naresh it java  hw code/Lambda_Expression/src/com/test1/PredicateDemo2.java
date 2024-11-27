package com.test1;

//By using Predicate verify whether my name starts with 'A' or /not

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateDemo2 {

	public static void main(String[] args) 
	{
		Predicate<String> p2 = name -> name.startsWith("A") ; 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Name :");
		String name = sc.next();
		
		System.out.println(name+" starts with A :"+p2.test(name));
		
		sc.close();

	}

}

