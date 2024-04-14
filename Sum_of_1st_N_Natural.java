import java.util.Scanner;
/**
 * Sum_of_1st_N_Natural
 */
public class Sum_of_1st_N_Natural {

    public static void main(String [] args)
    {
        int n,add=0;
        int i=1;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of n:");
        n = sc.nextInt();
        while (i<=n)
        {
            add=add+i;
            i++;
        }
        System.out.println("Addition="+add);

    }
}