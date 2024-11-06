package com.test;

public class Test8 {
    public void m1(int... f) {
        System.out.println("int...");
    }
    public void m1(byte b) {
        System.out.println("byte");
    }
    public void m1(Object l) {
        System.out.println("Object");
    }
    public static void main(String[] args) {
        Test8 t = new Test8();
        t.m1(null);
       
       
    }
}
