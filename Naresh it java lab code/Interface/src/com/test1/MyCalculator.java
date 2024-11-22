package com.test1;

public class MyCalculator implements AdvancedArithmetic {

	@Override
	public int divisorSum(int divisorSum) {
		int sum=0;
		if(divisorSum<=0){
			System.err.println("Input must be a positive integer.");
			System.exit(0);
		}
		for(int i =1;i<=divisorSum/2;i++) {
		 if(divisorSum%i==0)
			sum+=i;
		}		
		return sum+divisorSum;
	}

}
