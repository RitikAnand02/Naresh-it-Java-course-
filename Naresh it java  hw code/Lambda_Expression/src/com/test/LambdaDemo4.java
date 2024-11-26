package com.test;

//Program that shows we can write the logic inside Lambda Method Expression
import java.util.*;

@FunctionalInterface
interface Calculator
{
	double getSquareAndCube(int num);
}


public class LambdaDemo4 
{

	public static void main(String[] args) 
	{
		Calculator calc = num -> 
		{
			if(num<=0)
			{
				return -1;
			}
			else if(num % 2== 0)
			{
				return (num*num);
			}
			else
			{
				return (num*num*num);
			}			
		};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int no = sc.nextInt();
		
		System.out.println(calc.getSquareAndCube(no));
		
		
	}

}
