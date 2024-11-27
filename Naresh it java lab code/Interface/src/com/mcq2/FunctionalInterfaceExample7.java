package com.mcq2;

@FunctionalInterface
interface NIT7
{
	String nit(String name);
}
public class FunctionalInterfaceExample7
{
	public static void main(String[] args) {
		NIT7 nit = (String name) -> "Welcome to ";
		System.out.println(nit.nit("NARESHIT"));		
	}
}
