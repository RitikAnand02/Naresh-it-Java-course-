package com.test;

//illegal forward reference

class Demo1 
{	
  static
	{   
		i = 100;		
	}

  static int i;
}

public class StaticBlockDemo5
{
  public static void main(String[] args) 
	{
      System.out.println(Demo1.i);
	}
}

//Note : For static variable i, already memory is allocated in the prepare phase so we can initialize (can perform write operation)
//in the static block without pre-declaration.