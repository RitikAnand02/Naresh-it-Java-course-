// IMPLEMENT A PROGRAM TO CHECK WHETHER THE GIVEN NUMBER IS PRIME OR NOT 

class Demo {
    static boolean isPrime1(int n) {
        // loop
        int i, f = 0;
        for (i = 1; i <= n; i++) {
            if (n % i == 0)
                f++;
        }
        return f == 2;
    }

    static boolean isPrime2(int n, int i) {
        // recursion
        if (i == 1)
            return true;
        else if (n % i == 0)
            return false;
        else
            return isPrime2(n, --i);
    }
}

class Test6 {
    public static void main(String[] args) {
        java.util.Scanner obj = new java.util.Scanner(System.in);
        System.out.println("Enter n value");
        int n = obj.nextInt();
        for (int i = 2; i <= n; i++) {
            System.out.println(
                    i + "\t" + (Demo.isPrime1(i) ? "Yes" : "No") + "\t" + (Demo.isPrime2(i, i / 2) ? "Yes" : "No"));
        }
    }
}
