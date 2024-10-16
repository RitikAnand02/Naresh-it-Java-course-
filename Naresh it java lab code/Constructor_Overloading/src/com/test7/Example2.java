package com.test7;

public class Example2 {
	int eid;
	String ename;
	String company;
	public String toString(){
	return
	"eid:"+eid+"\n"+"ename:"+ename+"\n"+"company:"+company+"\n";
	}
	public static void main(String[] args)
	{
	Example2 e1=new Example2();
	e1.eid=7279;
	e1.ename="Ganesh";
	e1.company="Naresh IT";
	System.out.println(e1);
	e1=new Example2();
	System.out.println(e1);
	}

}
