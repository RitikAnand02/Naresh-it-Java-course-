package com.test1;

import java.io.Closeable;
import java.io.IOException;

public class FileResourse implements Closeable
{
	@Override
	public void close() throws IOException 
	{
		System.out.println("File resourse closed successfully");	
	}

}
