package com.test;

class Demo2 
{
    static 
	{   
		i = 100;
		//System.out.println(i); //Invalid
		System.out.println(Demo2.i);
    }

    static int i;
}

public class StaticBlockDemo6
{

    public static void main(String[] args) 
	{
		System.out.println(Demo2.i);
	}
}

//Note : Without declaring the static variable if we try to access(read Operation) static variable value in the static block directly then we will get compilation error, we can access with the help of class name (Class Area)
