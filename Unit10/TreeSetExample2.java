
package Unit10;
import java.util.*;

public class TreeSetExample2 {
      public static void main(String args[]){
          TreeSet<String>s=new TreeSet<>();
          Scanner sc=new Scanner(System.in);
          int i,n;
          String cityname;
          System.out.print("How many Cities: ");
          n=sc.nextInt();
          for(i=0;i<n;i++)
          {
              System.out.print("Enter Name of City: ");
              cityname=sc.next();
              s.add(cityname);
          }
          System.out.println("\nIterating over List: ");
          Iterator<String> itr=s.iterator();
          while(itr.hasNext())
              System.out.println(itr.next());
      }
}
