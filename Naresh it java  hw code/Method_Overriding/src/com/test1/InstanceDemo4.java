package com.test1;

public class InstanceDemo4
{

     public static void main(String[] args) 
	{
         Integer i = 45;
		
		if(i instanceof Integer)
		{
			System.out.println("i is pointing Integer Object");
		}
		
		else if(i instanceof Number)
		{
			System.out.println("i is pointing to Number Object");
		}		

		else if(i instanceof Object)
		{
			System.out.println("i is pointing to Object Object");
		}		

}
}
