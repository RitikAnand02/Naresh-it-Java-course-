package com.test;

public class Test2 {
	   
    public void m1(Integer a) {
        System.out.println("Integer");
    }
    public void m1(Long a) {
        System.out.println("Long");
    }
    public void m1(int... a) {
        System.out.println("int...");
    }
    public static void main(String[] args) {
        Test2 t = new Test2();
        byte b = 10;
        Integer io = 10;
        t.m1(b);
        t.m1(io);    
    }
}