package com.test5;

public class TestingConstructor
{
  void TestingConstructor()
  {
    System.out.println("Amsterdam");	
  }

  TestingConstructor()
  {
    System.out.println("Antarctica");	
  }
	
  public static void main(String[] args)
  {
    TestingConstructor tc = new TestingConstructor();
  }
}