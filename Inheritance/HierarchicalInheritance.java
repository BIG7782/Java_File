
package Inheritance;
import java.util.Scanner;
class A
{
    int rollno;
    String name;
    Scanner sc = new Scanner(System.in);
}
class B extends A
{
    public void getrollno()
    {
        System.out.println("\n Enter rollno: ");
        rollno=sc.nextInt();
    }
    public void displayrollno()
    {
        System.out.println("\nRollno: "+rollno);
    }
}
class C extends A
{
    public void getname()
    {
        System.out.println("Enter name: ");
        name=sc.next();
    }
    public void displayname()
    {
        System.out.println("Name: "+name);
    }
}
public class HierarchicalInheritance {
    public static void main(String args[])
    {
        B obj1= new B();
        C obj2= new C();
        obj1.getrollno();
        obj2.getname();
        obj1.displayrollno();
        obj2.displayname();
    }
    
}
