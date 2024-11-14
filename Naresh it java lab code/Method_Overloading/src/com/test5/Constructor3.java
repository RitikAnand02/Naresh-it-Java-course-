package com.test5;

public class Constructor3
{
  int birds=10;
  Constructor3()
  {
    this(20);
  }
  Constructor3(int birds)
  {
    System.out.println("Birds=" + birds);
  }

  public static void main(String[] args)
  {
    Constructor3 con = new Constructor3();
  }
}