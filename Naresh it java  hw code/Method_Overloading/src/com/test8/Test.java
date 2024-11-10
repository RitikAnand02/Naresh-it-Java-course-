//Program to show that var args can hold hetrogeneous elements


package com.test8;

public class Test 
{
   public void acceptHetro(Object ...obj)
   {
	   for(Object o : obj)
	   {
		   System.out.println(o);
	   }
   }
}
