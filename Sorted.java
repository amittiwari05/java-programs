import java.util.Scanner;
/**
 * Demo
 */
public class Demo {

    int a[]= new int [10];
    void getdata()
    {
        Scanner sc = new Scanner (System.in);
        int i;
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
    for(j=i+1;j<9;j++)
    {
        if(a[i]>a[j])
        {
            t=a[i];
            a[i]=a[j];
            a[j]=t;
        }
    }
   }
   public static void main(String args[])
   {
    Demo aa= new Demo();
    aa.getdata();
    System.out.println("Unsorted=");
    aa.putdata();
    System.out.println("Sorted array");
    aa.sort();
    aa.putdata();
   }
}