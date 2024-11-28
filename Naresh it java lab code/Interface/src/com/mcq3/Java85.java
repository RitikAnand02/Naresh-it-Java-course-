package com.mcq3;

interface NIT5
{
	void myInterface(int a);
	 void defalutFunction() 
	{
		System.out.println("Naresh I Technologies");
	}
	
}
public class Java85 {
	public static void main(String[] args) {
		NIT5 nit = (int a) -> System.out.println(a/5);
		nit.myInterface(15);
	}
}
