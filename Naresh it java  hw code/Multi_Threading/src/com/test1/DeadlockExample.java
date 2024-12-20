package com.test1;

public class DeadlockExample
{
public static void main(String[] args) 
 {
 String resource1 = "Ameerpet";  
 String resource2 = "S R Nagar";  

// t1 tries to lock resource1 then resource2

Thread t1 = new Thread() 
	{
  @Override
  public void run() 
	  {
		  synchronized (resource1) 
			  {
		   System.out.println("Thread 1: locked resource 1");
		      try 
			   { 
			   Thread.sleep(1000);
			   } 
			   catch (Exception e) 
			   {}				  
			  				  
		   synchronized (resource2) //Nested synchronized block
		   {
			System.out.println("Thread 1: locked resource 2");
		   }
         }
  }
};


// t2 tries to lock resource2 then resource1
Thread t2 = new Thread() 
{
  @Override
  public void run() 
  {
    synchronized (resource2) 
		{
      System.out.println("Thread 2: locked resource 2");
          try 
		  { 
		  Thread.sleep(1000);
		  } 
		  catch (Exception e) 
		  {}

      synchronized (resource1) //Nested synchronized block
	  {
        System.out.println("Thread 2: locked resource 1");
      }
    }
  }
};    
t1.start();
t2.start();
}
}

//Note : Both the threads are in infinite waiting state so it is Deadlock situation.
