package com.test;

class Sleep extends Thread
{
   @Override
   public void run()
   {	 
	   
	   for(int i=1; i<=10; i++)
	   {
		   System.out.println("i value is :"+i);
		   try
		   {
			   Thread.sleep(1000);
		   }
		   catch(InterruptedException e)
		   {
			   System.err.println("Thread interrupted "+e);
		   }
	   }
   }
   
}
public class SleepDemo 
{
	public static void main(String[] args)  
	{
	  	Sleep s = new Sleep();
	  	s.start(); 		  	
	  	  
	}
}

