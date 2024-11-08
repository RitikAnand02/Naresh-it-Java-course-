package com.test1;

public class Calculator {
	public void add(int num1, int num2) {
		System.out.println("Sum of Two Integers: "+(num1+num2));
	}
	
	public void add(double num1, double num2) {
		System.out.println("Sum of Two Doubles: "+(num1+num2));
	}
   
	public void multiply(int num1, int num2) {
		System.out.println("Product of Two Integers: "+(num1*num2));
	}
	
	public void multiply(double num1, double num2) {
		System.out.println("Product of Two Doubles: "+(num1*num2));
	}
}
