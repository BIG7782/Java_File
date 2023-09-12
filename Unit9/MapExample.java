
package Unit9;

import java.util.*;
public class MapExample {
    public static void main(String args[]){
        Map<String,Integer> map=new HashMap<String,Integer>();
        map.put("Ashika",100);
        map.put("Sarmila", 101);
        map.put("Pratima", 101);
        System.out.println(map);
         System.out.println(map.get("Sarmila"));
          System.out.println(map.containsKey("Soba Raj"));
           System.out.println(map.containsValue(102));
           
           for(Map.Entry m:map.entrySet())
           {
                 System.out.println(m.getKey()+" "+m.getValue());
           }
    }
}
