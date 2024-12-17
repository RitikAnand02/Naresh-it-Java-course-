package com.test;

class Priority extends Thread
{
	@Override
	public void run()
	{
		int priority = Thread.currentThread().getPriority();
		System.out.println("Child Thread priority is :"+priority);
	}
}

public class ThreadPriorityDemo1 {

	public static void main(String[] args) 
	{
		Thread t = Thread.currentThread();
		t.setPriority(9);
		
		Priority p1 = new Priority();
		p1.start();
		
		System.out.println("Main Thread priority is :"+t.getPriority());

	}

}

//Note : The thread which are created under main Thread will 
//acquire main thread priority.
