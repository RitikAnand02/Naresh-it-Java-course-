package com.test1;

class Interrupt extends Thread
{
   @Override
   public void run()
	{
	   Thread t = Thread.currentThread();
	   System.out.println(t.isInterrupted()); 
       
	   for(int i=1; i<=5; i++)
		{
		   System.out.println(i);  
           try
		   {
			Thread.sleep(1000);
		   }
		   catch (Exception e)
		   {
			   System.err.println("Thread is Interrupted ");
			   e.printStackTrace();
		   }
		   
		}
	}
}
public class  InterruptThread
{
	public static void main(String[] args) 
	{
        Interrupt it = new Interrupt();
		System.out.println(it.getState());  //NEW
		it.start();
		it.interrupt();  //main thread is interrupting the child thread	
	}
}

//Note : main thread is interrupting child thread.