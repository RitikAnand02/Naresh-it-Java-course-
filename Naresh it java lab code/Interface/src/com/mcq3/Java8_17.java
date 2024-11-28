package com.mcq3;

interface NIT17
{
	String myInterface(String a);
}
public class Java8_17 {
	public static void main(String[] args) {
		NIT17 nit = (a) -> {return a;};
		System.out.println(nit.myInterface("NIT"));
	}
}
