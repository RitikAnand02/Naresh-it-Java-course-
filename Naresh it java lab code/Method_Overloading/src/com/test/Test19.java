package com.test;

class Building { }
public class Test19 extends Building {
 static void main(String[] args) {
 Building build1 = new Building(); //CE
 Test19 barn1 = new Test19();
Test19 barn2 = (Test19) build1;
 Object obj1 = (Object) build1;
// String str1 = (String) build1; //CE
 Building build2 = (Building) barn1;
 }
 }
