
package Unit2;
import java.util.Scanner;
public class ElseIfLadder {
    public static void main(String[] args)
    {
        int a,b,c,d;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter four  numbers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        if(a==b&&b==c&&c==d)
            System.out.print("All number are equal");
        else if(a>b&&a>b&&a>d)
           System.out.print(a+"is greater: ");
        else if(b>a&&b>c&&b>d)
            System.out.print(b+"is greater: ");
         else if(c>b&&c>a&&c>d)
             System.out.print(c+"is greater: ");
        else
             System.out.print(d+"is greater: ");
         
    }
}
