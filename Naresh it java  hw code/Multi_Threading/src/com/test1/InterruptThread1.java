package com.test1;

class Interrupt1 extends Thread
{
   @Override
   public void run()
	{
	   try
	   {
	    Thread.currentThread().interrupt();

	   for(int i=1; i<=10; i++)
		{
		   System.out.println("i value is :"+i);
		   Thread.sleep(1000);
		}

	   }
		catch (InterruptedException e)
		{
			System.err.println("Thread is Interrupted :"+e);
		}
		System.out.println("Child thread completed...");
	}
}
public class  InterruptThread1
{
	public static void main(String[] args) 
	{	
		Interrupt1 it = new Interrupt1();
		it.start();	
	}
}

//Note : Here Child Thread is interrupting itself.
