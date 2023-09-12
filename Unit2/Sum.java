package Unit2;
import java.util.Scanner;
public class Sum {
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("a: ");
        a=sc.nextInt();
        System.out.print("b:");
        b=sc.nextInt();
        c=a+b;
        System.out.print("sum="+c); 
    } 
}
