package com.mcq3;

interface NIT10
{
	void myInterface(int a, int b);
}
public class Java8_10 {
	public static void main(String[] args) {
		NIT10 nit = (int a, int b) -> System.out.println(a+b);
		nit.myInterface(5, 10);
	}
}
