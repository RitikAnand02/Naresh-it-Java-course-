package com.test;

//program on method local inner class
class Outer5
{
    private String x = "Outer class private data";

    public void doSttuff()
    { 
         String z = "local variable";  

         class MyInner  //Only final and abstract applicable
         {
               public void seeOuter()
               {
                    System.out.println("Outer x is "+x);
                    System.out.println("Local variable z is : "+z);
               }
         }
		  MyInner mi = new MyInner();
          mi.seeOuter();
	   
    }	   
	 
}
public class Test15
{
    public static void main(String args[])
    {
          Outer5 m = new Outer5();
          m.doSttuff();  
    } 
}
