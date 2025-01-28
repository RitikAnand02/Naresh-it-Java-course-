package com.test5;

import java.util.*;
public class Test13 
{
	public static void main(String[] args) 
	{
		List<? extends Number> list1 = new ArrayList<Float>();

		List<? super String> list2 = new ArrayList<Object>();

		List<? super Gamma> list3 = new ArrayList<Alpha>();

		List list4 = new ArrayList();
		
		System.out.println("yes");
	}
}

class Alpha
{
}
class Beta extends Alpha
{
}
class Gamma extends Beta
{
}
