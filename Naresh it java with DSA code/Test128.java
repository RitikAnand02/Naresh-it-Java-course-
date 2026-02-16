// 10. Impl prg to reverse the entire sentence.  

class Test128 {
    public static void main(String[] args) {
        String s = "the quick brown fox jumps over lazy dog";
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        System.out.println(sb);
    }
}
