package Unit2;
import java.util.Scanner;
public class AskingConditionalOpera {
    public static void main(String args[])
    {    
     int a,b,c;
     Scanner sc = new Scanner (System.in);
    System.out.print("Input value of a: ");
    a = sc.nextInt();
    System.out.print("Input value of b: ");
    b = sc.nextInt();
    c=a>b?a:b;
    System.out.println("c is largest: "+c);
    }
}

