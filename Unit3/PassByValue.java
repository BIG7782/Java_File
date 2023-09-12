
package Unit3;
class X{
    int a,b;
    void add(int x,int y)
    {
        a=x+3;
        b=y+3;
    }
}
public class PassByValue 
{
    public static void main (String args[])
    {               
        X obj=new X();
        int a=5,b=10;
        System.out.println("Before function call a = "+a+" b = "+b);
        obj.add(a,b);
        System.out.println("After function call a = "+a+" b = "+b);
    }
}
