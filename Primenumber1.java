import java.util.Scanner;
/**
 * Primenumber1
 */
public class Primenumber1 {

    int n;
    void getdata()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number to check:");
        n=sc.nextInt();
    }
    void putdata()
    {
        int i,count=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
                count=count+1;
        }
        if (count==2)
            System.out.println("Prime");
        else
            System.out.println("Not prime");
    }
    public static void main(String args[])
    {
        Primenumber1 aa = new Primenumber1();
        aa.getdata();
        aa.putdata();
    }
}