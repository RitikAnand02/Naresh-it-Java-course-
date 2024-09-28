//OR Operator (At least one condition must be true)
class Test17 {
    public static void main(String args[]) {
        int a = 10;
        int b = 5;
        int c = 20;
        System.out.println(a > b || a < c); // true
        System.out.println(b > c || a > c); // false
    }
}