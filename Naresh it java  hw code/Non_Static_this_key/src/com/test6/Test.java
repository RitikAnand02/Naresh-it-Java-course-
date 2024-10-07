package com.test6;

public class Test {

	int x = 100;

	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test();

		++t1.x;
		--t2.x;

		System.out.println(t1.x); // 101
		System.out.println(t2.x); // 99
	}

}
