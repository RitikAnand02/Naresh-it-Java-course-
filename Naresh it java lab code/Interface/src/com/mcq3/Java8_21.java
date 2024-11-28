package com.mcq3;

interface NIT21
{
	void myInterface(String a);
}
public class Java8_21 {
	
	public static void main(String[] args) {
		
		//without parameter
		NIT21 nit = information -> System.out.println("Welcome to " + information);
		nit.myInterface("NIT");
	}
}
