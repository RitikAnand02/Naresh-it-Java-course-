
// Program to read and calcualte sum of all the elements present in the matrix 
import java.util.*;

class Test73 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter matrix row size:");
        int rsize = obj.nextInt();

        System.out.println("Enter matrix column size:");
        int csize = obj.nextInt();

        int i, j, sum;
        int a[][] = new int[rsize][csize];

        System.out.println("Enter matrix element one-by-one:");
        for (i = 0; i < rsize; i++) {
            for (j = 0; j < csize; j++) {
                a[i][j] = obj.nextInt();
            }
        }

        sum = 0;
        for (i = 0; i < rsize; i++) {
            for (j = 0; j < csize; j++) {
                sum = sum + a[i][j];
            }
        }
        System.out.println("Sum =" + sum);

    }
}