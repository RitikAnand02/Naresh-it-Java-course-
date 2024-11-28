package com.mcq3;

interface NIT2
{
	public int myInterface(int a);
}
public class Java82 {
	public static void main(String[] args) {
		NIT2 nit = (String a) -> a*5;
		int i = nit.myInterface(6);
		System.out.println(i);
	}
}
