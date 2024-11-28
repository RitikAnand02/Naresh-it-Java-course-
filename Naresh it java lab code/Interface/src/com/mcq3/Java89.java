package com.mcq3;

interface NIT9
{
	String myInterface();
}
public class Java89 {
	public static void main(String[] args) {
		NIT9 nit = () -> {return "NareshITechnologies";};
		System.out.println(nit.myInterface());
	}
}
