package com.test;

class Welcome
{
	public void greet()
	{
		System.out.println("Hello Batch 38!");
	}
}
public class NoClassDefFoundErrorDemo 
{
	public static void main(String[] args) 
	{
		Welcome w = new Welcome();
		w.greet();
	}
}

//After compilation either delete Welcome.class or put this .class file in another folder[remove from the current folder]
