
// Impl prg to validate bike registration number  
// TS 21 AB 1234 
// TS[12][0-9][A-Z]{2}[0-9]{4} 
import java.util.*;

class Test117 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        System.out.println(s.matches("TS[12][0-9][A-Z]{2}[0-9]{4}"));
    }
}