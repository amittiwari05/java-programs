import java.util.Scanner;
class Calculator
{
    public static void main (String [] args)
    {
        int a,b,ch;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter First number:");
        a = sc.nextInt();
        System.out.println("Enter Second number:");
        b = sc.nextInt();
        System.out.println("Enter your choice 1->Addition 2->Subtraction 3->Multiplication 4->division");
        ch = sc.nextInt();
        if (ch ==1)
        System.out.println("Addition="+(a+b));
        else if (ch ==2)
        System.out.println("Subtraction="+(a-b));
        else if (ch ==3)
        System.out.println("Multiplication="+(a*b));
        else if (ch ==4)
        System.out.println("Division="+(a/b));
        else
        System.out.println("Invalid Choice");
    }
}
