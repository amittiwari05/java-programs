import java.util.Scanner;
class Transpose_m1
{
    int a[][] = new int[3][3];
    int i,j;
    void getdata()
    {
        Scanner sc = new Scanner(System.in);
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.println("Enter the numbers:");
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
        System.out.println("The transpose of matrix is:");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(a[j][i]+"    ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Transpose_m1 aa = new Transpose_m1();
        aa.getdata();
        System.out.println("Original Matrix is:");
        aa.putdata();
        aa.transpose();
    }
}