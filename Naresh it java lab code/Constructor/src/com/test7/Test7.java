package com.test7;

public class Test7 {
	Test7( )
	{
	System.out.println("Object address inside constructor : "+this);
	}
	public static void main(String args[ ])
	{
	Test7 obj = new Test7();
	System.out.println("Object address inside main : "+obj);
	}

}
