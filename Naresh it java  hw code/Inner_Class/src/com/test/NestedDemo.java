package com.test;

class Ravi{}

public class NestedDemo 
{
   public class A  //Nested non static class
   {
	   
   }
   
   public static class B //Nested static class
   {
	   
   }
   
   public void method()
   {
	   class Local  //Local inner class
	   {
		   
	   }
	   
	   Ravi anonymous = new Ravi()
	   {
		   
	   };	   
   } 
   
}