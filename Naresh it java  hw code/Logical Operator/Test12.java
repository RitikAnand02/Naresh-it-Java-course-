// Circle.java(BLC)
// ------------------

/*
 Find the area of circle. Accept the radius value from the user
 if the radius is zero or negative then return -1. 
*/

//BLC

import java.util.Scanner;

class Circle {
	public static double getAreaOfCircle(int radius) {
		if (radius <= 0) {
			return -1;
		} else {
			final double PI = 3.14;
			double areaOfCircle = PI * radius * radius;
			return areaOfCircle;
		}
	}
}
//ELC
public class Test12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of the Circle :");
		int radius = sc.nextInt();

		double areaOfCircle = Circle.getAreaOfCircle(radius);
		System.out.println("Area of Circle is :" + areaOfCircle);
		sc.close();
	}

}
