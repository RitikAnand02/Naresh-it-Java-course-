package com.test1;

class Example22 {
	static int x = 10;

	public static void main(String[] args) {
		System.out.println(Example22.m1()+Example22.x);
	}

	static int m1() {
		Example22.x = Example22.x+100;
		return Example22.x;
	} 
}