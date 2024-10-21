package com.test6;

public class ConstructorTest {
	public int a = 100;
	public ConstructorTest() {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		ConstructorTest test = new ConstructorTest();
	}
}
