package com.test5;

public class IAm1 {
    public static void main(String arg[]) {
        float input = 24.8888888888888889f;
        School1 ref = null;
        if (input < 10) {
            ref = new School1();
        } else if (input > 30) {
            ref = new College1();
        } else if (input == 24.88889f) {
            ref = new Office1();
        }
        ref.display();
    }
}
class School1 {
    void display() {
        System.out.println("I am studying 10th class.");
    }
}
class College1 extends School1 {
    void display() {
        System.out.println("I am studying B.Tech.");
    }
}

class Office1 extends School1 {
    void display() {
        System.out.println("I am working in S/W company.");
    }
}
