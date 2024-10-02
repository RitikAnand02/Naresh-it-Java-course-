package com.test3;


import java.util.Scanner;

public class Test 
{	
   public static void main(String[] args) 
   {
	 Scanner sc = new Scanner(System.in);	 
	 System.out.print("Enter a number :");
	 int num = sc.nextInt();
	
	 int result = Calculate.getSquareAndCube(num);
	 System.out.println("Result is :"+result);
	 
	 sc.close();
	
	 
   }	
	
}

