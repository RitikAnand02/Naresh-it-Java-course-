package com.test;

class Resource 
{
    private boolean flag = false;

    public synchronized void waitMethod() 
	{
		System.out.println("Wait");  //child1  wait  child1 is waiting Child1 notif
		
       	while (!flag)
		{
          try 
		  {
             System.out.println(Thread.currentThread().getName() + " is waiting...");
             System.out.println(Thread.currentThread().getName()+" is Waiting for Notification");
             wait(); 
          } 
		  catch (InterruptedException e) 
		  {
                e.printStackTrace();
          }
        }
        System.out.println(Thread.currentThread().getName() + " thread completed!!");
    }

    public synchronized void setMethod() 
	{
		System.out.println("notifyAll");
		this.flag = true;
        System.out.println(Thread.currentThread().getName() + " has make flag value as a true");
        notifyAll(); // Notify all waiting threads that the signal is set
    }
}

public class ITCDemo6
{
    public static void main(String[] args) 
		{   	
    	
    	
        Resource r1 = new Resource(); //lock is created

        Thread t1 = new Thread(() -> r1.waitMethod(), "Child1");
		Thread t2 = new Thread(() -> r1.waitMethod(), "Child2");
		Thread t3 = new Thread(() -> r1.waitMethod(), "Child3");

		t1.start();
        t2.start();
        t3.start();
       
		
		Thread setter = new Thread(() -> r1.setMethod(), "Setter_Thread");
      
		   try 
			{
	            Thread.sleep(2000);
	        } 
			catch (InterruptedException e) 
			{
	            e.printStackTrace();
	        }
		
	       setter.start();
    }
}
