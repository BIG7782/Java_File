
package Unit3;
class A
{
    int x,y;
    A()
    {
        x=5;
        y=10;
    }
    void display()
    {
        System.out.print("x = "+x+" y = "+y);
    }
}
public class ConstructorExample {
    public static void main(String args[])
    {
        A obj=new A();
        obj.display();
    }    
}
