import java.util.Scanner;
public class Row_sum
{
    int a[][] = new int[3][3];
    int i,j;
    void getdata()
    {
        Scanner sc = new Scanner (System.in);
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
    void row_sum()
    {
        int sum=0;
        for(i=0;i<3;i++)
        {
         sum=0;
            for(j=0;j<3;j++)
            {
                sum=sum+a[i][j];
            }
        
        System.out.println("Sum of"+ i+1 + "row="+ sum);
        }
    }
    public static void main(String args[])
    {
        Row_sum aa = new Row_sum ();
        aa.getdata();
        System.out.println("The matrix is:");
        aa.putdata();
        aa.row_sum();
    }
}