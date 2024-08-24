import java.util.Scanner;

public class Multiplication_2D {
    int a[][] = new int[3][3];
    int b[][] = new int[3][3];
    int c[][] = new int[3][3];
    int i = 0, j = 0;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of matrix A:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("Enter number for a[" + i + "][" + j + "]: ");
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of matrix B:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("Enter number for b[" + i + "][" + j + "]: ");
                b[i][j] = sc.nextInt();
            }
        }
    }

    void multiply() {
        System.out.println("Multiplication of matrix A and B is:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
    }

    void putdata() {
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(c[i][j] + "    ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Multiplication_2D aa = new Multiplication_2D();
        aa.getdata();
        aa.multiply();
        aa.putdata();
    }
}