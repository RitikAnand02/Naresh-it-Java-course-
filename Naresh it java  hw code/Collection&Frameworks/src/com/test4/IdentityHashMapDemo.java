package com.test4;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

	public static void main(String[] args) 
	{
		IdentityHashMap<String,Integer> ihm = new IdentityHashMap<>();
		ihm.put("Raj", 123);
		ihm.put(new String("Raj"), 456);
		System.out.println(ihm.size());  //2
		System.out.println(ihm); //{Raj = 123, Raj = 456}
		
		
		HashMap<String,Integer> hm = new HashMap<>();
		hm.put("Raj", 123);
		hm.put(new String("Raj"), 456);
		System.out.println(hm.size());  //1
		System.out.println(hm); //{Raj = 456}

	}

}
