package com.test2;

public class MainShape {

	public static void main(String[] args) {
		Cube c1 = new Cube();
		double calculateVolumeparameter = c1.calculateVolumeparameter(3.0);
		System.out.println("Volume of the Cube: " +calculateVolumeparameter );
		System.out.println();
		
		Cylinder c2 = new Cylinder();
		double calculateVolumeparameter2 = c2.calculateVolumeparameter(3.0, 3.0);
		System.out.println("Volume of the Cylinder: "+calculateVolumeparameter2);
		System.out.println();
		
		Sphere s1 = new Sphere();
		double calculateVolumeparameter3 = s1.calculateVolumeparameter(3);
		System.out.println("Volume of the Sphere: "+calculateVolumeparameter3);

	}

}
