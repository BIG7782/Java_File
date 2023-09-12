
package Unit2;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args)
    {
        int num,n,digit,rev=0;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number: ");
        n=sc.nextInt();
        num=n;
        do 
        {
            digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        while(n>0);
        System.out.println("Reverse of "+num+"="+rev);
    }
}
