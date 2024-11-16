package com.test1;

class Test
{
	
}

public class InstanceOfDemo3 
{
	public static void main(String[] args) 
	{
	   Test t1 = new Test();
	   
	   if(t1 instanceof Test)
	   {
		   System.out.println("t1 is the instance of Test");
	   }
	   
	   else if(t1 instanceof Object)
	   {
		   System.out.println("t1 is the instance of Object");
	   }
	   
	   
	}

}
