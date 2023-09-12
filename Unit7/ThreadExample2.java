package Unit7;
    class MultiThread2 implements Runnable 
        {
            public void run()
            {
                for(int i=65;i<=90;i++)
                    System.out.print((char)i+" ");
            }       
        }
        public class ThreadExample2 {
            public static void main(String arg[])
            {
                MultiThread2 obj=new MultiThread2();
               Thread t = new Thread(obj);
               t.start();
               for(int i=1;i<=20;++i)
                   System.out.print(i+" ");
    }
}
        