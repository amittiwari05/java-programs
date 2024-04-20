import java.util.Scanner;
/**
 * Prime_number
 */
public class Prime_number {

    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        int n,i,count=0;
        System.out.println("Enter the value of n to check prime number:");
        n = sc.nextInt();
        i=1;// initialization
        while (i<=n)
        {
            if (n%i == 0)
                count = count +1;
            i = i + 1;
        }
        if (count ==2)
            System.out.println("It is Prime");
        else 
            System.out.println("It is not Prime");
    }
}