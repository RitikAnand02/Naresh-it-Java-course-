package com.test;

public class Test4 {
    public static void m1(char a) {
        System.out.println("char");
    }
        public void m1(float f) {
               System.out.println("float");
        }
    public static void main(String[] args) {
        Test4 t = new Test4();
        byte b = 10;
        t.m1(b);
       
       
    }
}
