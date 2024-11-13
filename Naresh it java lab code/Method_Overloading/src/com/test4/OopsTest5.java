package com.test4;

class NIT8{
	String name;
	public NIT8(String name) {
		this.name=name;
	}
}
class NIT9 extends NIT8{
	String programmingLanguage;
	public NIT9(String programmingLanguage, String name) {
		super(name);
		this.programmingLanguage=programmingLanguage;
	}
}
class NIT10 extends NIT8{
	String faculty;
	public NIT10(String faculty) {
		super("Naresh");
		this.faculty=faculty;
	}
}
class OopsTest5{
public static void main(String[] args) {
	NIT8 nit = new NIT8("Project");
	System.out.print(nit.name+" ");
	NIT9 nit1= new NIT9("Java","NareshIT");
	System.out.print(nit1.name+" "+nit1.programmingLanguage+" ");
	NIT10 nit2 = new NIT10("Naidu");
	System.out.println(nit2.name+" "+nit2.faculty);
	}
}
