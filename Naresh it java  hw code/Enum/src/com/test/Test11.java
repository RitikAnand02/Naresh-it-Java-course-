package com.test;

//Writing constructor in enum

enum Season
{
	WINTER, SUMMER, SPRING, RAINY, FALL;   //All are object of type enum
	 
	private Season()
	{
		System.out.println("Constructor is executed....");
	}	
}
class Test11 
{
	public static void main(String[] args) 
	{
		System.out.println(Season.WINTER);
		System.out.println(Season.SUMMER);
		
	}
}


//Every time enum object will be created, appropriate constructor will be executed.
