package com.test;

class Test12 {
	static {	
		System.out.println("Test12 : SB1 called");
		m1();
	}
	static void m1() {
		System.out.println("Test12 : m1() called");
	}
	public static void main(String[] args) {
		//no operation
	}
}