import java.util.Scanner;
/**
 * Reverse1
 */
public class Reverse1 {

    int n;
    void getdata(int i)
    {
        n=i;
    }
    void putdata()
    {
        int rev=0;
        while(n>0)
        {
            rev=(rev*10)+n%10;
            n=n/10;
        }
    System.out.println("Reverse="+rev);
    }
public static void main (String args[])
{
    int m;
    Reverse1 aa= new Reverse1 ();
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter number to find reverse:");
    m=sc.nextInt();
    aa.getdata(m);
    aa.putdata();
}
}