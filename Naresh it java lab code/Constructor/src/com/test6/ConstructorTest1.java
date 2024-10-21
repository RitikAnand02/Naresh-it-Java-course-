package com.test6;

public class ConstructorTest1 {
	public int a = 10;
	public ConstructorTest1() {
	}
	public ConstructorTest1(int a) {
		this.a = a;
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		ConstructorTest1 test = new ConstructorTest1();
	}

}
