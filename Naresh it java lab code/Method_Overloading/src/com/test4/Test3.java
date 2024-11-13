package com.test4;

class A2{
public void printValue(){
System.out.println("Value-A");
}
}
class B2 extends A2{
public void printNameB(){
System.out.println("Name-B");
}
}
class C2 extends A2{
public void printNameC(){
System.out.println("Name-C");
}
}

public class Test3{
public static void main (String[] args){
B2 b = new B2();
C2 c = new C2();
newPrint(b);
newPrint(c);
}
public static void newPrint(A2 a){
a.printValue();
}
}