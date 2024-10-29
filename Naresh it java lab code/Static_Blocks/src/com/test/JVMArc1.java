package com.test;

public class JVMArc1 {
	public static void main(String[] args) {
		System.out.println(JVMArc.class.getClassLoader());
		System.out.println(JVMArc.class.getClassLoader().getParent());
		System.out.println(JVMArc.class.getClassLoader().getParent().getParent());
		
	}
}
