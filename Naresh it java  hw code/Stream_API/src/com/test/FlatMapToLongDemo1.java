package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;

public class FlatMapToLongDemo1 {

	public static void main(String[] args) 
	{
		long []arr1 = new long[] {23,33,43};
		long []arr2 = new long[] {53,63,73};
		long []arr3 = new long[] {83,93,103};
		
		List<long[]> longArray = Arrays.asList(arr1, arr2,arr3);
		LongStream flatMapToLong = longArray.stream().
				flatMapToLong(array -> Arrays.stream(array));
		
		flatMapToLong.forEach(System.out::println);
	}

}