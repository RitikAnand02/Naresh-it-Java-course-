import java.util.Scanner;

class Demo {
    static void convert(int n) {
        if (n == 0) {
            System.out.print("");
        } else {
            convert(n / 2);
            System.out.print(n % 2);
        }
    }
}

class Test20 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        Demo.convert(n);
    }
}
