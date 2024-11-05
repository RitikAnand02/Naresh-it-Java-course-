package com.test;

public class Test2 {
    
    static void m1(double a) {
    	System.out.println("double");
    }
    static void m1(float a) {
    	System.out.println("float");
    }
    
    public static void main(String[] args) {
		m1(10.5);
		m1(50.6f);
		
	}
    
}
