package com.mcq3;

interface NIT15
{
	int myInterface(int a, int b);
}
public class Java8_15 {
	int calculate(int i, int j, NIT15 nit)
	{
		return nit.myInterface(i,j);
	}
	public static void main(String[] args) {
		int result = 0;
		NIT15 addition = (a,b) -> a+b;
		NIT15 multiplication = (a,b) -> a*b;
		NIT15 division = (a,b) -> a/b;
		Java8_15 java = new Java8_15();
		result = java.calculate(15, 5, multiplication);
		System.out.println(result);
		result = java.calculate(result, result, addition);
		System.out.println(result);
		result = java.calculate(result, result, division);
		System.out.println(result);
	}
}