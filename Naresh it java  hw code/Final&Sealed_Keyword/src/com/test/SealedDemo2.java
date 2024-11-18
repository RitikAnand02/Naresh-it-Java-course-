package com.test;

sealed class OnlineClass permits Mobile,Laptop
{
	public void attendOnlineJavaClass()
	{
		System.out.println("Online java class!!!");
	}
}
final class Mobile extends OnlineClass
{
	@Override
	public void attendOnlineJavaClass()
	{
		System.out.println("Attending Java class through mobile.");
	}
}
final class Laptop extends OnlineClass
{
	@Override
	public void attendOnlineJavaClass()
	{
		System.out.println("Attending Java class through Laptop.");
	}
}
public class SealedDemo2 
{
	public static void main(String[] args) 
	{
		OnlineClass c = null;
		c = new Mobile(); c.attendOnlineJavaClass();
		c = new Laptop(); c.attendOnlineJavaClass();
	}

}
