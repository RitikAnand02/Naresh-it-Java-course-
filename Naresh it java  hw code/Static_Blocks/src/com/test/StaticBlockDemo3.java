package com.test;

class Demo
{
	
	final static int a ;	//Blank static final field

	static
	{	
		a = 100;
		System.out.println(a); 
	}
}	
public class  StaticBlockDemo3
{
	public static void main(String[] args) 
		{		
	         System.out.println("a value is :"+Demo.a);		
	    }
}

//Note : A blank static final field must be initialized through static block only.
