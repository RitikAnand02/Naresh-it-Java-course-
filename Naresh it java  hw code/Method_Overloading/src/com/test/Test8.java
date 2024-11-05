package com.test;

public class Test8 {
	public static void m1(int a) {System.out.println("int"); }
	public static void m1(long a) {System.out.println("long"); }
	public static void m1(Integer a) {System.out.println("Integer");}
	public static void m1(Long a) {System.out.println("Integer");}
	public static void m1(Number a) {System.out.println("Number");}
    
    
    public static void main(String[] args) {
	    m1(10);
 
	}
  
}
