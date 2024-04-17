import java.util.Scanner;
/**
 * Sumof_evenandproductof_odd
 */
public class Sumof_evenandproductof_odd {

    public static void main (String [] args)
    {
        int n,sum=0,product=1,digit;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of n:");
        n = sc.nextInt();
        while (n>0)
        {
            digit = n%10;
            if (digit % 2 ==0)
                sum = sum+digit;
            else
                product = product*digit;
            n = n/10;
        }
        System.out.println("the product of odd is:="+product);
        System.out.println("the sum of even is:="+sum);
    }
}