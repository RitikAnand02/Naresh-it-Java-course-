package com.test;

class MySuperclass {
	 public Integer step1(int i) { return 1; }                         // (1)
	 protected String step2(String str1, String str2) { return str1; } // (2)
	 public String step2(String str1) { return str1; }                 // (3)
	 public static String step2() { return "Hi"; }                     // (4)
	 public Test20 makeIt() { return new Test20(); }                 // (5)
	 public MySuperclass makeIt2() { return new Test20(); }           // (6)
	}
	public class Test20 extends MySuperclass {
	  public Test20 makeIt2() { return new Test20(); }



	 }