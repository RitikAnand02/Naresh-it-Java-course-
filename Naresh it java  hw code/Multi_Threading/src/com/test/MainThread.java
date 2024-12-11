package com.test;

public class MainThread {

	public static void main(String[] args) 
	{
		//Thread obj = Thread.currentThread();
		//System.out.println("Current thread name is :"+obj.getName());
		
		                  //OR
		
		String name = Thread.currentThread().getName();
		System.out.println("Current thread name is :"+name);

	}

}