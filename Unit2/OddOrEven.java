
package Unit2;
import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args)
    {
        int a;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value: ");
        a = sc.nextInt();
        if(a%2==0)
       System.out.print(a+" is Even");
       else
       System.out.print(a+" is odd");
    
}
}