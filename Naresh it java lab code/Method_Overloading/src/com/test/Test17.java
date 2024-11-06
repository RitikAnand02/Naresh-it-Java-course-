package com.test;

abstract class Poly{
    abstract void  m1(Integer... i) ;
}
class Overload extends Poly{
    @Override
    void m1(Integer[] i) {
          System.out.println("Integer[]");}    
    void m1(Number... i) {
        System.out.println("Number...");}
    void m1(Object... i) {
        System.out.println("Object...");}        }
public class Test17 {
    public static void main(String[] args) {
    Overload o = new Overload();
     int b1=10;
    o.m1(b1,20);
   
   
   
    }
}

