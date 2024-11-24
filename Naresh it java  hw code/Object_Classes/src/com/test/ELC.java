package com.test;

class Test 
{

}

public class ELC {

	public static void main(String[] args) 
	{	
        Test t1 = new Test();
        System.out.println(t1.getClass());  //class keyword + FQN
        System.out.println(t1.getClass().getName()); //FQN
	}

}

//Note :- java.lang.Class class has provided a predefined method 
//         getName() through which we can get the Fully Qualified name 
//	 of the class.
//
//	 public String getName();
//
//
//          getClass().getName(); //Method Chaining
