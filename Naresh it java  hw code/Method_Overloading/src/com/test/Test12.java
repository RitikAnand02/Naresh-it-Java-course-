package com.test;

public class Test12 {
	  public static void m1(int... a) {
		  System.out.println("int...");
	  }
	  
	  public static void m1(Integer... a) {
		  System.out.println("Integer...");
	  }
	  
	  public static void main(String[] args) {
		int[] num = {1,3,4,5};
		m1(num);
		Integer[] obj = {1,2,3,4,5};
		m1(obj);
		
		
		
	}
	}
