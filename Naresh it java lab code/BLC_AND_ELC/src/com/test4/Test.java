package com.test4;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a spy no: ");
		int num = sc.nextInt();
		int sum = 0, mul = 1, rem;
		while (num > 0) {
			rem = num % 10;

			sum = sum + rem;

			mul = mul * rem;

			num = num / 10;

		}

		if (sum == mul) {

			System.out.println("The number is Spy no: ");
		} else {
			System.out.println("The number is not a spy no: ");

		}
		sc.close();
	}

}
