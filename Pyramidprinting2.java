import java.util.Scanner;
/**
 * Pyramidprinting2
 */
public class Pyramidprinting2 {

    public static void main (String args[])
    {
        int n,i,b,j;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number of rows:");
        n=sc.nextInt();
        for (i=1;i<=n;i++){
            for(b=1;b<=n-i;b++);
            System.out.print(" ");
        for (j=1;j<2*i-1;j++)
            System.out.print("*");
        System.out.println();
        }
    }
}