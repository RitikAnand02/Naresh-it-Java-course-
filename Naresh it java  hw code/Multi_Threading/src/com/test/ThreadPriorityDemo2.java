package com.test;


class MyPriority extends Thread
{
	@Override
	public void run()
	{
		int count = 0;
		
		for(int i=1; i<=1000000; i++)
		{
	       count++;		
		}
		
		System.out.println("Thread name is :"+Thread.currentThread().getName());
		System.out.println("Thread Priority is :"+Thread.currentThread().getPriority());
	}
}

public class ThreadPriorityDemo2 
{
	public static void main(String[] args) 
	{
       MyPriority m1 = new MyPriority();
       m1.setPriority(Thread.MIN_PRIORITY);
       m1.setName("Last");
       
       MyPriority m2 = new MyPriority();
       m2.setPriority(Thread.MAX_PRIORITY);
       m2.setName("First");
       
       m1.start();  m2.start();

	}

}

//Most of time the thread having highest priority will complete its task but we can't say that it will always complete its task first that means Thread schedular dominates Priority of the Thread.