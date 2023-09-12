package Unit5;

public class FinallyBlock {
    public static void main(String[] args)
    {
        try
        {
            int a = 10;
            int b = 0;
            int result = a/b;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Finished. ");
        }
    }
}
