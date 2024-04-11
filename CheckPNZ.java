import java.util.Scanner;
class CheckPNZ
{
    public static void main (String [] args)
    {
        int a;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number:");
        a = sc.nextInt();
        if (a>0)
        System.out.println("Number is positive="+a);
        else if (a<0)
        System.out.println("Number is negative="+a);
        else
        System.out.println("Number is Zero="+a);
    }
}
