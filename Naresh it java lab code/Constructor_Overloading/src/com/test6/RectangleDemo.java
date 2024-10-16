package com.test6;

import java.util.Scanner;

public class RectangleDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Width: ");
		double width = sc.nextDouble();
		
		System.out.println("Enter The Height: ");
		double height = sc.nextDouble();
		 if(width <0 || height<0){
				System.err.println("Width and height must be non-negative");
				System.exit(0);
			}
		
		Rectangle r1 = new Rectangle(width,height);
		double area = r1.getArea();
		double perimeter = r1.getPerimeter();
		System.out.println("The Area is "+area);
		System.out.println("The Perimeter is "+perimeter);
		sc.close();

	}

}
