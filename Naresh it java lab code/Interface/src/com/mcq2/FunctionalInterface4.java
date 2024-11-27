package com.mcq2;

interface NIT2
{
	public void nit();
}

public class FunctionalInterface4 
{
	public static void main(String[] args) {
		String str = "IT";
		NIT2 n = () -> 
		{
			System.out.println("Naresh" +str);
		};
	}
}
