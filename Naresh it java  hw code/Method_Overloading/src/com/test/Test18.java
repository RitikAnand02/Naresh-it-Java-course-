package com.test;

public class Test18 {
	  public static void main(String[] args) { 
		Integer i1 = 100; // i1 : 1000x : value : 100
		Integer i2 = 101; //2000x : value : 101
		System.out.println("Before modification");
		System.out.println(i1);//100
		System.out.println(System.identityHashCode(i1));//1000x
		
		 ++i1; //++i1.intValue();  //Integer.valueOf(101) //i1:  2000x : value : 101   
		System.out.println("After modification...");
		System.out.println(i1);//101
		System.out.println(System.identityHashCode(i1));//2000x	
	}
	}
