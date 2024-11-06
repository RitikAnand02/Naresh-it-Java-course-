package com.test;

public class Test3 {
    public void m1(Integer a) {
        System.out.println("Integer");
    }
    public void m1(Long a) {
        System.out.println("Long");
    }
    public void m1(Integer... a) {
        System.out.println("Integer...");
    }
    public static void main(String[] args) {
        Test3 t = new Test3();
        byte b = 10;
        t.m1(b);
       
       
    }
}
