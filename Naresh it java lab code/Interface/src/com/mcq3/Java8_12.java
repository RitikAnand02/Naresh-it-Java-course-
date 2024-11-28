package com.mcq3;

interface NIT12
{
	int myInterface(int a, int b);
}
public class Java8_12 {
	public static void main(String[] args) {
		NIT12 nit = (int a, int b) ->
		{
			return a+b;
		};
		
	}
}
