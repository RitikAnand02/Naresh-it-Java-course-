public class Test6 {
    public static void main(String[] args) {
        byte b = 90;

        switch (b) {
           // case 128: // error
                System.out.println("It is case 127");
                break;
        }
    }

}

// Note : Value 128 is out of the range of byte and same applicable for short
// data type