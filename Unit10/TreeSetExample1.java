
package Unit10;
import java.util.*;
public class TreeSetExample1 {
        public static void main(String args[]){
            TreeSet<String>s=new TreeSet<>();
            s.add("Devendra");
            s.add("Bindu");
            s.add("Binayak");
            s.add("Soba Raj");
            s.add("Binayak");
            System.out.println(s);
            s.remove("Soba Raj");
            System.out.println(s);
            System.out.println("\nInterating over List: ");
            Iterator<String> itr=s.iterator();
            while(itr.hasNext())
                System.out.println(itr.next());
        }
    }

