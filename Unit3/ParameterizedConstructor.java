
package Unit3;
import java.util.Scanner;
class Sum
        {
    Sum(int a,int b)
    {
        System.out.println("Sum of two  numbers: "+(a+b));
    }
}
public class ParameterizedConstructor {
    public static void main(String[] args)
    {
        int x,y;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        x = sc.nextInt();
        y = sc.nextInt();
        Sum obj=new Sum(x,y);
        
    }
}
