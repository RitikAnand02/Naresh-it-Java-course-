package com.test;

public class Test10 {
	
	public static void m1(Integer a) {System.out.println("Integer");}
	public static void m1(Long a) {System.out.println("Integer");}
	public static void m1(Number a) {System.out.println("Number");}
	public static void m1(Object a) {System.out.println("Object");}
    
    
    public static void main(String[] args) {
	    //m1(10);
    	int x  = 100;
    	m1(x);
    	//m1('a');
    	//m1(null);
    	m1(5.6);
    	m1(true);   
	}
  
}
