package com.test5;

 class Animal {
	private String name;

	public Animal(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void getDisplay() {
		System.out.println("Animal Name: "+getName());
	}
}
