import java.util.Scanner;
/**
 * Powerofxy
 */
public class Powerofxy {

    public static void main (String [] args)
    {
        Scanner sc = new Scanner ( System.in);
        int x,y,pro=1;
        System.out.println("Enter base:");
        x=sc.nextInt();
        System.out.println("Enter power:");
        y = sc.nextInt();
        while(y>0)
        {
            pro = pro * x;
            y --;
        }
        System.out.println("Value="+pro);
    }
}