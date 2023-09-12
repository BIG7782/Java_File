
package Unit7;
class MultiThread1 extends Thread
{
    public void run()
    {
        for(int i=65;i<=90;++i)
            System.out.println((char)i+" ");
    }
}
public class ThreadExample1 {
    public static void main(String args[])
    {
        MultiThread1 obj= new MultiThread1();
        obj.start();
        for(int i=1;i<=20;i++)
            System.out.println(i+" ");
        
    }
}
