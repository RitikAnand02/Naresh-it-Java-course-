package com.test;

public class ThreadPriority {

	public static void main(String[] args) 
	{
		//Default Priority of the Thread
		Thread t = Thread.currentThread();
		System.out.println("Main thread priority is :"+t.getPriority());
		
		Thread t1 = new Thread();
		System.out.println("User thread priority is :"+t1.getPriority());
		
	}

}

//Note : By default every thread even main thread is having default priority i.e 5.
