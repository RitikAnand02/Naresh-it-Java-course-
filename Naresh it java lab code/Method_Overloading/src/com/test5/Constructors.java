package com.test5;

class Constructors {
    public static void main(String[] args) {
        new A2(3);
        new B2(5, 6);
        new B2(6, 7).C2(1, 2, 3);
        new C2(3, 3, 4).B2(4, 5);
        new C2(1, 1, 1);
    }
}
class A2 {
    A2(int i) {  
  print(i * 2);   
     }
    void print(int i) { 
    System.out.print(i + " ");   
    }
}
class B2 extends A2 {
    B2(int j, int k) {
        super(j);
        print(k * 4);
    }
    void C2(int j, int k, int l) {
      print(j + k + l - 3);   
       }
}
class C2 extends B2 {
    C2(int j, int k, int l) {
        super(j, k);
        print(l - 3);
    }
    void B2(int i, int k) {  
      print(i * 6);   
      }
}