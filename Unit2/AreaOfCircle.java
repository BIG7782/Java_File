
package Unit2;
import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String args[])
    {
      float r,area;
      Scanner sc=new Scanner(System.in);
      System.out.println("Radius");
      r=sc.nextFloat();
      area=(float) (3.14*r*r);
      System.out.println("Area="+area);
    } 
}
