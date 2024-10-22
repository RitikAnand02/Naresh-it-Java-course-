package com.test7;

public class Test11 {
	int x;
	int y;
	void m1(Test11 t){
	x=x+1;
	y=y+2;
	t.x=t.x+3;
	t.y=t.y+4;
	}
	public static void main(String[] args)
	{
	Test11 t1=new Test11();
	Test11 t2=new Test11();
	t1.m1(t2);
	System.out.println(t1.x+"... "+t1.y);
	System.out.println(t2.x+"... "+t2.y);
	t2.m1(t1);
	System.out.println(t1.x+"... "+t1.y);
	System.out.println(t2.x+"... "+t2.y);
	t1.m1(t1);
	System.out.println(t1.x+"... "+t1.y);
	System.out.println(t2.x+"... "+t2.y);
	t2.m1(t2);
	System.out.println(t1.x+"... "+t1.y);
	System.out.println(t2.x+"... "+t2.y);
	}

}
