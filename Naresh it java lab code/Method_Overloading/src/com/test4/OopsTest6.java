package com.test4;

class NIT11
{
	static String val = "NareshIT";
	String language;
	String faculty;
	String student;
	
	public NIT11(String language, String faculty, String student) {
		this.faculty = faculty;
		this.language = language;
		this.student = student;
	}
	
	static public String get() 
	{
		return val; // line 1
	}
	
	public void getValues() 
	{
		System.out.println(NIT11.this.faculty+" "+NIT11.this.language+" "+NIT11.this.student); // line 2
	}
	
}

class OopsTest6
{
	public static void main(String[] args) {
		System.out.println("Welcome to "+NIT11.get());
		//new NIT11("Java", "Naresh", "IT");
		NIT11 nit11 = new NIT11("Java", "Naresh", "IT");
		nit11.getValues(); // line 3
	}
}
