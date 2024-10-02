package com.test2;
import java.util.Scanner;


public class Test
{
	public static void main (String[] arg)
	{	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of side :");
		int side = sc.nextInt();
		
	    int square = FindSquare.getSquare(side);
	    System.out.println("Square of "+side+" is :"+square);
	    sc.close();
	}
}