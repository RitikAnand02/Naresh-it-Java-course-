package com.test;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException
	{
		var fos = new FileOutputStream("D:\\Naresh it Java course\\Naresh it java  hw code\\File_Handling\\src\\com\\test\\Hyd.txt");
		
		try(fos)
		{
			String str = "Welcome to IT city, Hyderabad";			
			byte[] byteData = str.getBytes();
			fos.write(byteData);		
		}
		catch(Exception e)
		{
			
		} 
		System.out.println("Data stored successfully");
	}

}
