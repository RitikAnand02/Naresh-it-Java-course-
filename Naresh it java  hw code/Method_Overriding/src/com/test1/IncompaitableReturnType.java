package com.test1;

class Super
{
	public void show()
	{
		System.out.println("Super class show Method");
	}
}
class Sub extends Super
{
	@Override
	public int show()
	{
		System.out.println("Sub class show Method");
		return 0;
	}
}

public class IncompaitableReturnType 
{
	public static void main(String[] args) 
	{
		Super s = new Sub();
		s.show();
	}
}

//Note : error, return type int is not compaitable with void.
