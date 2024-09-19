public class AreaOfCircle {
    public static void main(String[] args) {
        // Converting String to double
        double radius = Double.parseDouble(args[0]);

        final double PI = 3.14;
        double area = PI * radius * radius;
        System.out.println("Area of Circle is :" + area);

    }
}