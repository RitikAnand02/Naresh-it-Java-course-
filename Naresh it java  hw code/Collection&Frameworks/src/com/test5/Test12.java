package com.test5;

//program on wild-card character
import java.util.*;
class Parent1
{

}
class Child1 extends Parent1
{
}
public class Test12
{
public static void main(String [] args)
	{	
		List<?> lp = new ArrayList<Parent1>(); 
		System.out.println("Wild card....");
	}
}