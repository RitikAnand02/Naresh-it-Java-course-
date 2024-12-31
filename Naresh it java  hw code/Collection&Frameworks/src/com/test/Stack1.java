package com.test;

//Program to insert and fetch the elements from stack

import java.util.*;
public class Stack1
{
    public static void main(String args[])
    {
          Stack<Integer> s = new Stack<>();
            try
            {
                s.push(12);
                s.push(15);
				  s.push(22);
				  s.push(33);
				  s.push(49);				  
				  System.out.println("After insertion elements are :"+s); 

                System.out.println("Fetching the elements using pop method");
                System.out.println(s.pop());
                System.out.println(s.pop()); 
                System.out.println(s.pop());  
                System.out.println(s.pop());  
                System.out.println(s.pop());
                                      
               			  	
	 				 				  
				  System.out.println("After deletion elements are :"+s);//[]
				  
				  System.out.println("Is the Stack empty ? :"+s.empty());  
            }
			catch(EmptyStackException e)
			{
			   e.printStackTrace();
			} 
			
    }
}