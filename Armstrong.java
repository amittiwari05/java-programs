import java.util.Scanner;
/**
 * Armstrong
 */
public class Armstrong {

    public static void main (String [] args)
    {
        
        Scanner sc = new Scanner (System.in);
        int n,z, digit, i, pro, sum=0;
        int count=1;
        System.out.println("Enter number:");
        n = sc.nextInt();
        z = n;
        while(z>0)
        {
            count = count + 1;
            z = z/10;
            digit = z%10; pro =1;
            for ( i=1; i<=count; i++)
                pro = pro* digit;
                sum = sum + pro;
                z = z/10;
            

        }
        if (sum == 0)
        System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");

    }
}