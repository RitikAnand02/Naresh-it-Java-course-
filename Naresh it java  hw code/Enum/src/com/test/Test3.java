package com.test;

public class Test3 
{
	enum Color { RED,BLUE } 

     public static void main(String args[])
     {
          Color c1 = Color.RED; 
          Color c2 = Color.RED;  
		  
          if(c1 == c2)
          {
                System.out.println("== Operator");
          }
          if(c1.equals(c2))
          {
                 System.out.println("equals method");
          }
     }	
}

//We can compare enum constant by using == operator or equals(Object obj) method of enum class.
