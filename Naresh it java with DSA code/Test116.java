
// Impl prg to validate student university hall ticket number  
// DSxxxx ===> DS[0-9]{4} 
import java.util.*;

class Test116 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        System.out.println(s.matches("DS\\d{4}"));
    }
}