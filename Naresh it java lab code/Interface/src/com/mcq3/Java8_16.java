package com.mcq3;

public class Java8_16 {
	interface NIT16 
	{
		int myInterface(int a, int b); 
	}
	
	public static void main(String[] args) {
		NIT16 nit = (int a, int b) -> a/b;
		int a = nit.myInterface(15, 110);
		System.out.println(a);
	}
}
