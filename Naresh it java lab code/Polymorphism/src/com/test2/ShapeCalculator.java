package com.test2;

public class ShapeCalculator {
      public int calculateArea(int sideLength) {
    	  if(sideLength<0) {
    		  System.err.println(" Side length must be non-negative.");
    		  System.exit(0);
    	  }
    	  else {
    	  int result = sideLength * sideLength;
    	  return result;
    	  }
    	  return 0;

      }
      
      public int calculateArea(int length, int width) {
    	  if(length<0 || width<0) {
    		  System.err.println(" Side length must be non-negative.");
    		  System.exit(0);
    	  }
    	  else {
    	  int result = length * width;
    	  return result;
    	  }
    	  return 0;
      }
      
      public double calculateArea(double radius) {
    	  if(radius<0) {
    		  System.err.println(" Radius must be non-negative.");
    		  System.exit(0);
    	  }
    	  else {
    	   final double pi = 3.14;
    	  double result = pi*radius*radius;
    	  return result;
    	  }
    	  return 0;
      }
}
