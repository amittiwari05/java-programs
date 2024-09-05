import java.util.Scanner;
/**
 * Length_string
 */
public class Length_string {

    public static void main(String args[])
    {
        String s= new String();
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        s=sc.next();
        int len=s.length();
        System.out.println("The String is:"+s);
        System.out.println("The length of string is:"+s.length());

        for(i=0;i<len;i++)
            System.out.println(s.charAt(i));
    }
}