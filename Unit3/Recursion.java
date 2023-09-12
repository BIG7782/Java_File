
package Unit3;
import java.util.Scanner;
class Fibonacci
{
    int fibo(int n)
    {
        if(n==0||n==1)
            return 1;
        else 
            return (fibo(n-1)+fibo(n-2));
    }
}
public class Recursion 
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        Fibonacci obj= new Fibonacci();
        int n,i;
        System.out.print("Enter a number: ");
        n=sc.nextInt();
        System.out.print("0\t");
        for(i=0;i<n-1;i++)
         System.out.print(obj.fibo(i)+"\t");
    }
}
