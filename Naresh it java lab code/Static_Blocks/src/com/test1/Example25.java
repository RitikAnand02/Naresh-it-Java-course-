package com.test1;

class Example25 {
	static int a = 50;

	public static void main(String[] args) {
		int a = 60;

		a = a;

		System.out.println(a);
		System.out.println(Example25.a); 
	}
}
