package com.mcq;

@FunctionalInterface
interface NIT2{
 int square(int x);
 static int add(int a, int b){
     return a+b;
 }
 static int sub(int a, int b){
     return a-b;
 }
 static int multiply(int a, int b){
     return a*b;
 }
 static int divide(int a, int b){
     return a/b;
 }
}
public class FunctionalInterfaceExample2{
 public static void main(String[] args){
     int a = 25;
     int b = 5;  
     int add = NIT2.add(a,b);
     int sub = NIT2.sub(a,b);
     int mul = NIT2.multiply(a,b);
     int div = NIT2.divide(a,b);
     System.out.print(add+" "+sub+" "+mul+" "+div+" ");
      
     NIT2 sq = (x) -> 
     {
    	 return x*x;
     };
     System.out.print(sq.square(6));
 }
}

