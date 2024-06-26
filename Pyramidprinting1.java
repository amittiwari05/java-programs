import java.util.Scanner;
/**
 * Pyramidprinting1
 */
public class Pyramidprinting1 {

    public static void main (String args [])
    {
        int n,i,j,b;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number of rows:");
        n=sc.nextInt();
        for (i=1;i<=n;i++)
        {
            for (b=1;b<=i;b++)
                System.out.print(" ");
            for (j=1;j<=n+1-i;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}