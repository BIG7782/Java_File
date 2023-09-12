
package Inheritance;
class A
{
    void display()
    {
        System.out.println("This is display method in class A ");
    }
}
class B extends A
{
    void display()
    {
        System.out.println("This is display method in class B");
    }
}
public class MethodOverriding {
    public static void main(String args[])
    {
        A obj1=new A();
        B obj2=new B();
        obj1.display();//invokes A class display()
        obj2.display();//invokes A class display()
            
    }
    
}
