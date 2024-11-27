package com.mcq2;

interface NIT9
{
	String nit(String name);
}
public class FunctionalInterface9
{
	public static void main(String[] args) {
		NIT9 nit = (String name) -> "Welcome to " + name;
		System.out.println(nit.nit("NARESHIT"));		
	}
}
