package com.test4;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo1 {

	public static void main(String[] args) throws IOException 
	{
		FileReader reader = new FileReader("D:\\new\\db.properties");
		
		Properties p = new Properties();
		p.load(reader);
		
		String driver = p.getProperty("driverName");
		String userName = p.getProperty("userName");
		String password = p.getProperty("password");
					
		System.out.println(driver);
		System.out.println(userName);
		System.out.println(password);

	}

}


//If we make changes in the properties file then directly (without compilation) we can take the the value in our java file so after any modification in the properties file we need not to re-compile/re-deploy our java program.
