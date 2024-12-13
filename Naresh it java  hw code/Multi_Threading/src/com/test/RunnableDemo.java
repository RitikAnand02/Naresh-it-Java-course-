package com.test;

class Ravi implements Runnable
{
	@Override
	public void run() 
	{
		System.out.println("Thread is performing my task ");		
	}	
}

public class RunnableDemo
{
   public static void main(String [] args)
   {
	   System.out.println("Main");        
        
        Thread t1 = new Thread(new Ravi());
        t1.start();
       
   }
}   
