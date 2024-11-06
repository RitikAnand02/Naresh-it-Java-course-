package com.test;

public class Test6 {
    public void m1(Number f) {
        System.out.println("Number");
    }
    public void m1(Long l) {
        System.out.println("Long");
    }
    public void m1(Object l) {
        System.out.println("Object");
    }
    public static void main(String[] args) {
           Test6 t = new Test6();
           t.m1(null);
    }
}
