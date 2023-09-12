
package Unit3;
import java.util.Scanner;
class Factorial
{
    int fact(int n)
    {
        if(n==0)
            return 1;
        else 
            return (n*fact(n-1));
    }
}
public class FactorialUsingRecursion
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        Factorial obj= new Factorial();
        int n;
        System.out.println("Enter a number: ");
        n=sc.nextInt();
        System.out.println("Factorial of "+n+"="+obj.fact(n));

    }
}


