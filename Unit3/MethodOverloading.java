
package Unit3;
import java.util.Scanner;
class Overloading 
{
    public void area (int r)
    {
        System.out.println("Area of circle: "+(3.14*r*r));
    }
    public void area (int l,int b)
    {
        System.out.println("\nArea of Rectangle: "+(l*b));
    }
}
public class MethodOverloading {
    public static void main(String args[])
    {
        Overloading obj=new Overloading();
        int r,l,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        r=sc.nextInt();
        obj.area(r);
        System.out.print("Enter length and Breadth of the rectangle: ");
        l=sc.nextInt();
        b=sc.nextInt();
        obj.area(l,b);     
    }  
}
