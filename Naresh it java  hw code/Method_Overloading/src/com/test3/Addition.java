package com.test3;

public class Addition 
{
 public Addition()
 {
 this(100);
 System.out.println("No Argument Constructor");
 }
 
 public Addition(int x)
 {
 this(1000,2000); 
 System.out.println("One Argument Constructor :"+x);
 
 }
 public Addition(int x, int y)
 {
 super();
 System.out.println("Two Argument Constructor :"+x+":"+y);
 }
 
 {
System.out.println("Instance Block");
 }
}
