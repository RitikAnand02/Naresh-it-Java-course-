package com.test;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo1 {

	public static void main(String[] args) throws IOException
	{
		var  fin = new FileInputStream("D:\\Naresh it Java course\\Naresh it java  hw code\\File_Handling\\src\\com\\test\\Hyderabad.txt");
		
		try(fin)
		{
			while(true)
			{
				int i = fin.read();
				
				if(i==-1)
					break;
				System.out.print((char)i);
			}
		}
		catch(Exception e)
		{
			
		}
	}	
}
