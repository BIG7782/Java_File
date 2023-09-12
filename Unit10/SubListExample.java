
package Unit10;
 import java.util.*;
public class SubListExample {
    public static void main(String args[])
    {
  
   List<String>names=new ArrayList<String>();
   names.add("C");
    names.add("C++");
    names.add("Java");
    names.add("PHP");
     names.add("DotNet");
   List<String>range=new ArrayList<String>();
   range=names.subList(2,5);
   System.out.println(range);
    }
}
