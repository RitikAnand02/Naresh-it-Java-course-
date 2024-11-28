package com.mcq3;

interface NIT11
{
	int myInterface(int a, int b);
}
public class Java8_11 {
	public static void main(String[] args) {
		NIT11 nit = (int a, int b) -> System.out.println(a+b);
		nit.myInterface(5, 10);
	}
}
