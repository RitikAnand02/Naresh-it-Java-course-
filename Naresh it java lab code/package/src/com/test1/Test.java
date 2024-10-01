package com.test1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int num=sc.nextInt();
        int sumOfDigits = TwoDigitsSum.getSumOfDigits(num);
        System.out.println("The Sum of two Digit: "+sumOfDigits);
        sc.close();

	}

}
