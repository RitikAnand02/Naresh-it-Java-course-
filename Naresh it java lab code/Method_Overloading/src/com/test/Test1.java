package com.test;

public class Test1 {
    public void m1(int a) {
        System.out.println("int");
    }
    public int m1(Integer a) {
        System.out.println("Integer");
        return 0;
    }
    public String m1(int... a) {
        System.out.println("int...");
        return null;
    }
    public static void main(String[] args) {
        Test1 t = new Test1();
        int i = 10;
        Integer io = 10;
        t.m1(i);
        t.m1(io);
       
    }
}
