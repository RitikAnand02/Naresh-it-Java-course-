package com.test4;

public class ShapeTester {

	public static void main(String[] args) {
        Cylinder c1 = new Cylinder(5,5);
        double area = c1.getArea();
        System.out.println("The Area Of Circle: "+area);
        double volume = c1.getVolume();
        System.out.println("The Volume Of Cylinder: "+volume);
        
	}

}
