
package Unit3;
class Outer
{
    int x=5;
   
    //euta class vitra aarko class inner class
private class Inner//static rw private banauna milxa
{
    void display()
    {
        System.out.println("Value of x = "+x);
    }
    
}
void show()
{
Inner obj = new Inner();
        obj.display();
   }
}
public class InnerClass
{
    public static void main(String args[])
    {
        Outer ob = new Outer();
        ob.show();
    }
}