package com.test;

class Demo extends Thread
{
	@Override
	public void run()
	{
		 String name = Thread.currentThread().getName();
		 System.out.println("Running Thread name is :"+name);
	}
}
public class ThreadName1 
{
	public static void main(String[] args) 
	{
	  Thread t =  Thread.currentThread();
	  t.setName("Parent"); //Changing the name of the main thread
	  
	   Demo d1 = new Demo();
	   Demo d2 = new Demo();
	   
	 
	   d1.setName("Child1");
	   d2.setName("Child2");	   
	   d1.start();  d2.start();
	   
	   
	   
	   String name = Thread.currentThread().getName();
	   System.out.println(name + " Thread is running Here..");
	}
}
