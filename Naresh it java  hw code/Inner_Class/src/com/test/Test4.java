package com.test;

class MyOuter2  
{
      static int x = 7;
	  class MyInner
          {
            public static void seeOuter()  //MyInner.seeOuter();
            {
                  System.out.println("Outer x is "+x);
            }
         }
}

public class Test4
{
      public static void main(String args[])
      {
          MyOuter2.MyInner.seeOuter();
      } 
}
