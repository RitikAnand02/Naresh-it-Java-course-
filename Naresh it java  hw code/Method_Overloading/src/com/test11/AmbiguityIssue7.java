package com.test11;

class Test7
{
	public void accept(byte d)
	{
		System.out.println("byte");
	}
	public void accept(short s)
	{
		System.out.println("short");
	}	
}
public class AmbiguityIssue7 {

	public static void main(String[] args) 
	{
		Test7 t = new Test7();
		//t.accept(9);  //error
        t.accept((short)9);

	}
}

//Here value 9 is of type int so, we can't assign directly to byte and short, If we want explicit type casting is reqd.
