package com.mcq2;

@FunctionalInterface
interface NIT5
{
	int cal(int value);
}
public class FunctionalInterfaceExample5
{
	public static void main(String[] args) {
		NIT5 nit = (int value) -> value+25;		
		System.out.println("Result: "+nit.cal(20));
	}
}
