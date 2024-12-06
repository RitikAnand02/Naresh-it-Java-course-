package com.test;

public class ReturnExample
{
    public static void main(String[] args) 
    {     	
       System.out.println(methodReturningValue());        
    }	
	
	
	public static int methodReturningValue()
    {
        try
        {
            System.out.println("Try block");
            return 10/0;    
        }
        catch (Exception e)
        {
            System.out.println("catch block");         
           return 20;  //return statement is compulsory  
        }
        
       // System.out.println("Unreachable code");
               
    }
}
