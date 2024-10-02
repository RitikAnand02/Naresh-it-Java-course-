package com.test5;

import java.util.Scanner;


public class Test 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number :");
		int num = sc.nextInt();
		
	    boolean isEven = EvenOrOdd.isEven(num);
	    System.out.println(num+" is Even ?:"+isEven);
	    
	    System.out.print("Enter another Number :");
		num = sc.nextInt();
	    
	    isEven = EvenOrOdd.isEven(num);
	    System.out.println(num+" is Even ?:"+isEven);
	    sc.close();
	}

}
