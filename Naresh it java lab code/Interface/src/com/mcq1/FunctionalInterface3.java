package com.mcq1;

@FunctionalInterface
interface Str
{
	int methodStr(String str);
}
public class FunctionalInterface3 {
	public static void main(String[] args) {
		Str str = (String s) -> "2";
		System.out.println(str.methodStr("2"));
	}
}
