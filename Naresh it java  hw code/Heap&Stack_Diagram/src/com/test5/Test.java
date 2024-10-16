package com.test5;

class Test
{
int x;  
int y;  

void m1(Test t)  
{
x=x+1;
y=y+2;
t.x=t.x+3;
t.y=t.y+4;
}
public static void main(String[] args)
{
Test t1=new Test();  // x and y  m1()
Test t2=new Test();  // x and y  m1()

t1.m1(t2);

System.out.println(t1.x+"... "+t1.y); // 1 ... 2
System.out.println(t2.x+"... "+t2.y); // 3 ... 4

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

//1... 2
//3... 4
//4... 6
//4... 6
//8... 12
//4... 6
//8... 12
//8... 12