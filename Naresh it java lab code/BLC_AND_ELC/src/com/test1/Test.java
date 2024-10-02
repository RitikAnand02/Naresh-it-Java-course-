package com.test1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius :");
		double radius = sc.nextDouble();

		String areaOfCircle = Circle.getAreaOfCircle(radius);

		float area = Float.parseFloat(areaOfCircle);

		System.out.printf("Area of circle is  : %.2f ", area);
		sc.close();

	}
}
