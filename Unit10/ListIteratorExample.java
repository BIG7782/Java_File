
package Unit10;
import java.util.*;
public class ListIteratorExample {
    
    public static void main(String args[])
    {
        List<String>names=new ArrayList<String>();
        names.add("Mahima");
        names.add("Nikita");
       names.add("Mahima");
         names.add("Niru");
        ListIterator litr=names.listIterator();
        System.out.println("Traversing list in forward direction ");
        while(litr.hasNext())
        {
         System.out.println(litr.next());
    }
        System.out.println("Traversing list in backward direction ");
        while(litr.hasPrevious())
        {
            System.out.println(litr.previous());
        }
    }
}
