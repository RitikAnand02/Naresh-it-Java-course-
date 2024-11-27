package com.mcq2;

@FunctionalInterface
interface NIT11
{
	String nit(String name);
}
public class FunctionalInterfaceExample10
{
	public static void main(String[] args) {
		NIT11 nit = (String name) -> {
			return name;
		};
		
		NIT11 nit1 = (String name) -> name;
		
		System.out.println(nit.nit("Welcome to ")+nit1.nit("NARESHIT"));
	}
}