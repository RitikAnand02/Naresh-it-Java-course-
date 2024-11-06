package com.test;

public class Test11 {    
    public void m1(short... f) {
        System.out.println("short...");
    }
    public void m1(boolean... b) {
        System.out.println("boolean...");
    }
    public static void main(String[] args) {
        Test11 t = new Test11();
        t.m1();
    }
}
