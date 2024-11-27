package com.test1;

import java.util.function.Supplier;

public class SupplierDemo1 {

	public static void main(String[] args) 
	{
		Supplier<String> s1 = () -> 40 + 40+" Ravi "+ 80 + 80;
		System.out.println(s1.get());
	}

}
