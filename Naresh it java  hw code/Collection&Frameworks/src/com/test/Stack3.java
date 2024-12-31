package com.test;

import java.util.Stack;  

public class Stack3
{  
	public static void main(String[] args)   
		{  
			Stack<String> stk= new Stack<>();  
			stk.push("Apple");  
			stk.push("Grapes");  
			stk.push("Mango");  
			stk.push("Orange");  
			System.out.println("Stack: " + stk);  
			
			String fruit = stk.peek(); 			
			System.out.println("Element at top: " + fruit);  
			System.out.println("Stack elements are : " + stk); 
		}  
}  
