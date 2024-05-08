/**
 * Break&Continue
 */
public class Break_Continue {

    public static void main (String [] args )
    {
        int i;
        i=0;
        while (i<=10)
        {
            i = i+1;
            System.out.println(i);
            if (i == 5)
            break; //replace break by continue for continue
        }
        System.out.println("Execution done");
    }
}
