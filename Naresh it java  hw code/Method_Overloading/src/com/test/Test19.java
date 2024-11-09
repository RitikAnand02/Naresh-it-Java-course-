package com.test;

//setter -> mutator
//getter -> accessor
//Imutable class without accepting any modication

final class CustomImutable {
	private final int x;
	
	public CustomImutable(int x) {
	this.x = x;
	}

	public int getX() {
		return x;
	}
}
//2. Imutable Object which accepts modification(Example: Integer, String...)

final class ModifiableImmutableClass {
	 private final int x;
	 ModifiableImmutableClass(int x) {
		 this.x = x;
	 }
	 public int getX() {
		 return x;
	 }
	 public ModifiableImmutableClass modify(int newValue) {
		return new ModifiableImmutableClass(newValue);
	 } 
}

public class Test19 {
public static void main(String[] args) {
    CustomImutable  c1= new CustomImutable(10);
    System.out.println(c1.getX());
    
    ModifiableImmutableClass m = new ModifiableImmutableClass(100);
    System.out.println(m.getX());
    System.out.println(m);
    m = m.modify(200);
    System.out.println(m.getX());
    System.out.println(m);
    
    Integer i = Integer.valueOf(101);
    Integer o = Integer.valueOf("13",20);  // 1*20^1 + 3*20^0
    System.out.println(o);
    
}
}

