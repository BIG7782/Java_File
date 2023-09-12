
package Unit5;
import java.io.IOException;
class A
{
    void method()throws IOException
    {
        throw new IOException("device error");
    }
}
class ThrowsException
{
    public static void main(String args[])
    {
        try
        {
            A obj=new A();
            obj.method();
        }
        catch(Exception e)
        {
            System.out.println("Exception Handled");
        }
    }
}

   

