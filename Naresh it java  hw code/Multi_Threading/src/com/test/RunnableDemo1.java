package com.test;

class Ravi1 implements Runnable
{
	@Override
	public void run() 
	{
		System.out.println("Thread is performing my task ");		
	}	
}

public class RunnableDemo1
{
   public static void main(String [] args)
   {
	   System.out.println("Main");        
        
        Thread t1 = new Thread(new Ravi1());
        t1.start();
       
   }
}   