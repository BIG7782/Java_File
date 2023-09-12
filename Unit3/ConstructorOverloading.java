
package Unit3;
import java.util.Scanner;

class Area
{
    Area(int r)
    {
        System.out.println("Area of circle: "+(3.14*r*r));
    }
    Area (int l, int b)
    {
        System.out.println("Area of rectangle: "+(l*b));
    }
    }
public class ConstructorOverloading{
    public static void main(String[] args)
    {
        int radius,length,breadth;
        Scanner sc = new Scanner (System.in);
         System.out.println("Enter Radius of a circle:" );
        radius = sc.nextInt();
        System.out.println("Enter length and breadth: \n");
        length = sc.nextInt();
        breadth = sc.nextInt();
        Area obj1= new Area(radius);
         Area obj2= new Area(length,breadth);
        
    }
}