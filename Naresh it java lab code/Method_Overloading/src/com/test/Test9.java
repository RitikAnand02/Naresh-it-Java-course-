package com.test;

public class Test9 {
    public void m1(int... f) {
        System.out.println("int...");
    }
    public void m1(char... b) {
        System.out.println("char...");
    }
    public static void main(String[] args) {
        Test9 t = new Test9();
        t.m1();
    }
}
