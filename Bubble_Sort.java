import java.util.Scanner;
/**
 * Bubble_Sort
 */
public class Bubble_Sort {

    int a[] = new int [10];
    void getdata()
    {
        int i;
        Scanner sc = new Scanner (System.in);
        for(i=0;i<10;i++)
        {
            System.out.println("Enter numbers:");
            a[i]=sc.nextInt();
        }
    }
    void putdata()
    {
        int i;
        for(i=0;i<10;i++)
        {
            System.out.println(a[i]);
        }
    }
    void sort()
    {
        int i,j,t;
        for(i=0;i<10;i++)
        for(j=0;j<9-i;j++)
        {
            if(a[i]>a[j+1])
            {
                t=a[j];
                a[j]=a[j+1];
                a[j+1]=t;
            }
        }
    }
    public static void main(String args[])
    {
        Bubble_Sort aa = new Bubble_Sort ();
        aa.getdata();
        System.out.println("Unsorted array");
        aa.putdata();
        System.out.println("Sorted array");
        aa.sort();
        aa.putdata();
    }
}