package com.test;

//same type--> widening
public class Test3 {
  
  static void m1(double a) {
  	System.out.println("double");
  }
  static void m1(String a) {
  	System.out.println("String");
  }
  
  public static void main(String[] args) {
		m1(10);   // double
		m1(10.6); // double
		m1("Raam");//String
		
	}
  
}
