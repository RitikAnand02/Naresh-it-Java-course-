package com.test;

class UserThread extends Thread
{
	@Override
	public void run()
	{
		System.out.println("My user thread is running in a separate stack"); 
	}
}

public class MainThread1 {

	public static void main(String[] args) 
	{
		System.out.println("Main thread started");
		
		UserThread ut = new UserThread();
		ut.start();
		
		System.out.println(10/0);
		
		System.out.println("Main thread ended");

	}

}

//In the above program, we have two threads, main thread which is responsible to execute 
//main method and Thread-0 thread which is responsible to execute run()
//method. [10-DEC-24]