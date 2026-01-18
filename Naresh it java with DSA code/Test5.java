// IMPLEMENT A PROGRAM TO FIND FACTORIAL OF THE GIVEN NUMBER 
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 

class Demo {
    static int fact1(int n) {
        // loop
        int i, f = 1;
        for (i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    static int fact2(int n) {
        // recursion
        if (n == 1 || n == 0)
            return 1;
        else
            return n * fact2(n - 1);
    }
}

class Test5 {
    public static void main(String[] args) {
        java.util.Scanner obj = new java.util.Scanner(System.in);
        System.out.println("Enter n value");
        int n = obj.nextInt();
        if (n >= 0) {
            System.out.println("factorial by using loop = " + Demo.fact1(n));
            System.out.println("factorial by using recursion = " + Demo.fact2(n));
        } else
            System.out.println("Arey what happend to you factorial for -ve num not existed");
    }
}