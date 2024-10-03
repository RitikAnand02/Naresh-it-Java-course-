package com.test1;

public class DogDemo {

	public static void main(String[] args) {

		Dog siri = new Dog();

		siri.name = "Siri";
		siri.height = 4.5;
		siri.age = 5;

		siri.getDogInformation();
		siri.bark();
	}

}
