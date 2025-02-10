package com.test;

class Outer6
{
   private int x = 100;

  public void m1()
  {
      class Inner
      {
		  int x = 200;

          public void m1()
		  {
			  System.out.println("Inner class value is :"+this.x);
			  System.out.println("Outer class value is :"+Outer6.this.x);
		  }
	  }
	  Inner i = new Inner();  
	  i.m1();
  }
	
}
public class Demo6 
{	
	public static void main(String[] args) 
	{	 
	  Outer6 out = new Outer6();
	  out.m1();
	}
}

//Note : Method Local inner class will be accessible within the same method body only.