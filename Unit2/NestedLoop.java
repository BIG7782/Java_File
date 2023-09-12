
package Unit2;
public class NestedLoop {
    public static void main(String[] args)
    {
        int i,n,fact=0;
        for(n=1;n<=100;n++)
        {
            for(i=1;i<=n;i++)
            {
                if(n%i==0)
                    fact++;
            }
            if(fact==2)
                System.out.print(n+"\t");
            fact=0;
        }
    }
}
