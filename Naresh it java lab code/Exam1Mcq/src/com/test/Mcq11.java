package com.test;

public class Mcq11 {
	 public static void main(String[] args) {
		 int i = 0;
		 int j = 0;
		 boolean t = true;
		 boolean r;
		 r = (t & 0 < (i+=1));
		 r = (t && 0 < (i+=2));
		 r = (t | 0 < (j+=1));
		 r = (t || 0 < (j+=2));
		 System.out.println(i + " " + j);
		 }

}
