package com.test;

public class AnonymousDemo3 {

	public static void main(String[] args) 
	{
		Thread t1 = new Thread(()-> System.out.println(Thread.currentThread().getName()));
		t1.start();
		
		System.out.println("................");
		
		new Thread(()-> System.out.println(Thread.currentThread().getName())).start();
		
		System.out.println("................");
		
		new Thread(()-> System.out.println(Thread.currentThread().getName()),"Scott").start();
		
	}

}
