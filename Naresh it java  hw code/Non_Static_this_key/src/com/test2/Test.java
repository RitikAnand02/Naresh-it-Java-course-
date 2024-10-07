package com.test2;

public class Test {
	static int a = 100;
	int b = 200;

	public void acceptData(int c) {
		int d = 400;
		System.out.println("Static Field :" + Test.a);
		System.out.println("Non Static Field :" + this.b);
		System.out.println("Parameter Variable :" + c);
		System.out.println("Local varaible :" + d);
	}

}
