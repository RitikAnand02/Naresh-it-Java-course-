package com.test;

class Foo implements Runnable
{
	@Override
	public void run() 
	{
		String name = Thread.currentThread().getName();
	System.out.println(name+" is Enjoying Full Stack Developer under Batch 38");
		
	}	
}
 
public class ThreadGroupDemo1 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  
	 ThreadGroup tg = new ThreadGroup("Batch 38");
	 
	 Thread t1 = new Thread(tg, new Foo(), "Scott");
	 Thread t2 = new Thread(tg, new Foo(), "Smith");
	 Thread t3 = new Thread(tg, new Foo(), "Alen");
	 Thread t4 = new Thread(tg, new Foo(), "John");
	 Thread t5 = new Thread(tg, new Foo(), "Martin");
	 
	 t1.start();
	 t2.start();
	 t3.start();
	 t4.start();
	 t5.start();
	 
	 //Thread.sleep(5000);
	 
	System.out.println("How many threads are active under Batch 38 group :"+tg.activeCount());
	 
	System.out.println("Name of the the Group is :"+tg.getName());
	 
	 
	 
  }
}
