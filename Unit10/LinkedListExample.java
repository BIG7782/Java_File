package Unit10;

import java.util.*;
public class LinkedListExample 
{
    public static void main(String args[])
    {
        LinkedList<String>s=new LinkedList<>();
        s.add("D");
        s.add("C");
        s.addLast("G");
        s.addFirst("A");
        s.add("E");
        //s.add(e1,)
        System.out.println(s);
        boolean status=s.contains("G");
        if(status)
            System.out.println("List Contains Element 'G' ");
        else
            System.out.println("List Doesnot contains Element 'G'  ");
        s.remove(1);
        System.out.println(s);
        s.remove("D");
        System.out.println(s);
          s.removeLast();
          System.out.println(s);
          s.removeFirst();
          System.out.println(s);
   
    }
}
