import java.util.Scanner;

public class Array2D {

    int a[][] = new int[3][3];
    int i, j;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements for matrix:");
        for (i = 0; i < 3; i++)
            for (j = 0; j < 3; j++) {
                System.out.println("Enter number:");
                a[i][j] = sc.nextInt();
            }
    }

    void putdata() {
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Array2D aa = new Array2D();
        aa.getdata();
        aa.putdata();
    }
}
