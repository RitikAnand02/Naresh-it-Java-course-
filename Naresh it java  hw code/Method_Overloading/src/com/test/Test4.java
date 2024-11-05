package com.test;

//same type--> widening
public class Test4 {
  
  static void m1(byte b, byte c) {
  	System.out.println("byte-byte");
  }
  static void m1(int a, int b) {
  	System.out.println("int-int");
  }
  
  public static void main(String[] args) {
	byte b1 =10, b2 = 20;
	int x = b1, y = b2;
	m1(b1,b1); //byte- byte
	m1(x,y); // int-int
	
	m1(b1,x); //int int
	
		
	}
  
}
