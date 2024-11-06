package com.test;

public class Test13 {    
    public void m1(Integer i) {
        System.out.println("Integer");
    }
    public void m1(Long l) {
        System.out.println("Long");
    }
    public void m1(Object... obj) {
        System.out.println("Object...");
    }
    public static void main(String[] args) {
        Test13 t = new Test13();
        char ch = 'A';
        t.m1(ch);
    }
}
