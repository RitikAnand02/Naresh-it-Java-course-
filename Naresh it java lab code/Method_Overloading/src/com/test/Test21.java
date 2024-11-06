package com.test;

class Message { // The message that should be printed:
	 String text = "Hello, world!";}
	class MySuperclass1 {
	 Message msg = new Message();}
	public class Test21 extends MySuperclass1 {
	 public static void main(String[] args) {
	 Test21 object = new Test21();
	 object.print();
	 }
	 public void print() {
	 System.out.println(  super.msg.text);}
	}
