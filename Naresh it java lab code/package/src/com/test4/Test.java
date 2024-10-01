package com.test4;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first no : ");
		int num1 = sc.nextInt();
		System.out.print("Enter the second no : ");
		int num2 = sc.nextInt();
		System.out.print("Enter the third no : ");
		int num3 = sc.nextInt();
		int sumOfRoundedValues = RoundedSum.sumOfRoundedValues(num1, num2,num3);
		System.out.println("The sum of rounded digit: "+sumOfRoundedValues);
		sc.close();
		

	}

}
