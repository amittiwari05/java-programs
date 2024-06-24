import java.util.Scanner;
/**
 * Practice11
 */
public class Shapeprinting {

    public static void main (String args[])
{
    Scanner sc = new Scanner (System.in);
    int i,n,j;
    System.out.println("Enter the value of n:");
    n=sc.nextInt();
    for ( ;n>=1;n--)
    {
        for (j=1; j<=n; j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
}
}