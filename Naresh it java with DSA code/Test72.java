
import java.util.*;

class Test72 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter matrix-A row size:");
        int rsize1 = obj.nextInt();

        System.out.println("Enter matrix-A column size:");
        int csize1 = obj.nextInt();

        System.out.println("Enter matrix-B row size:");
        int rsize2 = obj.nextInt();

        System.out.println("Enter matrix-B column size:");
        int csize2 = obj.nextInt();

        if (rsize1 == csize2) {
            int i, j, k;
            int a[][] = new int[rsize1][csize1];
            int b[][] = new int[rsize2][csize2];
            int c[][] = new int[rsize1][csize1];

            System.out.println("Enter matrix-A element one-by-one:");
            for (i = 0; i < rsize1; i++) {
                for (j = 0; j < csize1; j++) {
                    a[i][j] = obj.nextInt();
                }
            }

            System.out.println("Enter matrix-B element one-by-one:");
            for (i = 0; i < rsize2; i++) {
                for (j = 0; j < csize2; j++) {
                    b[i][j] = obj.nextInt();
                }
            }

            for (i = 0; i < rsize1; i++) {
                for (j = 0; j < csize2; j++) {
                    c[i][j] = 0;
                    for (k = 0; k < csize1; k++) {
                        c[i][j] = c[i][j] + (a[i][k] * b[k][j]);
                    }
                }
            }

            System.out.println("MATRIX-A ELEMENTS ARE:");
            for (i = 0; i < rsize1; i++) {
                for (j = 0; j < csize1; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("MATRIX-B ELEMENTS ARE:");
            for (i = 0; i < rsize2; i++) {
                for (j = 0; j < csize2; j++) {
                    System.out.print(b[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("MATRIX-C ELEMENTS ARE:");
            for (i = 0; i < rsize1; i++) {
                for (j = 0; j < csize2; j++) {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("MATRIX MULTIPLICATION is not possible");
        }
    }
}