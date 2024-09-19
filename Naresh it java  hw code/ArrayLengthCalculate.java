class ArrayLengthCalculate {
    public static void main(String[] args) {
        int length = args.length;

        if (length == 0) {
            System.out.println("No value from command Line argument");
        } else if (length == 1) {
            int num = Integer.parseInt(args[0]);
            System.out.println("Cube of " + num + " is :" + (num * num * num));
        } else if (length == 2) {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println("Sum of " + a + " and " + b + " is :" + (a + b));
        }
    }
}