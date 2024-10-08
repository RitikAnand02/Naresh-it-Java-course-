package com.test;

public class Mcq4 {
	 public static void main(String[] args) {
		 final int iLoc = 3;
		 final int iFour = 4;
		 int iRef = 4;
		 switch (iRef) {
		 case 1:
		 case iLoc:
		 case 2 * iLoc:
		 System.out.println("I am not OK.");
		 default:
		System.out.println("You are OK.");
		 case iFour:
		System.out.println("It’s OK.");
		  }
		 }

}
