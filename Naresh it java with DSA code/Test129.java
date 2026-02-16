
// 11. Impl prg to reverse individual words.  
import java.util.*;

class Test129 {
    public static void main(String[] args) {
        String s = "the quick brown fox jumps over lazy dog";
        StringTokenizer st = new StringTokenizer(s);
        while (st.hasMoreTokens())
            System.out.print(new StringBuffer(st.nextToken()).reverse() + " ");
    }
}