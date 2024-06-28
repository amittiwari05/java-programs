import java.util.Scanner;
/**
 * Addition
 */
public class Addition {

    


     int a,b;  // class variable
    void getdata()
    {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter first number:");
        a = sc.nextInt();
        System.out.println("Enter second number:");
        b = sc.nextInt();
    }
    
    void putdata(){
    
        System.out.println("Addition:"+(a+b));
    }
    public static void main (String args[])
    {
        Addition aa= new Addition();
        aa.getdata();
        aa.putdata();
    }

}