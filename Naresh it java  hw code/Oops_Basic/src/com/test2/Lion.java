package com.test2;

public class Lion {
	String name;
	double height;
	String color;

	public void roar() {
		System.out.println("I can roar so don't come near to me");
	}

	public String getLionInformation() {
		return "[Lion Name is :" + name + ", height is :" + height + ", color is :" + color + "]";
	}

}
