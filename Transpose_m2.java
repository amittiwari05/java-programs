import java.util.Scanner;
/**
 * Transpose_m2
 */
public class Transpose_m2 {

    int a[][] = new int[3][3];
    int b[][] = new int[3][3];
    int i,j;
    void getdata()
    {
        Scanner sc = new Scanner(System.in);
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.println("Enter numbers:");
                a[i][j]=sc.nextInt();
            }
        }
    }
    void putdata()
    {
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(a[i][j]+"    ");

            }
            System.out.println();
        }
    }
    void transpose()
    {
        for(i=0;i<3;i++)
            for(j=0;j<3;j++)
            {
                b[i][j]=a[j][i];
            }
        System.out.println("Transpose is:");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(b[i][j]+"    ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Transpose_m2 aa = new Transpose_m2();
        aa.getdata();
        System.out.println("Original matrix is:");
        aa.putdata();
        aa.transpose();
    }
}