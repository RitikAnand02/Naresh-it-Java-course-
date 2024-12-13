package com.test;

public class AnonymousWithoutReference {

	public static void main(String[] args) 
	{
		new Thread()
		{
		   @Override
		   public void run()
		   {
			   String name = Thread.currentThread().getName();
			   System.out.println("Running thread name is :"+name);
		   }
		}.start();
		
	}

}
