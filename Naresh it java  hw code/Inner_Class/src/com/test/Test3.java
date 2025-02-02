package com.test;

class MyOuter1
{
      private int x = 15;
      class MyInner
      {
            public void seeOuter()
            {
                  System.out.println("Outer x is "+x);
            }
      }
}
public class Test3
{
      public static void main(String args[])
      {
		  //Creating inner class object in a single line
           MyOuter1.MyInner m = new MyOuter1().new MyInner();
			m.seeOuter();
      } 
}
