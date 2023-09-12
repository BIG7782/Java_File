
package Unit2;
import java.util.Scanner;
public class NestedIfElse {
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter three value");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a==b&&b==c)
            System.out.print("All number are equal");
        else
        {
            if(a>b)
            {
            if(a>c)
                System.out.println(a+"is largest");
            else
                System.out.println(c+"is largest");
        }
            else 
            {
                if(b>c)
                    System.out.println(b+"is largest");
                else
                    System.out.println(c+"is largest");
            }     
    }
 }
}

