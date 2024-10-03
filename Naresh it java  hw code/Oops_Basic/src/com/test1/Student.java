package com.test1;

public class Student {
	// Object Properties (non static variable)
	String name;
	int age;
	int rollNumber;

	// Object Behavior
	public void talk() {
		System.out.println("My name is :" + name);
		System.out.println("My Age is :" + age);
		System.out.println("And My rollNumber is :" + rollNumber);
	}

	public void writeExam() {
		System.out.println(name + " is writing exam");
	}

}
