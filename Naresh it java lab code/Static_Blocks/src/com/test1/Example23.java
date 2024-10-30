package com.test1;

class Example23 {
	static int x = m1();

	public static void main(String[] args) {
		System.out.println(Example23.x);//120
	}

	static {
		System.out.println(x);//100
		Example23.x = x+20;
	}

	static int m1() {
		Example23.x = 50;
		return m2();		
	} 

	static int m2() {
		System.out.println(Example23.x);//50
		return 100;
	}
}