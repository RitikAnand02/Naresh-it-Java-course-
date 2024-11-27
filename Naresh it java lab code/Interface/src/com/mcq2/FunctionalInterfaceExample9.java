package com.mcq2;

@FunctionalInterface
interface NIT10
{
	String nit(String name);
}
public class FunctionalInterfaceExample9 implements NIT10
{
	public static void main(String[] args) {
		FunctionalInterfaceExample9 nit = new FunctionalInterfaceExample9();
		System.out.println(nit.nit("Welcome to "));
	}	
	@Override
	public String nit(String name) {
		return name+"NARESHIT";
	}
}
