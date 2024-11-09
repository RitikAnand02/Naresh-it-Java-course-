package com.test;

public class Test17 {
	public static void main(String[] args) {

		Integer i1 = 100;
		Integer i2 = 100;
		System.out.println(i1 == i2); // true
		System.out.println(i1.equals(i2));
		System.out.println(System.identityHashCode(i1));
		System.out.println(System.identityHashCode(i2));
		Integer i3 = -128;
		Integer i4 = -128;

		System.out.println(i3 == i4);
		System.out.println(i3.equals(i4));
		System.out.println(System.identityHashCode(i3));
		System.out.println(System.identityHashCode(i4));

		Character.valueOf('a');

	}
}