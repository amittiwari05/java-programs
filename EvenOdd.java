import java.util.Scanner;
class EvenOdd
{
    public static void main (String [] args)
    {
        int a,b;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter first number:");
        a = sc.nextInt();
        System.out.println("Enter second number:");
        b = sc.nextInt();
        if (a%2==0)
        System.out.println("Even="+a);
        else
        System.out.println("Odd="+b);
    }
}
