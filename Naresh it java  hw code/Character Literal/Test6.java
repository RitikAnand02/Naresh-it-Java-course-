//Range of UNICODE Value (65535) OR '\uffff'
class Test6 {
    public static void main(String[] args) {
        char ch1 = 65535;
        System.out.println("ch value is :" + ch1);

        char ch2 = 65536; // error [out of range]
        System.out.println("ch value is :" + ch2);
    }
}