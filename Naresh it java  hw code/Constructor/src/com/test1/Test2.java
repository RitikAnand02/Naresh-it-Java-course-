package com.test1;

public class Test2 {
	public void Test2()
	{
		System.out.println("Method");
		return;
	}	

	public static void main(String[] args) 
	{		
	  System.out.println("Main");
          Test2 t1 = new Test2();
          t1.Test2();
	}

}
