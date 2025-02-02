package com.test;

class MyOuter
{
      private int x = 7;
      public void makeInner()
      {
            MyInner in = new MyInner();
			System.out.println("Inner y is "+in.y);
            in.seeOuter();
      }

      class MyInner
      {
		    private int y = 15;
            public void seeOuter()
            {
                  System.out.println("Outer x is "+x);
            }
      }
}
public class Test2
{
      public static void main(String args[])
      {
            MyOuter m = new MyOuter();
            m.makeInner();   
      } 
}
