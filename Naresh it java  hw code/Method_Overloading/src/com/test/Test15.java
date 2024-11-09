package com.test;

import java.util.Scanner;

public class Test15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num : ");
		int num = sc.nextInt(); // 1
		Integer obj = num;
		switch (obj) { // obj.intValue();
		case 1:
			System.out.println("Case 1 : " + obj);
			break;
		case 2:
			System.out.println("Case 2 : " + obj);
			break;
		default:
			System.out.println("Default");
		}
	}
}


