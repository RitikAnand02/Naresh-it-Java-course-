
// 30. Impl prg to validate given date. ------------------------------------ 
// 20-01-2023 
// [0123][0-9]-[01][0-9]-202[3-9] 
import java.util.*;

class Test118 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        System.out.println(s.matches("[0123][0-9]-[01][0-9]-202[3-9]"));
    }
}
