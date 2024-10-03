package com.test2;

public class LionDemo {

	public static void main(String[] args) {
		Lion lion = new Lion();
		lion.name = "Tiger";
		lion.height = 4.4;
		lion.color = "Brown";

		lion.roar();
		System.out.println(lion.getLionInformation());

	}

}
