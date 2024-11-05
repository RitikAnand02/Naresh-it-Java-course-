package com.test;

public class Test1 {
    static void m1(int a) {
    	System.out.println("int");
    }
    static void m1(double a) {
    	System.out.println("double");
    }
    static void m1(String a) {
    	System.out.println("String");
    }
    
    public static void main(String[] args) {
		m1(10);   // int
		m1(10.6); //double
		m1("Raam");//String
		
	}
    

}