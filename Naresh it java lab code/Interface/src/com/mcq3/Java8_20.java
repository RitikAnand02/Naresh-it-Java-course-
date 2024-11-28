package com.mcq3;

interface NIT20
{
	String myInterface(String a);
}
public class Java8_20 {
	
	public static void main(String[] args) {
		
		//without parameter
		NIT20 nit = information -> System.out.println("Welcome to " + information);
		nit.myInterface("NIT");
	}
}
