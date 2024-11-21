package com.test1;

public class ArithmeticOperation implements Calculator {

	@Override
	public void sum(int x, int y) {
		System.out.println("Addition Of Two Number is : "+(x+y));

	}

	@Override
	public void sub(int x, int y) {
		System.out.println("Subtraction Of Two Number is : "+(x-y));
	}

	@Override
	public void mul(int x, int y) {
		System.out.println("Multiplication Of Two Number is : "+(x*y));

	}

	@Override
	public void div(int x, int y) {
		System.out.println("Division Of Two Number is : "+(x/y));
	}

}
