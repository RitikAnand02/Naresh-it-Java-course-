package com.test;

//Stream.of()

import java.util.stream.*;
public class StreamDemo2 
{
	public static void main(String[] args) 
	{
		//Stream of numbers
		Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
		stream.forEach(p -> System.out.println(p));

		System.out.println("...............................");

       //Anonymous Array Object (Stream of Arrays)
		
		Stream<Integer> strm = Stream.of( new Integer[]{15,29,45,8,16} );
		strm.forEach(p -> System.out.println(p));
	}
}
