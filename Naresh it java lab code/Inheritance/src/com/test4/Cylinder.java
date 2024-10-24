package com.test4;

 class Cylinder extends Circle {
	 protected double height;
	 {
		 this.height=0.0;
	 }
	public Cylinder(double radius, double height) {
		super(radius);
		if(height<=0) {
			System.err.println("Error Invalid Input");
			System.exit(0);
		}
		this.height = height;
	}
	 
	 public double getVolume() {
		final double Pi = 3.14;
		if(this.height>=0) {
			double volume = Pi*radius*radius*height;
			return volume;
		}
		else {
			return -1;
			
		}
	 }

}
