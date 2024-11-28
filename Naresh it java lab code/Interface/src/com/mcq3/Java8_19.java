package com.mcq3;

interface NIT19
{
	String myInterface(String a);
}
public class Java8_19 {
	
	private void operation(int a, int b, Calculate cal) 
	{
		System.out.println(cal.myinterface(a, b));
	}
	
	public static void main(String[] args) {
		Java8_19 java = new Java8_19();
		Calculate cal = (a,b) -> a+b;
		java.operation(1, 5, cal);
		cal = (a,b) -> a*b;
		java.operation(17, 0, cal);
		NIT19 nit = (a) -> {return a;};
		System.out.println(nit.myInterface("NIT"));
	}
}
