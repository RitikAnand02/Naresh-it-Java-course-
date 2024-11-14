package com.test5;

class White {
    White() {
        System.out.print("white is ");
    }
}
class Purple extends White {
    Purple(String color) {
        System.out.print(color);
    }
}
public class Black extends Purple {
    Black() {
        super("beautiful" + ",");
    }
    public static void main(String[] a) {
        new Purple("awesome" + ",");
        new Purple("nice");
    }
}