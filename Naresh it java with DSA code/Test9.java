import java.util.*;

class Demo {
    static int c;

    void m() {
        if (c > 10)
            return;
        else {
            System.out.println("Good Evening, c=" + c);
            c++;
            m();
        }
    }
}

class Test9 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Demo d = new Demo();
        d.m();
    }
}