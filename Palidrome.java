import java.util.Scanner;
public class Palidrome {
    public static void main (String [] args)
    {
        int n,rev=0,z;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of n:");
        n = sc.nextInt();
        z = n;
        while (n>0)
        {
            rev = rev*10 + n%10;
            n = n/10;
        }
        System.out.println("Palidrome is:="+rev);
    }
    
}
