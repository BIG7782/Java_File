
package PackageOne;
public class A {
   void display()
    {
   System.out.println("Diplaying function inside class A: ");
    }   
}
class B{
    public static void main(String args[])
    {
        A obj=new A();
        obj.display();
    }
}
