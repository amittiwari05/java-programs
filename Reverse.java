import java.util.Scanner;
/**
 * Reverse
 */
public class Reverse {

    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        int n,rev=0;
        System.out.println("Enter the value of n:");
        n = sc.nextInt();
    
        while (n>0)
        {
            rev = rev*10 + n%10;
            n=n/10;
        }
        System.out.println("Reverse="+rev);
    }
}
