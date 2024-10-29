package com.test1;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassDescription {

	public static void main(String[] args) throws Exception 
	{
		Class cls = Class.forName("com.test1.Test");
		
		System.out.println("Class Name :"+cls.getName());
		System.out.println("Package Name :"+cls.getPackageName());
		
		System.out.println("Available Methods :");
		   int count = 0;
		
		   Method[] methods = cls.getDeclaredMethods();
		   
		   for(Method method : methods)
		   {
			   count++;
			   System.out.println(method.getName());
		   }
		
		   System.out.println("Total number of methods are :"+count);
		   
		   System.out.println("Available Fields :");
		   count = 0;
		   Field[] fields = cls.getDeclaredFields();
		   
		   for(Field field : fields)
		   {
			   count++;
			   System.out.println(field.getName());
		   }
		   System.out.println("Total number of fields are :"+count);

	}

}


//Note :- getDeclaredMethods() is a predefined non static method available in java.lang.Class class , the return type of this method is Method array where Method is a predefined class available in java.lang.reflect sub package.
//
//getDeclaredFields() is a predefined non static method available in java.lang.Class class , the return type of this method is Field array where Field is a predefined class available in java.lang.reflect sub package.
//
//Field and Method both the classes are providing getName() method to get the name of the field and Method.
