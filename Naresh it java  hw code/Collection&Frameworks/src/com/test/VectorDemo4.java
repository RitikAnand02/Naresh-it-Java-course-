package com.test;

//Program to describe that ArrayList is better than Vector in performance

import java.util.ArrayList;
import java.util.Vector;

public class VectorDemo4 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<>();
		
		long startTime = System.currentTimeMillis();
		
		for(int i=0; i<1000000; i++)
		{
			al.add(i);
		}
		
		long endTime = System.currentTimeMillis();
		
		long timeTaken = endTime - startTime;
		
		System.out.println("Time taken by ArrayList class :"+timeTaken+" ms");
		
		
        Vector<Integer> v1 = new Vector<>();
		
		startTime = System.currentTimeMillis();
		
		for(int i=0; i<1000000; i++)
		{
			v1.add(i);
		}
		
		endTime = System.currentTimeMillis();
		
		timeTaken = endTime - startTime;
		
		System.out.println("Time taken by Vector class :"+timeTaken+" ms");	
		
	}
}
