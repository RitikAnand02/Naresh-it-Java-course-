package com.test;

public class Test14 {
	public static void main(String[] args) {
		/*
		 int a = 10;
		 System.out.println(a.toString()); // not valid
		 int x = null; //CE: not valid
		 */
		Integer obj1 = null;
		Integer obj2 = new Integer(11);
		System.out.println(obj2.toString());
		 
		//Converting PDT to WO
         //Upto 1.4v 
		 Integer obj3 = new Integer(10);
		 Integer obj4 = Integer.valueOf(100);
		 
		 //From java 1.5 onwards
		 
		 Integer obj5 = 100; //Auto Boxing
		 /*
		  * Developer source code
		  * Integer obj5 = 100; 
		  * Compiler converted code
		  * Integer obj5 = Integer.valueOf(100);
		  */
		 Byte b = 10;  //Byte.valueOf(10)
		 Short s = 11; //Short.valueOf(11)
		 Long l = 100L; //Long.valueOf(100L)
		 Float f = 10.5f; //Float.valueOf(10.5);
		 Double d = 50.5; //Double.valueOf(50.5);
		 Character ch = 'A'; //Character.valueOf('A')
		 Boolean bool = false; //Boolean.valueOf(false);
		 
		 //Converting WO to PDT
		 //upto 1.4
		 int a  = obj5.intValue(); 
		 
		 //from java 1.5+ (Unboxing)
		 int x = obj5;        //obj5.intValue()
		 /*
		  * Source code
		  * int x = obj5;
		  * 
		  * compiler converted code
		  * int x = obj5.intValue()
		  */
		  byte b1 = b;      //b.byteValue()
		  short s1 = s;     //s.shortValue()    .... xxxValue()
		  
		 Integer i1 = new Integer(100);
		 Integer i2 = new Integer(100);
		 
		 System.out.println(i1==i2);
		 System.out.println(i1.equals(i2));
		 
		 Integer i3 = Integer.valueOf(100);
		 Integer i4 = Integer.valueOf(100);
		 
		 System.out.println(i3==i4);
		 System.out.println(i3.equals(i4));	 
		
	}
}