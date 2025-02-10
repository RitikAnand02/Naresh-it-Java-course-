package com.test;

class Outer4
{  
	  int x=15;  //Non static variable

	  static class Inner
	  {  
			void msg()
				{
					System.out.println("x value is  "+x);
				}  
	  }
}
class Test14
{  
	public static void main(String args[])
	{  
		Outer4.Inner obj=new Outer4.Inner();  
		obj.msg();  
	}  
}  

//Note : We will get error because from static area (static nested inner class) we can't access the non static member directly.
