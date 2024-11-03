package com.test3;

public class Person {
	private String name;
	private Address address;
	public Person(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}
	
	
	

}
