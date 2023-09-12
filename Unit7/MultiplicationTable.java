package Unit7;
public class MultiplicationTable {
    void printTable(int n)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+"x"+i+"="+n*i);
            try
            {
                Thread.sleep(400);
            }
            catch(Exception e)
            {
                
            }
        }
    }
    public static void main(String args[])
    {
        
    }
}
