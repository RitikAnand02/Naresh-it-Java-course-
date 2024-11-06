package com.test;

public class Test7 {    
    public void m1(Integer f) {
        System.out.println("Integer");
    }
    public void m1(String l) {
        System.out.println("String");
    }
    public void m1(Object l) {
        System.out.println("Object");
    }
   
    public static void main(String[] args) {
        Test7 t = new Test7();
        t.m1(null);
       
       
    }
}
