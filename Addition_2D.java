import java.util.Scanner;
/**
 * Addition_2D
 */
public class Addition_2D {

    int a[][]= new int[3][3];
    int b[][]= new int[3][3];
    int c[][]= new int[3][3];
    int i=0,j=0;
    void getdata()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter elements of matrix A:");
        for(i=0;i<3;i++)
            for(j=0;j<3;j++)
            {
                System.out.println("Enter numbers:");
                a[i][j]=sc.nextInt();
            }
        System.out.println("Enter elements for matrix B:");
        for(i=0;i<3;i++)
            for(j=0;j<3;j++)
            {
                System.out.println("Enter numbers:");
                b[i][j]=sc.nextInt();
            }
    }
    void add()
    {
        System.out.println("Addition of matrix A and B is:");
        for(i=0;i<3;i++)
        for(j=0;j<3;j++)
        {
            c[i][j]=a[i][j]+b[i][j];
        }
    }
    void putdata()
    {
        for(i=0;i<3;i++)
        {
        for(j=0;j<3;j++)
        {
            System.out.print(c[i][j]+"    ");
        }
        System.out.println();
        }
    }

    public static void main(String args[])
    {
        Addition_2D aa = new Addition_2D();
        aa.getdata();
        aa.add();
        aa.putdata();
    }
}