import java.util.Scanner;
/**
 * Constructor
 */
public class Add_ParametrizedConstructor {

    int a,b;
    Add_ParametrizedConstructor (int x,int y)
    {
        a=x;
        b=y;
    }
    void output()
    {
        int c;
        c=a+b;
        System.out.println("Addition="+c);

    }
    public static void main (String args[])
    {
        int m,n;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter 1st no.:");
        m=sc.nextInt();
        System.out.println("ENter 2nd no.:");
        n=sc.nextInt();
        Add_ParametrizedConstructor aa = new Add_ParametrizedConstructor(m, n);
        aa.output(); 
    }
}