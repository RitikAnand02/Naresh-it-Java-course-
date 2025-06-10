package com.test;

import java.util.Iterator;
import java.util.Vector;

class Concurrent extends Thread
{
	private Vector<String> listOfFruits;

	public Concurrent(Vector<String> listOfFruits) 
	{
		super();
		this.listOfFruits = listOfFruits;
	}
	
	
	@Override
	public void run()
	{
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			
		}
		listOfFruits.add("POMOGRANATE");
	}
	
	
	
}

public class ConcurrentModificationDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		Vector<String> fruits = new Vector<>();
		fruits.add("Apple");   
		fruits.add("Orange");
		fruits.add("Grapes");
		fruits.add("Mango");
		fruits.add("Guava");
		
		Concurrent crm = new Concurrent(fruits);
		crm.start();
		
		Iterator<String> itr = fruits.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			Thread.sleep(500);
		}
		
		

	}

}
//Note :- In the above program we will get java.util.ConcurrentModificationException because Iterator is fail fast iterator.