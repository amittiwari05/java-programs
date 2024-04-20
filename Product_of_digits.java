import java.util.Scanner;
/**
 * Product_of_digits
 */
public class Product_of_digits {

    public static void main (String [] args)
    {
        int n,product=1;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of n:");
        n = sc.nextInt();
        while (n>0)
        {
            product = product * n % 10;
            n=n/10;
        }
        System.out.println("Product of given digit is="+ product);
    }
}