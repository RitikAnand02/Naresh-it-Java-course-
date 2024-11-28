package com.mcq3;

interface NIT1
{
	public int myInterface(int a);
}
public class Java81 {
	public static void main(String[] args) {
		NIT1 nit = (int a) -> a*5;
		int i = nit.myInterface(6);
		System.out.println(i);
	}
}
