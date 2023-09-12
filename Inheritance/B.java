
package Inheritance;
class A
{
    int num=5;
}
public class B extends A{
    int num=10;
    void display()
    {
        System.out.println("num = "+super.num);
        System.out.println("num = "+num);
    }
    public static void main(String args[])
    {
        B obj=new B();
        obj.display();
    }
}
