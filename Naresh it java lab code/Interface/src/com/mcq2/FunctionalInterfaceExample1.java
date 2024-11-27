package com.mcq2;

public class FunctionalInterfaceExample1
{
	public static void main(String[] args) {
		Runnable nit = () -> System.out.println("Thread Started");
		nit.run();
	}
}
