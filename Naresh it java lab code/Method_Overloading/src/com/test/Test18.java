package com.test;

abstract class Foo {}
class Alpha extends Foo {}
class Beta extends Alpha {}
class Delta extends Beta {
public static void main( String[] args ) {
//Beta x = new Beta();
// insert code here  
Foo f = (Delta)x;
//---line-7
}
}
