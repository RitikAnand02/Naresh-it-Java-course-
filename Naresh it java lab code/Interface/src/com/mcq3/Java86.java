package com.mcq3;

interface NIT6
{
	void myInterface(int a);
	default void defalutFunction() 
	{
		System.out.println("Naresh I Technologies");
	}
	
}
public class Java86 {
	public static void main(String[] args) {
		NIT6 nit = (int a) -> System.out.println(a/5);
		nit.myInterface(15);
	
		
	}
}