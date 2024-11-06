package com.test;

public class Test10 {
    public void m1(short... f) {
        System.out.println("short...");
    }
    public void m1(char... b) {
        System.out.println("char...");
    }
    public static void main(String[] args) {
        Test10 t = new Test10();
        t.m1();  
    }
}
