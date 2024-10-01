package com.test3;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a no: ");
		int num=sc.nextInt();
		int nextMultipleOfHundred = NextMultipleOfHundred.getNextMultipleOfHundred(num);
		System.out.println(" the next multiple of 100 for the given number: "+nextMultipleOfHundred);
		sc.close();

	}

}
