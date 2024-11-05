package com.test;

//Reference data type widening

class A {}
class B extends A{}
class C extends B {}
class D{}
public class Test6 {
	public static void m1(A a) {System.out.println("A"); }
	public static void m1(B a) {System.out.println("B"); }
	public static void m1(C a) {System.out.println("C");}
    public static void m1(D a) {System.out.println("D");}
    public static void m1(Object a) {System.out.println("Object");}
    public static void main(String[] args) {
		//m1(new A());
    	//m1(new B());
    	//m1(new C());
    	m1(new D());
		   
	}  
}