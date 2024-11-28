package com.mcq3;

interface NIT14
{
	int myInterface(int a, int b);
}
public class Java8_14 {
	int calculate(int i, int j, NIT14 nit)
	{
		return nit.myInterface(i,j);
	}
	public static void main(String[] args) {
		NIT14 addition = (a,b) -> a+b;
		NIT14 multiplication = (a,b) -> a*b;
		NIT14 division = (a,b) -> a/b;
		Java8_14 java = new Java8_14();
		int result = java.calculate(15, 5, multiplication);
		System.out.println(result);
	}
}
