package com.test1;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionDemo1
{
	public static void main(String[] args) 
	{
		Function<Integer, Integer> fn1 = num -> num*num*num;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int num = sc.nextInt();
		
		Integer cube = fn1.apply(num);
		System.out.println("Cube of "+num+" is "+cube);
		sc.close();
	}

}
