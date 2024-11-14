package com.test5;

class Main1 {

	  String language;

	  Main1() {
	    this.language = "Java";
	  }

	  Main1(String language) {
	    this.language = language;
	  }

	  public void getName() {
	    System.out.println("Programming Langauage: " + this.language);
	  }

	  public static void main(String[] args) {

	    Main1 obj1 = new Main1();

	    Main1 obj2 = new Main1("Python");

	    obj1.getName();
	    obj2.getName();
	  }
	} 
