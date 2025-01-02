package com.test;

import java.util.List;

public class ImmutableListDemo 
{
	public static void main(String[] args) 
	{
		List<Integer> immutableList = List.of(1,2,3,4,5,6,7,8,9,10,11,12);
		//immutableList.set(0, 10);
		//immutableList.add(13);
		
		System.out.println(immutableList);
	}

}