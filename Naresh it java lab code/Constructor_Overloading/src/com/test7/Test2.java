package com.test7;

public class Test2 {
	  public static void main(String[] args) 
	  {
		  int original1 = 1;
		   int original2 = 2;
		   swap(original1, original2);
		   System.out.println(original1);   
		   System.out.println(original2);   
		
	  }
	  
	  public static void swap(int a, int b) {
		   int temp = a;
		   a = b;
		   b = temp;
		 }

}
