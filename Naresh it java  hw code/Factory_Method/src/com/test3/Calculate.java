package com.test3;

public class Calculate {
	 public Calculate(double x, double y)
	  {	  
		  this(10,20,30);
		  System.out.println("Addition of two double is :"+(x+y));
			 
	  }
	  
	   public Calculate(int x, int y, int z)
	   {
		   this();
		   System.out.println("Addition of three integer is :"+(x+y+z));
		  
	   }
	   
	   public Calculate()
	   {
		   System.out.println("Non parameterized Constructor...");
	   }  

}
