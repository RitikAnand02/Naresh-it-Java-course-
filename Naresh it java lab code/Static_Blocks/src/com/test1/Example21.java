package com.test1;

class Example21 {
	static int x = Example21.m1();

	public static void main(String[] args) {
		System.out.println(Exmaple21.x);
	}

	static int m1() {
		Example21.x = 10;

		return Example21.m2();
	}

	static int m2() {
		System.out.println(Example21.x);
		return 20;
	}
}
