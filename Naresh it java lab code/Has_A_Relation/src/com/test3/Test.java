package com.test3;

public class Test {
    public static void main(String[] args) {
        Address address = new Address("123 Elm Street", "Springfield");
        Person person = new Person("John Doe", address);
        System.out.println(person);
	
    }
}
