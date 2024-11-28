package com.mcq3;

interface NIT4
{
	void myInterface(int a);
	
}
public class Java84 {
	public static void main(String[] args) {
		NIT4 nit = (int a) -> System.out.println(a+5);
		nit.myInterface(15);
	}
}
