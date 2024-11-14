package com.test5;

public class Constructor7
{
  Constructor7(int a)
  {
    System.out.println("Book=" + a);
  }
  Constructor7(float a)
  {
    System.out.println("Pen="+ a );
  }
  public static void main(String[] args)
  {
    Constructor7 con = new Constructor7(50.5f);
  }
}