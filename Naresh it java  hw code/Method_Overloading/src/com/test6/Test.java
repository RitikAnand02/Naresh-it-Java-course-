//Program to add sum of parameters passes inside a method using var args


package com.test6;

public class Test 
{
   public void sumOfParameters(int... values)
   {
	   int sum = 0;
	   
	   for(int value : values)
	   {
		   sum = sum + value;
	   }
	   System.out.println("Sum of parameter is :"+sum);
   }
}

