package com.mcq;

@FunctionalInterface
interface NIT
{
	String get(String nit);
}
public class FunctionalInterfaceExample
{
	public static void main(String[] args) {
		NIT nit = (str) -> str +"Welcome to"; // str concatenate to "Welcome to" 
		NIT nit1 = (str) -> str + "NARESHIT"; // str1 concatenate to "NARESHIT"
		information("Hai ", nit); // HAI + Welcome to
		information("Hai ", nit1); // HAI + NARESHIT
	}
	public static void information(String str, NIT obj) {
		String result = obj.get(str);
		System.out.println(result);
	}
}
