package com.test2;

public class Main 
{
	public static void main(String[] args) 
	{
		Restaurant.acceptObject(new Tea());
		Restaurant.acceptObject(new Coffee());
		Restaurant.acceptObject(new Horlicks());
	}

}