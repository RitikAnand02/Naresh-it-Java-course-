package com.test;

abstract class Alpha
{
	public abstract void show();
	public abstract void demo();
}
abstract class Beta extends Alpha
{
	@Override
	public void show() //+ demo();
	{
		System.out.println("Show method implemented in Beta class");		
	}
}
class Gamma extends Beta
{
	@Override
	public void demo() 
	{
		System.out.println("Demo method implemented in Gamma class");			
	}	
}
public class AbstractDemo4 
{
   public static void main(String[] args) 
   {
      Gamma g = new Gamma();
      g.show();
      g.demo();
   }
}
