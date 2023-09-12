
package Unit2;
import java.util.Scanner;
public class LargestNum {
     public static void main(String[] args)
     { 
         Scanner sc = new Scanner(System.in);
         int a,b;
         System.out.print("Enter the value of a and b : ");
         a = sc.nextInt();
         b = sc.nextInt();
         if(a==b)
             System.out.print(" Both are equal");
         else if(a>b)
             System.out.print(" a is largest");
         else
         System.out.print("b is largest");
     }
}
