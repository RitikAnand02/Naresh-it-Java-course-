package com.test2;

import java.util.Scanner;



public class Test {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a no: ");
	        int num=sc.nextInt();
	         int diffOfDigits = TwoDigitsDifference.getDiffOfDigits(num);
	        System.out.println("The Differnce of two Digit: "+diffOfDigits);
	        sc.close();

	}

}
