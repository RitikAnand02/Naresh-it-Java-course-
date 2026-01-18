import java.util.Scanner;

class Demo {
    static void swap(int a, int b) {
        System.out.println("before swaping a=" + a + " and b=" + b);
        a = a + b - (b = a);
        System.out.println("after swaping a=" + a + " and b=" + b);
    }
}

class Test1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a value");
        int a = obj.nextInt();
        System.out.println("Enter b value");
        int b = obj.nextInt();
        Demo.swap(a, b);
        obj.close();
    }
}