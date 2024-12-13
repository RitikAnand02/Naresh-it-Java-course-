package com.test;

class MyThread1 extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Child Thread is running");
	}
}

public class SleepDemo2 {

	public static void main(String[] args) throws InterruptedException 
	{
		MyThread1 m1 = new MyThread1();
		m1.start();
		
		m1.sleep(2000); //current thread is main
		
		System.out.println("Main Thread is Running");
		

	}

}

//Note : Here main thread will go into the sleeping state.