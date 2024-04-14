import java.util.Scanner;
class Program1_n
 {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        int i,n;
        System.out.println("Enter the value of n which you want to print:");
        n=sc.nextInt();
        i=1;
        while (i<=n)
        {
            System.out.println(i);
            i=i+1;
        }
    }
    
}
