
package Unit10;
import java.util.*;
public class HashSetExample {
     public static void main(String args[])
    {
        HashSet<String>s=new HashSet<>();
        s.add("Devendra");
        s.add("Bindu");
        s.add("Hari");
        s.add("Binayak");
        s.add("Sob Raj");
        s.add("Binayak");
        System.out.println(s);
        s.remove("Sob Raj");
       System.out.println(s);
        System.out.println("\nIterating over list: ");
        Iterator<String> itr=s.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
    }
    
}
