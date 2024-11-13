package com.test4;

class Parent
{
int a = 15;
int display()
{
int b = a*a;
return b;
}
}
class Child extends Parent
{
float display()
{
float d = a/2;
return d;
}
}
public class Main
{
public static void main(String args[])
{
Child ob = new Child();
float num = ob.display();
System.out.println(num);
}
}
