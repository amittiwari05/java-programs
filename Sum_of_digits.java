import java.util.Scanner;
/**
 * Sum_of_digits
 */
public class Sum_of_digits {

    public static void main (String [] args)
    {
        int n,sum=0;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of n:");
        n = sc.nextInt();
        while(n>0)
        {
            sum = sum + n%10;
            n = n/10;
        }
        System.out.println("Sum of the digits are:="+sum);
    }
}