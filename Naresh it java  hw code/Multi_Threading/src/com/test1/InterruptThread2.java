package com.test1;

public class InterruptThread2
{
    public static void main(String[] args) 
	{
        Thread thread = new Thread(new MyRunnable());
        thread.start();
     
        try 
		{
          Thread.sleep(3000); //Main thread is waiting for 3 Sec
        } 
		catch (InterruptedException e) 
		{
            e.printStackTrace();
        }
        
       thread.interrupt();  
    }
}

class MyRunnable implements Runnable 
{
    @Override
    public void run() 
	{
        try 
		{
            while (!Thread.currentThread().isInterrupted())
			{
                System.out.println("Thread is running by locking the resource");
                Thread.sleep(500);
            }
        } 
		catch (Exception e) 
		{
            System.out.println("Thread interrupted gracefully.");
        } 
		finally 
		{
            System.out.println("Thread resource can be release here.");
        }
    }
}
