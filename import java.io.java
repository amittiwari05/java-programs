import java.io.*;
class add
{
    public static void main(String args[]);
    {
        int a,b,sum;
        BufferedReader br= new BufferedReader(new Input StreamReader(System.in));
        System.out.println ("Enter First Number:");
        a=Integer.parseInt(br.readline());
        System.out.println("Enter Second Number:");
        b=Integer.parseInt(br.readline());
        c=a+b;
        System.out.println("Addition="+c);
    }
}