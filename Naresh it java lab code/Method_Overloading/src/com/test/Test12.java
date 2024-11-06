package com.test;

public class Test12 {    
    public void m1(Integer... f) {
        System.out.println("Integer...");
    }
    public void m1(Long... b) {
        System.out.println("Long...");
    }
    public void m1(Object... obj) {
        System.out.println("Object...");
    }
    public static void main(String[] args) {
        Test12 t = new Test12();
        t.m1();
    }
}
