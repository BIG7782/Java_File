
package Unit10;
import java.util.*;
public class HashMapExample {
    public static void main(String args[]){
        HashMap<Integer,String> map=new HashMap<Integer,String>();//map object name
        map.put(1,"Subal");
        map.put(2,"Sanvi");
        map.put(3,"Sonu");
        map.put(4,"Sonu");
        map.put(1,"Laxmi");
        System.out.println("Iterating Hashmap...");
        for(Map.Entry i:map.entrySet()){
             System.out.println(i.getKey()+" "+i.getValue());
        } 
    }
    }

