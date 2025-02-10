package com.test;

class Outer2
{  
	  static int x = 15;  

	  static class Inner
	  {  
			    void msg()
				{
					System.out.println("x value is  "+x);
				}  
	  }
}
class Test12
{  
	public static void main(String args[])
	{  
		Outer2.Inner obj=new Outer2.Inner();  
		obj.msg();  
	}  
}  

//We can static static member of Outer class.
