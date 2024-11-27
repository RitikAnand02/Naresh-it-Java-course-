package com.mcq2;

interface Course
{
	String courseName();
	String facultyName();
	String duration();
}
@FunctionalInterface
interface NIT extends Course
{
	String nit(String courseName);
}
public class FunctionalInterfaceExample2
{
	public static void main(String[] args) {
		NIT nit = (String course) -> course;
		System.out.println(nit.nit("Java"));
	}
}


