import java.util.Scanner;

class Area_of_rectangle
{
    public static void main(String [] args)
{
    int len,br,area;
    Scanner SC = new Scanner(System.in);
    System.out.println("Enter Length:");
    len =SC. nextInt();
    System.out.println("Enter Breadth:");
    br =SC. nextInt();
    area = len*br;
    System.out.println("Area of rectangle="+area);
}
}
