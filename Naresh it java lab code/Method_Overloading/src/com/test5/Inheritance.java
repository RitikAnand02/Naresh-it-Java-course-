package com.test5;

class A3
{
int i;
void display()
{
System.out.println(i);
}
}
class B3 extends A3
{
int j;
void display()
{
System.out.println(j);
}
}
class Inheritance
{
public static void main(String args[])
{
B3 obj = new B3();
obj.i=1;
obj.j=2;
obj.display();
}
}
