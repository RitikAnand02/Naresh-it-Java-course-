package com.test1;

public class Dog {
	String name;
	Double height;
	int age;

	public void getDogInformation() {
		System.out.println("Dog Name is: " + name);

		System.out.println("Dog height is: " + height);

		System.out.println("Dog age is: " + age);
	}

	public void bark() {
		System.out.println("Dog is barking!!!");
	}
}
