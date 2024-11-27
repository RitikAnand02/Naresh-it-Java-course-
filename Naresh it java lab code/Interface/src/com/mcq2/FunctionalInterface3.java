package com.mcq2;

@FunctionalInterface 
interface Str
{
	String str(String str);
}

public class FunctionalInterface3 {
	public static void main(String[] args) {
		Str nit = s -> "Naresh"+s;
		System.out.println(nit.str("IT"));	
	}
}
