package com.test;

class Addition {

    void add(int a, int b) {System.out.println(a+b);}
    void add(float a, float b) {System.out.println(a+b);}
    void addString(String a, String b) { System.out.println(a+b);}
    void add(int a, double d){System.out.println(a+d);}
    
    void add(int a, int b, int c){System.out.println(a+b+c);}
    
    
    void add(double d, int a) {System.out.println(d+a);}

 }

 class Test {
         void m1() {  } 
 // static void m1(){}       //CE : Duplicate method
         void m1(int a){}
  static void m1(int a, int b) { } //Valid
       //  void m1(int a, int b){} //CE : Duplicate method

         void m2(){} 
          int m2(int a, double d) {return 0; }
// static  void m2(int a , double d) {} //CE: Duplicate method

  public static void main(String [] args){
          Test obj = new Test();
          obj.m1();
          obj.m1(7);
          Test.m1(5,6);

 }
 }
