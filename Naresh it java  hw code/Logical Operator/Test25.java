//* instanceof operator 
public class Test25 {
    public static void main(String[] args) {
        String str = "India";

        if (str instanceof String) {
            System.out.println("str is pointing to String object");
        }

        // Integer i = 45;
        // if (i instanceof Integer) {
        //     System.out.println("i is pointing to Integer object");
        // }

        Double d = 90.67;
        if (d instanceof Number) // IS-A relation between Double and Number class
        {
            System.out.println("d is pointing to Double object");
        }

    }
}