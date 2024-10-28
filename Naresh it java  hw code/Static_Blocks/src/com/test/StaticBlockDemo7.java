package com.test;

class StaticBlockDemo7 
{
	static 
	{
      System.out.println("Static Block");
	 // return; 
	}

	public static void main(String[] args) 
	{
		System.out.println("Main Method");
	}
}

//Note : We can't write return statement in static and non static block
