package com.test5;

public class SimpleCalculator implements Calculator {

	@Override
	public void calculateSum(int... numbers) {
		  int sum = 0;
	        for (int num : numbers) {
	            sum += num;
	        }
	        System.out.println("Sum of the numbers: " + sum);
	}

}
