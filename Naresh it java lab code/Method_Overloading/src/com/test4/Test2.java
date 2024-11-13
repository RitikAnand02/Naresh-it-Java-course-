package com.test4;

class A1{
public A1(){
System.out.println("A");
}
public A1(int i){
this();
System.out.println(i);
}
}
class B1 extends A1{
public B1(){
System.out.println("B");
}
public B1(int i){
this();
System.out.println(i+3);
}
}
public class Test2{
public static void main (String[] args){
new B1(5);
}
}
