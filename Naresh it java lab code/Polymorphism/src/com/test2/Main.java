package com.test2;

public class Main {

	public static void main(String[] args) {
        ShapeCalculator s1 = new ShapeCalculator();
        double calculateArea = s1.calculateArea(7.0);
        System.out.println("Area of circle with radius: "+calculateArea);
        System.out.println();
        
        int calculateArea2 = s1.calculateArea(5);
        System.out.println("Area of a square: "+calculateArea2);
        System.out.println();
        
        int calculateArea3 = s1.calculateArea(5, 10);
        System.out.println("Area of a rectangle: "+calculateArea3);
	}

}
