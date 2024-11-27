package com.mcq2;

@FunctionalInterface
interface NIT8
{
	String str(String nit);
}
public class FunctionalInterfaceExample8
{
	public static void main(String[] args) {
	NIT8 nit = (String nit) -> nit +"";
	}
}
