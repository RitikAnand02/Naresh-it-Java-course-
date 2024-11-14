package com.test5;

public class IAm {
    public static void main(String arg[]) {
        School ref = null;
        ref = new Office();
        ref.display();
    }
}
class School {
    void display() {
        System.out.println("10th class");
    }
}
class College extends School {
    void display() {
        new School().display();
        System.out.println("B.Tech");
    }
}
class Office extends School {
    void display() {
        new College().display();
        System.out.println("S/W company");
    }
}