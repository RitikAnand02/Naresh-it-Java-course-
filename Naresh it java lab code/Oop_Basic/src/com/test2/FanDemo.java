package com.test2;

public class FanDemo {

	public static void main(String[] args) {

		Fan bajaj = new Fan();

		bajaj.name = "Bajaj";
		bajaj.coil = "Copper";

		bajaj.wings = 4;

		bajaj.switchOn();
		bajaj.switchOff();
	}

}
