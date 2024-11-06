package com.test;

public class Test5 {
    public static void m1(char a) {
        System.out.println("char");
    }
        public  void m1(float f) {
               System.out.println("float");
        }
        
        public static final void m1(Object obj) {
               System.out.println("Object");
        }
    public static void main(String[] args) {
              Test5 t = new Test5();
              double d = 10;
              t.m1(d);
       
       
    }
}
