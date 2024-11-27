//By using Predicate verify whether the number is even or odd.

package com.test1;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateDemo1
{
	public static void main(String[] args)
	{
		Predicate<Integer> p1 = num -> num % 2 ==0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int num = sc.nextInt();
		
		boolean result = p1.test(num);
		System.out.println("Is "+num+" even ??"+result);
		sc.close();
		
		
		
	}

}
