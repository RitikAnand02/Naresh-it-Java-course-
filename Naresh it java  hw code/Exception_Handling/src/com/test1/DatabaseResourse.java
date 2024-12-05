package com.test1;

public class DatabaseResourse implements AutoCloseable
{
	@Override
	public void close() throws Exception 
	{
		System.out.println("Database resourse is closed");		
	}

}