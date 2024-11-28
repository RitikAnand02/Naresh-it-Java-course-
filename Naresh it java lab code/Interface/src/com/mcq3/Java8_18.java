package com.mcq3;

interface Calculate
{
	int myinterface(int a, int b);
}

interface NIT18
{
	String myInterface(String a);
}
public class Java8_18 {
	public static void main(String[] args) {
		Calculate cal = (a) -> a+5;
		cal.myinterface(1, 5);
		NIT18 nit = (a) -> {return a;};
		System.out.println(nit.myInterface("NIT"));
	}
}  
