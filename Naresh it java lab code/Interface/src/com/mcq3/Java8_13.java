package com.mcq3;

interface NIT13
{
	int myInterface(int a, int b);
}
public class Java8_13 {
	public static void main(String[] args) {
		NIT13 nit = (a, b) ->
		{
			int div = a/b;
			int addition = a+b;
			return addition;
		};
	}
}
