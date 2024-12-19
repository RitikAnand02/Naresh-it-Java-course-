package com.test;

public class ThreadGroupDemo2 {

	public static void main(String[] args) 
	{
		Thread t = Thread.currentThread();
		System.out.println(t.toString());
	}

}



//Output : Thread[#1main, 5, main]
//
//Here first main is the name of the Thread, 5 is the priority and last main represents group name.
//
//Whenever we define a main method then internally, main group is created and under this main group main thread is executed.
