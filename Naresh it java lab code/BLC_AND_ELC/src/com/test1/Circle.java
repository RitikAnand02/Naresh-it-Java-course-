package com.test1;

public class Circle {
	public static String getAreaOfCircle(double radius) {
		if (radius <= 0) {
			return "" + (0);
		} else {
			final double PI = 3.14;
			double areaOfCircle = PI * radius * radius;
			return "" + areaOfCircle;
		}

	}
}
