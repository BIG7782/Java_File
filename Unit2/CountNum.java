
package Unit2;
import java.util.Scanner;
public class CountNum {
    public static void main(String[] args)
    {
        int n,count=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();;
    do
 {
        n=n/10;
        count=count+1;
 }
    while(n>0);
    System.out.println("Number of digits: "+count);
}
        }
