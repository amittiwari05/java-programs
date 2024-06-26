import java.util.Scanner;
/**
 * PyramidPrinting
 */
public class PyramidPrinting {

    public static void main (String args [])
    {   
        int n,i,j,s;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number of rows:");
        n = sc.nextInt();
        for (i=1;i<=n;i++)
        {
            for (s=1;s<=n-i; s++)
                System.out.print(" ");
            for (j=1;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }

    }
}