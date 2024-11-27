package com.mcq2;

@FunctionalInterface
interface NIT6
{
	void nit(String name);
}
public class FunctionalInterfaceExample6
{
	public static void main(String[] args) {
		NIT6 nit = (String name) -> "";
		System.out.println(nit.nit("NARESHIT"));
		
	}
}
