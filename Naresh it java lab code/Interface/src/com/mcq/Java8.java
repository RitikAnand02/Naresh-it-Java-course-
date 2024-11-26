package com.mcq;

interface NIT3
{
	public int myInterface(int a);
}

public class Java8 {
	public static void main(String[] args) {
		NIT3 nit = (a) -> a+1;
		int i = nit.myInterface(6);
		System.out.println(i);
	}
}
