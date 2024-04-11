import java.util.Scanner;
public class Area_of_circle
{
    public static void main(String [] args)
    {
        float radius;
        float pi=(float) 3.14;
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter Radius:");
        radius = SC.nextFloat();
        float area = pi*radius*radius;
        System.out.println("Area of circle="+area);
    }
}