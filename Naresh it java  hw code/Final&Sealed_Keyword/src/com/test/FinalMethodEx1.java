package com.test;

class Alpha
{
	private final void accept()
	{
		System.out.println("Alpha class accept method");
	}
}
class Beta extends Alpha
{
	protected void accept()
	{
		System.out.println("Beta class accept method");
	}
}
public class FinalMethodEx1 
{
	public static void main(String [] args) 
	{
		new Beta().accept();
	}
}

//Note : Here Program will compile and execute because private method of super class is not available to sub class.