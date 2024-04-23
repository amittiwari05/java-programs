import java.util.Scanner;
/**
 * Factorial
 */
public class Factorial {

    public static void main (String [] args)

    {
        Scanner sc = new Scanner (System.in);
        int n,fac=1;
        System.out.println("Enter the value of number(n) which you want to find factorial:");
        n = sc.nextInt();
        while (n>0)
        {
            fac = fac * n;
            n = n-1;
        }
        System.out.println("Factorial of you given number is="+fac);
    }
}