
package Unit3;
        import java.util.Scanner;
class Circle
{
    void area(int r)
        {
System.out.println("Area of circle: "+(3.14*r*r));
        }
    void circumference(int r)
    {
        System.out.println("Circumference of circle: "+(2*3.14*r));
    }
}
public class AreaCircumference {
    public static void main(String[] args)
    {
        Circle obj = new Circle();
        int r;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter radius of Circle:  ");
        r=sc.nextInt();
        obj.area(r);
        obj.circumference(r);
    }
    
}
