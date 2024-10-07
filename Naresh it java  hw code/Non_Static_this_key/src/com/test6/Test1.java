package com.test6;

public class Test1 {
	static int x = 100;

	public static void main(String[] args) {
		Test1 d1 = new Test1();
		Test1 d2 = new Test1();

		++d1.x;
		++d2.x;

		System.out.println(d1.x); // 102
		System.out.println(d2.x); // 102

	}

}
