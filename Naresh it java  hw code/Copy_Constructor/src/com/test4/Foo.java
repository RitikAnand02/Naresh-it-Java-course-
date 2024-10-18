package com.test4;

public class Foo {
	 private Foo() //Private Constructor
	  {
		  System.out.println("It is a private Constructor");
	  }
	  
	  public static void main(String [] args)
	  {
		  new Foo(); 	  
	  }

}
