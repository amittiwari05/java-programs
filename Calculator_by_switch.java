import java.util.Scanner;
public class Calculator_by_switch 
{
    public static void main(String [] args )
    {
        int a,b,ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number:");
        a = sc.nextInt();
        System.out.println("Enter Second number:");
        b = sc.nextInt();
        System.out.println("Enter Your Choice: 1->Add 2->Subtract 3->Multiply 4->Division");
        ch = sc.nextInt();
        switch(ch){
        case 1:
                System.out.println("Addition="+(a+b));
                break;
        case 2:
                System.out.println("Subtraction="+(a-b));
                break;
        case 3:
                System.out.println("Multiplication="+(a*b));
                break;
        case 4:
                System.out.println("Division="+(a/b));
                break;
        case 5:
                System.out.println("Invalid");
        }

    }
}
