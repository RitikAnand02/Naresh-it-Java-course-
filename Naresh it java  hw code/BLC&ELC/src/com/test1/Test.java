package com.test1;
import java.util.Scanner;

public class Test 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the side :");
		int side = sc.nextInt();		
		GetSquare.getSquareOfNumber(side);
		
		sc.close();
		
	}
}