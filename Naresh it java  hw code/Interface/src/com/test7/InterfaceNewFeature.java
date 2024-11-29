package com.test7;

interface Worker
{
	public abstract void m1();  //JDK 1.0
	
	public default void m2() //JDK 1.8
	{
		m4();
		m5();
	}
	
	public static void m3()  //JDK 1.8
	{
		m5();
	
	}
	
	private void m4()   //Java 9 [Private non static method]
	{	
		System.out.println("Private non static method");
	}
	
	private static void m5() //Java 9 [Private static method]
	{	
		System.out.println("Private static method");
	}	
}

class Implementer implements Worker
{
	@Override
	public void m1() 
	{
		System.out.println("M1 method of Implementer class");		
	}	
}
public class InterfaceNewFeature {

	public static void main(String[] args) 
	{
		Implementer i = new Implementer();
		i.m1();  //abstract method
		i.m2();  //default 
		Worker.m3(); //public static 
	}

}


//Note : We can achieve 100% abstraction by using private method inside interface.
