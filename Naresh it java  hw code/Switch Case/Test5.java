public class Test5 {
    public static void main(String[] args) {
        int x = 12;
        final int y = 12;

        switch (x) {
            case y:
                System.out.println("It is case 12");
                break;
        }
    }

}