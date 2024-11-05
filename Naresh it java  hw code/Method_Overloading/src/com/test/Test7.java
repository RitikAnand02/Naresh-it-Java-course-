package com.test;

//Auto Boxing and Auto Unboxing : 1.5
/*
 * abstract class Number
 * 
 * byte -> Byte
 * short - >Short
 * int -> Integer
 * long -> Long
 * float -> Float
 * double -> Double
 * 
 * char -> Character
 * boolean -> Boolean
 */

public class Test7 {
    public static void main(String[] args) {
		int x = 10;//x = 10
		Integer obj = new Integer(x); // 1000x -> value : 10
		System.out.println(x);
		System.out.println(obj.toString());
		Integer obj2 = Integer.valueOf(x);
		
		double d = 78.0;
		
		Double d1 = new Double(d); //Boxing
		Double d2 = Double.valueOf(d);
		
		Double d3 = d;//AutoBoxing
		
		double d4 = d3.doubleValue();//un boxing
		double d5 = d3;//Auto unboxing
		
		
		Integer i1 = 100;//Auto boxing
		int a = i1;//Auto Unboxing	   
	}    
}