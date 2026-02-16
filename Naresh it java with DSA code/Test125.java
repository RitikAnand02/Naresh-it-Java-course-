
// 07. Impl prg to check whether the given str is paliandrome or not. 

class Test125 {
    public static void main(String[] args) {
        String s = "madam";
        String ss = new StringBuffer(s).reverse().toString();

        System.out.println(s.equals(ss));// true
    }
}